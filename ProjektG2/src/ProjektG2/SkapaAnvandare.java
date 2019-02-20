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
 * @author lisajansson
 */
public class SkapaAnvandare extends javax.swing.JFrame {

    private InfDB db;

    /**
     * Creates new form SkapaInlogg
     */
    public SkapaAnvandare(InfDB idb) {
        initComponents();
        this.db = idb;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        personnummer = new javax.swing.JLabel();
        text1 = new javax.swing.JLabel();
        fornamn = new javax.swing.JLabel();
        efternamn = new javax.swing.JLabel();
        beskrivning = new javax.swing.JLabel();
        kontorsrum = new javax.swing.JLabel();
        titel = new javax.swing.JLabel();
        tfPnr = new javax.swing.JTextField();
        tfTitel = new javax.swing.JTextField();
        tfFornamn = new javax.swing.JTextField();
        tfEfternamn = new javax.swing.JTextField();
        tfBeskrivning = new javax.swing.JTextField();
        tfRum = new javax.swing.JTextField();
        btnSkapa = new javax.swing.JButton();
        personnummer1 = new javax.swing.JLabel();
        tfMail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfLosen = new javax.swing.JTextField();
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

        jLabel1.setFont(new java.awt.Font("Menlo", 0, 36)); // NOI18N
        jLabel1.setText("Skapa ny användare");

        personnummer.setText("Personnummer");

        text1.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        text1.setText("ÅÅÅÅMMDDXXXX");

        fornamn.setText("Förnamn");

        efternamn.setText("Efternamn");

        beskrivning.setText("Beskrivning");

        kontorsrum.setText("Kontorsrum");

        titel.setText("Titel");

        btnSkapa.setText("Skapa ny användare");
        btnSkapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkapaActionPerformed(evt);
            }
        });

        personnummer1.setText("Email");

        jLabel2.setText("Lösenord");

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
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(personnummer)
                    .addComponent(titel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(beskrivning)
                                .addComponent(efternamn)
                                .addComponent(fornamn)))
                        .addComponent(kontorsrum, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel2)
                    .addComponent(personnummer1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfFornamn, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTitel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPnr))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfEfternamn, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfBeskrivning, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfRum, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(161, 161, 161))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSkapa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(tfMail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfLosen))
                        .addGap(161, 161, 161))))
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personnummer)
                    .addComponent(tfPnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titel)
                    .addComponent(tfTitel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fornamn)
                    .addComponent(tfFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(efternamn)
                    .addComponent(tfEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(tfBeskrivning, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(beskrivning)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kontorsrum)
                    .addComponent(tfRum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personnummer1)
                    .addComponent(tfMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSkapa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSkapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkapaActionPerformed
        // Knapp lägg till en ny lärare i systemet

        //VARIABLAR FÖR LÄGGA TILL ANVÄNDARE
        String pnr = tfPnr.getText(); //Textbox personnummer, lokal variabel hämtar textfältet
        String titeln = tfTitel.getText();
        String fnamn = tfFornamn.getText();
        String enamn = tfEfternamn.getText();
        String beskrivningen = tfBeskrivning.getText();
        String kontorsnr = tfRum.getText();
        String losenord = tfLosen.getText();
        String admin = "V"; //Sätter användare till icke admin by default
        String email = tfMail.getText();
        String notis = "F";

        //KOLLAR OM NÅGON RUTA ÄR TOM
        if (Validering.textFaltHarVarde(pnr) && Validering.textFaltHarVarde(titeln) && Validering.textFaltHarVarde(fnamn)
                && Validering.textFaltHarVarde(enamn) && Validering.textFaltHarVarde(beskrivningen) && Validering.textFaltHarVarde(kontorsnr)
                && Validering.textFaltHarVarde(losenord) && Validering.textFaltHarVarde(email)) {

            //KOLLA OM NAMN ELLER EFTERNAMN ÄR I BOKSTÄVER
            if (Validering.vardeArString(tfFornamn) && Validering.vardeArString(tfEfternamn)) {

                //KOLLAR OM PERSONNR ÄR TOLV TECKEN
                if (tfPnr.getText().length() == 12) {

                    //VARIABLAR FÖR EMAIL
                    String amne = "Nytt konto har skapats";
                    String valkommen = "Välkommen " + fnamn + " till lärarplattformen för Informatik! \n\n"
                            + "Ditt användarnamn är: " + pnr + " \n"
                            + "Ditt lösenord är: " + losenord;

                    String laggTillAnvandare = "INSERT INTO ANVANDARE VALUES ('" + pnr + "', '" + fnamn + "', '" 
                                + beskrivningen + "', '" + losenord + "', '" + kontorsnr + "', '" + titeln 
                                + "', '" + admin + "', '" + enamn + "')";
                    String laggTillEmail = "INSERT INTO EMAIL(MAIL, NOTIS, PNR) VALUES('" + email + "','" + notis + "', '" + pnr + "')";

                    try {
                        db.insert(laggTillAnvandare);
                        db.insert(laggTillEmail); // Uppdaterar databasen  
                                                
                        JOptionPane.showMessageDialog(null, "Användaren har lagts till i systemet");

                        //KÖR METOD FÖR ATT SKICKA MAIL I KLASSEN START
                        Mail.start(email, amne, valkommen);

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Ops! Något gick fel!"); // Pop up felmeddelande
                    }
                    // PERSONNUMMRET ÄR INTE 12 SIFFOR
                    } else {
                        JOptionPane.showMessageDialog(null, "Ditt personnummer måste vara 12 siffror.");
                }
                //OM FÖRNAMN ELLER EFTERNAMN ÄR ANNAT ÄN BOKSTÄVER
            } else {
                JOptionPane.showMessageDialog(null, "Är det där verkligen ditt namn?");
            }
            //OM NÅGOT FÄLT ÄR TOMT
        } else {
            JOptionPane.showMessageDialog(null, "Alla fält måste vara ifyllda.");
        }

    }//GEN-LAST:event_btnSkapaActionPerformed

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
    private javax.swing.JButton btnSkapa;
    private javax.swing.JLabel efternamn;
    private javax.swing.JLabel fornamn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JLabel kontorsrum;
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
    private javax.swing.JLabel personnummer;
    private javax.swing.JLabel personnummer1;
    private javax.swing.JLabel text1;
    private javax.swing.JTextField tfBeskrivning;
    private javax.swing.JTextField tfEfternamn;
    private javax.swing.JTextField tfFornamn;
    private javax.swing.JTextField tfLosen;
    private javax.swing.JTextField tfMail;
    private javax.swing.JTextField tfPnr;
    private javax.swing.JTextField tfRum;
    private javax.swing.JTextField tfTitel;
    private javax.swing.JLabel titel;
    // End of variables declaration//GEN-END:variables
}
