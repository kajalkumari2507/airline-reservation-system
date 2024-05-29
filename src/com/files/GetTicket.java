
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

public class GetTicket extends javax.swing.JInternalFrame {

        /**
         * Creates new form GetTicket
         */
        public GetTicket() {
                initComponents();
                this.getContentPane().setBackground(Color.blue);
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                ticketID = new javax.swing.JTextField();
                jButton1 = new javax.swing.JButton();
                jLabel2 = new javax.swing.JLabel();
                jPanel1 = new javax.swing.JPanel();
                jLabel3 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jLabel9 = new javax.swing.JLabel();
                jLabel10 = new javax.swing.JLabel();
                gender = new javax.swing.JLabel();
                firstName = new javax.swing.JLabel();
                LastName = new javax.swing.JLabel();
                arrival = new javax.swing.JLabel();
                departure = new javax.swing.JLabel();
                contact = new javax.swing.JLabel();
                flightname = new javax.swing.JLabel();

                setClosable(true);

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setText("Ticket ID");

                jButton1.setText("Get Ticket");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(255, 255, 255));
                jLabel2.setText("Thanks for Choosing Acciojob Airline");

                jPanel1.setBackground(new java.awt.Color(51, 51, 255));

                jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(255, 255, 255));
                jLabel3.setText("First Name");

                jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                jLabel5.setForeground(new java.awt.Color(255, 255, 255));
                jLabel5.setText("Last Name");

                jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(255, 255, 255));
                jLabel4.setText("Gender");

                jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                jLabel6.setForeground(new java.awt.Color(255, 255, 255));
                jLabel6.setText("Arrival");

                jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                jLabel8.setForeground(new java.awt.Color(255, 255, 255));
                jLabel8.setText("Departure");

                jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                jLabel7.setForeground(new java.awt.Color(255, 255, 255));
                jLabel7.setText("Contact No");

                jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                jLabel10.setForeground(new java.awt.Color(255, 255, 255));
                jLabel10.setText("Flight Name");

                gender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                gender.setForeground(new java.awt.Color(255, 255, 255));
                gender.setText("jLabel11");

                firstName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                firstName.setForeground(new java.awt.Color(255, 255, 255));
                firstName.setText("jLabel11");

                LastName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                LastName.setForeground(new java.awt.Color(255, 255, 255));
                LastName.setText("jLabel11");

                arrival.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                arrival.setForeground(new java.awt.Color(255, 255, 255));
                arrival.setText("jLabel11");

                departure.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                departure.setForeground(new java.awt.Color(255, 255, 255));
                departure.setText("jLabel11");

                contact.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                contact.setForeground(new java.awt.Color(255, 255, 255));
                contact.setText("jLabel11");

                flightname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                flightname.setForeground(new java.awt.Color(255, 255, 255));
                flightname.setText("jLabel11");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel4)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(jLabel9))
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(58, 58, 58)
                                                                                                                                .addComponent(LastName))
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(gender)))
                                                                                                .addGap(54, 54, 54)
                                                                                                .addComponent(jLabel10))
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(jLabel5))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                247, Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel6)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(arrival)
                                                                                                .addGap(17, 17, 17))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(jLabel7)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(contact))
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(jLabel8)
                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                .addComponent(departure)))
                                                                                                .addGap(20, 20, 20))))
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(126, 126, 126)
                                                                                .addComponent(firstName)
                                                                                .addContainerGap(562, Short.MAX_VALUE)))
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                .addContainerGap(381,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(flightname)
                                                                                                .addGap(307, 307,
                                                                                                                307))));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(jLabel6)
                                                                                .addComponent(arrival))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jLabel5)
                                                                                                                .addComponent(jLabel8)
                                                                                                                .addComponent(departure))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel4,
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                                                                .addComponent(jLabel7)
                                                                                                                                                                .addComponent(jLabel9)
                                                                                                                                                                .addComponent(jLabel10)
                                                                                                                                                                .addComponent(contact))
                                                                                                                                                .addContainerGap())))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(LastName)
                                                                                                .addGap(23, 23, 23)
                                                                                                .addComponent(gender)
                                                                                                .addContainerGap(15,
                                                                                                                Short.MAX_VALUE))))
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(20, 20, 20)
                                                                                .addComponent(firstName)
                                                                                .addContainerGap(71, Short.MAX_VALUE)))
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                .addContainerGap(101,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(flightname)
                                                                                                .addContainerGap())));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(279, 279, 279)
                                                                .addComponent(jLabel2)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(32, 32, 32)
                                                                                                .addComponent(jPanel1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(249, 249, 249)
                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(jButton1,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                128,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addComponent(jLabel1)
                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                .addComponent(ticketID,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                119,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                                .addGap(0, 41, Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel1)
                                                                                .addComponent(ticketID,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jButton1)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel2)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
                try {
                        // TODO add your handling code here:

                        String TicketID = ticketID.getText();

                        Connection con;
                        PreparedStatement pre;
                        Class.forName("com.mysql.jdbc.Driver");
                        con = DriverManager.getConnection("jdbc:mysql://localhost/airline", "root", "root");

                        pre = con.prepareStatement("select * from ticket where TicketID=?");
                        pre.setString(1, TicketID);

                        ResultSet rs = pre.executeQuery();

                        if (rs.next() != false) {
                                firstName.setText(rs.getString("FirstName"));
                                LastName.setText(rs.getString("LastName"));
                                gender.setText(rs.getString("Gender"));
                                arrival.setText(rs.getString("Arrival"));
                                departure.setText(rs.getString("Departure"));
                                contact.setText(rs.getString("Contact"));

                                String s = rs.getString("FlightID");
                                PreparedStatement vc = con
                                                .prepareStatement("select FlightName from Flight where FlightID=?");
                                vc.setString(1, s);

                                ResultSet vs = vc.executeQuery();
                                vs.next();

                                flightname.setText(vs.getString("FlightName"));

                        } else {
                                JOptionPane.showMessageDialog(null, "Your Ticket ID is invalid");
                        }

                } catch (ClassNotFoundException ex) {
                        Logger.getLogger(GetTicket.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                        Logger.getLogger(GetTicket.class.getName()).log(Level.SEVERE, null, ex);
                }
        }// GEN-LAST:event_jButton1ActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel LastName;
        private javax.swing.JLabel arrival;
        private javax.swing.JLabel contact;
        private javax.swing.JLabel departure;
        private javax.swing.JLabel firstName;
        private javax.swing.JLabel flightname;
        private javax.swing.JLabel gender;
        private javax.swing.JButton jButton1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JTextField ticketID;
        // End of variables declaration//GEN-END:variables
}
