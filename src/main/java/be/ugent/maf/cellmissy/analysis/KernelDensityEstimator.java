/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ugent.maf.cellmissy.analysis;

import be.ugent.maf.cellmissy.exception.TwoOrMoreObservationsException;
import java.util.List;

/**
 * Kernel Density Estimator interface
 *
 * @author Paola Masuzzo
 */
public interface KernelDensityEstimator {

    /**
     * Estimate Density Function for a dataset data
     *
     * @param data
     * @return a List of double arrays (x and y values of density Function)
     * @throws be.ugent.maf.cellmissy.exception.TwoOrMoreObservationsException
     */
    List<double[]> estimateDensityFunction(Double[] data) throws TwoOrMoreObservationsException;
}
