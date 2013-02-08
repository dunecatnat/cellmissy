/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ConditionsPanel.java
 *
 * Created on Apr 6, 2012, 11:18:03 AM
 */
package be.ugent.maf.cellmissy.gui.experiment.setup;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JScrollPane;

/**
 *
 * @author Paola
 */
public class ConditionsPanel extends javax.swing.JPanel {

    /** Creates new form ConditionsPanel */
    public ConditionsPanel() {
        initComponents();
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getRemoveButton() {
        return removeButton;
    }

    public JList getConditionsJList() {
        return conditionsJList;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        conditionsJList = new javax.swing.JList();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(30, 30));

        addButton.setText("Add New Condition");

        removeButton.setText("Remove Condition");

        jScrollPane1.setBorder(null);
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setMinimumSize(new java.awt.Dimension(20, 20));
        jScrollPane1.setVerifyInputWhenFocusTarget(false);

        conditionsJList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        conditionsJList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        conditionsJList.setSelectedIndex(0);
        jScrollPane1.setViewportView(conditionsJList);
        conditionsJList.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addButton)
                    .addComponent(removeButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeButton)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JList conditionsJList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeButton;
    // End of variables declaration//GEN-END:variables
}
