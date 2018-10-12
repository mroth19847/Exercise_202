
package gui;

public class SenderDlg extends javax.swing.JDialog {


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
        // TODO add your handling code here:
    }//GEN-LAST:event_btokActionPerformed

    private void btdenyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdenyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btdenyActionPerformed


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
