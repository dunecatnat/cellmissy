/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SetupConditionsPanel.java
 *
 * Created on Apr 2, 2012, 10:41:55 AM
 */
package be.ugent.maf.cellmissy.gui.experiment;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Paola
 */
public class SetupConditionsPanel extends javax.swing.JPanel {

    /** Creates new form SetupConditionsPanel */
    public SetupConditionsPanel() {
        initComponents();
    }

    public JComboBox getCellLineComboBox() {
        return cellLineComboBox;
    }

    public JTextField getCellLineNameTextField() {
        return cellLineNameTextField;
    }

    public JButton getInsertCellLineButton() {
        return insertCellLineButton;
    }

    public JComboBox getEcmDimensionComboBox() {
        return ecmDimensionComboBox;
    }

    public JPanel getAssayEcmParentPanel() {
        return assayEcmParentPanel;
    }

    public JPanel getAssayEcmPanel() {
        return assayEcmPanel;
    }

    public JPanel getTreatmentDualListParent() {
        return treatmentDualListParent;
    }

    public JTextField getTimingTextField() {
        return timingTextField;
    }

    public JTextArea getAdditionalInfoTextArea() {
        return additionalInfoTextArea;
    }

    public JTextField getConcentrationTextField() {
        return concentrationTextField;
    }

    public JComboBox getGrowthMediumComboBox() {
        return growthMediumComboBox;
    }

    public void setGrowthMediumComboBox(JComboBox growthMediumComboBox) {
        this.growthMediumComboBox = growthMediumComboBox;
    }

    public JTextField getSeedingDensityTextField() {
        return seedingDensityTextField;
    }

    public void setSeedingDensityTextField(JTextField seedingDensityTextField) {
        this.seedingDensityTextField = seedingDensityTextField;
    }

    public JTextField getSeedingTimeTextField() {
        return seedingTimeTextField;
    }

