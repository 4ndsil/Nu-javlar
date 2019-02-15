package ProjektG2;

import ProjektG2.LoggaIn;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Johan
 */
public class TaBortKommentar extends javax.swing.JFrame {

    private InfDB db;
    private LoggaIn loggaIn;

    public TaBortKommentar(InfDB db) {
        initComponents();
        this.db = db;
        fyllLista();
        loggaIn.returneraInloggadPnr();
    }

    public void fyllLista() {
        String user = loggaIn.returneraInloggadPnr();
        try {
            String sql2 = "SELECT PNR FROM ANVANDARE WHERE PNR ='" + user + "'";
            String inloggadPerson = db.fetchSingle(sql2);

            lKommentarer.clearSelection();

            DefaultListModel list = new DefaultListModel();
            ArrayList<HashMap<String, String>> anvandare;
            String sql = "SELECT DATUM, TEXT FROM KOMMENTAR WHERE PNR = " + inloggadPerson;
            anvandare = db.fetchRows(sql);

            anvandare.stream().map((hittad) -> {
                String datum = hittad.get("DATUM");
                String text = hittad.get("TEXT");
                list.addElement("Datum: " + datum + " Kommentar: " + text);
                return hittad;
            }).forEachOrdered((_item) -> {
                lKommentarer.setModel(list);
            });
        } catch (InfException e) {
            System.out.println(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lKommentarer = new javax.swing.JList<>();
        btnTaBort = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lKommentarer.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lKommentarer);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE))
        );

        btnTaBort.setText("Ta bort kommentar");
        btnTaBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(673, Short.MAX_VALUE)
                .addComponent(btnTaBort)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTaBort)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTaBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortActionPerformed

        DefaultListModel list = (DefaultListModel) lKommentarer.getModel();
        String valdKommentar = lKommentarer.getSelectedValue();

        String[] part = valdKommentar.split("Kommentar: ");
        for (int i = 0; i < part.length; i++) {
            String felDel = part[0];
            String rättDel = part[1];

            {
                try {
                    db.update("UPDATE KOMMENTAR SET PNR = NULL WHERE TEXT ='" + rättDel + "'");

                    db.update("UPDATE KOMMENTAR SET BLOGGID = NULL WHERE TEXT ='" + rättDel + "'");

                    String sql1 = "DELETE FROM KOMMENTAR WHERE TEXT ='" + rättDel + "'";
                    db.delete(sql1);

                } catch (InfException e) {
                    System.out.println(e.getMessage());
                }
            }
            list.removeElement(lKommentarer.getSelectedValue());
            fyllLista();
    }//GEN-LAST:event_btnTaBortActionPerformed
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTaBort;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lKommentarer;
    // End of variables declaration//GEN-END:variables
}
