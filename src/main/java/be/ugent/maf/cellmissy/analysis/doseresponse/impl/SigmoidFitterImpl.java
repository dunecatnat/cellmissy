/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ugent.maf.cellmissy.analysis.doseresponse.impl;

import be.ugent.maf.cellmissy.analysis.doseresponse.DoseResponseAbstractCurveFitter;
import be.ugent.maf.cellmissy.analysis.doseresponse.SigmoidFitter;
import be.ugent.maf.cellmissy.entity.result.doseresponse.DoseResponsePair;
import be.ugent.maf.cellmissy.entity.result.doseresponse.SigmoidFittingResultsHolder;
import be.ugent.maf.cellmissy.utils.AnalysisUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.math3.fitting.AbstractCurveFitter;
import org.apache.commons.math3.analysis.ParametricUnivariateFunction;
import org.apache.commons.math3.fitting.WeightedObservedPoint;
import org.apache.commons.math3.fitting.leastsquares.LeastSquaresBuilder;
import org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.springframework.stereotype.Component;

/**
 * Contains all variations of the fitter (constrained parameter combinations).
 * Their function is the same but the methods differ in parameters (any
 * constrained values are given), which results in a different model for the
 * sigmoid function that is to be fit.
 *
 * @author Gwendolien
 */
@Component("sigmoidFitter")
public class SigmoidFitterImpl implements SigmoidFitter {

    //implementation of interface method
    @Override
    public void fitNoConstrain(List<DoseResponsePair> dataToFit, SigmoidFittingResultsHolder resultsHolder, int standardHillslope) {
        //initial parameter values for fitting: lowest y, highest y, middle x and standard hillslope
        double[] yValues = AnalysisUtils.generateYValues(dataToFit);
        double[] xValues = AnalysisUtils.generateXValues(dataToFit);

        double initialTop = yValues[0];
        double initialBottom = yValues[0];
        double initialLogEC50;
        double maxX = xValues[0];
        double minX = xValues[0];
        for (int i = 0; i < yValues.length; i++) {
            if (yValues[i] < initialBottom) {
                initialBottom = yValues[i];
            } else if (yValues[i] > initialTop) {
                initialTop = yValues[i];
            }
            if (xValues[i] < minX) {
                minX = xValues[i];
            } else if (xValues[i] > maxX) {
                maxX = xValues[i];
            }
        }
        initialLogEC50 = (maxX + minX) / 2;
        final double[] initialGuesses = new double[]{initialBottom, initialTop, initialLogEC50, standardHillslope};

        //add all datapoint to collection with standard weight 1.0
        Collection<WeightedObservedPoint> observations = new ArrayList<>();
        for (int i = 0; i < xValues.length; i++) {
            observations.add(new WeightedObservedPoint(1.0, xValues[i], yValues[i]));
        }

        final ParametricUnivariateFunction function = new ParametricUnivariateFunction() {
            /**
             * @param conc The concentration of the drug, log transformed
             * @param paramaters The fitted parameters (bottom, top, logEC50 and
             * hillslope)
             * @return The velocity
             */
            @Override
            public double value(double conc, double[] parameters) {
                double bottom = parameters[0];
                double top = parameters[1];
                double logEC50 = parameters[2];
                double hillslope = parameters[3];

                return (bottom + (top - bottom) / (1 + Math.pow(10, (logEC50 - conc) * hillslope)));
            }

            @Override
            public double[] gradient(double conc, double[] parameters) {
                double bottom = parameters[0];
                double top = parameters[1];
                double logEC50 = parameters[2];
                double hillslope = parameters[3];

                return new double[]{
                    1 - (1 / ((Math.pow(10, (logEC50 - conc) * hillslope)) + 1)),
                    1 / ((Math.pow(10, (logEC50 - conc) * hillslope)) + 1),
                    (hillslope * Math.log(10) * Math.pow(10, hillslope * (logEC50 + conc)) * (bottom - top))
                    / (Math.pow(Math.pow(10, hillslope * conc) + Math.pow(10, hillslope * logEC50), 2)),
                    (Math.log(10) * (logEC50 - conc) * (bottom - top) * Math.pow(10, (logEC50 + conc) * hillslope))
                    / Math.pow((Math.pow(10, logEC50 * hillslope) + Math.pow(10, hillslope * conc)), 2)

                };

            }

        };

        //set up the fitter with the observations and function created above
        DoseResponseAbstractCurveFitter fitter = new DoseResponseAbstractCurveFitter() {

            @Override
            protected LeastSquaresProblem getProblem(Collection<WeightedObservedPoint> observations) {
                // Prepare least-squares problem.
                final int len = observations.size();
                final double[] target = new double[len];
                final double[] weights = new double[len];

                int i = 0;
                for (final WeightedObservedPoint obs : observations) {
                    target[i] = obs.getY();
                    weights[i] = obs.getWeight();
                    ++i;
                }

                final AbstractCurveFitter.TheoreticalValuesFunction model
                        = new AbstractCurveFitter.TheoreticalValuesFunction(function, observations);

                // build a new least squares problem set up to fit a secular and harmonic curve to the observed points
                return new LeastSquaresBuilder().
                        maxEvaluations(Integer.MAX_VALUE).
                        maxIterations(Integer.MAX_VALUE).
                        start(initialGuesses).
                        target(target).
                        weight(new DiagonalMatrix(weights)).
                        model(model.getModelFunction(), model.getModelFunctionJacobian()).
                        build();
            }
        };

        OptimumImpl bestFit = fitter.performRegression(observations);
        //get the best-fit parameters
        double[] params = bestFit.getPoint().toArray();
        double bottom = params[0];
        double top = params[1];
        double logEC50 = params[2];
        double hillslope = params[3];

        //set the fields of the fitting results holder
        resultsHolder.setBottom(bottom);
        resultsHolder.setTop(top);
        resultsHolder.setLogEC50(logEC50);
        resultsHolder.setHillslope(hillslope);
        //no parameters were constrained
        resultsHolder.setConstrainedParameters(new ArrayList<String>());
        //TEST: what is the effect of the singularity threshold argument?
        resultsHolder.setCovariances(bestFit.getCovariances(0).getData());
    }

