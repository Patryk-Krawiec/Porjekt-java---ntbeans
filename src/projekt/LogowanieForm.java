package projekt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LogowanieForm extends javax.swing.JFrame {

    public LogowanieForm() {
        initComponents();

        lbl_U.setVisible(false); //lbl_U/P, to "values" przypisane do czerw. gwiazdek, ktore sa okreslone jako niewidoczne po uruchomieniu formatki
        lbl_P.setVisible(false);
        wpl.setVisible(false);
        
    }


    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_Username = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton_Login = new javax.swing.JButton();
        jButton_Cancel = new javax.swing.JButton();
        lbl_P = new javax.swing.JLabel();
        lbl_U = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox_typ = new javax.swing.JComboBox<>();
        wpl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("Formularz logowania");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(jLabel1);
        jLabel1.setBounds(940, 190, 205, 26);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("Login:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(870, 250, 46, 21);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setText("Hasło:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(870, 280, 49, 21);

        jTextField_Username.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jTextField_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_UsernameActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField_Username);
        jTextField_Username.setBounds(940, 250, 200, 23);

        jPasswordField1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jPanel2.add(jPasswordField1);
        jPasswordField1.setBounds(940, 280, 200, 23);

        jButton_Login.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Login.setText("Zaloguj");
        jButton_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LoginActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_Login);
        jButton_Login.setBounds(940, 350, 77, 23);

        jButton_Cancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Cancel.setText("Anuluj");
        jButton_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CancelActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_Cancel);
        jButton_Cancel.setBounds(1060, 350, 80, 23);

        lbl_P.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_P.setForeground(new java.awt.Color(255, 0, 51));
        lbl_P.setText("*");
        jPanel2.add(lbl_P);
        lbl_P.setBounds(920, 280, 11, 22);

        lbl_U.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_U.setForeground(new java.awt.Color(255, 0, 51));
        lbl_U.setText("*");
        jPanel2.add(lbl_U);
        lbl_U.setBounds(920, 250, 11, 22);

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setText("Typ:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(880, 310, 33, 21);

        jComboBox_typ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Klient", "Agent" }));
        jComboBox_typ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_typActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox_typ);
        jComboBox_typ.setBounds(940, 310, 110, 20);

        wpl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        wpl.setForeground(new java.awt.Color(255, 0, 51));
        wpl.setText("Niepoprawny login lub hasło");
        jPanel2.add(wpl);
        wpl.setBounds(950, 220, 220, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekt/img/logowanie.jpeg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(0, 0, 1630, 600);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1162, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_typActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_typActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_typActionPerformed

    private void jButton_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelActionPerformed
        System.exit(0); //zamyka po nacisnieciu "Anuluj" buttona
    }//GEN-LAST:event_jButton_CancelActionPerformed

    private void jButton_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LoginActionPerformed
        lbl_U.setVisible(false);
        lbl_P.setVisible(false);
        if (jTextField_Username.getText().equals("")) //petla sprawdzajaca warunek zawartosci wymaganych pol, jezeli puste to wyswietla "*"
        {
            lbl_U.setVisible(true);
        }
        if (String.valueOf(jPasswordField1.getPassword()).equals("")) 
        {
            lbl_P.setVisible(true);
        } 
           else {
            Connection con = OracleConnection.getConnection(); //obiekt polaczenia z baza
            PreparedStatement ps;   //obiekt reprezentujacy skomplikowana instrukcje SQL, instrukcja jest kompilowana i przechowywana w tym obiekcie
            String typ = jComboBox_typ.getSelectedItem().toString();
            
        if(typ == "Agent")
            {
            try {
                ps = con.prepareStatement("SELECT LOGIN, HASLO FROM AGENT WHERE LOGIN = ? AND HASLO = ?");  //przypisanie instrukcji z SQL'a do ps, instrukcja sprawdza czy login i haslo sa w bazie
                ps.setString(1, jTextField_Username.getText()); //pobiera stringiem nazwe uzytkownika
                ps.setString(2, String.valueOf(jPasswordField1.getPassword())); //pobiera stringiem haslo
                ResultSet rs = ps.executeQuery();   //Wykonuje zapytanie SQL w tym PreparedStatement obiekcie i zwraca ResultSet obiekt wygenerowany przez zapytanie


                
                    if (rs.next()) //petla, ktora jezeli haslo i login sa poprawne otwiera formatke z klasy GlownyForm
                    {
                        GlownyForm gf = new GlownyForm();
                        gf.setVisible(true);
                        gf.pack();
                        gf.setLocationRelativeTo(null);

                        gf.jLabel_Username.setText(jTextField_Username.getText()); //label wyswietlajacy nazwe zalogowanego uzytkownika
                        this.dispose(); //zamyka formatke z klasy "LogowanieForm"
                    } 
                    else {

                        System.out.println("Błędny login lub haslo");   //wyswietla jezeli bledny login lub haslo
                        wpl.setVisible(true);
                    }
               
            }     
                catch (SQLException ex) { //wyrzucenie wyjatku
                Logger.getLogger(LogowanieForm.class.getName()).log(Level.SEVERE, null, ex);
            }

            }
            else
            {
                       try {
                ps = con.prepareStatement("SELECT LOGIN, HASLO FROM KLIENT WHERE LOGIN = ? AND HASLO = ?");  //przypisanie instrukcji z SQL'a do ps, instrukcja sprawdza czy login i haslo sa w bazie
                ps.setString(1, jTextField_Username.getText()); //pobiera stringiem nazwe uzytkownika
                ps.setString(2, String.valueOf(jPasswordField1.getPassword())); //pobiera stringiem haslo

                ResultSet rs = ps.executeQuery();   //Wykonuje zapytanie SQL w tym PreparedStatement obiekcie i zwraca ResultSet obiekt wygenerowany przez zapytanie

                    if (rs.next()) //petla, ktora jezeli haslo i login sa poprawne otwiera formatke z klasy GlownyForm
                    {
                        GlownyFormKlient gfk = new GlownyFormKlient();
                        gfk.setVisible(true);
                        gfk.pack();
                        gfk.setLocationRelativeTo(null);

                        gfk.jLabel_Username.setText(jTextField_Username.getText()); //label wyswietlajacy nazwe zalogowanego uzytkownika
                        this.dispose(); //zamyka formatke z klasy "LogowanieForm"
                    } else {

                        System.out.println("Błędny login lub hasło");   //wyswietla jezeli bledny login lub haslo
                        wpl.setVisible(true);
                    }
                
            }     
                catch (SQLException ex) { //wyrzucenie wyjatku
                Logger.getLogger(LogowanieForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        }
    }//GEN-LAST:event_jButton_LoginActionPerformed

    private void jTextField_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_UsernameActionPerformed

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
            java.util.logging.Logger.getLogger(LogowanieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogowanieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogowanieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogowanieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogowanieForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Cancel;
    private javax.swing.JButton jButton_Login;
    private javax.swing.JComboBox<String> jComboBox_typ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField_Username;
    private javax.swing.JLabel lbl_P;
    private javax.swing.JLabel lbl_U;
    private javax.swing.JLabel wpl;
    // End of variables declaration//GEN-END:variables
}
