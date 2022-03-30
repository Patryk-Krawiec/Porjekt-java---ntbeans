package projekt;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author student
 */
public class dodZamowienia extends javax.swing.JFrame {

    OracleConnection connection = new OracleConnection();
    Statement statement;
    ResultSet resultset;
    DefaultTableModel model = new DefaultTableModel();
    
    public dodZamowienia() {
        initComponents();
        model.addColumn("id_wypozyczenia");
        model.addColumn("id_klienta");
        model.addColumn("id_samochodu");
        model.addColumn("data_zamowienia");
        model.addColumn("data_wypozyczenia");
        model.addColumn("data_oddania");
        
        try {
            statement = connection.getConnection().createStatement();
            ResultSet Rs = statement.executeQuery("SELECT * FROM wypozyczenie");
            while (Rs.next()) {
                model.addRow(new Object[]{Rs.getString("id_wypozyczenia"), Rs.getString("id_klienta"), Rs.getString("id_samochodu"), Rs.getString("data_zamowienia"), Rs.getString("data_wypozyczenia"), Rs.getString("data_oddania")});

            }
        } catch (Exception e) {
            System.err.println(e);
        }

        jTable1.setModel(model);
    }
     private void pobierz(int i) {

        try {
            szukaj.setText(model.getValueAt(i, 0).toString());
        } catch (Exception e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Błąd!" + e.getLocalizedMessage());
        }

    }
    private void wyswietl() {
        model.setRowCount(0);
        try {
            statement = connection.getConnection().createStatement();
            ResultSet Rs = statement.executeQuery("SELECT * FROM wypozyczenie");
            while (Rs.next()) {
                model.addRow(new Object[]{Rs.getString("id_wypozyczenia"), Rs.getString("id_klienta"), Rs.getString("id_samochodu"), Rs.getString("data_zamowienia"), Rs.getString("data_wypozyczenia"), Rs.getString("data_oddania")});

            }
        } catch (Exception e) {
            System.err.println(e);
        }

        jTable1.setModel(model);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        szukaj = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        szukaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                szukajActionPerformed(evt);
            }
        });

        jButton1.setText("szukaj");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("odswiez");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("MENU");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("ILOSC ZAM.");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(szukaj)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 44, Short.MAX_VALUE)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(szukaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(94, 94, 94)
                .addComponent(jButton3)
                .addGap(29, 29, 29)
                .addComponent(jButton5)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        wyswietl();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void szukajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_szukajActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_szukajActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            model.setRowCount(0);        // Wyczyszczenie tabeli by wyświetlała tylko szukane wyniki.
            {
                resultset = statement.executeQuery("SELECT id_wypozyczenia, id_klienta, id_samochodu, data_zamowienia, data_wypozyczenia, data_oddania FROM wypozyczenie WHERE id_wypozyczenia LIKE '%" + szukaj.getText() + "%'");
            }
            while (resultset.next()) {

                Object[] wyp = {resultset.getInt(1), resultset.getString(2), resultset.getString(3), resultset.getString(4), resultset.getString(5), resultset.getString(6)};
                model.addRow(wyp);
            }
            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Brak wyników.");

            } else {
                int i = 0;
                pobierz(i);
            }

        } catch (Exception e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        projekt.GlownyForm gf = new GlownyForm();
        gf.pack();
        gf.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection connection = 
                    DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:kosmos","student","student1");

            CallableStatement cstmt = connection.prepareCall("{?=call ile_zamowien()}");
            cstmt.registerOutParameter(1, Types.NUMERIC);
            cstmt.execute();
           JOptionPane.showMessageDialog(null,"Ilosc wszystkich zamowien: "+cstmt.getString(1));          
            connection.close();
        } catch(Exception e){ 
            System.out.println(e); 
        }
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(dodZamowienia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dodZamowienia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dodZamowienia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dodZamowienia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dodZamowienia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField szukaj;
    // End of variables declaration//GEN-END:variables

}