    @Override
    public void fitBotConstrain(List<DoseResponsePair> dataToFit, SigmoidFittingResultsHolder resultsHolder, Double bottomConstrain, int standardHillslope) {

        final Double bottom = bottomConstrain;

        //initial parameter values for fitting: highest y, middle x and standard hillslope
        double[] yValues = AnalysisUtils.generateYValues(dataToFit);
        double[] xValues = AnalysisUtils.generateXValues(dataToFit);
        double initialTop = yValues[0];
        double initialLogEC50;
        double maxX = xValues[0];
        double minX = xValues[0];
        for (int i = 0; i < yValues.length; i++) {
            if (yValues[i] > initialTop) {
                initialTop = yValues[i];
            }
            if (xValues[i] < minX) {
                minX = xValues[i];
            } else if (xValues[i] > maxX) {
                maxX = xValues[i];
            }
        }
        initialLogEC50 = (maxX + minX) / 2;

        final double[] initialGuesses = new double[]{initialTop, initialLogEC50, standardHillslope};

        //add all datapoint to collection with standard weight 1.0
        Collection<WeightedObservedPoint> observations = new ArrayList<>();
        for (int i = 0; i < xValues.length; i++) {
            observations.add(new WeightedObservedPoint(1.0, xValues[i], yValues[i]));
        }

        final ParametricUnivariateFunction function = new ParametricUnivariateFunction() {
            /**
             * @param conc The concentration of the drug, log transformed
             * @param paramaters The fitted parameters (top, logEC50 and
             * hillslope)
             * @return The velocity
             */
            @Override
            public double value(double conc, double[] parameters) {
                double top = parameters[0];
                double logEC50 = parameters[1];
                double hillslope = parameters[2];

                return (bottom + (top - bottom) / (1 + Math.pow(10, (logEC50 - conc) * hillslope)));
            }

            @Override
            public double[] gradient(double conc, double[] parameters) {
                double top = parameters[0];
                double logEC50 = parameters[1];
                double hillslope = parameters[2];

                return new double[]{
                    1 / ((Math.pow(10, (logEC50 - conc) * hillslope)) + 1),
                    (hillslope * Math.log(10) * Math.pow(10, hillslope * (logEC50 + conc)) * (bottom - top))
                    / (Math.pow(Math.pow(10, hillslope * conc) + Math.pow(10, hillslope * logEC50), 2)),
                    (Math.log(10) * (logEC50 - conc) * (bottom - top) * Math.pow(10, (logEC50 + conc) * hillslope))
                    / Math.pow((Math.pow(10, logEC50 * hillslope) + Math.pow(10, hillslope * conc)), 2)

                };

            }

        };

        //set up the fitter with the observations and function created above
        DoseResponseAbstractCurveFitter fitter = new DoseResponseAbstractCurveFitter() {

            @Override
            protected LeastSquaresProblem getProblem(Collection<WeightedObservedPoint> observations) {
                // Prepare least-squares problem.
                final int len = observations.size();
                final double[] target = new double[len];
                final double[] weights = new double[len];

                int i = 0;
                for (final WeightedObservedPoint obs : observations) {
                    target[i] = obs.getY();
                    weights[i] = obs.getWeight();
                    ++i;
                }

                final AbstractCurveFitter.TheoreticalValuesFunction model
                        = new AbstractCurveFitter.TheoreticalValuesFunction(function, observations);

                // build a new least squares problem set up to fit a secular and harmonic curve to the observed points
                return new LeastSquaresBuilder().
                        maxEvaluations(Integer.MAX_VALUE).
                        maxIterations(Integer.MAX_VALUE).
                        start(initialGuesses).
                        target(target).
                        weight(new DiagonalMatrix(weights)).
                        model(model.getModelFunction(), model.getModelFunctionJacobian()).
                        build();
            }
        };

        OptimumImpl bestFit = fitter.performRegression(observations);
        double[] params = bestFit.getPoint().toArray();
        double top = params[0];
        double logEC50 = params[1];
        double hillslope = params[2];

        resultsHolder.setBottom(bottom);
        resultsHolder.setTop(top);
        resultsHolder.setLogEC50(logEC50);
        resultsHolder.setHillslope(hillslope);
        //bottom parameter was constrained
        List<String> constrainedParam = new ArrayList<>();
        constrainedParam.add("bottom");
        resultsHolder.setConstrainedParameters(constrainedParam);
        resultsHolder.setCovariances(bestFit.getCovariances(0).getData());
    }

