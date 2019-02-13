/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjektG2;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Aquelin
 */
public class Favoriter extends javax.swing.JFrame {

    private static InfDB db;
    //private String startValue = "Alla inlagg";

    /**
     * Creates new form Favoriter
     */
    public Favoriter(InfDB db) {
        initComponents();
        this.db = db;
        fyllcbHK();
        fyllcbUK();
        fyllTextArea();
    }

    // EJ KLAR!
    private void fyllTextArea() {
        taFavoritOutput.setText("");
        try {
            String hidQuery = "SELECT HID FROM HUVUDKATEGORI WHERE NAMN = '" + cbHK.getSelectedItem().toString() + "'";
            int hid = Integer.parseInt(db.fetchSingle(hidQuery));
            String uidQuery = "SELECT UID FROM UNDERKATEGORI WHERE NAMN = '" + cbUK.getSelectedItem().toString() + "'";
            int uid = Integer.parseInt(db.fetchSingle(uidQuery));

            //EN ARRYLIST DÄR VI LÄGGER IN DATAN SOM SEDAN SKA SKRIVAS UT
            ArrayList<HashMap<String, String>> listaBloggInlagg;
            listaBloggInlagg = db.fetchRows("SELECT RUBRIK, DATUM, INNEHALL FROM BLOGGINLAGG WHERE HID = "
                    + hid + " AND UID = " + uid);

            //LOOPAR LISTA OCH HÄMTAR DATAN SOM SKA SKRIVAS UT
            for (HashMap<String, String> inlagg : listaBloggInlagg) {
                String rubrik = inlagg.get("RUBRIK");
                String datum = inlagg.get("DATUM");
                String innehall = inlagg.get("INNEHALL");

                taFavoritOutput.append(rubrik + "\n" + datum + "\n" + innehall + "\n\n");
            }

            //OM NÅGOT FEL FÅNGAS SKRIV UT I POPUP-RUTA
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel.");
            System.out.println(e.getMessage());
        }

    }

    private void fyllcbHK() {
        //RENSAR CB
        cbHK.removeAllItems();
        //cbHK.insertItemAt(startValue, -1);

        //ARRAY SOM SKA LAGRA HUVUDKATEGORIER
        ArrayList<String> cbListaHuvudkategori;

        //HÄMTAR HUVUDKATEGORIER
        String query = "SELECT NAMN FROM HUVUDKATEGORI";

        try {
            cbListaHuvudkategori = db.fetchColumn(query);

            //FYLLER CB
            for (String aResult : cbListaHuvudkategori) {
                cbHK.addItem(aResult);
            }
        } catch (InfException e) {
            e.printStackTrace();
        }
//        //HÄMTAR VALD KATEGORI I COMBOBOX
//        String huvudkategori = cbHK.getSelectedItem().toString();
//
//        fyllcbUK(huvudkategori);
    }

