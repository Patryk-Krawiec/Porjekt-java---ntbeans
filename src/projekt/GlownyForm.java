package projekt;
import javax.swing.JFrame;

public class GlownyForm extends javax.swing.JFrame {

    public GlownyForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jLabel_Username = new javax.swing.JLabel();
        jLabel_Username1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jPanel3.setLayout(null);

        jButton7.setText("SPRAWDZ ZAMOWIENIA");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7);
        jButton7.setBounds(320, 220, 360, 70);

        jLabel_Username.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Username.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Username.setText("<#####>");
        jPanel3.add(jLabel_Username);
        jLabel_Username.setBounds(140, 0, 120, 22);
        jLabel_Username.getAccessibleContext().setAccessibleDescription("");

        jLabel_Username1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel_Username1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Username1.setText("Zalogowany jako");
        jPanel3.add(jLabel_Username1);
        jLabel_Username1.setBounds(0, 0, 140, 30);

        jButton1.setText("AGENCI");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(190, 50, 290, 70);

        jButton2.setText("SAMOCHODY");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(520, 50, 300, 70);

        jButton3.setText("MECHANICY");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(190, 130, 290, 70);

        jButton4.setText("NAPRAWA");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(520, 130, 300, 70);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(450, 10, 100, 40);

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekt/img/Log-Out-icon.png"))); // NOI18N
        logout.setText("Wyloguj");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel3.add(logout);
        logout.setBounds(960, 10, 99, 33);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekt/img/Dodaj auto.jpeg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(0, 0, 1070, 400);

        jButton5.setText("NAPRAWA");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(520, 130, 300, 70);

        jButton6.setText("NAPRAWA");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6);
        jButton6.setBounds(520, 130, 300, 70);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1074, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dodAgenta da = new dodAgenta();    //tworzy obiekt formatke
        da.setVisible(true);   //wyswietla
        da.pack(); //metoda pack okresla rozmiar formatki
        da.setLocationRelativeTo(null);   //ustawia polozenie okna (null = na srodku)
        da.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  //ustawia domyslna operacje, gdy uzytkownik zainicjuje zamkniecie 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dodSamochod ds = new dodSamochod();    //tworzy obiekt formatke
        ds.setVisible(true);   //wyswietla
        ds.pack(); //metoda pack okresla rozmiar formatki
        ds.setLocationRelativeTo(null);   //ustawia polozenie okna (null = na srodku)
        ds.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  //ustawia domyslna operacje, gdy uzytkownik zainicjuje zamkniecie 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        LogowanieForm lf = new LogowanieForm();
        lf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dodMechanika dm = new dodMechanika();    //tworzy obiekt formatke
        dm.setVisible(true);   //wyswietla
        dm.pack(); //metoda pack okresla rozmiar formatki
        dm.setLocationRelativeTo(null);   //ustawia polozenie okna (null = na srodku)
        dm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  //ustawia domyslna operacje, gdy uzytkownik zainicjuje zamkniecie 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dodNaprawa dn = new dodNaprawa();    //tworzy obiekt formatke
        dn.setVisible(true);   //wyswietla
        dn.pack(); //metoda pack okresla rozmiar formatki
        dn.setLocationRelativeTo(null);   //ustawia polozenie okna (null = na srodku)
        dn.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  //ustawia domyslna operacje, gdy uzytkownik zainicjuje zamkniecie 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dodZamowienia dz = new dodZamowienia();    //tworzy obiekt formatke
        dz.setVisible(true);   //wyswietla
        dz.pack(); //metoda pack okresla rozmiar formatki
        dz.setLocationRelativeTo(null);   //ustawia polozenie okna (null = na srodku)
        dz.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  //ustawia domyslna operacje, gdy uzytkownik zainicjuje zamkniecie 
    }//GEN-LAST:event_jButton7ActionPerformed


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
            java.util.logging.Logger.getLogger(GlownyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GlownyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GlownyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GlownyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GlownyForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel_Username;
    private javax.swing.JLabel jLabel_Username1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logout;
    // End of variables declaration//GEN-END:variables
}
