/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CellMissyFrame.java
 *
 * Created on Mar 27, 2012, 4:45:13 PM
 */
package be.ugent.maf.cellmissy.gui;

import be.ugent.maf.cellmissy.gui.controller.CellMissyController;
import be.ugent.maf.cellmissy.spring.ApplicationContextProvider;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.UIManager;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author Paola
 */
public class CellMissyFrame extends javax.swing.JFrame {

    /** Creates new form CellMissyFrame */
    public CellMissyFrame() {
        initComponents();
        this.getContentPane().setBackground(new Color(255, 255, 255));
        UIManager.put("nimbusBase", Color.lightGray);      // Base color
        UIManager.put("nimbusBlueGrey", Color.lightGray);  // BlueGrey
        UIManager.put("control", Color.white);         // Control
        UIManager.put("OptionPane.background", Color.white); // Background for option pane
    }

    public JPanel getBackgroundPanel() {
        return backgroundPanel;
    }

    public JMenuItem getCellMiaMenuItem() {
        return cellMiaMenuItem;
    }

    public JMenuItem getDataAnalysisMenuItem() {
        return dataAnalysisMenuItem;
    }

    public JMenuItem getProjectMenuItem() {
        return newProjectMenuItem;
    }

    public JMenuItem getAllProjectsMenuItem() {
        return allProjectsMenuItem;
    }

    public JMenuItem getExitMenuItem() {
        return exitMenuItem;
    }

    public JMenuItem getNewExperimentMenuItem() {
        return newExperimentMenuItem;
    }

    public JMenuItem getNewProjectMenuItem() {
        return newProjectMenuItem;
    }

    public JMenuItem getUserMenuItem() {
        return userMenuItem;
    }

    public JMenuItem getGenericInputMenuItem() {
        return genericInputMenuItem;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        jMenuBar = new javax.swing.JMenuBar();
        projectMenu = new javax.swing.JMenu();
        newProjectMenuItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        allProjectsMenuItem = new javax.swing.JMenuItem();
        experimentMenu = new javax.swing.JMenu();
        newExperimentMenuItem = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        loadDataMenu = new javax.swing.JMenu();
        cellMiaMenuItem = new javax.swing.JMenuItem();
        genericInputMenuItem = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        dataAnalysisMenuItem = new javax.swing.JMenuItem();
        miscMenu = new javax.swing.JMenu();
        userMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exitMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(30, 5, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(120, 300));

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        backgroundPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        backgroundPanel.setPreferredSize(new java.awt.Dimension(20, 20));
        backgroundPanel.setLayout(new java.awt.GridBagLayout());

        jMenuBar.setBackground(java.awt.Color.white);
        jMenuBar.setAlignmentY(0.5F);
        jMenuBar.setMinimumSize(new java.awt.Dimension(5, 2));

        projectMenu.setText("Project");

        newProjectMenuItem.setText("Create Project ...");
        newProjectMenuItem.setIconTextGap(2);
        projectMenu.add(newProjectMenuItem);
        projectMenu.add(jSeparator2);

        allProjectsMenuItem.setText("Overview Projects ...");
        allProjectsMenuItem.setIconTextGap(2);
        projectMenu.add(allProjectsMenuItem);

        jMenuBar.add(projectMenu);

        experimentMenu.setText("Experiment");

        newExperimentMenuItem.setText("Create Experiment...");
        newExperimentMenuItem.setToolTipText("");
        newExperimentMenuItem.setIconTextGap(2);
        experimentMenu.add(newExperimentMenuItem);
        experimentMenu.add(jSeparator3);

        loadDataMenu.setText("Load Motility Data...");
        loadDataMenu.setIconTextGap(2);

        cellMiaMenuItem.setText("... from CELLMIA");
        loadDataMenu.add(cellMiaMenuItem);

        genericInputMenuItem.setText("... from generic input");
        loadDataMenu.add(genericInputMenuItem);

        experimentMenu.add(loadDataMenu);
        experimentMenu.add(jSeparator4);

        dataAnalysisMenuItem.setText("Data Analysis");
        dataAnalysisMenuItem.setIconTextGap(2);
        dataAnalysisMenuItem.setInheritsPopupMenu(true);
        experimentMenu.add(dataAnalysisMenuItem);

        jMenuBar.add(experimentMenu);

        miscMenu.setText("Miscellaneous");

        userMenuItem.setText("User Management");
        userMenuItem.setIconTextGap(2);
        miscMenu.add(userMenuItem);
        miscMenu.add(jSeparator1);

        exitMenuItem.setText("Quit CellMissy...");
        exitMenuItem.setIconTextGap(2);
        miscMenu.add(exitMenuItem);

        jMenuBar.add(miscMenu);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(CellMissyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                ApplicationContext context = ApplicationContextProvider.getInstance().getApplicationContext();
                CellMissyController cellMissyController = (CellMissyController) context.getBean("cellMissyController");

                cellMissyController.init();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem allProjectsMenuItem;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JMenuItem cellMiaMenuItem;
    private javax.swing.JMenuItem dataAnalysisMenuItem;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu experimentMenu;
    private javax.swing.JMenuItem genericInputMenuItem;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JMenu loadDataMenu;
    private javax.swing.JMenu miscMenu;
    private javax.swing.JMenuItem newExperimentMenuItem;
    private javax.swing.JMenuItem newProjectMenuItem;
    private javax.swing.JMenu projectMenu;
    private javax.swing.JMenuItem userMenuItem;
    // End of variables declaration//GEN-END:variables
}
