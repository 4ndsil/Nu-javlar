/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjektG2;

import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author edith
 */
public class SkapaInlagg extends javax.swing.JFrame {

    private InfDB db;

    //NYTT
    String filename = null;
    byte[] personal_image = null;
    private byte[] picture;
//    //?
//    private byte[] picture;

    public SkapaInlagg(InfDB db) {
        initComponents();
        this.db = db;
        fyllHuvudkategoriComboBox();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbHuvudkategori = new javax.swing.JComboBox<>();
        cbUnderkategori = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        taText = new javax.swing.JTextArea();
        tfRubrik = new javax.swing.JTextField();
        lblRubrik = new javax.swing.JLabel();
        tfUnderkategori = new javax.swing.JTextField();
        lblSkapaNyKategori = new javax.swing.JLabel();
        lblSkrivInlagg = new javax.swing.JLabel();
        btnPublicera = new javax.swing.JButton();
        lblVäljUnderkategori = new javax.swing.JLabel();
        lblVäljHuvudkategori = new javax.swing.JLabel();
        lblLaggTillBildfil = new javax.swing.JLabel();
        btnBildfil = new javax.swing.JButton();
        tfBildfilNamn = new javax.swing.JTextField();
        lblBilden = new javax.swing.JLabel();
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

        cbHuvudkategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHuvudkategoriActionPerformed(evt);
            }
        });

        cbUnderkategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUnderkategoriActionPerformed(evt);
            }
        });

        taText.setColumns(20);
        taText.setLineWrap(true);
        taText.setRows(5);
        jScrollPane1.setViewportView(taText);

        lblRubrik.setText("Rubrik");

        tfUnderkategori.setColumns(10);
        tfUnderkategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUnderkategoriActionPerformed(evt);
            }
        });

        lblSkapaNyKategori.setText("Skapa ny underkategori:");

        lblSkrivInlagg.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblSkrivInlagg.setText("Skriv inlägg");

        btnPublicera.setText("Publicera");
        btnPublicera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPubliceraActionPerformed(evt);
            }
        });

        lblVäljUnderkategori.setText("Välj Underkategori:");

        lblVäljHuvudkategori.setText("Välj Huvudkategori:");

        lblLaggTillBildfil.setText("Lägg till bildfil:");

        btnBildfil.setText("Välj bildfil");
        btnBildfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBildfilActionPerformed(evt);
            }
        });

        tfBildfilNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBildfilNamnActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfRubrik))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPublicera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSkapaNyKategori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLaggTillBildfil, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblBilden, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(btnBildfil)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfBildfilNamn, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)))
                                        .addGap(8, 8, 8))))
                            .addComponent(cbUnderkategori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblVäljHuvudkategori)
                            .addComponent(lblVäljUnderkategori)
                            .addComponent(cbHuvudkategori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfUnderkategori, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(lblSkrivInlagg)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblSkrivInlagg)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRubrik)
                    .addComponent(tfRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblVäljHuvudkategori)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbHuvudkategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVäljUnderkategori)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbUnderkategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSkapaNyKategori)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfUnderkategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLaggTillBildfil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBildfil)
                            .addComponent(tfBildfilNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBilden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPublicera))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //NYTT
    public byte[] getImage() throws InfException {
        return picture;
    }

    public void skickaNotis(String huvudkategori, String rubrik, ArrayList<HashMap<String, String>> mottagare) {
        String hk = huvudkategori;
        String amne = "Nytt inlägg har publicerats!";
        boolean skicka = false;

        if (huvudkategori.equals("Forskning") && Profil.notisForskning == true){
            skicka = true;
        } else if (huvudkategori.equals("Utbildning") && Profil.notisUtbildning == true){
            skicka = true;
        } else if (huvudkategori.equals("Informell") && Profil.notisInformell == true){
            skicka = true;
        }
        
        if (skicka == true){
        for (HashMap<String, String> resultat : mottagare) {
            String fnamn = resultat.get("FORNAMN");
            String email = resultat.get("MAIL");

            String text = "Hej " + fnamn + "!"
                    + "\nEtt nytt inlägg har skapats inom kategorin " + hk + ":"
                    + "\n <i>" + rubrik + "</i>"
                    + "\n\n Gå in på plattformen för att se inlägget.";

            Mail.start(email, amne, text);
        }
        }
    }

    private void fyllHuvudkategoriComboBox() {

        //RENSAR CB
        cbHuvudkategori.removeAllItems();

        //ARRAY SOM SKA LAGRA HUVUDKATEGORIER
        ArrayList<String> cbListaHuvudkategori;

        //HÄMTAR HUVUDKATEGORIER
        String query = "SELECT NAMN FROM HUVUDKATEGORI";

        try {
            cbListaHuvudkategori = db.fetchColumn(query);

            //FYLLER CB
            for (String aResult : cbListaHuvudkategori) {
                cbHuvudkategori.addItem(aResult);
            }
        } catch (InfException e) {
            e.printStackTrace();
        }
        //HÄMTAR VALD KATEGORI I COMBOBOX
        String huvudkategori = cbHuvudkategori.getSelectedItem().toString();
        //ANROPAR METOD SOM FYLLER UNDERKATEGORIER UTIFRÅN HUVUDKATEGORI
        fyllUnderkategoriComboBox(huvudkategori);

    }

    private void fyllUnderkategoriComboBox(String huvudkategori) {

        //RENSAR CB
        cbUnderkategori.removeAllItems();

        //ARRAY SOM SKA LAGRA UNDERKATEGORIER
        ArrayList<String> cbListaUnderkategori;

        String query = "SELECT NAMN FROM UNDERKATEGORI WHERE HID = (SELECT HID FROM HUVUDKATEGORI WHERE NAMN = '" + huvudkategori + "')";

//        //HÄMTAR UID FRÅN VALD HUVUDKATEGORI
//        String uid = "(SELECT UID FROM HUVUDKATEGORI WHERE NAMN = '" + huvudkategori + "')";
//
//        //HÄMTAR UNDERKATEGORIER UTIFRÅN UID
//        String query = "SELECT NAMN FROM UNDERKATEGOR WHERE UID =" + uid;
        try {
            cbListaUnderkategori = db.fetchColumn(query);
            if(cbListaUnderkategori !=null){
            //FYLLER CB
            for (String aResult : cbListaUnderkategori) {
                cbUnderkategori.addItem(aResult);
            }
            }else{taText.append("Det finns inga underkategorier att visa.");}
            
        } catch (InfException e) {
            //lägg till jKPSGJSÖSFGSH
            e.printStackTrace();
        }
    }

    private void cbHuvudkategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHuvudkategoriActionPerformed

        //HÄMTAR VALD KATEGORI I COMBOBOX
        String huvudkategori = cbHuvudkategori.getSelectedItem().toString();
        //ANROPAR METOD SOM FYLLER UNDERKATEGORIER UTIFRÅN HUVUDKATEGORI
        fyllUnderkategoriComboBox(huvudkategori);

    }//GEN-LAST:event_cbHuvudkategoriActionPerformed

    private void cbUnderkategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUnderkategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbUnderkategoriActionPerformed

    private void tfUnderkategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUnderkategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUnderkategoriActionPerformed

    private void btnPubliceraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPubliceraActionPerformed

        //LAGRAR INKOMMANDE VÄRDE I VARIABLAR
        String rubrik = tfRubrik.getText();
        String text = taText.getText();
        String nyUnderkategori = tfUnderkategori.getText();

        //HÄMTAR VÄRDEN FRÅN CB
        String huvudkategori = cbHuvudkategori.getSelectedItem().toString();
        String underkategori = cbUnderkategori.getSelectedItem().toString();

        //SKAPAR LOKAL VARIABEL
        int hid = 0;
        int uid = 0;

        //TITTAR OM ANVÄNDAREN HAR SKRIVIT NÅGONTING I RUTAN FÖR ATT SKAPA NY UNDERKATEGORI
        if (!nyUnderkategori.isEmpty()) {
            try {

                //TILLDELAR UNDERKATEGORI AUTOMATISKT ID
                String fetchMaxID = db.fetchSingle("SELECT MAX(UID) FROM UNDERKATEGORI");
                uid = Integer.parseInt(fetchMaxID) + 1;
                String hamtaHID = "SELECT HID FROM HUVUDKATEGORI WHERE NAMN = '" + huvudkategori + "'";
                //OMVANDLAR STRING TILL INT OCH HÄMTAR DATA FRÅN DATABASEN
                hid = Integer.parseInt(db.fetchSingle(hamtaHID));
                String laggaTillUid = "INSERT INTO UNDERKATEGORI VALUES(" + uid + ",'" + nyUnderkategori + "', " + hid + ")";
                db.insert(laggaTillUid);

            } catch (InfException ex) {
                Logger.getLogger(SkapaInlagg.class.getName()).log(Level.SEVERE, null, ex);
            }

            //OM TEXTRUTAN ÄR TOM SÅ SKA ISTÄLLET DEN VALDA HUVUD- OCH UNDERKATEGORIN LAGRAS KOPPLAT TILL INLÄGGET
        } else {
            //LAGRAR SQL I STRÄNG
            String uidQuery = "SELECT UID FROM UNDERKATEGORI WHERE NAMN = '" + underkategori + "'"
                    + "AND HID = (SELECT HID FROM HUVUDKATEGORI WHERE NAMN = '" + huvudkategori + "')";
            String hidQuery = "SELECT HID FROM HUVUDKATEGORI WHERE NAMN = '" + huvudkategori + "'";

            try {
                //OMVANDLAR STRING TILL INT OCH HÄMTAR DATA FRÅN DATABASEN
                uid = Integer.parseInt(db.fetchSingle(uidQuery));
                hid = Integer.parseInt(db.fetchSingle(hidQuery));
            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, "Något gick fel.");
                System.out.println(e.getMessage());
            }
        }
        //DATUM OBJEKT 
        Date date = new Date();
        //HÄMTAR TIDEN
        long time = date.getTime();
        //HÄMTAR INLOGGATPERSONUMMER FRÅN LOGGAIN-KLASSEN
        String pnr = LoggaIn.returneraInloggadPnr();
        //LAGRAR TIDSSTÄMPEL
        Timestamp datum = new Timestamp(time);

        String datumOchTid = "20190211";

        Object[] alternativ = {"Visa inlägg", "Skapa nytt inlägg", "Gå tillbaka till startsidan"};

        if (Validering.textFaltHarVarde(rubrik)) {
            if (Validering.textFaltHarVarde(text)) {
                try {

                    //TILLDELAR INLAGG AUTOMATISKT ID 
                    String fetchMaxID = db.fetchSingle("SELECT MAX(BLOGGID) FROM BLOGGINLAGG");
                    int bloggId = Integer.parseInt(fetchMaxID) + 1;
                    //LÄGGER TILL INLÄGG I DATABASEN
                    String skapaInlagg = "INSERT INTO BLOGGINLAGG VALUES(" + bloggId + ", '" + rubrik + "', '" + datumOchTid + "', '" + personal_image
                            + "', '" + null + "', '" + text + "', '" + null + "', " + hid + ", '" + pnr + "'," + uid + ")";
                    try {
                        db.insert(skapaInlagg);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Oj, vad hände nu?");
                    }

                    //SKAPAR EN DIALOGRUTA MED ALTERNATIV
                    int input = JOptionPane.showOptionDialog(null, "Ditt blogginlägg har publicerats.", "Vind i seglen!", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.INFORMATION_MESSAGE, null, alternativ, null);

                    //OM INPUT ÄR LIKA MED 0
                    switch (input) {
                        //OM INPUT ÄR LIKA MED 1
                        case 0:
                            //STÄNGER AKTUELL SIDA OCH ÖPPNAR VISAINLAGG
                            dispose();
                            new VisaInlagg(db).setVisible(true);
                            break;

                        //OM INPUT ÄR LIKA MED 2
                        case 1:
                            //STÄNGER AKTUELL SIDA OCH ÖPPNAR FÖRSTASIDAN
                            dispose();
                            new SkapaInlagg(db).setVisible(true);
                            break;
                        case 2:
                            //KOM IHÅG ATT LÄGGA OLIKA FÖNSTER BEROENDE FÖR VEM SOM ÄR INLOGGAD

                            //STÄNGER AKTUELL SIDA OCH ÖPPNAR FÖRSTASIDAN
                            dispose();
                            new AdminHuvud(db).setVisible(true);
                            break;
                        default:
                            break;

                    }
                    ArrayList<HashMap<String, String>> mottagare;
                    String sql = "SELECT ANVANDARE.FORNAMN, EMAIL.MAIL FROM ANVANDARE "
                    + "JOIN EMAIL ON EMAIL.PNR = ANVANDARE.PNR";
                    mottagare = db.fetchRows(sql);
                    skickaNotis(huvudkategori, rubrik, mottagare);
                    
                    //OM NÅGOT FEL FÅNGAS SKRIV UT I POPUP-RUTA
                } catch (InfException e) {
                    JOptionPane.showMessageDialog(null, "Något gick fel..");
                    System.out.println(e.getMessage());
                }

            } else {
                JOptionPane.showMessageDialog(null, "Inlägget är tomt.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Var snäll och skriv en rubrik.");

        }
    }//GEN-LAST:event_btnPubliceraActionPerformed

    private void tfBildfilNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBildfilNamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBildfilNamnActionPerformed

    private void btnBildfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBildfilActionPerformed
        // NYTT
        // JFileChooser provides a simple mechanism for the user to choose a file. 
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        // An abstract representation of file and directory pathnames
        File f = chooser.getSelectedFile();
        // A pathname, whether abstract or in string form, may be either 
        // absolute or relative. An absolute pathname is complete in that 
        // no other information is required in order to locate the file that it denotes.
        filename = f.getAbsolutePath();
        // An implementation of the Icon interface that paints Icons from Images.
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblBilden.getWidth(), lblBilden.getHeight(), Image.SCALE_SMOOTH));
        lblBilden.setIcon(imageIcon);
        try {
            File image = new File(filename);
            // A FileInputStream obtains input bytes from a file in a file system.
            // FileInputStream is meant for reading streams of raw bytes such as image data.
            FileInputStream fis = new FileInputStream(image);
            // This class implements an output stream in which the data is written into a byte 
            // array. The buffer automatically grows as data is written to it. The data can be 
            // retrieved using toByteArray() and toString().
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            // read() Reads a byte of data from this input stream.
            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                // Writes len bytes from the specified byte array starting at offset off to 
                // this byte array output stream.
                bos.write(buf, 0, readNum);

            }
            // Creates a newly allocated byte array.
            personal_image = bos.toByteArray();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btnBildfilActionPerformed

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
    private javax.swing.JButton btnBildfil;
    private javax.swing.JButton btnPublicera;
    private javax.swing.JComboBox<String> cbHuvudkategori;
    private javax.swing.JComboBox<String> cbUnderkategori;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBilden;
    private javax.swing.JLabel lblLaggTillBildfil;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JLabel lblSkapaNyKategori;
    private javax.swing.JLabel lblSkrivInlagg;
    private javax.swing.JLabel lblVäljHuvudkategori;
    private javax.swing.JLabel lblVäljUnderkategori;
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
    private javax.swing.JTextArea taText;
    private javax.swing.JTextField tfBildfilNamn;
    private javax.swing.JTextField tfRubrik;
    private javax.swing.JTextField tfUnderkategori;
    // End of variables declaration//GEN-END:variables
}