    private void fyllcbUK() {
        //RENSAR CB
        cbUK.removeAllItems();

        //ARRAY SOM SKA LAGRA UNDERKATEGORIER
        ArrayList<String> cbListaUnderkategori;

        String query = "SELECT NAMN FROM UNDERKATEGORI WHERE HID = (SELECT HID FROM HUVUDKATEGORI WHERE NAMN = '" + cbHK.getSelectedItem().toString() + "')";

        try {
            cbListaUnderkategori = db.fetchColumn(query);

            //FYLLER CB
            for (String aResult : cbListaUnderkategori) {
                cbUK.addItem(aResult);
            }
        } catch (InfException e) {
            //lägg till jKPSGJSÖSFGSH
            e.printStackTrace();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbHK = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        taFavoritOutput = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbUK = new javax.swing.JComboBox<>();
        btnValj = new javax.swing.JButton();
        mbAdminHuvud = new javax.swing.JMenuBar();
        mStart = new javax.swing.JMenu();
        miTillStart = new javax.swing.JMenuItem();
        mBlogg = new javax.swing.JMenu();
        miVisaInlagg = new javax.swing.JMenuItem();
        miSkapaInlagg = new javax.swing.JMenuItem();
        mProfil = new javax.swing.JMenu();
        miVisaProfil = new javax.swing.JMenuItem();
        miFavoritInlagg = new javax.swing.JMenuItem();
        miLoggaUt = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mLaggTill = new javax.swing.JMenu();
        miSkapaAnvandare = new javax.swing.JMenuItem();
        miSkapaHuvudkategori = new javax.swing.JMenuItem();
        miUnderkategori = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("★★★ FAVORITER ★★★");

        cbHK.setToolTipText("");
        cbHK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHKActionPerformed(evt);
            }
        });

        taFavoritOutput.setColumns(20);
        taFavoritOutput.setLineWrap(true);
        taFavoritOutput.setRows(5);
        jScrollPane1.setViewportView(taFavoritOutput);

        jLabel2.setText("Huvudkategori:");

        jLabel3.setText("Underkategori:");

        cbUK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUKActionPerformed(evt);
            }
        });

        btnValj.setText("Välj");
        btnValj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValjActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbHK, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbUK, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnValj)))
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbHK)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(cbUK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnValj))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addGap(50, 50, 50))
        );

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

        mProfil.setText("Profil");
        mProfil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        miVisaProfil.setText("Visa profil");
        miVisaProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVisaProfilActionPerformed(evt);
            }
        });
        mProfil.add(miVisaProfil);

        miFavoritInlagg.setText("Favoritinlägg");
        miFavoritInlagg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFavoritInlaggActionPerformed(evt);
            }
        });
        mProfil.add(miFavoritInlagg);

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

        setJMenuBar(mbAdminHuvud);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void miVisaProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVisaProfilActionPerformed
        dispose();
        new Profil(db).setVisible(true);
    }//GEN-LAST:event_miVisaProfilActionPerformed

    private void miFavoritInlaggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFavoritInlaggActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miFavoritInlaggActionPerformed

    private void miLoggaUtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLoggaUtActionPerformed
        dispose();
        new LoggaIn(db).setVisible(true);
    }//GEN-LAST:event_miLoggaUtActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new GemensamKalender(db).setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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

    private void cbHKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHKActionPerformed
        //HÄMTAR VALD KATEGORI I COMBOBOX
        //String huvudkategori = cbHK.getSelectedItem().toString();
        //ANROPAR METOD SOM FYLLER UNDERKATEGORIER UTIFRÅN HUVUDKATEGORI
        fyllcbUK();        
    }//GEN-LAST:event_cbHKActionPerformed

    private void cbUKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUKActionPerformed
      
    }//GEN-LAST:event_cbUKActionPerformed

    private void btnValjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValjActionPerformed
        fyllTextArea();
    }//GEN-LAST:event_btnValjActionPerformed

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
            java.util.logging.Logger.getLogger(Favoriter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Favoriter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Favoriter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Favoriter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Favoriter(db).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnValj;
    private javax.swing.JComboBox<String> cbHK;
    private javax.swing.JComboBox<String> cbUK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu mBlogg;
    private javax.swing.JMenu mLaggTill;
    private javax.swing.JMenu mProfil;
    private javax.swing.JMenu mStart;
    private javax.swing.JMenuBar mbAdminHuvud;
    private javax.swing.JMenuItem miFavoritInlagg;
    private javax.swing.JMenuItem miLoggaUt;
    private javax.swing.JMenuItem miSkapaAnvandare;
    private javax.swing.JMenuItem miSkapaHuvudkategori;
    private javax.swing.JMenuItem miSkapaInlagg;
    private javax.swing.JMenuItem miTillStart;
    private javax.swing.JMenuItem miUnderkategori;
    private javax.swing.JMenuItem miVisaInlagg;
    private javax.swing.JMenuItem miVisaProfil;
    private javax.swing.JTextArea taFavoritOutput;
    // End of variables declaration//GEN-END:variables

}
