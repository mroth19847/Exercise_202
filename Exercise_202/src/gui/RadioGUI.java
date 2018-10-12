package gui;

import bl.Sender;
import bl.SenderTableModel;
import bl.SenderTableRenderer;

public class RadioGUI extends javax.swing.JFrame {

    private SenderTableModel bl = new SenderTableModel();
    
    public RadioGUI() {
        initComponents();
        RadioTable.setModel(bl);
        bl.add(new Sender("Radio Steiermark", 99.3, "AM"));
        bl.add(new Sender("Ö3", 99.5, "FM"));
        bl.add(new Sender("NaturRadio", 100.5, "AM"));
        RadioTable.setDefaultRenderer(Object.class, new SenderTableRenderer());
    }

    public void initTable(){
        RadioTable.getColumnModel().getColumn(0).setWidth(150);
        RadioTable.getColumnModel().getColumn(0).setWidth(120);
        RadioTable.getColumnModel().getColumn(0).setWidth(50);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContextMenu = new javax.swing.JPopupMenu();
        btadd = new javax.swing.JMenuItem();
        bthide = new javax.swing.JMenuItem();
        btshow = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        RadioTable = new javax.swing.JTable();

        btadd.setText("hinzufügen");
        btadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaddActionPerformed(evt);
            }
        });
        ContextMenu.add(btadd);

        bthide.setText("Band verstecken");
        bthide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthideActionPerformed(evt);
            }
        });
        ContextMenu.add(bthide);

        btshow.setText("Band anzeigen");
        btshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btshowActionPerformed(evt);
            }
        });
        ContextMenu.add(btshow);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RadioTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        RadioTable.setComponentPopupMenu(ContextMenu);
        jScrollPane1.setViewportView(RadioTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaddActionPerformed
        SenderDlg dlg = new SenderDlg(this,true);
        dlg.setVisible(true);
        if(dlg.isOk()){
            bl.add(dlg.getSender());
        }
    }//GEN-LAST:event_btaddActionPerformed

    private void bthideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthideActionPerformed
        bl.hide();
    }//GEN-LAST:event_bthideActionPerformed

    private void btshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btshowActionPerformed
        bl.show();
    }//GEN-LAST:event_btshowActionPerformed

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
            java.util.logging.Logger.getLogger(RadioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RadioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RadioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RadioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RadioGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu ContextMenu;
    private javax.swing.JTable RadioTable;
    private javax.swing.JMenuItem btadd;
    private javax.swing.JMenuItem bthide;
    private javax.swing.JMenuItem btshow;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
