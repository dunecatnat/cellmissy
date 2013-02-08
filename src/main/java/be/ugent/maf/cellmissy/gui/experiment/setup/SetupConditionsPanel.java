/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SetupConditionsPanel.java
 *
 * Created on Apr 2, 2012, 10:41:55 AM
 */
package be.ugent.maf.cellmissy.gui.experiment.setup;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
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

    public JButton getAddCellLineButton() {
        return addCellLineButton;
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

    public JComboBox getGrowthMediumComboBox() {
        return growthMediumComboBox;
    }

    public JTextField getSeedingDensityTextField() {
        return seedingDensityTextField;
    }

    public JTextField getSeedingTimeTextField() {
        return seedingTimeTextField;
    }

    public JPanel getTreatmentParentPanel() {
        return treatmentParentPanel;
    }

    public JTabbedPane getjTabbedPane1() {
        return jTabbedPane1;
    }

    public JComboBox getSerumComboBox() {
        return serumComboBox;
    }

    public JTextField getSerumConcentrationTextField() {
        return serumConcentrationTextField;
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
        jPanel1 = new javax.swing.JPanel();
        cellLineComboBox = new javax.swing.JComboBox();
        selectCellLineLabel = new javax.swing.JLabel();
        seedingDensityLabel = new javax.swing.JLabel();
        seedingDensityTextField = new javax.swing.JTextField();
        seedingTimeTextField = new javax.swing.JTextField();
        seedingTimeLabel = new javax.swing.JLabel();
        growthMediumLabel = new javax.swing.JLabel();
        growthMediumComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        serumConcentrationLabel = new javax.swing.JLabel();
        serumConcentrationTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        serumLabel = new javax.swing.JLabel();
        serumComboBox = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cellLineNameLabel = new javax.swing.JLabel();
        cellLineNameTextField = new javax.swing.JTextField();
        addCellLineButton = new javax.swing.JButton();
        assayEcmPanel = new javax.swing.JPanel();
        ecmDimensionPanel = new javax.swing.JPanel();
        ecmDimensionLabel = new javax.swing.JLabel();
        ecmDimensionComboBox = new javax.swing.JComboBox();
        assayEcmParentPanel = new javax.swing.JPanel();
        treatmentParentPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        cellLinePanel.setOpaque(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Choose a Cell Line"));
        jPanel1.setOpaque(false);

        selectCellLineLabel.setText("Select a cell line");

        seedingDensityLabel.setText("Seeding Density");

        seedingTimeLabel.setText("Seeding Time");

        growthMediumLabel.setText("Growth Medium");

        jLabel2.setText("cells/well");

        serumConcentrationLabel.setText("Serum Concentration");

        jLabel3.setText("%");

        serumLabel.setText("Serum");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(seedingDensityLabel)
                        .addComponent(selectCellLineLabel)
                        .addComponent(seedingTimeLabel))
                    .addComponent(growthMediumLabel)
                    .addComponent(serumLabel)
                    .addComponent(serumConcentrationLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(growthMediumComboBox, 0, 83, Short.MAX_VALUE)
                    .addComponent(seedingTimeTextField)
                    .addComponent(seedingDensityTextField)
                    .addComponent(serumConcentrationTextField)
                    .addComponent(cellLineComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(serumComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {seedingDensityLabel, seedingTimeLabel});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectCellLineLabel)
                    .addComponent(cellLineComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seedingDensityLabel)
                    .addComponent(seedingDensityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seedingTimeLabel)
                    .addComponent(seedingTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(growthMediumLabel)
                    .addComponent(growthMediumComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serumLabel)
                    .addComponent(serumComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serumConcentrationLabel)
                    .addComponent(serumConcentrationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Add a new Cell Line"));
        jPanel2.setMinimumSize(new java.awt.Dimension(20, 20));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(20, 20));

        jLabel1.setText("If the cell line you want to use is not present, add it:");

        cellLineNameLabel.setText("Cell line name");

        addCellLineButton.setText("Add Cell Line");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cellLineNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cellLineNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addCellLineButton))
                    .addComponent(jLabel1))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cellLineNameLabel)
                    .addComponent(cellLineNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCellLineButton))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout cellLinePanelLayout = new javax.swing.GroupLayout(cellLinePanel);
        cellLinePanel.setLayout(cellLinePanelLayout);
        cellLinePanelLayout.setHorizontalGroup(
            cellLinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cellLinePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cellLinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
        );
        cellLinePanelLayout.setVerticalGroup(
            cellLinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cellLinePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("Cell Line", cellLinePanel);

        assayEcmPanel.setOpaque(false);
        assayEcmPanel.setLayout(new java.awt.GridBagLayout());

        ecmDimensionPanel.setOpaque(false);
        ecmDimensionPanel.setPreferredSize(new java.awt.Dimension(20, 20));

        ecmDimensionLabel.setText("Select ECM dimension");

        ecmDimensionComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout ecmDimensionPanelLayout = new javax.swing.GroupLayout(ecmDimensionPanel);
        ecmDimensionPanel.setLayout(ecmDimensionPanelLayout);
        ecmDimensionPanelLayout.setHorizontalGroup(
            ecmDimensionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ecmDimensionPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(ecmDimensionLabel)
                .addGap(18, 18, 18)
                .addComponent(ecmDimensionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(282, Short.MAX_VALUE))
        );
        ecmDimensionPanelLayout.setVerticalGroup(
            ecmDimensionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ecmDimensionPanelLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(ecmDimensionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ecmDimensionLabel)
                    .addComponent(ecmDimensionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.1;
        assayEcmPanel.add(ecmDimensionPanel, gridBagConstraints);

        assayEcmParentPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        assayEcmParentPanel.setOpaque(false);
        assayEcmParentPanel.setPreferredSize(new java.awt.Dimension(20, 20));
        assayEcmParentPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.9;
        assayEcmPanel.add(assayEcmParentPanel, gridBagConstraints);

        jTabbedPane1.addTab("Assay-Ecm", assayEcmPanel);

        treatmentParentPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        treatmentParentPanel.setOpaque(false);
        treatmentParentPanel.setPreferredSize(new java.awt.Dimension(20, 20));
        treatmentParentPanel.setLayout(new java.awt.GridBagLayout());
        jTabbedPane1.addTab("Treatments", treatmentParentPanel);

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
    private javax.swing.JButton addCellLineButton;
    private javax.swing.JPanel assayEcmPanel;
    private javax.swing.JPanel assayEcmParentPanel;
    private javax.swing.JComboBox cellLineComboBox;
    private javax.swing.JLabel cellLineNameLabel;
    private javax.swing.JTextField cellLineNameTextField;
    private javax.swing.JPanel cellLinePanel;
    private javax.swing.JComboBox ecmDimensionComboBox;
    private javax.swing.JLabel ecmDimensionLabel;
    private javax.swing.JPanel ecmDimensionPanel;
    private javax.swing.JComboBox growthMediumComboBox;
    private javax.swing.JLabel growthMediumLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel seedingDensityLabel;
    private javax.swing.JTextField seedingDensityTextField;
    private javax.swing.JLabel seedingTimeLabel;
    private javax.swing.JTextField seedingTimeTextField;
    private javax.swing.JLabel selectCellLineLabel;
    private javax.swing.JComboBox serumComboBox;
    private javax.swing.JLabel serumConcentrationLabel;
    private javax.swing.JTextField serumConcentrationTextField;
    private javax.swing.JLabel serumLabel;
    private javax.swing.JPanel treatmentParentPanel;
    // End of variables declaration//GEN-END:variables
}
