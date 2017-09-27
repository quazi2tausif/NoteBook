package TEFormate;

import editor.TextEditor_GUI;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

public class TEFont extends javax.swing.JFrame {

    public int checksize(int fsize) {
        if (fsize <= 50) {
            return fsize;
        } else {
            return 12;
        }
    }

    public TEFont() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2 - this.getSize().width/2, dim.height/2 - this.getSize().height/2);
        fontname1.setEditable(false);
        fontstyle1.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fontname2 = new javax.swing.JList();
        fontname1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        fontstyle2 = new javax.swing.JList();
        fontstyle1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fontsize1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        fontsize2 = new javax.swing.JList();
        sample = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Text Editor Font");
        setResizable(false);

        jLabel1.setText("Font:");

        fontname2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Arial", "Bookman Old Style", "Cambria", "Candara", "Tahoma" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        fontname2.setSelectedIndex(4);
        fontname2.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                fontname2ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(fontname2);

        fontname1.setText("Tahoma");
        fontname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontname1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Style:");

        fontstyle2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Plain", "Bold", "Italic", "Bold Italic" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        fontstyle2.setSelectedIndex(0);
        fontstyle2.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                fontstyle2ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(fontstyle2);

        fontstyle1.setText("Plain");

        jLabel3.setText("Size:");

        fontsize1.setText("12");

        fontsize2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "08", "10", "12", "14", "16", "18", "20", "22", "24", "26", "28", "32", "36", "42", "48" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        fontsize2.setSelectedIndex(2);
        fontsize2.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                fontsize2ValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(fontsize2);

        sample.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sample.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sample.setText("AaBbYyZz");
        sample.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Sample : ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        jButton1.setText("Cancel");

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(sample, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(120, 120, 120)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fontname1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fontstyle1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fontsize1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fontname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fontstyle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fontsize1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sample, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fontname2ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_fontname2ValueChanged
        Object index = fontname2.getSelectedValue();
        final String index_name = String.valueOf(index);
        final int index_style = fontstyle2.getSelectedIndex();
        final int index_size = checksize(Integer.parseInt(fontsize1.getText()));
        fontname1.setText(index_name);
        fontstyle1.setText(String.valueOf(fontstyle2.getSelectedValue()));
        Font f = new Font(index_name, index_style, index_size);
        sample.setFont(f);
    }//GEN-LAST:event_fontname2ValueChanged

    private void fontname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fontname1ActionPerformed

    }//GEN-LAST:event_fontname1ActionPerformed

    private void fontstyle2ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_fontstyle2ValueChanged
        final int index_style = fontstyle2.getSelectedIndex();
        final String index_name = fontname1.getText();
        final int index_size = checksize(Integer.parseInt(fontsize1.getText()));
        fontstyle1.setText(String.valueOf(fontstyle2.getSelectedValue()));
        Font f = new Font(index_name, index_style, index_size);
        sample.setFont(f);
    }//GEN-LAST:event_fontstyle2ValueChanged

    private void fontsize2ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_fontsize2ValueChanged
        final String index_name = fontname1.getText();
        final int index_style = fontstyle2.getSelectedIndex();
        final String index = String.valueOf(fontsize2.getSelectedValue());
        fontsize1.setText(index);
        final int index_size = checksize(Integer.parseInt(fontsize1.getText()));
        Font f = new Font(index_name, index_style, index_size);
        sample.setFont(f);
    }//GEN-LAST:event_fontsize2ValueChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        final String index_name = fontname1.getText();
        final int index_style = fontstyle2.getSelectedIndex();
        final int index_size = checksize(Integer.parseInt(fontsize1.getText()));
        TextEditor_GUI.gettefont(index_name, index_style, index_size);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed
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
            java.util.logging.Logger.getLogger(TEFont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TEFont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TEFont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TEFont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TEFont().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fontname1;
    private javax.swing.JList fontname2;
    private javax.swing.JTextField fontsize1;
    private javax.swing.JList fontsize2;
    private javax.swing.JTextField fontstyle1;
    public javax.swing.JList fontstyle2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel sample;
    // End of variables declaration//GEN-END:variables
}
