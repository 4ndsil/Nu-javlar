/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjektG2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author andre
 */
public class SkapaMote extends javax.swing.JFrame {

   private InfDB db;
    
    public SkapaMote(InfDB db) {
        initComponents();
        this.db =db;
        lista();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jCal = new com.toedter.calendar.JCalendar();
        btnSkapa = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lMoten = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        tfTitel = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfSlut = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfStart = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfLokal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
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
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        miAnvandare = new javax.swing.JMenuItem();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSkapa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSkapa.setText("Skapa möte");
        btnSkapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkapaActionPerformed(evt);
            }
        });

        lMoten.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lMoten.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lMoten);

        jLabel1.setFont(new java.awt.Font("Menlo", 0, 36)); // NOI18N
        jLabel1.setText("Skapa möte");

        tfTitel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Titel");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tfSlut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Sluttid");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Starttid");

        tfStart.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Inplanerade möten");

        tfLokal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Lokal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSkapa)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCal, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(tfTitel, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSlut, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(tfStart, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(tfLokal, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCal, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfTitel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfSlut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfLokal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(btnSkapa))
                            .addComponent(jScrollPane2))
                        .addGap(88, 88, 88))))
        );

        mStart.setText("Start");
        mStart.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        miTillStart.setText("Till Startsidan");
        miTillStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTillStartActionPerformed(evt);
            }
        });
        mStart.add(miTillStart);

        jMenuBar1.add(mStart);

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

        jMenuBar1.add(mBlogg);

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

        jMenuBar1.add(mLaggTill);

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

        jMenuBar1.add(mProfil);

        jMenu3.setText("Kalender");
        jMenu3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jMenuItem1.setText("Se Kalender");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Ta bort");
        jMenu4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        miAnvandare.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        miAnvandare.setText("Användare");
        miAnvandare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAnvandareActionPerformed(evt);
            }
        });
        jMenu4.add(miAnvandare);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void lista() {
        lMoten.clearSelection();
        try {
            DefaultListModel list = new DefaultListModel();
            ArrayList<HashMap<String, String>> anvandare;
            String sql = "SELECT TITEL, DATUM, STARTTID, SLUTTID FROM MOTE";
            anvandare = db.fetchRows(sql);

            for (HashMap<String, String> hittad : anvandare) {
                String titel = hittad.get("TITEL");
                String datum = hittad.get("DATUM");
                String start = hittad.get("STARTTID");
                String slut = hittad.get("SLUTTID");
                list.addElement(titel + " " + datum + " " + start + "-" + slut);
                lMoten.setModel(list);
            }
        } catch (InfException e) {
            System.out.println(e.getMessage());
        }
    }
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
        // TODO add your handling code here:
        dispose();
        new GemensamKalender(db).setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void miAnvandareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAnvandareActionPerformed

        new TaBortAnvandare(db).setVisible(true);
    }//GEN-LAST:event_miAnvandareActionPerformed

    private void btnSkapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkapaActionPerformed
      
        DefaultListModel list = new DefaultListModel();

        Calendar calVart = jCal.getCalendar();
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 0);
        Date date = calVart.getTime();
//      Ändrar  formatet på datumet.
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy.MM.dd");
        String aktivtDatum = null;

        int id = genereraID();
        String titel = tfTitel.getText();
        String start = tfStart.getText();
        String slut = tfSlut.getText();
        String lokal = tfLokal.getText();
        if(Validering.arTid(tfSlut) && Validering.arTid(tfStart)){

        try {
            aktivtDatum = format1.format(date);
            String sql = "INSERT INTO MOTE(MOTESID, DATUM, LOKAL, STARTTID, SLUTTID, TITEL) VALUES (" +id + ",'"+aktivtDatum+"','"+lokal+"','" +start+"','" +slut+"','"+titel+"')";
            db.insert(sql);
            
            list.addElement(titel + " " + aktivtDatum + " " + start + "-" + slut);
            JOptionPane.showMessageDialog(null, "Mötet " + titel + " har lagts till.");
            
             } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "något gick fel");
            System.out.println(e.getMessage());
        }}
            lista();
    }//GEN-LAST:event_btnSkapaActionPerformed

    public int genereraID(){
    
        int id = 0;
        try {
            String fetchMaxID = db.fetchSingle("SELECT MAX(MOTESID) FROM MOTE");
            id = Integer.parseInt(fetchMaxID) + 1;
        } catch (InfException e) {
            System.out.println(e.getMessage());
        }
        return id;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSkapa;
    private com.toedter.calendar.JCalendar jCal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JList<String> lMoten;
    private javax.swing.JMenu mBlogg;
    private javax.swing.JMenu mLaggTill;
    private javax.swing.JMenu mProfil;
    private javax.swing.JMenu mStart;
    private javax.swing.JMenuItem miAnvandare;
    private javax.swing.JMenuItem miLoggaUt;
    private javax.swing.JMenuItem miSkapaAnvandare;
    private javax.swing.JMenuItem miSkapaHuvudkategori;
    private javax.swing.JMenuItem miSkapaInlagg;
    private javax.swing.JMenuItem miTillStart;
    private javax.swing.JMenuItem miUnderkategori;
    private javax.swing.JMenuItem miVisaInlagg;
    private javax.swing.JMenuItem miVisaProfil;
    private javax.swing.JTextField tfLokal;
    private javax.swing.JTextField tfSlut;
    private javax.swing.JTextField tfStart;
    private javax.swing.JTextField tfTitel;
    // End of variables declaration//GEN-END:variables
}
