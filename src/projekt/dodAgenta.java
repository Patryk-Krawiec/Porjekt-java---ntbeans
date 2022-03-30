package projekt;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class dodAgenta extends javax.swing.JFrame {

    OracleConnection connection = new OracleConnection();
    Statement statement;
    ResultSet resultset;
    DefaultTableModel model = new DefaultTableModel();
    
    public dodAgenta() {
        initComponents();
        model.addColumn("id_agenta");
        model.addColumn("id_wypozyczalni");
        model.addColumn("Imie");
        model.addColumn("Nazwisko");
        model.addColumn("nr_telefonu");
        model.addColumn("Wynagrodzenie");
        
        try {
            statement = connection.getConnection().createStatement();
            ResultSet Rs = statement.executeQuery("SELECT * FROM agent");
            while (Rs.next()) {
                model.addRow(new Object[]{Rs.getString("id_agenta"), Rs.getString("id_wypozyczalni"), Rs.getString("imie"), Rs.getString("nazwisko"), Rs.getString("nr_telefonu"), Rs.getString("wynagrodzenie")});

            }
        } catch (Exception e) {
            System.err.println(e);
        }

        jTable1.setModel(model);
    }
    
    private void pobierz(int i) {

        try {
            id.setText(model.getValueAt(i, 0).toString());
            id_wypozyczalni.setText(model.getValueAt(i, 1).toString());
            imie.setText(model.getValueAt(i, 2).toString());
            nazwisko.setText(model.getValueAt(i, 3).toString());
            nr_telefonu.setText(model.getValueAt(i, 4).toString());
            wynagrodzenie.setText(model.getValueAt(i, 5).toString());
            txtszukaj.setText(model.getValueAt(i, 6).toString());
        } catch (Exception e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Błąd!" + e.getLocalizedMessage());
        }

    }
        private void wyswietl() {
        model.setRowCount(0);
        try {
            statement = connection.getConnection().createStatement();
            ResultSet Rs = statement.executeQuery("SELECT * FROM agent");
            while (Rs.next()) {
                model.addRow(new Object[]{Rs.getString("id_agenta"), Rs.getString("id_wypozyczalni"), Rs.getString("imie"), Rs.getString("nazwisko"), Rs.getString("nr_telefonu"), Rs.getString("wynagrodzenie")});

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
        imie = new javax.swing.JTextField();
        nazwisko = new javax.swing.JTextField();
        nr_telefonu = new javax.swing.JTextField();
        wynagrodzenie = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtszukaj = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        id_wypozyczalni = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
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

        jButton1.setText("usun");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("edytuj");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("odswiez");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("dodaj");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txtszukaj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtszukajKeyReleased(evt);
            }
        });

        jButton5.setText("szukaj");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setText("imie");

        jLabel2.setText("nazwisko");

        jLabel3.setText("nr telefonu");

        jLabel4.setText("wynagrodzenie");

        jLabel5.setText("ID wypozyczalni");

        jLabel6.setText("ID agenta");

        jLabel7.setText("Wprowadź nazwisko:");

        jButton6.setText("ZAMKNIJ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel7)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 19, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel1)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel6))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                                    .addComponent(wynagrodzenie, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(nr_telefonu, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(nazwisko, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(imie, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(id_wypozyczalni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jButton3)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(txtszukaj))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton6)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(imie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nr_telefonu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(wynagrodzenie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id_wypozyczalni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton4))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtszukaj, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        wyswietl();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try {
            if (JOptionPane.showConfirmDialog(null, "Czy jesteś pewien?", "Usuwanie agenta.", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                if (id.getText().length() != 0) {
                    statement.executeUpdate("DELETE FROM agent where id_agenta = " + id.getText());
                    wyswietl();
                } else {
                    JOptionPane.showMessageDialog(null, "Podaj ID!");
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Błąd podczas usuwania \n" + e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      try {
            if (JOptionPane.showConfirmDialog(null, "Potwierdzić edycję", "Edycja",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {

                statement.executeUpdate("UPDATE Agent SET imie='" + imie.getText() + "',nazwisko='" + nazwisko.getText()
                        + "',nr_telefonu='" + nr_telefonu.getText() + "',wynagrodzenie='" + wynagrodzenie.getText() + "',id_wypozyczalni='" + id_wypozyczalni.getText() + "' WHERE id_agenta = " + id.getText());
                wyswietl();

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Błąd edycji! " + e.getMessage());
            System.err.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String imie = this.imie.getText();
        String nazwisko = this.nazwisko.getText();
        String nr_telefonu = this.nr_telefonu.getText();
        String wynagrodzenie = this.wynagrodzenie.getText();
        String id_agenta = this.id.getText();
        String id_wypozyczalni = this.id_wypozyczalni.getText();

        if (imie == null || nazwisko == null || nr_telefonu == null || wynagrodzenie == null || id_agenta == null || id_wypozyczalni == null) {
            JOptionPane.showMessageDialog(null, "Nie podano danych.");
        } else {
            try {
                String agent = "INSERT INTO Agent(imie, nazwisko, nr_telefonu, wynagrodzenie, id_agenta, id_wypozyczalni)VALUES('"
                        + imie + "','" + nazwisko + "','" + nr_telefonu + "','" + wynagrodzenie + "','" + id_agenta + "','" + id_wypozyczalni + "')";

                statement.executeUpdate(agent);
                JOptionPane.showMessageDialog(null, "Agent został dodany.");
                this.imie.setText("");
                this.nazwisko.setText("");
                this.nr_telefonu.setText("");
                this.wynagrodzenie.setText("");
                this.id.setText("");
                this.id_wypozyczalni.setText("");
                wyswietl();
            } catch (SQLException ex) {
                Logger.getLogger(dodAgenta.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            try {
            model.setRowCount(0);        // Wyczyszczenie tabeli by wyświetlała tylko szukane wyniki.
            {
                resultset = statement.executeQuery("SELECT id_agenta, id_wypozyczalni, imie, nazwisko, nr_telefonu, wynagrodzenie FROM agent WHERE nazwisko LIKE '%" + txtszukaj.getText() + "%'");
            }
            while (resultset.next()) {

                Object[] wyszukanie = {resultset.getInt(1), resultset.getString(2), resultset.getString(3), resultset.getString(4), resultset.getString(5), resultset.getString(6)};
                model.addRow(wyszukanie);
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
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtszukajKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtszukajKeyReleased
        
    }//GEN-LAST:event_txtszukajKeyReleased

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed


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
            java.util.logging.Logger.getLogger(dodAgenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dodAgenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dodAgenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dodAgenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dodAgenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id;
    private javax.swing.JTextField id_wypozyczalni;
    private javax.swing.JTextField imie;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nazwisko;
    private javax.swing.JTextField nr_telefonu;
    private javax.swing.JTextField txtszukaj;
    private javax.swing.JTextField wynagrodzenie;
    // End of variables declaration//GEN-END:variables
}
