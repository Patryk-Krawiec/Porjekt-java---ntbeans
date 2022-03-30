package projekt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GlownyFormKlient extends javax.swing.JFrame {
    OracleConnection connection = new OracleConnection();
    Statement statement;
    ResultSet resultset;
    String uu;
    public GlownyFormKlient() {
        
        initComponents();
       
            }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_Username = new javax.swing.JLabel();
        jLabel_Username1 = new javax.swing.JLabel();
        jButton_katalog = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton_wypozyczenia = new javax.swing.JButton();
        jButton_wypozyczeniaa = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jButton_dodaj = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jPanel2.setLayout(null);

        jLabel_Username.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Username.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Username.setText("<#####>");
        jPanel2.add(jLabel_Username);
        jLabel_Username.setBounds(150, 10, 110, 17);
        jLabel_Username.getAccessibleContext().setAccessibleDescription("");

        jLabel_Username1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel_Username1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Username1.setText("Zalogowany jako");
        jPanel2.add(jLabel_Username1);
        jLabel_Username1.setBounds(10, 10, 150, 22);

        jButton_katalog.setText("Katalog samochodów");
        jButton_katalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_katalogActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_katalog);
        jButton_katalog.setBounds(260, 100, 230, 90);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Menu");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(440, 20, 120, 70);

        jButton_wypozyczenia.setText("Twoje aktualne wypożyczenia");
        jButton_wypozyczenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_wypozyczeniaActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_wypozyczenia);
        jButton_wypozyczenia.setBounds(510, 210, 220, 90);

        jButton_wypozyczeniaa.setText("Twoje zarchiwizowane wypożyczenia");
        jButton_wypozyczeniaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_wypozyczeniaaActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_wypozyczeniaa);
        jButton_wypozyczeniaa.setBounds(510, 100, 220, 90);

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekt/img/Log-Out-icon.png"))); // NOI18N
        logout.setText("Wyloguj");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel2.add(logout);
        logout.setBounds(1050, 10, 99, 33);

        jButton_dodaj.setText("Dodaj zamówienie");
        jButton_dodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_dodajActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_dodaj);
        jButton_dodaj.setBounds(260, 210, 230, 90);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekt/img/Dodaj auto.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, -30, 1210, 460);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1179, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_katalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_katalogActionPerformed
       Katalog kat = new Katalog();
                    kat.setVisible(true);
                    kat.pack();
                    kat.setLocationRelativeTo(null);

                    
    }//GEN-LAST:event_jButton_katalogActionPerformed

    private void jButton_wypozyczeniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_wypozyczeniaActionPerformed
                        Wyp_kl wk = new Wyp_kl();
                        wk.setVisible(true);
                        wk.pack();
                        wk.setLocationRelativeTo(null);     
    }//GEN-LAST:event_jButton_wypozyczeniaActionPerformed

    private void jButton_wypozyczeniaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_wypozyczeniaaActionPerformed
                        Wyp_kl_arch wka = new Wyp_kl_arch();
                        wka.setVisible(true);
                        wka.pack();
                        wka.setLocationRelativeTo(null);    
    }//GEN-LAST:event_jButton_wypozyczeniaaActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        LogowanieForm lf = new LogowanieForm();
        lf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void jButton_dodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_dodajActionPerformed
         dodZam dz = new dodZam();
         dz.setVisible(true);
         dz.pack();
         dz.setLocationRelativeTo(null);
         
    }//GEN-LAST:event_jButton_dodajActionPerformed

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
            java.util.logging.Logger.getLogger(GlownyFormKlient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GlownyFormKlient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GlownyFormKlient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GlownyFormKlient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GlownyFormKlient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_dodaj;
    private javax.swing.JButton jButton_katalog;
    private javax.swing.JButton jButton_wypozyczenia;
    private javax.swing.JButton jButton_wypozyczeniaa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel_Username;
    private javax.swing.JLabel jLabel_Username1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logout;
    // End of variables declaration//GEN-END:variables
}