    @Override
    public void fitTopConstrain(List<DoseResponsePair> dataToFit, SigmoidFittingResultsHolder resultsHolder, Double topConstrain, int standardHillslope) {
        final Double top = topConstrain;

        //initial parameter values for fitting: lowest y, middle x and standard hillslope
        double[] yValues = AnalysisUtils.generateYValues(dataToFit);
        double[] xValues = AnalysisUtils.generateXValues(dataToFit);
        double initialBottom = yValues[0];
        double initialLogEC50;
        double maxX = xValues[0];
        double minX = xValues[0];
        for (int i = 0; i < yValues.length; i++) {
            if (yValues[i] < initialBottom) {
                initialBottom = yValues[i];
            }
            if (xValues[i] < minX) {
                minX = xValues[i];
            } else if (xValues[i] > maxX) {
                maxX = xValues[i];
            }
        }
        initialLogEC50 = (maxX + minX) / 2;

        final double[] initialGuesses = new double[]{initialBottom, initialLogEC50, standardHillslope};

        //add all datapoint to collection with standard weight 1.0
        Collection<WeightedObservedPoint> observations = new ArrayList<>();
        for (int i = 0; i < xValues.length; i++) {
            observations.add(new WeightedObservedPoint(1.0, xValues[i], yValues[i]));
        }

        final ParametricUnivariateFunction function = new ParametricUnivariateFunction() {
            /**
             * @param conc The concentration of the drug, log transformed
             * @param paramaters The fitted parameters (bottom, logEC50 and
             * hillslope)
             * @return The velocity
             */
            @Override
            public double value(double conc, double[] parameters) {
                double bottom = parameters[0];
                double logEC50 = parameters[1];
                double hillslope = parameters[2];

                return (bottom + (top - bottom) / (1 + Math.pow(10, (logEC50 - conc) * hillslope)));
            }

            @Override
            public double[] gradient(double conc, double[] parameters) {
                double bottom = parameters[0];
                double logEC50 = parameters[1];
                double hillslope = parameters[2];

                return new double[]{
                    1 - (1 / ((Math.pow(10, (logEC50 - conc) * hillslope)) + 1)),
                    (hillslope * Math.log(10) * Math.pow(10, hillslope * (logEC50 + conc)) * (bottom - top))
                    / (Math.pow(Math.pow(10, hillslope * conc) + Math.pow(10, hillslope * logEC50), 2)),
                    (Math.log(10) * (logEC50 - conc) * (bottom - top) * Math.pow(10, (logEC50 + conc) * hillslope))
                    / Math.pow((Math.pow(10, logEC50 * hillslope) + Math.pow(10, hillslope * conc)), 2)

                };

            }

        };

        //set up the fitter with the observations and function created above
        DoseResponseAbstractCurveFitter fitter = new DoseResponseAbstractCurveFitter() {

            @Override
            protected LeastSquaresProblem getProblem(Collection<WeightedObservedPoint> observations) {
                // Prepare least-squares problem.
                final int len = observations.size();
                final double[] target = new double[len];
                final double[] weights = new double[len];

                int i = 0;
                for (final WeightedObservedPoint obs : observations) {
                    target[i] = obs.getY();
                    weights[i] = obs.getWeight();
                    ++i;
                }

                final AbstractCurveFitter.TheoreticalValuesFunction model
                        = new AbstractCurveFitter.TheoreticalValuesFunction(function, observations);

                // build a new least squares problem set up to fit a secular and harmonic curve to the observed points
                return new LeastSquaresBuilder().
                        maxEvaluations(Integer.MAX_VALUE).
                        maxIterations(Integer.MAX_VALUE).
                        start(initialGuesses).
                        target(target).
                        weight(new DiagonalMatrix(weights)).
                        model(model.getModelFunction(), model.getModelFunctionJacobian()).
                        build();
            }
        };

        OptimumImpl bestFit = fitter.performRegression(observations);
        double[] params = bestFit.getPoint().toArray();
        double bottom = params[0];
        double logEC50 = params[1];
        double hillslope = params[2];

        resultsHolder.setBottom(bottom);
        resultsHolder.setTop(top);
        resultsHolder.setLogEC50(logEC50);
        resultsHolder.setHillslope(hillslope);
        //top parameter was constrained
        List<String> constrainedParam = new ArrayList<>();
        constrainedParam.add("top");
        resultsHolder.setConstrainedParameters(constrainedParam);
        resultsHolder.setCovariances(bestFit.getCovariances(0).getData());
    }

