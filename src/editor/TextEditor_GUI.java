/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editor;

import TEEdit.TEFind;
import TEEdit.TEReplace;
import TEFiile.te_saveas;
import TEFormate.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;

public class TextEditor_GUI extends javax.swing.JFrame {

    public static Color hl_color;
    public static Color hl_txt_color;
    public static JFileChooser jfc;

    public static void gettefont(String index_name, int index_style, int index_size) {
        Font f = new Font(index_name, index_style, index_size);
        usertextarea.setFont(f);
    }

    public TextEditor_GUI() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        usertextarea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        teFile = new javax.swing.JMenu();
        teNew = new javax.swing.JMenuItem();
        teOpen = new javax.swing.JMenuItem();
        teSave = new javax.swing.JMenuItem();
        teSaveAs = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        teExit = new javax.swing.JMenuItem();
        teEdit = new javax.swing.JMenu();
        teUndo = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        teCut = new javax.swing.JMenuItem();
        teCopy = new javax.swing.JMenuItem();
        tePaste = new javax.swing.JMenuItem();
        teDelete = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        teFind = new javax.swing.JMenuItem();
        teReplace = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        teSelectAll = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        teDateTime = new javax.swing.JMenuItem();
        teFormat = new javax.swing.JMenu();
        teFont = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        teTextColor = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        teBackground = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        teSelectColor = new javax.swing.JMenuItem();
        teSelectedTextColor = new javax.swing.JMenuItem();
        teHelp = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Text Editor 0.1");

