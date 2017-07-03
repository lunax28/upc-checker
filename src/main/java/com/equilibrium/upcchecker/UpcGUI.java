/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.equilibrium.upcchecker;

import com.equilibrium.spotifyApi.ApiClass;
import com.equilibrium.spotifyApi.SystemClipboard;
import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.BufferedWriter;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author equilibrium
 */
public class UpcGUI extends javax.swing.JFrame {

    File sourceFolderPath = null;

    private String token;
    private List<String> linkArray;
    private List<String> upcArray;
    private ApiClass apify;

    /**
     * Creates new form UpcGUI
     */
    public UpcGUI() {
        initComponents();
        this.apify = new ApiClass();
        this.token = this.apify.getToken();
        this.linkArray = new ArrayList<String>();
        this.upcArray = new ArrayList<String>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        upcListLabel = new javax.swing.JLabel();
        upcResultsLabel = new javax.swing.JLabel();
        jButton = new javax.swing.JButton();
        upcListTextArea = new java.awt.TextArea();
        upcResultsTextArea = new java.awt.TextArea();
        getTokenLabel = new javax.swing.JLabel();
        upcListTextArea1 = new java.awt.TextArea();
        upcListTextArea2 = new java.awt.TextArea();
        upcListLabel1 = new javax.swing.JLabel();
        upcListLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        fileSelectorButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        copyItemMenu = new javax.swing.JMenuItem();
        pasteItemMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        upcListLabel.setText("UPC LIST");

        upcResultsLabel.setText("RESULTS");

        jButton.setText("CHECK");
        jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt);
            }
        });

        getTokenLabel.setText("Get Token");

        upcListTextArea1.setEditable(false);
        upcListTextArea1.setEnabled(false);

        upcListTextArea2.setEditable(false);
        upcListTextArea2.setEnabled(false);

        upcListLabel1.setText("ARTIST ID");

        upcListLabel2.setText("RESULTS");

        jButton1.setText("CHECK");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        fileSelectorButton.setText("FOLDER");
        fileSelectorButton.setEnabled(false);
        fileSelectorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileSelectorButtonActionPerformed(evt);
            }
        });

        jButton3.setText("FOLDER");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        copyItemMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.META_MASK));
        copyItemMenu.setText("Copy");
        copyItemMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyItemMenuActionPerformed(evt);
            }
        });
        jMenu2.add(copyItemMenu);

        pasteItemMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.META_MASK));
        pasteItemMenu.setText("Paste");
        pasteItemMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteItemMenuActionPerformed(evt);
            }
        });
        jMenu2.add(pasteItemMenu);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(upcListTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(upcListTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(upcListTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fileSelectorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(16, 16, 16)
                                .addComponent(upcResultsTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(upcListLabel1)
                        .addGap(182, 182, 182)
                        .addComponent(upcListLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(upcListLabel)
                        .addGap(183, 183, 183)
                        .addComponent(upcResultsLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(getTokenLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(getTokenLabel)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(upcResultsLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(upcListLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(upcResultsTextArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(upcListTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(fileSelectorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton)))
                .addGap(37, 37, 37)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(upcListLabel1)
                    .addComponent(upcListLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(upcListTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(upcListTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(113, 113, 113))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActionPerformed

        if (upcListTextArea.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "UPC list empty!");
            return;

        }

        if (this.apify.getResponseCode() == 429 || this.apify.getResponseCode() == 0) {
            apify = new ApiClass();
            this.token = apify.getToken();

        }

        String link = "";
        System.out.println("UPC QUERY LINK:: " + link);
        Scanner scanner = null;
        String tmp = "";
        try {
            scanner = new Scanner(upcListTextArea.getText());

            //for (int i = 0; i < 15; i++) {
            while (scanner.hasNextLine()) {
                tmp = scanner.nextLine();
                upcArray.add(tmp);
                link = ("https://api.spotify.com/v1/search?q=upc:" + tmp + "&type=album");
                linkArray.add(link);
            }
            //}
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        /*
        Path file = Paths.get("/Users/equilibrium/Desktop/test.txt");
        List<String> apifyresult = new ArrayList();
        for (String upclink : linkArray) {
            apifyresult.add(apify.isAlbum(upclink).toString() + "\n");

        }
        try {
            Files.write(file, apifyresult, Charset.forName("UTF-8"));

            
            for(String upclink : linkArray){
            
            //upcResultsTextArea.setText(apify.isAlbum(upclink).toString() + "\n");
            upcResultsTextArea.append(apify.isAlbum(upclink).toString() + "\n");
            
            }    
             
        } catch (IOException ex) {
            Logger.getLogger(UpcGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
         */
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {

            fw = new FileWriter("/Users/equilibrium/Desktop/UPCCheck.txt");
            bw = new BufferedWriter(fw);
            int index = 0;
            List<String> apifyresult = new ArrayList();
            for (String upclink : linkArray) {
                apifyresult.add(upcArray.get(index) + "," + apify.isAlbum(upclink).toString() + "\n");
                index++;
            }

            for (String a : apifyresult) {
                bw.write(a);

            }

            System.out.println("Done");

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (bw != null) {
                    bw.close();
                }

                if (fw != null) {
                    fw.close();
                }

            } catch (IOException ex) {

                ex.printStackTrace();

            }
        }

        this.linkArray.clear();
        this.upcArray.clear();

    }//GEN-LAST:event_jButtonActionPerformed

    private void copyItemMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyItemMenuActionPerformed
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        String s = upcResultsTextArea.getSelectedText();
        StringSelection clipString = new StringSelection(s);
        clip.setContents(clipString, null);
    }//GEN-LAST:event_copyItemMenuActionPerformed

    private void pasteItemMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteItemMenuActionPerformed
        /*
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        String s = textArea1.getSelectedText();
        StringSelection clipString = new StringSelection(s);
        clip.setContents(clipString, null);
         */
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = toolkit.getSystemClipboard();
        String result;
        try {
            result = (String) clipboard.getData(DataFlavor.stringFlavor);
            upcListTextArea.setText(result);
        } catch (UnsupportedFlavorException | IOException ex) {
            Logger.getLogger(UpcGUI.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_pasteItemMenuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fileSelectorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileSelectorButtonActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(null);
        chooser.setDialogTitle("Choose a folder");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);

        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {

            sourceFolderPath = chooser.getSelectedFile();
        }

    }//GEN-LAST:event_fileSelectorButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpcGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpcGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpcGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpcGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpcGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem copyItemMenu;
    private javax.swing.JButton fileSelectorButton;
    private javax.swing.JLabel getTokenLabel;
    private javax.swing.JButton jButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem pasteItemMenu;
    private javax.swing.JLabel upcListLabel;
    private javax.swing.JLabel upcListLabel1;
    private javax.swing.JLabel upcListLabel2;
    private java.awt.TextArea upcListTextArea;
    private java.awt.TextArea upcListTextArea1;
    private java.awt.TextArea upcListTextArea2;
    private javax.swing.JLabel upcResultsLabel;
    private java.awt.TextArea upcResultsTextArea;
    // End of variables declaration//GEN-END:variables
}
