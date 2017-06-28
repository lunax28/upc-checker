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

/**
 *
 * @author equilibrium
 */
public class UpcGUI extends javax.swing.JFrame {

    /**
     * Creates new form UpcGUI
     */
    public UpcGUI() {
        initComponents();

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
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(upcListLabel)
                    .addComponent(upcListTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jButton)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(upcResultsLabel)
                    .addComponent(upcResultsTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(upcListLabel)
                            .addComponent(upcResultsLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(upcResultsTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(upcListTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jButton)))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActionPerformed

        ApiClass apify = new ApiClass();

        List<String> linkArray = new ArrayList<String>();
        List<String> upcArray = new ArrayList<String>();

        String link = "";
        System.out.println("UPC QUERY LINK:: " + link);
        Scanner scanner = null;
        String tmp ="";
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

            String content = "This is the content to write into file\n";

            fw = new FileWriter("/Users/equilibrium/Desktop/UPCCheck.txt");
            bw = new BufferedWriter(fw);
            int index = 0;
            List<String> apifyresult = new ArrayList();
            for (String upclink : linkArray) {
                apifyresult.add(upcArray.get(index) + "," + apify.isAlbum(upclink).toString() + "\n");
                index++;
            }
            
            for(String a : apifyresult){
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
    private javax.swing.JButton jButton;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem pasteItemMenu;
    private javax.swing.JLabel upcListLabel;
    private java.awt.TextArea upcListTextArea;
    private javax.swing.JLabel upcResultsLabel;
    private java.awt.TextArea upcResultsTextArea;
    // End of variables declaration//GEN-END:variables
}