        usertextarea.setColumns(20);
        usertextarea.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        usertextarea.setRows(5);
        usertextarea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usertextareaMouseClicked(evt);
            }
        });
        usertextarea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usertextareaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(usertextarea);

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        teFile.setText("File");

        teNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        teNew.setText("New");
        teNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teNewActionPerformed(evt);
            }
        });
        teFile.add(teNew);

        teOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        teOpen.setText("Open");
        teOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teOpenActionPerformed(evt);
            }
        });
        teFile.add(teOpen);

        teSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        teSave.setText("Save");
        teSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teSaveActionPerformed(evt);
            }
        });
        teFile.add(teSave);

        teSaveAs.setText("Save As");
        teSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teSaveAsActionPerformed(evt);
            }
        });
        teFile.add(teSaveAs);
        teFile.add(jSeparator1);

        teExit.setText("Exit");
        teExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teExitActionPerformed(evt);
            }
        });
        teFile.add(teExit);

        jMenuBar1.add(teFile);

        teEdit.setText("Edit");

        teUndo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        teUndo.setText("Undo");
        teUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teUndoActionPerformed(evt);
            }
        });
        teEdit.add(teUndo);
        teEdit.add(jSeparator2);

        teCut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        teCut.setText("Cut");
        teCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teCutActionPerformed(evt);
            }
        });
        teEdit.add(teCut);

        teCopy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        teCopy.setText("Copy");
        teCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teCopyActionPerformed(evt);
            }
        });
        teEdit.add(teCopy);

        tePaste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        tePaste.setText("Paste");
        tePaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tePasteActionPerformed(evt);
            }
        });
        teEdit.add(tePaste);

        teDelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        teDelete.setText("Delete");
        teDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teDeleteActionPerformed(evt);
            }
        });
        teEdit.add(teDelete);
        teEdit.add(jSeparator3);

        teFind.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        teFind.setText("Find");
        teFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teFindActionPerformed(evt);
            }
        });
        teEdit.add(teFind);

        teReplace.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        teReplace.setText("Replace");
        teReplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teReplaceActionPerformed(evt);
            }
        });
        teEdit.add(teReplace);
        teEdit.add(jSeparator4);

        teSelectAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        teSelectAll.setText("Select All");
        teSelectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teSelectAllActionPerformed(evt);
            }
        });
        teEdit.add(teSelectAll);
        teEdit.add(jSeparator5);

        teDateTime.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        teDateTime.setText("Time/Date");
        teDateTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teDateTimeActionPerformed(evt);
            }
        });
        teEdit.add(teDateTime);

        jMenuBar1.add(teEdit);

        teFormat.setText("Format");

        teFont.setText("Font");
        teFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teFontActionPerformed(evt);
            }
        });
        teFormat.add(teFont);
        teFormat.add(jSeparator6);

        teTextColor.setText("Text Color");
        teTextColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teTextColorActionPerformed(evt);
            }
        });
        teFormat.add(teTextColor);
        teFormat.add(jSeparator7);

        teBackground.setText("Background");
        teBackground.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teBackgroundActionPerformed(evt);
            }
        });
        teFormat.add(teBackground);
        teFormat.add(jSeparator8);

        teSelectColor.setText("Select Color");
        teSelectColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teSelectColorActionPerformed(evt);
            }
        });
        teFormat.add(teSelectColor);

        teSelectedTextColor.setText("Selected Text Color");
        teSelectedTextColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teSelectedTextColorActionPerformed(evt);
            }
        });
        teFormat.add(teSelectedTextColor);

        jMenuBar1.add(teFormat);

        teHelp.setText("Help");
        jMenuBar1.add(teHelp);

        setJMenuBar(jMenuBar1);
        jMenuBar1.getAccessibleContext().setAccessibleName("");
        jMenuBar1.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void teExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_teExitActionPerformed

    private void teCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teCopyActionPerformed
        usertextarea.copy();
    }//GEN-LAST:event_teCopyActionPerformed

    private void teOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teOpenActionPerformed
        jfc = new JFileChooser();
        jfc.showOpenDialog(teOpen);
    }//GEN-LAST:event_teOpenActionPerformed

    private void teFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teFontActionPerformed
        TEFont tefont = new TEFont();
        tefont.setVisible(true);
    }//GEN-LAST:event_teFontActionPerformed

    private void teTextColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teTextColorActionPerformed
        usertextarea.setForeground(JColorChooser.showDialog(teTextColor, null, Color.white));
        System.out.println(usertextarea.getForeground());
    }//GEN-LAST:event_teTextColorActionPerformed

    private void teBackgroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teBackgroundActionPerformed
        usertextarea.setBackground(JColorChooser.showDialog(teBackground, null, Color.black));
    }//GEN-LAST:event_teBackgroundActionPerformed

    private void teCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teCutActionPerformed
        usertextarea.cut();
    }//GEN-LAST:event_teCutActionPerformed

    private void tePasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tePasteActionPerformed
        usertextarea.paste();
    }//GEN-LAST:event_tePasteActionPerformed

    private void teDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teDeleteActionPerformed
        usertextarea.replaceSelection(null);
    }//GEN-LAST:event_teDeleteActionPerformed

    private void teDateTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teDateTimeActionPerformed
        DateFormat df = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        Date date = new Date();
        usertextarea.setText(usertextarea.getText() + df.format(date));
    }//GEN-LAST:event_teDateTimeActionPerformed

    private void teSelectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teSelectAllActionPerformed
        usertextarea.selectAll();
    }//GEN-LAST:event_teSelectAllActionPerformed

    private void teFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teFindActionPerformed
        TEEdit.TEFind tef = new TEFind();
        tef.setVisible(true);
    }//GEN-LAST:event_teFindActionPerformed

    private void teReplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teReplaceActionPerformed
        TEEdit.TEReplace ter = new TEReplace();
        ter.setVisible(true);
    }//GEN-LAST:event_teReplaceActionPerformed

    private void teSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teSaveActionPerformed

    }//GEN-LAST:event_teSaveActionPerformed

    private void teSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teSaveAsActionPerformed
        jfc = new JFileChooser();
        jfc.showSaveDialog(teSaveAs);
        String file_path = jfc.getSelectedFile().getAbsolutePath();
        te_saveas.te_write(file_path);
        te_saveas.te_write_formate();
        te_saveas.register(jfc.getSelectedFile().getName());
    }//GEN-LAST:event_teSaveAsActionPerformed

    private void teSelectColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teSelectColorActionPerformed
        Color col = new Color(0, 153, 255);
        JColorChooser jcc = new JColorChooser();
        usertextarea.setSelectionColor(jcc.showDialog(teSelectColor, "Select Background Color", col));
        hl_color = jcc.getColor();
    }//GEN-LAST:event_teSelectColorActionPerformed

    private void teSelectedTextColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teSelectedTextColorActionPerformed
        JColorChooser jcc = new JColorChooser();
        usertextarea.setSelectedTextColor(jcc.showDialog(teSelectColor, "Selected Text Color", Color.white));
        hl_txt_color = jcc.getColor();
    }//GEN-LAST:event_teSelectedTextColorActionPerformed

    private void usertextareaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usertextareaKeyPressed
        usertextarea.getHighlighter().removeAllHighlights();
    }//GEN-LAST:event_usertextareaKeyPressed

    private void usertextareaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usertextareaMouseClicked
        usertextarea.getHighlighter().removeAllHighlights();
    }//GEN-LAST:event_usertextareaMouseClicked

    private void teNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teNewActionPerformed

    }//GEN-LAST:event_teNewActionPerformed

    private void teUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teUndoActionPerformed
        if (usertextarea.getText().length() != 0) {
            if (usertextarea.getText().length() == 1) {
                usertextarea.replaceRange("", usertextarea.getText().length() - 1, usertextarea.getText().length());
            } else {
                usertextarea.replaceRange("", usertextarea.getText().length() - 2, usertextarea.getText().length());
            }
        }
    }//GEN-LAST:event_teUndoActionPerformed

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
            java.util.logging.Logger.getLogger(TextEditor_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TextEditor_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TextEditor_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TextEditor_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TextEditor_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JMenuItem teBackground;
    private javax.swing.JMenuItem teCopy;
    private javax.swing.JMenuItem teCut;
    private javax.swing.JMenuItem teDateTime;
    private javax.swing.JMenuItem teDelete;
    private javax.swing.JMenu teEdit;
    private javax.swing.JMenuItem teExit;
    private javax.swing.JMenu teFile;
    private javax.swing.JMenuItem teFind;
    private javax.swing.JMenuItem teFont;
    private javax.swing.JMenu teFormat;
    private javax.swing.JMenu teHelp;
    private javax.swing.JMenuItem teNew;
    private javax.swing.JMenuItem teOpen;
    private javax.swing.JMenuItem tePaste;
    private javax.swing.JMenuItem teReplace;
    private javax.swing.JMenuItem teSave;
    private javax.swing.JMenuItem teSaveAs;
    private javax.swing.JMenuItem teSelectAll;
    private javax.swing.JMenuItem teSelectColor;
    private javax.swing.JMenuItem teSelectedTextColor;
    private javax.swing.JMenuItem teTextColor;
    private javax.swing.JMenuItem teUndo;
    public static javax.swing.JTextArea usertextarea;
    // End of variables declaration//GEN-END:variables
}
