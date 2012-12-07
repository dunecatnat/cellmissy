/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AssayEcm3DPanel.java
 *
 * Created on Apr 3, 2012, 3:04:23 PM
 */
package be.ugent.maf.cellmissy.gui.experiment.setup;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Paola
 */
public class AssayEcm3DPanel extends javax.swing.JPanel {

    /** Creates new form AssayEcm3DPanel */
    public AssayEcm3DPanel() {
        initComponents();
    }

    public JComboBox getAssayComboBox() {
        return assayComboBox;
    }

    public JComboBox getCompositionComboBox() {
        return compositionComboBox;
    }

    public JComboBox getDensityComboBox() {
        return densityComboBox;
    }

    public JTextField getPolymerizationTemperatureTextField() {
        return polymerizationTemperatureTextField;
    }

    public JTextField getPolymerizationTimeTextField() {
        return polymerizationTimeTextField;
    }

    public JTextField getVolumeTextField() {
        return volumeTextField;
    }

    public JButton getAddCompositionButton() {
        return addCompositionButton;
    }

    public JTextField getCompositionTextField() {
        return compositionTextField;
    }

    public JLabel getVolumeUnitLabel() {
        return volumeUnitLabel;
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

        assayPanel = new javax.swing.JPanel();
        assayComboBox = new javax.swing.JComboBox();
        selectAssayLabel = new javax.swing.JLabel();
        ecmPanel = new javax.swing.JPanel();
        densityLabel = new javax.swing.JLabel();
        compositionLabel = new javax.swing.JLabel();
        volumeLabel = new javax.swing.JLabel();
        polymerizationTimeLabel = new javax.swing.JLabel();
        polymerizationTemperatureLabel = new javax.swing.JLabel();
        volumeTextField = new javax.swing.JTextField();
        polymerizationTimeTextField = new javax.swing.JTextField();
        polymerizationTemperatureTextField = new javax.swing.JTextField();
        compositionComboBox = new javax.swing.JComboBox();
        densityComboBox = new javax.swing.JComboBox();
        addCompositionButton = new javax.swing.JButton();
        compositionTextField = new javax.swing.JTextField();
        volumeUnitLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        assayPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        assayPanel.setOpaque(false);
        assayPanel.setPreferredSize(new java.awt.Dimension(20, 20));

        assayComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        selectAssayLabel.setText("Select an invasion assay");

        javax.swing.GroupLayout assayPanelLayout = new javax.swing.GroupLayout(assayPanel);
        assayPanel.setLayout(assayPanelLayout);
        assayPanelLayout.setHorizontalGroup(
            assayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assayPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(selectAssayLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(assayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(343, Short.MAX_VALUE))
        );
        assayPanelLayout.setVerticalGroup(
            assayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(assayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectAssayLabel))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.1;
        add(assayPanel, gridBagConstraints);

        ecmPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Extra Cellular Matrix", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        ecmPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        ecmPanel.setOpaque(false);
        ecmPanel.setPreferredSize(new java.awt.Dimension(20, 20));

        densityLabel.setText("Density");

        compositionLabel.setText("Composition");

        volumeLabel.setText("Volume");

        polymerizationTimeLabel.setText("Polymerization time (min)");

        polymerizationTemperatureLabel.setText("Polymerization temperature");

        volumeTextField.setText("0");

        compositionComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        densityComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        addCompositionButton.setText("Add new composition");

        volumeUnitLabel.setMinimumSize(new java.awt.Dimension(10, 10));

        javax.swing.GroupLayout ecmPanelLayout = new javax.swing.GroupLayout(ecmPanel);
        ecmPanel.setLayout(ecmPanelLayout);
        ecmPanelLayout.setHorizontalGroup(
            ecmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ecmPanelLayout.createSequentialGroup()
                .addGroup(ecmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ecmPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ecmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(densityLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(volumeLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(polymerizationTimeLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(polymerizationTemperatureLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ecmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(densityComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(volumeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                            .addComponent(polymerizationTimeTextField)
                            .addComponent(polymerizationTemperatureTextField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(volumeUnitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ecmPanelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(ecmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ecmPanelLayout.createSequentialGroup()
                                .addComponent(compositionTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addCompositionButton))
                            .addGroup(ecmPanelLayout.createSequentialGroup()
                                .addComponent(compositionLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(compositionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(253, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ecmPanelLayout.setVerticalGroup(
            ecmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ecmPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(ecmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(compositionLabel)
                    .addComponent(compositionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(ecmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCompositionButton)
                    .addComponent(compositionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(ecmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(densityLabel)
                    .addComponent(densityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ecmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(volumeUnitLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(volumeTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(volumeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ecmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(polymerizationTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(polymerizationTimeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ecmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(polymerizationTemperatureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(polymerizationTemperatureLabel))
                .addGap(29, 29, 29))
        );

        ecmPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {volumeTextField, volumeUnitLabel});

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.9;
        add(ecmPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCompositionButton;
    private javax.swing.JComboBox assayComboBox;
    private javax.swing.JPanel assayPanel;
    private javax.swing.JComboBox compositionComboBox;
    private javax.swing.JLabel compositionLabel;
    private javax.swing.JTextField compositionTextField;
    private javax.swing.JComboBox densityComboBox;
    private javax.swing.JLabel densityLabel;
    private javax.swing.JPanel ecmPanel;
    private javax.swing.JLabel polymerizationTemperatureLabel;
    private javax.swing.JTextField polymerizationTemperatureTextField;
    private javax.swing.JLabel polymerizationTimeLabel;
    private javax.swing.JTextField polymerizationTimeTextField;
    private javax.swing.JLabel selectAssayLabel;
    private javax.swing.JLabel volumeLabel;
    private javax.swing.JTextField volumeTextField;
    private javax.swing.JLabel volumeUnitLabel;
    // End of variables declaration//GEN-END:variables
}