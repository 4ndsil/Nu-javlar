/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjektG2;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author andre
 */
public class TabortMote extends javax.swing.JFrame {

    private InfDB db;
    public TabortMote(InfDB db) {
        initComponents();
        this.db = db;
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lMoten = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnTaBort = new javax.swing.JButton();
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
        mMote = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miAnvandare = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mProfil = new javax.swing.JMenu();
        miVisaProfil = new javax.swing.JMenuItem();
        miLoggaUt = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lMoten.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lMoten.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lMoten);

        jLabel1.setFont(new java.awt.Font("Menlo", 0, 36)); // NOI18N
        jLabel1.setText("Ta bort möte");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Inplanerade möten");

        btnTaBort.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTaBort.setText("Ta bort");
        btnTaBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(btnTaBort)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTaBort))
                .addGap(42, 42, 42))
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

        mMote.setText("Möte");
        mMote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mMoteActionPerformed(evt);
            }
        });
        mLaggTill.add(mMote);

        mbAdminHuvud.add(mLaggTill);

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

        jMenuItem2.setText("Möte");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        mbAdminHuvud.add(jMenu2);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void mMoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mMoteActionPerformed
        new SkapaMote(db).setVisible(true);
    }//GEN-LAST:event_mMoteActionPerformed

    private void miAnvandareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAnvandareActionPerformed
        dispose();
        new TaBortAnvandare(db).setVisible(true);
    }//GEN-LAST:event_miAnvandareActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new TabortMote(db).setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        dispose();

        new GemensamKalender(db).setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void miVisaProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVisaProfilActionPerformed
        dispose();
        new Profil(db).setVisible(true);
    }//GEN-LAST:event_miVisaProfilActionPerformed

    private void miLoggaUtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLoggaUtActionPerformed
        dispose();
        new LoggaIn(db).setVisible(true);
    }//GEN-LAST:event_miLoggaUtActionPerformed

    private void btnTaBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortActionPerformed
     
        DefaultListModel list = (DefaultListModel) lMoten.getModel();
        String dela = lMoten.getSelectedValue();
        
        String[] mote = dela.split(" ", 4);
        for (int i = 0; i < mote.length; i++) {
            String titel = mote[0];
            String datum = mote[1];
            String start = mote[2];
            String slut = mote[3];
            
        try {
            String id = "SELECT MOTESID FROM MOTE WHERE TITEL ='" + titel + "' AND DATUM '" + datum + "' AND STARTTID '" + start + "' AND SLUTTID '" + slut;
            String id1 = db.fetchSingle(id);

           db.update("UPDATE DELTAMOTE SET MOTESID = NULL WHERE MOTESID =" + id1 + "");

            String sql = "DELETE FROM MOTE WHERE MOTESID =" + id1 + "";
                db.delete(sql);

            } catch (InfException e) {
                System.out.println(e.getMessage());
            }
        }
        list.removeElement(lMoten.getSelectedValue());
        lista();

    }//GEN-LAST:event_btnTaBortActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTaBort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lMoten;
    private javax.swing.JMenu mBlogg;
    private javax.swing.JMenu mLaggTill;
    private javax.swing.JMenuItem mMote;
    private javax.swing.JMenu mProfil;
    private javax.swing.JMenu mStart;
    private javax.swing.JMenuBar mbAdminHuvud;
    private javax.swing.JMenuItem miAnvandare;
    private javax.swing.JMenuItem miLoggaUt;
    private javax.swing.JMenuItem miSkapaAnvandare;
    private javax.swing.JMenuItem miSkapaHuvudkategori;
    private javax.swing.JMenuItem miSkapaInlagg;
    private javax.swing.JMenuItem miTillStart;
    private javax.swing.JMenuItem miUnderkategori;
    private javax.swing.JMenuItem miVisaInlagg;
    private javax.swing.JMenuItem miVisaProfil;
    // End of variables declaration//GEN-END:variables
}