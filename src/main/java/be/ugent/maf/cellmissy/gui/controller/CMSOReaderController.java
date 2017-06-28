/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ugent.maf.cellmissy.gui.controller;

import be.ugent.maf.cellmissy.gui.cmso.CMSOReaderPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author CompOmics Gwen
 */
public class CMSOReaderController {

    private static final org.apache.log4j.Logger LOG = org.apache.log4j.Logger.getLogger(CMSOReaderController.class);
    //model
    //view
    private CMSOReaderPanel cmsoReaderPanel;
    // parent controller
    @Autowired
    private CellMissyController cellMissyController;

    /**
     * Initialize controller
     */
    public void init() {
        //init view
        initCMSOReaderPanel();
    }

    /**
     * Initialize view
     */
    private void initCMSOReaderPanel() {
        //make summary text areas uneditable
        cmsoReaderPanel.getSummaryTextArea().setEditable(false);
        cmsoReaderPanel.getIsaTextArea().setEditable(false);
        cmsoReaderPanel.getOmeTextArea().setEditable(false);
        cmsoReaderPanel.getDpTextArea().setEditable(false);

        /**
         * Action Listeners
         */
        cmsoReaderPanel.getChooseFolderButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open a JFile Chooser
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Choose a CMSO dataset directory to import");
                fileChooser.setApproveButtonText("Choose directory");
                // Make sure only directories can be selected
                fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                fileChooser.setAcceptAllFileFilterUsed(false);
                // in response to the button click, show open dialog
                int returnVal = fileChooser.showOpenDialog(cmsoReaderPanel);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File chosenFile = fileChooser.getSelectedFile();
                    //check if directory name is conform ---?
                    // if so: set text field and parse data
                    if (chosenFile.getName().startsWith("cmsodataset")) {
                        cmsoReaderPanel.getFolderTextField().setText(chosenFile.getAbsolutePath());
                        parseCMSODataset(chosenFile);
                    } 
                    // else display error popup
                    else {
                        JOptionPane.showMessageDialog(cmsoReaderPanel, "The chosen directory does not seem to be a CMSO dataset", "Folder name incorrect", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        });
    }

    // need to read isa, ome and ../dp stuff and display
    //implement parsers (interface-impl) ??
    // --> what to return? String / Map<String, String> ("isa":"...info")
    // (to return a new class seems dumb)
    // ++ what in case of multiple  datapackages? show all in text
    //      and force user to choose one for analysis when continuing
    private void parseCMSODataset(File file) {
        try {
            //parsing and setting separated into two lines for debugging
            data = Parser.parseFile(file);
        } catch (FileParserException ex) {
            LOG.error(ex.getMessage());
            cellMissyController.showMessage(ex.getMessage(), "Error in input file", JOptionPane.ERROR_MESSAGE);
        }
    }
}
