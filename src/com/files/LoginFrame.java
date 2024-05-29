package com.files;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LoginFrame extends javax.swing.JFrame {

        /**
         * Creates new form LoginFrame
         */
        public LoginFrame() {
                initComponents();
                this.getContentPane().setBackground(Color.blue);
        }

        @SuppressWarnings("")
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                password = new javax.swing.JPasswordField();
                username = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setBackground(new java.awt.Color(0, 51, 204));

                jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 3, 18));
                jLabel1.setText("USERNAME");

                jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 3, 18));
                jLabel2.setText("PASSWORD");

                jPanel1.setBackground(new java.awt.Color(51, 51, 255));

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 0, Short.MAX_VALUE));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 0, Short.MAX_VALUE));

                jButton1.setText("Login");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                jButton2.setText("Cancel");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(43, 43, 43)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jLabel3,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                327,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(jButton1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                89,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(62, 62, 62)
                                                                                                .addComponent(jButton2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                99,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(122, Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(27, 27, 27)
                                                                .addComponent(jLabel3)
                                                                .addGap(46, 46, 46)
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jButton1)
                                                                                .addComponent(jButton2))
                                                                .addContainerGap(44, Short.MAX_VALUE)));

                pack();
        }

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
                try {
                        // Retrieve the username and password
                        String UserName = username.getText();
                        String Password = new String(password.getPassword());

                        // Establish database connection
                        Connection con;
                        PreparedStatement pre;
                        Class.forName("com.mysql.jdbc.Driver");
                        con = DriverManager.getConnection("jdbc:mysql://localhost/airline", "root", "root");

                        // Query the database for the admin credentials
                        pre = con.prepareStatement("select * from admin where UserName=? and Password=?");
                        pre.setString(1, UserName);
                        pre.setString(2, Password);
                        ResultSet rs = pre.executeQuery();

                        // If the query returns a result, login successful
                        if (rs.next() != false) {
                                Main main = new Main();
                                main.setVisible(true);
                                this.setVisible(false);
                        } else {
                                JOptionPane.showMessageDialog(null, "Admin credentials are wrong");
                        }
                } catch (ClassNotFoundException ex) {
                        Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                        Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
        }

        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(LoginFrame.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(LoginFrame.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(LoginFrame.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(LoginFrame.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                }
                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new LoginFrame().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPasswordField password;
        private javax.swing.JTextField username;
        // End of variables declaration
}
