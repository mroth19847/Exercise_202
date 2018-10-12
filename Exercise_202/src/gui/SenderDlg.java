package gui;

import bl.Sender;
import javax.swing.JOptionPane;

public class SenderDlg extends javax.swing.JDialog {

    private Sender sender;
    private boolean ok;

    public SenderDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tffrequence = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfband = new javax.swing.JTextField();
        btok = new javax.swing.JButton();
        btdeny = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(4, 2));

        jLabel1.setText("Sendername:");
        jPanel1.add(jLabel1);
        jPanel1.add(tfname);

        jLabel2.setText("Frequenz:");
        jPanel1.add(jLabel2);
        jPanel1.add(tffrequence);

        jLabel3.setText("Band:");
        jPanel1.add(jLabel3);
        jPanel1.add(tfband);

        btok.setText("OK");
        btok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btokActionPerformed(evt);
            }
        });
        jPanel1.add(btok);

        btdeny.setText("Cancel");
        btdeny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdenyActionPerformed(evt);
            }
        });
        jPanel1.add(btdeny);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btokActionPerformed
        ok = true;
        if (tfname.getText().equals("") || tffrequence.getText().equals("") || tfband.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Bitte füllen Sie alle Felder aus!");
        } else {
            try {
                double fr = Double.parseDouble(tffrequence.getText());
                if (fr < 0 || fr > 999) {
                    JOptionPane.showMessageDialog(null, "Die Frequenz ist nicht in der erlaubten Reichweite!");
                } else {
                    sender = new Sender(tfname.getText(), fr, tfband.getText());
                    dispose();
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Bitte achten Sie auf das korrekte Eingabeformat!");
            }
        }
    }//GEN-LAST:event_btokActionPerformed

    private void btdenyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdenyActionPerformed
        ok = false;
        dispose();
    }//GEN-LAST:event_btdenyActionPerformed

    public Sender getSender() {
        return sender;
    }

    public boolean isOk() {
        return ok;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btdeny;
    private javax.swing.JButton btok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfband;
    private javax.swing.JTextField tffrequence;
    private javax.swing.JTextField tfname;
    // End of variables declaration//GEN-END:variables
}
