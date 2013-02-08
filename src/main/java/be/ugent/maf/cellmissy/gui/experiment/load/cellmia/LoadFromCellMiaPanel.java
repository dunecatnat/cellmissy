/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LoadFromCellMiaPanel.java
 *
 * Created on Jun 15, 2012, 1:36:56 PM
 */
package be.ugent.maf.cellmissy.gui.experiment.load.cellmia;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

/**
 *
 * @author Paola Masuzzo
 */
public class LoadFromCellMiaPanel extends javax.swing.JPanel {

    /** Creates new form LoadFromCellMiaPanel */
    public LoadFromCellMiaPanel() {
        initComponents();
    }

    public JPanel getPlateViewParentPanel() {
        return plateViewParentPanel;
    }

    public JPanel getExpOverviewParentPanel() {
        return expOverviewParentPanel;
    }

    public JPanel getExpMetadataParentPanel() {
        return expMetadataParentPanel;
    }

    public JLabel getInfolabel() {
        return infolabel;
    }

    public JButton getExpDataButton() {
        return parseObsepFileButton;
    }

    public JButton getForwardButton() {
        return forwardButton;
    }

    public JButton getFinishButton() {
        return finishButton;
    }

    public JProgressBar getjProgressBar1() {
        return jProgressBar1;
    }

    public JButton getCancelButton() {
        return cancelButton;
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

        topPanel = new javax.swing.JPanel();
        leftPanel = new javax.swing.JPanel();
        expOverviewParentPanel = new javax.swing.JPanel();
        expMetadataParentPanel = new javax.swing.JPanel();
        plateViewParentPanel = new javax.swing.JPanel();
        bottomPanel = new javax.swing.JPanel();
        infolabel = new javax.swing.JLabel();
        forwardButton = new javax.swing.JButton();
        finishButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        parseObsepFileButton = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        topPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        topPanel.setOpaque(false);
        topPanel.setPreferredSize(new java.awt.Dimension(20, 20));
        topPanel.setLayout(new java.awt.GridBagLayout());

        leftPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        leftPanel.setOpaque(false);
        leftPanel.setPreferredSize(new java.awt.Dimension(20, 20));
        leftPanel.setLayout(new java.awt.GridBagLayout());

        expOverviewParentPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        expOverviewParentPanel.setOpaque(false);
        expOverviewParentPanel.setPreferredSize(new java.awt.Dimension(20, 20));
        expOverviewParentPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.7;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 0, 0);
        leftPanel.add(expOverviewParentPanel, gridBagConstraints);

        expMetadataParentPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        expMetadataParentPanel.setOpaque(false);
        expMetadataParentPanel.setPreferredSize(new java.awt.Dimension(20, 20));
        expMetadataParentPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.8;
        gridBagConstraints.weighty = 0.3;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 20, 0);
        leftPanel.add(expMetadataParentPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 1.0;
        topPanel.add(leftPanel, gridBagConstraints);

        plateViewParentPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Plate view"));
        plateViewParentPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        plateViewParentPanel.setOpaque(false);
        plateViewParentPanel.setPreferredSize(new java.awt.Dimension(20, 20));
        plateViewParentPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.8;
        gridBagConstraints.insets = new java.awt.Insets(100, 100, 100, 100);
        topPanel.add(plateViewParentPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.9;
        add(topPanel, gridBagConstraints);

        bottomPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Info"));
        bottomPanel.setOpaque(false);
        bottomPanel.setPreferredSize(new java.awt.Dimension(20, 20));

        infolabel.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N

        forwardButton.setText("Forward");

        finishButton.setText("Finish");

        cancelButton.setText("Cancel");

        parseObsepFileButton.setText("Exp Data");

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(infolabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(358, 358, 358)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(parseObsepFileButton)
                .addGap(18, 18, 18)
                .addComponent(cancelButton)
                .addGap(18, 18, 18)
                .addComponent(forwardButton)
                .addGap(18, 18, 18)
                .addComponent(finishButton)
                .addGap(158, 158, 158))
        );

        bottomPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelButton, finishButton, forwardButton, parseObsepFileButton});

        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bottomPanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(finishButton)
                            .addComponent(forwardButton)
                            .addComponent(cancelButton)
                            .addComponent(parseObsepFileButton))
                        .addGroup(bottomPanelLayout.createSequentialGroup()
                            .addComponent(infolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(3, 3, 3))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.1;
        add(bottomPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JPanel expMetadataParentPanel;
    private javax.swing.JPanel expOverviewParentPanel;
    private javax.swing.JButton finishButton;
    private javax.swing.JButton forwardButton;
    private javax.swing.JLabel infolabel;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JButton parseObsepFileButton;
    private javax.swing.JPanel plateViewParentPanel;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
