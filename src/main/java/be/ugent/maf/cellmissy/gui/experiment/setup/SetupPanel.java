/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SetupPanel.java
 *
 * Created on May 11, 2012, 3:26:08 PM
 */
package be.ugent.maf.cellmissy.gui.experiment.setup;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Paola Masuzzo
 */
public class SetupPanel extends javax.swing.JPanel {

    /**
     * Creates new form SetupPanel
     */
    public SetupPanel() {
        initComponents();
    }

    public JPanel getSetupPlateParentPanel() {
        return setupPlateParentPanel;
    }

    public JPanel getSetupConditionsParentPanel() {
        return setupConditionsParentPanel;
    }

    public JPanel getConditionsParentPanel() {
        return conditionsParentPanel;
    }

    public JButton getClearAllButton() {
        return clearAllButton;
    }

    public JButton getClearLastButton() {
        return clearLastButton;
    }

    public JLabel getExpNumberLabel() {
        return expNumberLabel;
    }

    public JLabel getExpPurposeLabel() {
        return expPurposeLabel;
    }

    public JLabel getProjNumberLabel() {
        return projNumberLabel;
    }

    public JButton getRandomButton() {
        return randomButton;
    }

    public JComboBox getPlateFormatComboBox() {
        return plateFormatComboBox;
    }

    public JPanel getBottomPanel() {
        return bottomPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        experimentMetadataPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        projNumberLabel = new javax.swing.JLabel();
        expNumberLabel = new javax.swing.JLabel();
        expPurposeLabel = new javax.swing.JLabel();
        conditionsParentPanel = new javax.swing.JPanel();
        setupConditionsParentPanel = new javax.swing.JPanel();
        platePanel = new javax.swing.JPanel();
        buttonsPanel = new javax.swing.JPanel();
        clearLastButton = new javax.swing.JButton();
        clearAllButton = new javax.swing.JButton();
        randomButton = new javax.swing.JButton();
        setupPlateParentPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        selectFormatLabel = new javax.swing.JLabel();
        plateFormatComboBox = new javax.swing.JComboBox();
        bottomPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        experimentMetadataPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Experiment metadata", 0, 0, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        experimentMetadataPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        experimentMetadataPanel.setOpaque(false);
        experimentMetadataPanel.setPreferredSize(new java.awt.Dimension(20, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Number:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Project:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Purpose:");

        projNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        expNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        expPurposeLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout experimentMetadataPanelLayout = new javax.swing.GroupLayout(experimentMetadataPanel);
        experimentMetadataPanel.setLayout(experimentMetadataPanelLayout);
        experimentMetadataPanelLayout.setHorizontalGroup(
            experimentMetadataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(experimentMetadataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(experimentMetadataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(experimentMetadataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(experimentMetadataPanelLayout.createSequentialGroup()
                        .addGroup(experimentMetadataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(projNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(expNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addComponent(expPurposeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        experimentMetadataPanelLayout.setVerticalGroup(
            experimentMetadataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(experimentMetadataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(experimentMetadataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(projNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(experimentMetadataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(expNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(experimentMetadataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(expPurposeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        add(experimentMetadataPanel, gridBagConstraints);

        conditionsParentPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Conditions", 0, 0, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        conditionsParentPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        conditionsParentPanel.setName(""); // NOI18N
        conditionsParentPanel.setOpaque(false);
        conditionsParentPanel.setPreferredSize(new java.awt.Dimension(20, 20));
        conditionsParentPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        add(conditionsParentPanel, gridBagConstraints);

        setupConditionsParentPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Conditions Setup", 0, 0, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        setupConditionsParentPanel.setMinimumSize(new java.awt.Dimension(10, 10));
        setupConditionsParentPanel.setOpaque(false);
        setupConditionsParentPanel.setPreferredSize(new java.awt.Dimension(10, 10));
        setupConditionsParentPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 10);
        add(setupConditionsParentPanel, gridBagConstraints);

        platePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Plate", 0, 0, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        platePanel.setMinimumSize(new java.awt.Dimension(20, 20));
        platePanel.setName(""); // NOI18N
        platePanel.setOpaque(false);
        platePanel.setPreferredSize(new java.awt.Dimension(20, 20));
        platePanel.setLayout(new java.awt.GridBagLayout());

        buttonsPanel.setMaximumSize(new java.awt.Dimension(20, 20));
        buttonsPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        buttonsPanel.setOpaque(false);
        buttonsPanel.setPreferredSize(new java.awt.Dimension(20, 20));

        clearLastButton.setText("Clear last selection");

        clearAllButton.setText("Clear all");

        randomButton.setText("Randomize wells");

        javax.swing.GroupLayout buttonsPanelLayout = new javax.swing.GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(buttonsPanelLayout);
        buttonsPanelLayout.setHorizontalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(randomButton)
                    .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(clearAllButton, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(clearLastButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap())
        );

        buttonsPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {clearAllButton, clearLastButton, randomButton});

        buttonsPanelLayout.setVerticalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsPanelLayout.createSequentialGroup()
                .addContainerGap(278, Short.MAX_VALUE)
                .addComponent(randomButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearLastButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearAllButton)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        platePanel.add(buttonsPanel, gridBagConstraints);

        setupPlateParentPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        setupPlateParentPanel.setOpaque(false);
        setupPlateParentPanel.setPreferredSize(new java.awt.Dimension(20, 20));
        setupPlateParentPanel.setLayout(new java.awt.GridBagLayout());

        topPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        topPanel.setOpaque(false);
        topPanel.setPreferredSize(new java.awt.Dimension(20, 20));

        selectFormatLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        selectFormatLabel.setText("Select a plate format");

        plateFormatComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(selectFormatLabel)
                .addGap(18, 18, 18)
                .addComponent(plateFormatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectFormatLabel)
                    .addComponent(plateFormatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        topPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {plateFormatComboBox, selectFormatLabel});

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.1;
        setupPlateParentPanel.add(topPanel, gridBagConstraints);

        bottomPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        bottomPanel.setOpaque(false);
        bottomPanel.setPreferredSize(new java.awt.Dimension(20, 20));
        bottomPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.9;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 75);
        setupPlateParentPanel.add(bottomPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.8;
        gridBagConstraints.weighty = 1.0;
        platePanel.add(setupPlateParentPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.6;
        gridBagConstraints.weighty = 0.8;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 0);
        add(platePanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JButton clearAllButton;
    private javax.swing.JButton clearLastButton;
    private javax.swing.JPanel conditionsParentPanel;
    private javax.swing.JLabel expNumberLabel;
    private javax.swing.JLabel expPurposeLabel;
    private javax.swing.JPanel experimentMetadataPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox plateFormatComboBox;
    private javax.swing.JPanel platePanel;
    private javax.swing.JLabel projNumberLabel;
    private javax.swing.JButton randomButton;
    private javax.swing.JLabel selectFormatLabel;
    private javax.swing.JPanel setupConditionsParentPanel;
    private javax.swing.JPanel setupPlateParentPanel;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
