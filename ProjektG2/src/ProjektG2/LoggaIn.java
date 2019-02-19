/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjektG2;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author andre
 */
public class LoggaIn extends javax.swing.JFrame {

    private InfDB db;
    private static String user = "";

    public LoggaIn(InfDB db) {
        initComponents();
        this.db = db;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInlogg = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfUser = new javax.swing.JTextField();
        pfText = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnInlogg.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnInlogg.setText("Logga in");
        btnInlogg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInloggActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Logga in");

        tfUser.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tfUser.setText("444444444444");
        tfUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUserActionPerformed(evt);
            }
        });

        pfText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pfText.setText("4");
        pfText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfTextActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Password");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("yyyymmddxxxx");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(btnInlogg)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(pfText, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pfText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(btnInlogg)
                .addGap(103, 103, 103))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInloggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInloggActionPerformed

        String loggaIn = "";
        String pw = pfText.getText();
        user = tfUser.getText();
        String admin = "";

        if (Validering.textFaltHarVarde(user)) {

            try {

                String sql = "SELECT LOSENORD FROM ANVANDARE WHERE PNR = " + "'" + user + "'";
                loggaIn = db.fetchSingle(sql);
                String sql1 = "SELECT ADMINSTATUS FROM ANVANDARE WHERE PNR = " + "'" + user + "'";
                admin = db.fetchSingle(sql1);
                if (pw.equals(loggaIn)) {
                    if (admin.equals("H")) {
                        dispose();
                        new AdminHuvud(db).setVisible(true);
                    } else if (admin.equals("F")) {
                        dispose();
                        new AdminForskning(db).setVisible(true);
                        //new AdminForskning(db).setVisible(true);
                    } else if (admin.equals("U")) {
                        dispose();
                        new AdminUtbildning(db).setVisible(true);
                        //new AdminUtbildning(db).setVisible(true);
                    } else if (admin.equals("V")) {
                        dispose();
                        new AdminHuvud(db).setVisible(true);
                        //new Anvandare(db).setVisible(true);
                    }
                }

            } catch (InfException e) {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null, "Felaktigt lösenord.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Alla fält är inte ifyllda.");

        }
    }//GEN-LAST:event_btnInloggActionPerformed

    public static String returneraInloggadPnr() {
        return user;
    }

    private void tfUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUserActionPerformed

    private void pfTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfTextActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInlogg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField pfText;
    private javax.swing.JTextField tfUser;
    // End of variables declaration//GEN-END:variables
}