    @Override
    public void fitBotTopConstrain(List<DoseResponsePair> dataToFit, SigmoidFittingResultsHolder resultsHolder, Double bottomConstrain, Double topConstrain, int standardHillslope) {

        final Double bottom = bottomConstrain;
        final Double top = topConstrain;

        //initial parameter values for fitting: middle x and standard hillslope
        double[] xValues = AnalysisUtils.generateXValues(dataToFit);
        double[] yValues = AnalysisUtils.generateYValues(dataToFit);
        double initialLogEC50;
        double maxX = xValues[0];
        double minX = xValues[0];
        for (int i = 0; i < xValues.length; i++) {
            if (xValues[i] < minX) {
                minX = xValues[i];
            } else if (xValues[i] > maxX) {
                maxX = xValues[i];
            }
        }
        initialLogEC50 = (maxX + minX) / 2;

        final double[] initialGuesses = new double[]{initialLogEC50, standardHillslope};

        //add all datapoint to collection with standard weight 1.0
        Collection<WeightedObservedPoint> observations = new ArrayList<>();
        for (int i = 0; i < xValues.length; i++) {
            observations.add(new WeightedObservedPoint(1.0, xValues[i], yValues[i]));
        }

        final ParametricUnivariateFunction function = new ParametricUnivariateFunction() {
            /**
             * @param conc The concentration of the drug, log transformed
             * @param paramaters The fitted parameters (bottom, top, logEC50 and
             * hillslope)
             * @return The velocity
             */
            @Override
            public double value(double conc, double[] parameters) {
                double logEC50 = parameters[0];
                double hillslope = parameters[1];

                return (bottom + (top - bottom) / (1 + Math.pow(10, (logEC50 - conc) * hillslope)));
            }

            @Override
            public double[] gradient(double conc, double[] parameters) {
                double logEC50 = parameters[0];
                double hillslope = parameters[1];

                return new double[]{
                    (hillslope * Math.log(10) * Math.pow(10, hillslope * (logEC50 + conc)) * (bottom - top))
                    / (Math.pow(Math.pow(10, hillslope * conc) + Math.pow(10, hillslope * logEC50), 2)),
                    (Math.log(10) * (logEC50 - conc) * (bottom - top) * Math.pow(10, (logEC50 + conc) * hillslope))
                    / Math.pow((Math.pow(10, logEC50 * hillslope) + Math.pow(10, hillslope * conc)), 2)

                };

            }

        };

        //set up the fitter with the observations and function created above
        DoseResponseAbstractCurveFitter fitter = new DoseResponseAbstractCurveFitter() {

            @Override
            protected LeastSquaresProblem getProblem(Collection<WeightedObservedPoint> observations) {
                // Prepare least-squares problem.
                final int len = observations.size();
                final double[] target = new double[len];
                final double[] weights = new double[len];

                int i = 0;
                for (final WeightedObservedPoint obs : observations) {
                    target[i] = obs.getY();
                    weights[i] = obs.getWeight();
                    ++i;
                }

                final AbstractCurveFitter.TheoreticalValuesFunction model
                        = new AbstractCurveFitter.TheoreticalValuesFunction(function, observations);

                // build a new least squares problem set up to fit a secular and harmonic curve to the observed points
                return new LeastSquaresBuilder().
                        maxEvaluations(Integer.MAX_VALUE).
                        maxIterations(Integer.MAX_VALUE).
                        start(initialGuesses).
                        target(target).
                        weight(new DiagonalMatrix(weights)).
                        model(model.getModelFunction(), model.getModelFunctionJacobian()).
                        build();
            }
        };

        OptimumImpl bestFit = fitter.performRegression(observations);
        //get best-fit parameters
        double[] params = bestFit.getPoint().toArray();
        double logEC50 = params[0];
        double hillslope = params[1];

        //set the values in the fitting results holder
        resultsHolder.setBottom(bottom);
        resultsHolder.setTop(top);
        resultsHolder.setLogEC50(logEC50);
        resultsHolder.setHillslope(hillslope);
        //bottom and top parameter were constrained
        List<String> constrainedParam = new ArrayList<>();
        constrainedParam.add("bottom");
        constrainedParam.add("top");
        resultsHolder.setConstrainedParameters(constrainedParam);
        resultsHolder.setCovariances(bestFit.getCovariances(0).getData());
    }

}
