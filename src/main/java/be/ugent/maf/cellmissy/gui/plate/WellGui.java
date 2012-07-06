/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ugent.maf.cellmissy.gui.plate;

import be.ugent.maf.cellmissy.entity.Well;
import be.ugent.maf.cellmissy.entity.WellHasImagingType;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.List;

/**
 * This class wraps the Well entity class and it is used in the Plate GUI
 * @author Paola
 */
public class WellGui {

    private Well well;
    private List<Ellipse2D> ellipsi;
    private Rectangle rectangle;

    public WellGui(int rowNumber, int columnNumber) {
        well = new Well();
        well.setWellHasImagingTypeCollection(new ArrayList<WellHasImagingType>());
        well.setRowNumber(rowNumber);
        well.setColumnNumber(columnNumber);
    }

    public int getRowNumber() {
        return well.getRowNumber();
    }

    public int getColumnNumber() {
        return well.getColumnNumber();
    }

    public void setWell(Well well) {
        this.well = well;
    }

    public Well getWell() {
        return well;
    }

    public List<Ellipse2D> getEllipsi() {
        return ellipsi;
    }

    public void setEllipsi(List<Ellipse2D> ellipsi) {
        this.ellipsi = ellipsi;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public String toString() {
        return "row: " + well.getRowNumber() + ", column: " + well.getColumnNumber() + ", number of wellHasImagingTypes: " + well.getWellHasImagingTypeCollection().size();
    }
}
