/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PlateFrame.java
 *
 * Created on Jan 20, 2012, 4:32:52 PM
 */
package be.ugent.maf.cellmissy.gui.plate;

import be.ugent.maf.cellmissy.entity.PlateFormat;
import be.ugent.maf.cellmissy.gui.ButtonPanel;
import be.ugent.maf.cellmissy.gui.mediator.PlateMediator;
import be.ugent.maf.cellmissy.gui.mediator.impl.PlateMediatorImpl;
import be.ugent.maf.cellmissy.service.PlateService;
import be.ugent.maf.cellmissy.spring.ApplicationContextProvider;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import org.apache.log4j.Logger;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.BindingGroup;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.observablecollections.ObservableList;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author Paola
 */
public class PlateFrame extends javax.swing.JFrame implements ComponentListener {
    private static final Logger LOG = Logger.getLogger(PlateFrame.class);
    
    private PlateMediator plateMediator;
    private PlateService plateService;
    private ObservableList<PlateFormat> plateFormatBindingList;
    private BindingGroup bindingGroup;
    private PlatePanel platePanel;

    /** Creates new form PlateFrame */
    public PlateFrame() {
        initComponents();
        //load applicationContext
        ApplicationContext context = ApplicationContextProvider.getInstance().getApplicationContext();
        plateService = (PlateService) context.getBean("plateService");

        //init plateFormatJcombo
        plateFormatBindingList = ObservableCollections.observableList(plateService.findAll());
        JComboBoxBinding jComboBoxBinding = SwingBindings.createJComboBoxBinding(UpdateStrategy.READ_WRITE, plateFormatBindingList, plateFormatComboBox);
        bindingGroup = new BindingGroup();
        bindingGroup.addBinding(jComboBoxBinding);
        bindingGroup.bind();
        // show 96 plate format as default
        plateFormatComboBox.setSelectedIndex(0);

        addComponentListener(this);

        plateMediator = new PlateMediatorImpl();

        //create new platePanel and add it to the middlePanel
        platePanel = new PlatePanel(plateMediator);
        middlePanel.add(platePanel);

        // initializes platePanel
        PlateFormat selectedPlateFormat = plateFormatBindingList.get(plateFormatComboBox.getSelectedIndex());
        Dimension parentDimension = middlePanel.getSize();
        platePanel.initPanel(selectedPlateFormat, parentDimension);
        repaint();

        // create new buttonPanel and add it to the bottomPanel
        ButtonPanel buttonPanel = new ButtonPanel(plateMediator);
        bottomPanel.add(buttonPanel);

        // set PlatePanel and ButtonPanel of PlateMediator
        plateMediator.setPlatePanel(platePanel);
        plateMediator.setButtonPanel(buttonPanel);
        // disable Finish button
        plateMediator.disableFinishButton();
        plateMediator.hideProgressBar();

        ActionListener actionListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {               
                PlateFormat selectedPlateFormat = plateFormatBindingList.get(plateFormatComboBox.getSelectedIndex());
                Dimension parentDimension = middlePanel.getSize();
                platePanel.initPanel(selectedPlateFormat, parentDimension);
                repaint();
            }
        };

        plateFormatComboBox.addActionListener(actionListener);

    }

    @Override
    public void componentResized(ComponentEvent e) {
        platePanel.doResize(middlePanel.getSize());
    }

    @Override
    public void componentMoved(ComponentEvent e) {
    }

    @Override
    public void componentShown(ComponentEvent e) {
    }

    @Override
    public void componentHidden(ComponentEvent e) {
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
        plateFormatComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        middlePanel = new javax.swing.JPanel();
        bottomPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Plate");
        setAutoRequestFocus(false);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("plateFrame"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        topPanel.setAutoscrolls(true);

        plateFormatComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        plateFormatComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plateFormatComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel1.setText("Select a plate format ");

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(plateFormatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(plateFormatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        topPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, plateFormatComboBox});

        getContentPane().add(topPanel, new java.awt.GridBagConstraints());

        middlePanel.setPreferredSize(new java.awt.Dimension(412, 120));

        javax.swing.GroupLayout middlePanelLayout = new javax.swing.GroupLayout(middlePanel);
        middlePanel.setLayout(middlePanelLayout);
        middlePanelLayout.setHorizontalGroup(
            middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );
        middlePanelLayout.setVerticalGroup(
            middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(middlePanel, gridBagConstraints);
        middlePanel.getAccessibleContext().setAccessibleName("");
        middlePanel.getAccessibleContext().setAccessibleDescription("");

        bottomPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bottomPanel.setMinimumSize(new java.awt.Dimension(330, 60));
        bottomPanel.setPreferredSize(new java.awt.Dimension(330, 100));
        bottomPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        getContentPane().add(bottomPanel, gridBagConstraints);

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void plateFormatComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plateFormatComboBoxActionPerformed
        // TODO add your handling code here:}//GEN-LAST:event_plateFormatComboBoxActionPerformed
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PlateFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel middlePanel;
    private javax.swing.JComboBox plateFormatComboBox;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}