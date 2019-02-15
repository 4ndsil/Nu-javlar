/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjektG2;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;


public class VisaInlagg extends javax.swing.JFrame {

    private InfDB db;

    public VisaInlagg(InfDB db) {
        initComponents();
        this.db = db;

        fyllKommentar();
        fyllCbHKategori();
        fyllCbUKategori();
        fyllCbRubrik();
        // fyllTextArea();

    }
   
  
    public void fyllCbHKategori() {
        
        cbHKategori.removeAllItems();
        
        ArrayList<String> cbListaHuvudkategori;
        
        String query = "SELECT NAMN FROM HUVUDKATEGORI";
        
        try {
            cbListaHuvudkategori = db.fetchColumn(query);

            for (String aResult : cbListaHuvudkategori) {
                cbHKategori.addItem(aResult);
            }
        } catch (InfException e) {
            e.printStackTrace();
        }
        
    }
    
    public void fyllCbUKategori() {
        
        cbUKategori.removeAllItems();
        
        ArrayList<String> cbListaUnderkategori;

        String query = "SELECT UNDERKATEGORI.NAMN FROM UNDERKATEGORI\n" +
        "JOIN HUVUDKATEGORI ON UNDERKATEGORI.HID = HUVUDKATEGORI.HID WHERE HUVUDKATEGORI.NAMN = '" + cbHKategori.getSelectedItem().toString() + "'";
        
        try {
            cbListaUnderkategori = db.fetchColumn(query);

            for(String aResult : cbListaUnderkategori)
            {
                cbUKategori.addItem(aResult);
            }
        } catch (InfException e) {
            e.printStackTrace();
        }
        
    }
    
