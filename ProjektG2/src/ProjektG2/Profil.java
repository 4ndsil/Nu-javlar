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
    public LoggaIn loggaIn;
    public static boolean notisForskning = true;
    public static boolean notisUtbildning = true;
    public static boolean notisInformell = true;

    public Profil(InfDB db) {
        initComponents();
        this.db = db;
        visaInformation();

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
        tfRum = new javax.swing.JTextField();
        titel = new javax.swing.JLabel();
        fornamn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAndra = new javax.swing.JButton();
        tfLosen2 = new javax.swing.JTextField();
        efternamn = new javax.swing.JLabel();
        tfTitel = new javax.swing.JTextField();
        personnummer1 = new javax.swing.JLabel();
        tfFornamn = new javax.swing.JTextField();
        beskrivning = new javax.swing.JLabel();
        tfMail = new javax.swing.JTextField();
        tfEfternamn = new javax.swing.JTextField();
        kontorsrum = new javax.swing.JLabel();
        lblRubrikAdminHuvud = new javax.swing.JLabel();
        personnummer2 = new javax.swing.JLabel();
        chbForskning = new javax.swing.JCheckBox();
        chbUtbildning = new javax.swing.JCheckBox();
        chbInformell = new javax.swing.JCheckBox();
        mbAdminHuvud = new javax.swing.JMenuBar();
        mStart = new javax.swing.JMenu();
        miTillStart = new javax.swing.JMenuItem();
        mBlogg = new javax.swing.JMenu();
        miVisaInlagg = new javax.swing.JMenuItem();
        miSkapaInlagg = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miAnvandare = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mProfil = new javax.swing.JMenu();
        miVisaProfil = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        miLoggaUt = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        lblRubrikAdminHuvud.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblRubrikAdminHuvud.setText("Profil");

        personnummer2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        personnummer2.setText("Notiser");

        chbForskning.setSelected(true);
        chbForskning.setText("Forskning");
        chbForskning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbForskningActionPerformed(evt);
            }
        });

        chbUtbildning.setSelected(true);
        chbUtbildning.setText("Utbildning");
        chbUtbildning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbUtbildningActionPerformed(evt);
            }
        });

        chbInformell.setSelected(true);
        chbInformell.setText("Informell");
        chbInformell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbInformellActionPerformed(evt);
            }
        });

        mbAdminHuvud.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mbAdminHuvud.setRequestFocusEnabled(false);

        mStart.setText("Start");
        mStart.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        miTillStart.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        miTillStart.setText("Till Startsidan");
        miTillStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTillStartActionPerformed(evt);
            }
        });
        mStart.add(miTillStart);

        mbAdminHuvud.add(mStart);

        mBlogg.setText("Blogg");
        mBlogg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        miVisaInlagg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        miVisaInlagg.setText("Visa inlägg");
        miVisaInlagg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVisaInlaggActionPerformed(evt);
            }
        });
        mBlogg.add(miVisaInlagg);

        miSkapaInlagg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        miSkapaInlagg.setText("Skapa inlägg");
        miSkapaInlagg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSkapaInlaggActionPerformed(evt);
            }
        });
        mBlogg.add(miSkapaInlagg);

        mbAdminHuvud.add(mBlogg);

        jMenu2.setText("Ta bort");
        jMenu2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        miAnvandare.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        miAnvandare.setText("Användare");
        miAnvandare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAnvandareActionPerformed(evt);
            }
        });
        jMenu2.add(miAnvandare);

        jMenuItem2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jMenuItem2.setText("Möte");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jMenuItem5.setText("Kommentar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        mbAdminHuvud.add(jMenu2);

        jMenu1.setText("Kalender");
        jMenu1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jMenuItem1.setText("Se Kalender");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        mbAdminHuvud.add(jMenu1);

        mProfil.setText("Profil");
        mProfil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        miVisaProfil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        miVisaProfil.setText("Visa profil");
        miVisaProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVisaProfilActionPerformed(evt);
            }
        });
        mProfil.add(miVisaProfil);

        jMenuItem4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jMenuItem4.setText("Favoritinlägg");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        mProfil.add(jMenuItem4);

        miLoggaUt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAndra))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
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
                            .addComponent(jLabel3)
                            .addComponent(personnummer2))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chbForskning)
                                .addGap(18, 18, 18)
                                .addComponent(chbUtbildning)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chbInformell))
                            .addComponent(tfMail)
                            .addComponent(tfRum)
                            .addComponent(tfBeskrivning)
                            .addComponent(tfEfternamn)
                            .addComponent(tfFornamn)
                            .addComponent(tfTitel)
                            .addComponent(tfLosen2, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE))))
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(lblRubrikAdminHuvud)
                .addGap(42, 42, 42)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tfBeskrivning, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfRum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kontorsrum))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfLosen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(personnummer1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(beskrivning)
                        .addGap(203, 203, 203)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personnummer2)
                    .addComponent(chbForskning)
                    .addComponent(chbUtbildning)
                    .addComponent(chbInformell))
                .addGap(30, 30, 30)
                .addComponent(btnAndra)
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void visaInformation() {

        String user = loggaIn.returneraInloggadPnr();

        try {
            String sql2 = "SELECT LOSENORD FROM ANVANDARE WHERE PNR ='" + user + "'";
            String sql11 = db.fetchSingle(sql2);
            tfLosen2.setText(sql11);

            String sql3 = "SELECT TITEL FROM ANVANDARE WHERE PNR = '" + user + "'";
            String sql12 = db.fetchSingle(sql3);
            tfTitel.setText(sql12);

            String sql4 = "SELECT FORNAMN FROM ANVANDARE WHERE PNR = '" + user + "'";
            String sql13 = db.fetchSingle(sql4);
            tfFornamn.setText(sql13);

            String sql5 = "SELECT EFTERNAMN FROM ANVANDARE WHERE PNR = '" + user + "'";
            String sql14 = db.fetchSingle(sql5);
            tfEfternamn.setText(sql14);

            String sql6 = "SELECT BESKRIVNING FROM ANVANDARE WHERE PNR = '" + user + "'";
            String sql15 = db.fetchSingle(sql6);
            tfBeskrivning.setText(sql15);

            String sql7 = "SELECT KONTORSNR FROM ANVANDARE WHERE PNR = '" + user + "'";
            String sql16 = db.fetchSingle(sql7);
            tfRum.setText(sql16);

            String sql8 = "SELECT MAIL FROM EMAIL WHERE PNR = '" + user + "'";
            String sql17 = db.fetchSingle(sql8);
            tfMail.setText(sql17);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void btnAndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraActionPerformed

        String titeln = tfTitel.getText();
        String fnamn = tfFornamn.getText();
        String enamn = tfEfternamn.getText();
        String beskrivningen = tfBeskrivning.getText();
        String kontorsnr = tfRum.getText();
        String email = tfMail.getText();
        String losen = tfLosen2.getText();
        String user = loggaIn.returneraInloggadPnr();
        System.out.println(user);
        
        if (Validering.textFaltHarVarde(fnamn) && Validering.textFaltHarVarde(enamn)) {
            if (Validering.vardeArString(tfFornamn) && Validering.vardeArString(tfEfternamn)) {
                if (Validering.textFaltHarVarde(titeln) && Validering.textFaltHarVarde(email) && Validering.textFaltHarVarde(kontorsnr)) {
                    try {

                        if (!losen.isEmpty()) {
                            String sql2 = "UPDATE ANVANDARE SET LOSENORD ='" + losen + "' WHERE PNR = '" + user + "'";
                            String sql11 = db.fetchSingle(sql2);
                            tfLosen2.setText(sql11);
                        }
                        if (!titeln.isEmpty()) {

                            String sql3 = "UPDATE ANVANDARE SET TITEL ='" + titeln + "' WHERE PNR = '" + user + "'";
                            String sql12 = db.fetchSingle(sql3);
                            tfTitel.setText(sql12);
                        }
                        if (!fnamn.isEmpty()) {

                            String sql4 = "UPDATE ANVANDARE SET FORNAMN ='" + fnamn + "' WHERE PNR = '" + user + "'";
                            String sql13 = db.fetchSingle(sql4);
                            tfFornamn.setText(sql13);
                        }
                        if (!enamn.isEmpty()) {

                            String sql5 = "UPDATE ANVANDARE SET EFTERNAMN ='" + enamn + "' WHERE PNR = '" + user + "'";
                            String sql14 = db.fetchSingle(sql5);
                            tfEfternamn.setText(sql14);
                        }
                        if (!beskrivningen.isEmpty()) {

                            String sql6 = "UPDATE ANVANDARE SET BESKRIVNING ='" + beskrivningen + "' WHERE PNR = '" + user + "'";
                            String sql15 = db.fetchSingle(sql6);
                            tfBeskrivning.setText(sql15);
                        }
                        if (!kontorsnr.isEmpty()) {

                            String sql7 = "UPDATE ANVANDARE SET KONTORSNR ='" + kontorsnr + "' WHERE PNR = '" + user + "'";
                            String sql16 = db.fetchSingle(sql7);

                            tfRum.setText(sql16);
                        }
                        if (!email.isEmpty()) {

                            String sql8 = "UPDATE EMAIL SET MAIL ='" + email + "' WHERE PNR = '" + user + "'";
                            String sql17 = db.fetchSingle(sql8);
                            tfMail.setText(sql17);

                            JOptionPane.showMessageDialog(null, "Informationen har ändrats.");
                            visaInformation();
                        }

                    } catch (Exception e) {
                    }
                }
            }
        }

    }//GEN-LAST:event_btnAndraActionPerformed

    private void tfMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMailActionPerformed

    private void tfLosen2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLosen2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLosen2ActionPerformed

    private void chbForskningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbForskningActionPerformed
        boolean isSelected = chbForskning.isSelected();
        chbForskning.setSelected(isSelected);
        notisForskning = isSelected;
    }//GEN-LAST:event_chbForskningActionPerformed

    private void chbUtbildningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbUtbildningActionPerformed
        boolean isSelected = chbUtbildning.isSelected();
        chbUtbildning.setSelected(isSelected);
        notisUtbildning = isSelected;
    }//GEN-LAST:event_chbUtbildningActionPerformed

    private void chbInformellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbInformellActionPerformed
        boolean isSelected = chbInformell.isSelected();
        chbInformell.setSelected(isSelected);
        notisInformell = isSelected;
    }//GEN-LAST:event_chbInformellActionPerformed

    private void miTillStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTillStartActionPerformed
        //STÄNGER NUVARANDE FLIK
        dispose();
        //ÖPPNAR STARTSIDA
        new AdminHuvud(db).setVisible(true);
    }//GEN-LAST:event_miTillStartActionPerformed

    private void miVisaInlaggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVisaInlaggActionPerformed

        dispose();
        new VisaInlagg(db).setVisible(true);
    }//GEN-LAST:event_miVisaInlaggActionPerformed

    private void miSkapaInlaggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSkapaInlaggActionPerformed
        dispose();
        new SkapaInlagg(db).setVisible(true);
    }//GEN-LAST:event_miSkapaInlaggActionPerformed

    private void miAnvandareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAnvandareActionPerformed
        dispose();
        new TaBortAnvandare(db).setVisible(true);
    }//GEN-LAST:event_miAnvandareActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        dispose();
        new TabortMote(db).setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

        dispose();
        new TaBortKommentar(db).setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        dispose();

        new GemensamKalender(db).setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void miVisaProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVisaProfilActionPerformed
        dispose();
        new Profil(db).setVisible(true);
    }//GEN-LAST:event_miVisaProfilActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

        dispose();
        new Favoriter(db).setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void miLoggaUtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLoggaUtActionPerformed
        dispose();
        new LoggaIn(db).setVisible(true);
    }//GEN-LAST:event_miLoggaUtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel beskrivning;
    private javax.swing.JButton btnAndra;
    private javax.swing.JCheckBox chbForskning;
    private javax.swing.JCheckBox chbInformell;
    private javax.swing.JCheckBox chbUtbildning;
    private javax.swing.JLabel efternamn;
    private javax.swing.JLabel fornamn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JLabel kontorsrum;
    private javax.swing.JLabel lblRubrikAdminHuvud;
    private javax.swing.JMenu mBlogg;
    private javax.swing.JMenu mProfil;
    private javax.swing.JMenu mStart;
    private javax.swing.JMenuBar mbAdminHuvud;
    private javax.swing.JMenuItem miAnvandare;
    private javax.swing.JMenuItem miLoggaUt;
    private javax.swing.JMenuItem miSkapaInlagg;
    private javax.swing.JMenuItem miTillStart;
    private javax.swing.JMenuItem miVisaInlagg;
    private javax.swing.JMenuItem miVisaProfil;
    private javax.swing.JLabel personnummer1;
    private javax.swing.JLabel personnummer2;
    private javax.swing.JTextField tfBeskrivning;
    private javax.swing.JTextField tfEfternamn;
    private javax.swing.JTextField tfFornamn;
    private javax.swing.JTextField tfLosen2;
    private javax.swing.JTextField tfMail;
    private javax.swing.JTextField tfRum;
    private javax.swing.JTextField tfTitel;
    private javax.swing.JLabel titel;
    // End of variables declaration//GEN-END:variables
}
