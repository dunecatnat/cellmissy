/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ugent.maf.cellmissy.gui.controller;

import be.ugent.maf.cellmissy.entity.Assay;
import be.ugent.maf.cellmissy.entity.MatrixDimension;
import be.ugent.maf.cellmissy.gui.GuiUtils;
import be.ugent.maf.cellmissy.gui.experiment.AssayEcm2DPanel;
import be.ugent.maf.cellmissy.gui.experiment.AssayEcm3DPanel;
import be.ugent.maf.cellmissy.service.AssayService;
import be.ugent.maf.cellmissy.service.EcmService;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.BindingGroup;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.observablecollections.ObservableList;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;

/**
 *
 * @author Paola
 */
public class AssayEcmPanelController {

    //model
    private ObservableList<Assay> assay2DBindingList;
    private ObservableList<Assay> assay3DBindingList;
    private ObservableList<MatrixDimension> matrixDimensionBindingList;
    private BindingGroup bindingGroup;
    //view
    private AssayEcm2DPanel assayEcm2DPanel;
    private AssayEcm3DPanel assayEcm3DPanel;
    //parent controller
    private ConditionsSetupPanelController conditionsSetupPanelController;
    //services
    private AssayService assayService;
    private EcmService ecmService;
    private GridBagConstraints gridBagConstraints;

    public AssayEcmPanelController(ConditionsSetupPanelController conditionsSetupPanelController) {
        this.conditionsSetupPanelController = conditionsSetupPanelController;

        //init services
        assayService = (AssayService) conditionsSetupPanelController.getExperimentSetupPanelController().getCellMissyController().getBeanByName("assayService");
        ecmService = (EcmService) conditionsSetupPanelController.getExperimentSetupPanelController().getCellMissyController().getBeanByName("ecmService");

        bindingGroup = new BindingGroup();
        gridBagConstraints = GuiUtils.getDefaultGridBagConstraints();

        //init views
        initEcmPanel();

    }

    public AssayEcm2DPanel getAssayEcm2DPanel() {
        return assayEcm2DPanel;
    }

    public AssayEcm3DPanel getAssayEcm3DPanel() {
        return assayEcm3DPanel;
    }

    private void initEcmPanel() {
        //init matrixDimensionJCombo
        matrixDimensionBindingList = ObservableCollections.observableList(ecmService.findAllMatrixDimension());
        JComboBoxBinding jComboBoxBinding = SwingBindings.createJComboBoxBinding(UpdateStrategy.READ_WRITE, matrixDimensionBindingList, conditionsSetupPanelController.getConditionsSetupPanel().getEcmDimensionComboBox());
        bindingGroup.addBinding(jComboBoxBinding);
        bindingGroup.bind();

        //add action listener
        //show different assay-ecm, 2D-3D panels
        conditionsSetupPanelController.getConditionsSetupPanel().getEcmDimensionComboBox().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (((MatrixDimension) (conditionsSetupPanelController.getConditionsSetupPanel().getEcmDimensionComboBox().getSelectedItem())).getMatrixDimension().equals("2D")) {
                    switchChildPanels(assayEcm2DPanel, assayEcm3DPanel);
                } else {
                    switchChildPanels(assayEcm3DPanel, assayEcm2DPanel);
                }
                conditionsSetupPanelController.getConditionsSetupPanel().getAssayEcmParentPanel().revalidate();
                conditionsSetupPanelController.getConditionsSetupPanel().getAssayEcmParentPanel().repaint();
            }
        });
        
        //init sub views
        assayEcm2DPanel = new AssayEcm2DPanel();
        assayEcm3DPanel = new AssayEcm3DPanel();
        initAssayEcm2DPanel();
        initAssayEcm3DPanel();
        
        conditionsSetupPanelController.getConditionsSetupPanel().getEcmDimensionComboBox().setSelectedIndex(0);

    }

    private void initAssayEcm2DPanel() {

        //init assayJCombo (2D)
        JComboBoxBinding jComboBoxBinding = SwingBindings.createJComboBoxBinding(UpdateStrategy.READ_WRITE, assay2DBindingList, assayEcm2DPanel.getAssayComboBox());
        //init BindingList
        assay2DBindingList = ObservableCollections.observableList(assayService.findByMatrixDimensionName("2D"));
        bindingGroup.addBinding(jComboBoxBinding);
        bindingGroup.bind();
    }

    private void initAssayEcm3DPanel() {

        //init assayJCombo (3D)
        JComboBoxBinding jComboBoxBinding = SwingBindings.createJComboBoxBinding(UpdateStrategy.READ_WRITE, assay3DBindingList, assayEcm3DPanel.getAssayComboBox());
        //init BindingList
        assay3DBindingList = ObservableCollections.observableList(assayService.findByMatrixDimensionName("3D"));
        bindingGroup.addBinding(jComboBoxBinding);
        bindingGroup.bind();
    }

    private void switchChildPanels(JPanel panelToAdd, JPanel panelToRemove) {
        if (!GuiUtils.containsComponent(conditionsSetupPanelController.getConditionsSetupPanel().getAssayEcmParentPanel(), panelToAdd)) {
            conditionsSetupPanelController.getConditionsSetupPanel().getAssayEcmParentPanel().add(panelToAdd, gridBagConstraints);
        }
        if (GuiUtils.containsComponent(conditionsSetupPanelController.getConditionsSetupPanel().getAssayEcmParentPanel(), panelToRemove)) {
            conditionsSetupPanelController.getConditionsSetupPanel().getAssayEcmParentPanel().remove(panelToRemove);
        }

    }
}