    public void fyllCbRubrik() {
       
        System.out.print(cbUKategori.getSelectedItem().toString());
        
        cbRubrik.removeAllItems();
        
        ArrayList<String> cbListaRubrik;

        String query = "SELECT BLOGGINLAGG.RUBRIK FROM BLOGGINLAGG JOIN UNDERKATEGORI ON UNDERKATEGORI.UID = BLOGGINLAGG.UID WHERE UNDERKATEGORI.NAMN = '" + cbUKategori.getSelectedItem().toString() + "'";
        
        try {
            cbListaRubrik = db.fetchColumn(query);

            for(String aResult : cbListaRubrik)
            {
                cbRubrik.addItem(aResult);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    public void fyllKommentar() {

        try {
            //EN ARRYLIST AV HASHMAP AV STRING 
            ArrayList<HashMap<String, String>> listaKommentarer;
            listaKommentarer = db.fetchRows("SELECT TEXT, PNR FROM KOMMENTAR");

            DefaultListModel dlm = new DefaultListModel();

            //LOOPAR LISTA OCH HÄMTAR ELEVHEMSNAMN OCH LÄGGER IN DEM I ELEVHEMSLISTAN
            for (HashMap<String, String> kommentar : listaKommentarer) {

                String rubrik = kommentar.get("TEXT");
                String persnr = kommentar.get("PNR");
                taKommentar.append(rubrik + "\n" + persnr + "\n" + "\n");
            }

            //OM NÅGOT FEL FÅNGAS SKRIV UT I POPUP-RUTA
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel.");
            System.out.println(e.getMessage());
        }

    }
    
    public void fyllTextArea() {
        
        taInlagg.setText("");
        
        try {
            //EN ARRYLIST AV HASHMAP AV STRING 
            ArrayList<HashMap<String, String>> listaBloggInlagg;
            listaBloggInlagg = db.fetchRows("SELECT RUBRIK, DATUM, INNEHALL FROM BLOGGINLAGG");

            DefaultListModel dlm = new DefaultListModel();

            //LOOPAR LISTA OCH HÄMTAR ELEVHEMSNAMN OCH LÄGGER IN DEM I ELEVHEMSLISTAN
            for (HashMap<String, String> inlagg : listaBloggInlagg) {

                String rubrik = inlagg.get("RUBRIK");
                String datum = inlagg.get("DATUM");
                String innehall = inlagg.get("INNEHALL");
                taInlagg.append(rubrik + "\n" + datum + "\n" + innehall + "\n" + "\n");
            }

            //OM NÅGOT FEL FÅNGAS SKRIV UT I POPUP-RUTA
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel.");
            System.out.println(e.getMessage());
        }

    }
    

    private void fyllTAUnderkategori() {
    // Fyller TextArea baserat på vad som valts i Combo boxen med Underkategori    
    // EJ KLAR ÄN 14 FEBRUARI
    
            taInlagg.setText("");

            try{

            String fraga =  "SELECT RUBRIK, DATUM, INNEHALL FROM BLOGGINLAGG\n" +
                            "JOIN UNDERKATEGORI \n" +
                            "ON BLOGGINLAGG.UID = UNDERKATEGORI.UID\n" +
                            "WHERE UNDERKATEGORI.NAMN ='" + cbUKategori.getSelectedItem() + "'";
            
            ArrayList<HashMap<String, String>> listaBloggInlagg;
            listaBloggInlagg = db.fetchRows(fraga);

            for (HashMap<String, String> inlagg : listaBloggInlagg) {
                String rubrik = inlagg.get("RUBRIK");
                String datum = inlagg.get("DATUM");
                String innehall = inlagg.get("INNEHALL");

                taInlagg.append(rubrik + "\n" + datum + "\n" + innehall + "\n \n");
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel.");
            System.out.println(e.getMessage());
        }    
    }
    
    private void fyllTARubrik() {
    // Fyller TextArea baserat på vad som valts i Combo boxen med Rubriker
    
            taInlagg.setText("");

            try{

            String fraga =  "SELECT RUBRIK, DATUM, INNEHALL FROM BLOGGINLAGG\n" +
                            "JOIN UNDERKATEGORI \n" +
                            "ON BLOGGINLAGG.UID = UNDERKATEGORI.UID\n" +
                            "WHERE UNDERKATEGORI.NAMN ='" + cbRubrik.getSelectedItem() + "'";
            
            ArrayList<HashMap<String, String>> listaBloggInlagg;
            listaBloggInlagg = db.fetchRows(fraga);

            for (HashMap<String, String> inlagg : listaBloggInlagg) {
                String rubrik = inlagg.get("RUBRIK");
                String datum = inlagg.get("DATUM");
                String innehall = inlagg.get("INNEHALL");

                taInlagg.append(rubrik + "\n" + datum + "\n" + innehall + "\n\n");
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel.");
            System.out.println(e.getMessage());
        }    
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
        jButton1 = new javax.swing.JButton();
        cbHKategori = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        taInlagg = new javax.swing.JTextArea();
        cbRubrik = new javax.swing.JComboBox<>();
        cbUKategori = new javax.swing.JComboBox<>();
        jbKommentera = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taKommentar = new javax.swing.JTextArea();
        tfKommentar = new javax.swing.JTextField();
        jbKategori = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbVisaInlagg = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        mbAdminHuvud = new javax.swing.JMenuBar();
        mStart = new javax.swing.JMenu();
        miTillStart = new javax.swing.JMenuItem();
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
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Lärarplattform Informatik: Bloggportal");

        jButton1.setText("Tillbaka");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cbHKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHKategoriActionPerformed(evt);
            }
        });

        taInlagg.setColumns(20);
        taInlagg.setLineWrap(true);
        taInlagg.setRows(5);
        taInlagg.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        taInlagg.setEnabled(false);
        jScrollPane5.setViewportView(taInlagg);

        cbRubrik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRubrikActionPerformed(evt);
            }
        });

        cbUKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUKategoriActionPerformed(evt);
            }
        });

        jbKommentera.setText("Kommentera valt inlägg");
        jbKommentera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbKommenteraActionPerformed(evt);
            }
        });

        jLabel3.setText("Kommentera");

        taKommentar.setColumns(20);
        taKommentar.setRows(5);
        jScrollPane2.setViewportView(taKommentar);

        tfKommentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfKommentarActionPerformed(evt);
            }
        });

        jbKategori.setText("Välj underkategori");
        jbKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbKategoriActionPerformed(evt);
            }
        });

        jLabel2.setText("Huvudkategori");

        jLabel4.setText("Underkategori");

        jLabel5.setText("Rubrik");

        jbVisaInlagg.setText("Visa alla inlägg");
        jbVisaInlagg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVisaInlaggActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Visa inlägg");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setText("Visa inlägg");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel6.setText("Baserat på vald underkategori");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel7.setText("Baserat på vald rubrik");

        mbAdminHuvud.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mbAdminHuvud.setRequestFocusEnabled(false);

        mStart.setText("Start");
        mStart.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

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

        jMenu1.setText("Kalender");
        jMenu1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jMenuItem1.setText("Se Kalender");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        mbAdminHuvud.add(jMenu1);

        setJMenuBar(mbAdminHuvud);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(234, 234, 234))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tfKommentar)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbHKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbUKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel7))
                                            .addComponent(jToggleButton2))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbKommentera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbVisaInlagg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel6))
                                            .addComponent(jToggleButton1))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)
                        .addGap(94, 94, 94)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbHKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbUKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbKategori)
                    .addComponent(jToggleButton1))
                .addGap(9, 9, 9)
                .addComponent(jLabel6)
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbVisaInlagg)
                    .addComponent(jToggleButton2))
                .addGap(4, 4, 4)
                .addComponent(jLabel7)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbKommentera)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(tfKommentar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose(); 
        AdminHuvud a = new AdminHuvud(db);
        a.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void miTillStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTillStartActionPerformed
        dispose();
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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
        new GemensamKalender(db).setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jbKommenteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbKommenteraActionPerformed
        // Knapp för att kommentera inlägg
        
                //DATUM OBJEKT 
        Date date = new Date();
        
        try {
            String kommentar = tfKommentar.getText(); 
            
                //TILLDELAR KOMMENTAR AUTOMATISKT ID
                String fetchMaxID = db.fetchSingle("SELECT MAX(KID) FROM KOMMENTAR");
                int KID = Integer.parseInt(fetchMaxID) + 1;
                
                String fraga1 = "INSERT INTO kommentar(text) VALUES('" + KID + "', '" + date + "', '" + kommentar + "');"; // SQL fråga
                db.insert(fraga1); // Uppdaterar databasen

            JOptionPane.showMessageDialog(null, "Tack för din kommentar!"); // Pop up meddelande när eleven lagts till i databasen
        }

        catch(InfException e) {
            JOptionPane.showMessageDialog(null, e.getMessage()); // Pop up felmeddelande
        }
        
    }//GEN-LAST:event_jbKommenteraActionPerformed

    private void tfKommentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfKommentarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfKommentarActionPerformed

    private void cbHKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHKategoriActionPerformed
        // TODO add your handling code here:
        fyllCbUKategori();
    }//GEN-LAST:event_cbHKategoriActionPerformed

    private void cbUKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUKategoriActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_cbUKategoriActionPerformed

    private void jbKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbKategoriActionPerformed
        // TODO add your handling code here:
        fyllCbRubrik();
    }//GEN-LAST:event_jbKategoriActionPerformed

    private void cbRubrikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRubrikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbRubrikActionPerformed

    private void jbVisaInlaggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVisaInlaggActionPerformed
        // TODO add your handling code here:
        fyllTextArea();
    }//GEN-LAST:event_jbVisaInlaggActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        fyllTAUnderkategori();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        fyllTARubrik();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbHKategori;
    private javax.swing.JComboBox<String> cbRubrik;
    private javax.swing.JComboBox<String> cbUKategori;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JButton jbKategori;
    private javax.swing.JButton jbKommentera;
    private javax.swing.JButton jbVisaInlagg;
    private javax.swing.JMenu mBlogg;
    private javax.swing.JMenu mLaggTill;
    private javax.swing.JMenu mProfil;
    private javax.swing.JMenu mStart;
    private javax.swing.JMenuBar mbAdminHuvud;
    private javax.swing.JMenuItem miLoggaUt;
    private javax.swing.JMenuItem miSkapaAnvandare;
    private javax.swing.JMenuItem miSkapaHuvudkategori;
    private javax.swing.JMenuItem miSkapaInlagg;
    private javax.swing.JMenuItem miTillStart;
    private javax.swing.JMenuItem miUnderkategori;
    private javax.swing.JMenuItem miVisaInlagg;
    private javax.swing.JMenuItem miVisaProfil;
    private javax.swing.JTextArea taInlagg;
    private javax.swing.JTextArea taKommentar;
    private javax.swing.JTextField tfKommentar;
    // End of variables declaration//GEN-END:variables
}
