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
 * @author edith
 */
public class Profil extends javax.swing.JFrame {

    private InfDB db;
    
    
    public Profil(InfDB db) {
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

        tfBeskrivning = new javax.swing.JTextField();
        text1 = new javax.swing.JLabel();
        btnVisa = new javax.swing.JButton();
        tfRum = new javax.swing.JTextField();
        titel = new javax.swing.JLabel();
        fornamn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAndra = new javax.swing.JButton();
        tfLosen2 = new javax.swing.JTextField();
        tfLosen = new javax.swing.JTextField();
        efternamn = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfTitel = new javax.swing.JTextField();
        personnummer1 = new javax.swing.JLabel();
        tfFornamn = new javax.swing.JTextField();
        beskrivning = new javax.swing.JLabel();
        tfPnr2 = new javax.swing.JTextField();
        tfMail = new javax.swing.JTextField();
        tfEfternamn = new javax.swing.JTextField();
        kontorsrum = new javax.swing.JLabel();
        personnummer = new javax.swing.JLabel();
        lblRubrikAdminHuvud = new javax.swing.JLabel();
        mbAdminHuvud = new javax.swing.JMenuBar();
        mStart = new javax.swing.JMenu();
        mBlogg = new javax.swing.JMenu();
        miVisaInlagg = new javax.swing.JMenuItem();
        miSkapaInlagg = new javax.swing.JMenuItem();
        mLaggTill = new javax.swing.JMenu();
        miSkapaAnvandare = new javax.swing.JMenuItem();
        miSkapaHuvudkategori = new javax.swing.JMenuItem();
        miUnderkategori = new javax.swing.JMenuItem();
        mProfil = new javax.swing.JMenu();
        miVisaProfil = new javax.swing.JMenuItem();
        miLoggaUt = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfBeskrivning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBeskrivningActionPerformed(evt);
            }
        });

        text1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        text1.setText("ÅÅÅÅMMDDXXXX");

        btnVisa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVisa.setText("Visa information");
        btnVisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaActionPerformed(evt);
            }
        });

        titel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titel.setText("Titel");

        fornamn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fornamn.setText("Förnamn");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Lösenord");

        btnAndra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAndra.setText("Ändra informationen");
        btnAndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraActionPerformed(evt);
            }
        });

        tfLosen2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLosen2ActionPerformed(evt);
            }
        });

        efternamn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        efternamn.setText("Efternamn");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Lösenord");

        personnummer1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        personnummer1.setText("Email");

        beskrivning.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        beskrivning.setText("Beskrivning");

        tfMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMailActionPerformed(evt);
            }
        });

        kontorsrum.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kontorsrum.setText("Kontorsrum");

        personnummer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        personnummer.setText("Personnummer");

        lblRubrikAdminHuvud.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblRubrikAdminHuvud.setText("Profil");

        mbAdminHuvud.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mbAdminHuvud.setRequestFocusEnabled(false);

        mStart.setText("Start");
        mStart.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mbAdminHuvud.add(mStart);

        mBlogg.setText("Blogg");
        mBlogg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        miVisaInlagg.setText("Visa inlägg");
        miVisaInlagg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVisaInlaggActionPerformed(evt);
            }
        });
        mBlogg.add(miVisaInlagg);

        miSkapaInlagg.setText("Skapa inlägg");
        miSkapaInlagg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSkapaInlaggActionPerformed(evt);
            }
        });
        mBlogg.add(miSkapaInlagg);

        mbAdminHuvud.add(mBlogg);

        mLaggTill.setText("Lägg till");
        mLaggTill.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        miSkapaAnvandare.setText("Användare");
        miSkapaAnvandare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSkapaAnvandareActionPerformed(evt);
            }
        });
        mLaggTill.add(miSkapaAnvandare);

        miSkapaHuvudkategori.setText("Huvudkategori");
        miSkapaHuvudkategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSkapaHuvudkategoriActionPerformed(evt);
            }
        });
        mLaggTill.add(miSkapaHuvudkategori);

        miUnderkategori.setText("Underkategori");
        miUnderkategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miUnderkategoriActionPerformed(evt);
            }
        });
        mLaggTill.add(miUnderkategori);

        mbAdminHuvud.add(mLaggTill);

        mProfil.setText("Profil");
        mProfil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        miVisaProfil.setText("Visa profil");
        miVisaProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVisaProfilActionPerformed(evt);
            }
        });
        mProfil.add(miVisaProfil);

        miLoggaUt.setText("Logga ut");
        miLoggaUt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLoggaUtActionPerformed(evt);
            }
        });
        mProfil.add(miLoggaUt);

        mbAdminHuvud.add(mProfil);

        setJMenuBar(mbAdminHuvud);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblRubrikAdminHuvud)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnVisa)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(personnummer)
                                        .addGap(18, 18, 18)
                                        .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tfPnr2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAndra))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titel)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(beskrivning)
                                                .addComponent(efternamn)
                                                .addComponent(fornamn)))
                                        .addComponent(kontorsrum, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(personnummer1)
                                    .addComponent(jLabel3))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfMail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                                    .addComponent(tfLosen2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfRum, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfBeskrivning, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfEfternamn, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfFornamn, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfTitel, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGap(170, 170, 170))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblRubrikAdminHuvud)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personnummer)
                    .addComponent(text1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPnr2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnVisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titel)
                    .addComponent(tfTitel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fornamn)
                    .addComponent(tfFornamn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(efternamn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tfBeskrivning, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfRum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kontorsrum))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfLosen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(personnummer1))
                        .addGap(18, 18, 18)
                        .addComponent(btnAndra)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(beskrivning)
                        .addGap(293, 293, 293))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void tfBeskrivningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBeskrivningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBeskrivningActionPerformed

    private void btnAndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraActionPerformed

        String pnr = tfPnr2.getText();
        String losen = tfLosen.getText();
        String titeln = tfTitel.getText();
        String fnamn = tfFornamn.getText();
        String enamn = tfEfternamn.getText();
        String beskrivningen = tfBeskrivning.getText();
        String kontorsnr = tfRum.getText();
        String email = tfMail.getText();
        String losen2 = tfLosen2.getText();
        
        if(Validering.textFaltHarVarde(tfFornamn) && Validering.textFaltHarVarde(tfEfternamn)){
         if (Validering.vardeArString(tfFornamn) && Validering.vardeArString(tfEfternamn)) {
             if(Validering.textFaltHarVarde(tfTitel) && Validering.textFaltHarVarde(tfMail) && Validering.textFaltHarVarde(tfRum)){
             if (Validering.vardeArSiffra(tfRum)){
        try {
                if (!losen2.isEmpty()) {
                    String sql2 = "UPDATE ANVANDARE SET LOSENORD ='" + losen2 + "' WHERE PNR = '" + pnr + "'";
                     String sql11 = db.fetchSingle(sql2);
                    tfLosen2.setText(sql11);
                }
                if (!titeln.isEmpty()) {

                    String sql3 = "UPDATE ANVANDARE SET TITEL ='" + titeln + "' WHERE PNR = '" + pnr + "'";
                     String sql12 = db.fetchSingle(sql3);
                    tfTitel.setText(sql12);
                }
                if (!fnamn.isEmpty()) {

                    String sql4 = "UPDATE ANVANDARE SET FORNAMN ='" + fnamn + "' WHERE PNR = '" + pnr + "'";
                     String sql13 = db.fetchSingle(sql4);
                    tfFornamn.setText(sql13);
                }
                if (!enamn.isEmpty()) {

                    String sql5 = "UPDATE ANVANDARE SET EFTERNAMN ='" + enamn + "' WHERE PNR = '" + pnr + "'";
                     String sql14 = db.fetchSingle(sql5);
                    tfEfternamn.setText(sql14);
                }
               if (!beskrivningen.isEmpty()) {

                    String sql6 = "UPDATE ANVANDARE SET BESKRIVNING ='" + beskrivningen + "' WHERE PNR = '" + pnr + "'";
                    String sql15 = db.fetchSingle(sql6);
                    tfBeskrivning.setText(sql15);
                }
               if (!kontorsnr.isEmpty()) {

                    String sql7 = "UPDATE ANVANDARE SET KONTORSNR ='" + kontorsnr + "' WHERE PNR = '" + pnr + "'";
                     String sql16 = db.fetchSingle(sql7);
                    tfRum.setText(sql16);
                }
                if (!email.isEmpty()) {

                    String sql8 = "UPDATE EMAIL SET MAIL ='" + email + "' WHERE PNR = '" + pnr + "'";
                    String sql17 = db.fetchSingle(sql8);
                    tfMail.setText(sql17);
                }
               
        }catch(Exception e){}}}}}

    }//GEN-LAST:event_btnAndraActionPerformed

    private void tfLosen2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLosen2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLosen2ActionPerformed

    private void tfMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMailActionPerformed

    private void miVisaInlaggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVisaInlaggActionPerformed

        dispose();
        new VisaInlagg(db).setVisible(true);
    }//GEN-LAST:event_miVisaInlaggActionPerformed

    private void miSkapaInlaggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSkapaInlaggActionPerformed
        dispose();
        new SkapaInlagg(db).setVisible(true);
    }//GEN-LAST:event_miSkapaInlaggActionPerformed

    private void miSkapaAnvandareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSkapaAnvandareActionPerformed
        dispose();
        new SkapaAnvandare(db).setVisible(true);
    }//GEN-LAST:event_miSkapaAnvandareActionPerformed

    private void miSkapaHuvudkategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSkapaHuvudkategoriActionPerformed
        dispose();
        new SkapaHuvudkategori(db).setVisible(true);
    }//GEN-LAST:event_miSkapaHuvudkategoriActionPerformed

    private void miUnderkategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miUnderkategoriActionPerformed
        dispose();
        new SkapaUnderkategori(db).setVisible(true);
    }//GEN-LAST:event_miUnderkategoriActionPerformed

    private void miVisaProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVisaProfilActionPerformed
        dispose();
        new Profil(db).setVisible(true);
    }//GEN-LAST:event_miVisaProfilActionPerformed

    private void miLoggaUtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLoggaUtActionPerformed
        dispose();
        new LoggaIn(db).setVisible(true);
    }//GEN-LAST:event_miLoggaUtActionPerformed

    private void btnVisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaActionPerformed

        String pnr = tfPnr2.getText();
        String losen = tfLosen.getText();
        String titeln = tfTitel.getText();
        String fnamn = tfFornamn.getText();
        String enamn = tfEfternamn.getText();
        String beskrivningen = tfBeskrivning.getText();
        String kontorsnr = tfRum.getText();
        String email = tfMail.getText();
        String losen2 = tfLosen2.getText();
        
        
      
        try {
            String sql = "SELECT LOSENORD FROM ANVANDARE WHERE PNR =" + "'" + pnr + "'";

            String sql10 = db.fetchSingle(sql);
            if (sql10.equals(losen)) {
               
               
                
                String sql2 = "SELECT LOSENORD FROM ANVANDARE WHERE PNR ='" + pnr + "'";
                String sql11 = db.fetchSingle(sql2);
                tfLosen2.setText(sql11);

                String sql3 = "SELECT TITEL FROM ANVANDARE WHERE PNR = '" + pnr + "'";
                String sql12 = db.fetchSingle(sql3);
                tfTitel.setText(sql12);

                String sql4 = "SELECT FORNAMN FROM ANVANDARE WHERE PNR = '" + pnr + "'";
                String sql13 = db.fetchSingle(sql4);
                tfFornamn.setText(sql13);

                String sql5 = "SELECT EFTERNAMN FROM ANVANDARE WHERE PNR = '" + pnr + "'";
                String sql14 = db.fetchSingle(sql5);
                tfEfternamn.setText(sql14);

                String sql6 = "SELECT BESKRIVNING FROM ANVANDARE WHERE PNR = '" + pnr + "'";
                String sql15 = db.fetchSingle(sql6);
                tfBeskrivning.setText(sql15);

                String sql7 = "SELECT KONTORSNR FROM ANVANDARE WHERE PNR = '" + pnr + "'";
                String sql16 = db.fetchSingle(sql7);
                tfRum.setText(sql16);

                String sql8 = "SELECT MAIL FROM EMAIL WHERE PNR = '" + pnr + "'";
                String sql17 = db.fetchSingle(sql8);
                tfMail.setText(sql17);
                    
            }else{
                JOptionPane.showMessageDialog(null, "Fel lösenord eller personnummer.");
            }
                    
        } catch (Exception e) {
        
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnVisaActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel beskrivning;
    private javax.swing.JButton btnAndra;
    private javax.swing.JButton btnVisa;
    private javax.swing.JLabel efternamn;
    private javax.swing.JLabel fornamn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel kontorsrum;
    private javax.swing.JLabel lblRubrikAdminHuvud;
    private javax.swing.JMenu mBlogg;
    private javax.swing.JMenu mLaggTill;
    private javax.swing.JMenu mProfil;
    private javax.swing.JMenu mStart;
    private javax.swing.JMenuBar mbAdminHuvud;
    private javax.swing.JMenuItem miLoggaUt;
    private javax.swing.JMenuItem miSkapaAnvandare;
    private javax.swing.JMenuItem miSkapaHuvudkategori;
    private javax.swing.JMenuItem miSkapaInlagg;
    private javax.swing.JMenuItem miUnderkategori;
    private javax.swing.JMenuItem miVisaInlagg;
    private javax.swing.JMenuItem miVisaProfil;
    private javax.swing.JLabel personnummer;
    private javax.swing.JLabel personnummer1;
    private javax.swing.JLabel text1;
    private javax.swing.JTextField tfBeskrivning;
    private javax.swing.JTextField tfEfternamn;
    private javax.swing.JTextField tfFornamn;
    private javax.swing.JTextField tfLosen;
    private javax.swing.JTextField tfLosen2;
    private javax.swing.JTextField tfMail;
    private javax.swing.JTextField tfPnr2;
    private javax.swing.JTextField tfRum;
    private javax.swing.JTextField tfTitel;
    private javax.swing.JLabel titel;
    // End of variables declaration//GEN-END:variables
}