    public void setSeedingTimeTextField(JTextField seedingTimeTextField) {
        this.seedingTimeTextField = seedingTimeTextField;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jTabbedPane1 = new javax.swing.JTabbedPane();
        cellLinePanel = new javax.swing.JPanel();
        cellLineComboBox = new javax.swing.JComboBox();
        selectCellLineLabel = new javax.swing.JLabel();
        cellLineNameLabel = new javax.swing.JLabel();
        cellLineNameTextField = new javax.swing.JTextField();
        insertCellLineButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        seedingDensityLabel = new javax.swing.JLabel();
        seedingTimeLabel = new javax.swing.JLabel();
        growthMediumLabel = new javax.swing.JLabel();
        seedingDensityTextField = new javax.swing.JTextField();
        seedingTimeTextField = new javax.swing.JTextField();
        growthMediumComboBox = new javax.swing.JComboBox();
        assayEcmPanel = new javax.swing.JPanel();
        ecmDimensionPanel = new javax.swing.JPanel();
        ecmDimensionLabel = new javax.swing.JLabel();
        ecmDimensionComboBox = new javax.swing.JComboBox();
        assayEcmParentPanel = new javax.swing.JPanel();
        treatmentPanel = new javax.swing.JPanel();
        treatmentDualListParent = new javax.swing.JPanel();
        treatmentSetupPanel = new javax.swing.JPanel();
        additionalInfoLabel = new javax.swing.JLabel();
        timingLabel = new javax.swing.JLabel();
        timingTextField = new javax.swing.JTextField();
        concentrationLabel = new javax.swing.JLabel();
        concentrationTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        additionalInfoTextArea = new javax.swing.JTextArea();

        setLayout(new java.awt.GridBagLayout());

        selectCellLineLabel.setText("Select a cell line");

        cellLineNameLabel.setText("Cell line name");

        insertCellLineButton.setText("Add Cell Line");

        jLabel1.setText("If the cell line you want to use is not present, add it:");

        seedingDensityLabel.setText("Seeding Density");

        seedingTimeLabel.setText("Seeding Time");

        growthMediumLabel.setText("Growth Medium");

        growthMediumComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout cellLinePanelLayout = new javax.swing.GroupLayout(cellLinePanel);
        cellLinePanel.setLayout(cellLinePanelLayout);
        cellLinePanelLayout.setHorizontalGroup(
            cellLinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cellLinePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cellLinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cellLinePanelLayout.createSequentialGroup()
                        .addComponent(growthMediumLabel)
                        .addGap(18, 18, 18)
                        .addComponent(growthMediumComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cellLinePanelLayout.createSequentialGroup()
                        .addGroup(cellLinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectCellLineLabel)
                            .addComponent(seedingDensityLabel)
                            .addComponent(seedingTimeLabel))
                        .addGap(18, 18, 18)
                        .addGroup(cellLinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(seedingTimeTextField)
                            .addComponent(cellLineComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seedingDensityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1)
                    .addGroup(cellLinePanelLayout.createSequentialGroup()
                        .addComponent(cellLineNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cellLineNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(insertCellLineButton)))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        cellLinePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {seedingDensityLabel, seedingTimeLabel});

        cellLinePanelLayout.setVerticalGroup(
            cellLinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cellLinePanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(cellLinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectCellLineLabel)
                    .addComponent(cellLineComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(cellLinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seedingDensityLabel)
                    .addComponent(seedingDensityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cellLinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seedingTimeLabel)
                    .addComponent(seedingTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cellLinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(growthMediumLabel)
                    .addComponent(growthMediumComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(cellLinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cellLineNameLabel)
                    .addComponent(cellLineNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertCellLineButton))
                .addContainerGap(191, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("cell line", cellLinePanel);

        assayEcmPanel.setLayout(new java.awt.GridBagLayout());

        ecmDimensionPanel.setPreferredSize(new java.awt.Dimension(250, 50));

        ecmDimensionLabel.setText("Choose ECM dimension");

        ecmDimensionComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout ecmDimensionPanelLayout = new javax.swing.GroupLayout(ecmDimensionPanel);
        ecmDimensionPanel.setLayout(ecmDimensionPanelLayout);
        ecmDimensionPanelLayout.setHorizontalGroup(
            ecmDimensionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ecmDimensionPanelLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(ecmDimensionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ecmDimensionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        ecmDimensionPanelLayout.setVerticalGroup(
            ecmDimensionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ecmDimensionPanelLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(ecmDimensionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ecmDimensionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ecmDimensionLabel))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        assayEcmPanel.add(ecmDimensionPanel, gridBagConstraints);

        assayEcmParentPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        assayEcmParentPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.6;
        assayEcmPanel.add(assayEcmParentPanel, gridBagConstraints);

        jTabbedPane1.addTab("assay-ecm", assayEcmPanel);

        treatmentPanel.setLayout(new java.awt.GridBagLayout());

        treatmentDualListParent.setMinimumSize(new java.awt.Dimension(20, 20));
        treatmentDualListParent.setPreferredSize(new java.awt.Dimension(20, 20));
        treatmentDualListParent.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.6;
        treatmentPanel.add(treatmentDualListParent, gridBagConstraints);

        treatmentSetupPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        treatmentSetupPanel.setPreferredSize(new java.awt.Dimension(20, 20));

        additionalInfoLabel.setText("Additional info");

        timingLabel.setText("Timing");

        concentrationLabel.setText("Concentration");

        additionalInfoTextArea.setColumns(20);
        additionalInfoTextArea.setRows(5);
        jScrollPane1.setViewportView(additionalInfoTextArea);

        javax.swing.GroupLayout treatmentSetupPanelLayout = new javax.swing.GroupLayout(treatmentSetupPanel);
        treatmentSetupPanel.setLayout(treatmentSetupPanelLayout);
        treatmentSetupPanelLayout.setHorizontalGroup(
            treatmentSetupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(treatmentSetupPanelLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(treatmentSetupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(timingLabel)
                    .addComponent(concentrationLabel)
                    .addComponent(additionalInfoLabel))
                .addGap(10, 10, 10)
                .addGroup(treatmentSetupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(timingTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(concentrationTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        treatmentSetupPanelLayout.setVerticalGroup(
            treatmentSetupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(treatmentSetupPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(treatmentSetupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(additionalInfoLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(treatmentSetupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timingLabel)
                    .addComponent(timingTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(treatmentSetupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(concentrationLabel)
                    .addComponent(concentrationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.4;
        treatmentPanel.add(treatmentSetupPanel, gridBagConstraints);

        jTabbedPane1.addTab("treatment", treatmentPanel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.8;
        gridBagConstraints.weighty = 1.0;
        add(jTabbedPane1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel additionalInfoLabel;
    private javax.swing.JTextArea additionalInfoTextArea;
    private javax.swing.JPanel assayEcmPanel;
    private javax.swing.JPanel assayEcmParentPanel;
    private javax.swing.JComboBox cellLineComboBox;
    private javax.swing.JLabel cellLineNameLabel;
    private javax.swing.JTextField cellLineNameTextField;
    private javax.swing.JPanel cellLinePanel;
    private javax.swing.JLabel concentrationLabel;
    private javax.swing.JTextField concentrationTextField;
    private javax.swing.JComboBox ecmDimensionComboBox;
    private javax.swing.JLabel ecmDimensionLabel;
    private javax.swing.JPanel ecmDimensionPanel;
    private javax.swing.JComboBox growthMediumComboBox;
    private javax.swing.JLabel growthMediumLabel;
    private javax.swing.JButton insertCellLineButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel seedingDensityLabel;
    private javax.swing.JTextField seedingDensityTextField;
    private javax.swing.JLabel seedingTimeLabel;
    private javax.swing.JTextField seedingTimeTextField;
    private javax.swing.JLabel selectCellLineLabel;
    private javax.swing.JLabel timingLabel;
    private javax.swing.JTextField timingTextField;
    private javax.swing.JPanel treatmentDualListParent;
    private javax.swing.JPanel treatmentPanel;
    private javax.swing.JPanel treatmentSetupPanel;
    // End of variables declaration//GEN-END:variables
}