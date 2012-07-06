/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ugent.maf.cellmissy.gui.plate;

import be.ugent.maf.cellmissy.entity.Algorithm;
import be.ugent.maf.cellmissy.entity.Experiment;
import be.ugent.maf.cellmissy.entity.ImagingType;
import be.ugent.maf.cellmissy.entity.PlateCondition;
import be.ugent.maf.cellmissy.entity.Well;
import be.ugent.maf.cellmissy.entity.WellHasImagingType;
import be.ugent.maf.cellmissy.gui.GuiUtils;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * this class is used in the loading data step: imaged wells are shown with related imaging types
 * @author Paola Masuzzo
 */
public class LoadDataPlatePanel extends AbstractPlatePanel {

    private List<ImagingType> imagingTypeList;
    private ImagingType currentImagingType;
    private Map<Algorithm, Map<ImagingType, List<WellHasImagingType>>> algoMap;
    private Experiment experiment;

    /**
     * getters and setters
     * @
     */
    public List<ImagingType> getImagingTypeList() {
        return imagingTypeList;
    }

    public void setImagingTypeList(List<ImagingType> imagingTypeList) {
        this.imagingTypeList = imagingTypeList;
    }

    public ImagingType getCurrentImagingType() {
        return currentImagingType;
    }

    public void setCurrentImagingType(ImagingType currentImagingType) {
        this.currentImagingType = currentImagingType;
    }

    public void setAlgoMap(Map<Algorithm, Map<ImagingType, List<WellHasImagingType>>> algoMap) {
        this.algoMap = algoMap;
    }

    public Map<Algorithm, Map<ImagingType, List<WellHasImagingType>>> getAlgoMap() {
        return algoMap;
    }

    public void setExperiment(Experiment experiment) {
        this.experiment = experiment;
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        if (experiment != null) {
            showRect(g);
        }

    }

    private void showRect(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        setGraphics(g2d);
        List<PlateCondition> plateConditions = new ArrayList<>();
        plateConditions.addAll(experiment.getPlateConditionCollection());
        
        for (PlateCondition plateCondition : plateConditions) {
            for (Well well : plateCondition.getWellCollection()) {
                for (WellGui wellGui : wellGuiList) {
                    if (wellGui.getRowNumber() == well.getRowNumber() && wellGui.getColumnNumber() == well.getColumnNumber()) {
                        g2d.setColor(GuiUtils.getAvailableColors()[plateConditions.indexOf(plateCondition) + 1]);
                        g2d.draw(wellGui.getEllipsi().get(0).getBounds());
                        wellGui.setRectangle(wellGui.getEllipsi().get(0).getBounds());
                    }
                }
            }
        }
    }

    @Override
    protected void reDrawWells(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        setGraphics(g2d);
        // a list of WellGUI objects is present, iterate through it
        for (WellGui wellGui : wellGuiList) {
            List<Ellipse2D> ellipsi = wellGui.getEllipsi();

            for (int i = 0; i < ellipsi.size(); i++) {
                Ellipse2D ellipse2D = ellipsi.get(i);
                g2d.draw(ellipse2D);

                // if a color of a wellGui has been changed, keep track of it when resizing
                // if a well was not imaged, set its color to the default one
                if (wellGui.getWell().getWellHasImagingTypeCollection().isEmpty()) {
                    g2d.setColor(GuiUtils.getAvailableColors()[0]);
                    g2d.draw(ellipse2D);
                } else {
                    // if it has been imaged, set its color to a different one
                    g2d.setColor(GuiUtils.getAvailableColors()[i + 1]);
                    g2d.fill(ellipse2D);
                }
            }

            // draw the labels on the plate
            if (wellGui.getRowNumber() == 1 || wellGui.getColumnNumber() == 1) {
                drawPlateLabel(ellipsi.get(0), g2d, wellGui.getColumnNumber(), wellGui.getRowNumber());
            }
        }
    }
}
