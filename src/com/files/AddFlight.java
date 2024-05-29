package com.files;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import com.toedter.calendar.JDateChooser;

public class AddFlight extends javax.swing.JInternalFrame {
        private JDateChooser date;

        public AddFlight() {
                date = new JDateChooser();
                initComponents();
                this.getContentPane().setBackground(Color.blue);
                AutoID();
        }

        public void AutoID() {
                try {
                        Connection con;
                        PreparedStatement pre;
                        Class.forName("com.mysql.jdbc.Driver");
                        con = DriverManager.getConnection("jdbc:mysql://localhost/airline", "root", "root");
                        pre = con.prepareStatement("Select MAX(FlightID) from flight");
                        ResultSet rs = pre.executeQuery();
                        rs.next();
                        if (rs.getString("MAX(FlightID)") == null) {
                                flightid.setText("FL001");
                        } else {
                                long id = Long
                                                .parseLong(rs.getString("MAX(FlightID)").substring(2,
                                                                rs.getString("MAX(FlightID)").length()));
                                id++;
                                flightid.setText("FL" + String.format("%03d", id));
                        }
                } catch (ClassNotFoundException ex) {
                        Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                        Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
                }
        }

        @SuppressWarnings("unchecked")
        private void initComponents() {
                jLabel1 = new javax.swing.JLabel();
                jPanel1 = new javax.swing.JPanel();
                jLabel2 = new javax.swing.JLabel();
                flightid = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                flightName = new javax.swing.JTextField();
                arrival = new javax.swing.JTextField();
                duration = new javax.swing.JTextField();
                departure = new javax.swing.JTextField();
                jPanel2 = new javax.swing.JPanel();
                jLabel8 = new javax.swing.JLabel();
                jLabel9 = new javax.swing.JLabel();
                jLabel10 = new javax.swing.JLabel();
                fare = new javax.swing.JTextField();
                seats = new javax.swing.JTextField();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();

                setClosable(true);

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setText("Welcome to the Flight Panel");

                jPanel1.setBackground(new java.awt.Color(51, 51, 255));

                jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(255, 255, 255));
                jLabel2.setText("Flight ID");

                jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(255, 255, 255));
                jLabel3.setText("Flight Name");

                jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(255, 255, 255));
                jLabel4.setText("Arrival");

                jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel5.setForeground(new java.awt.Color(255, 255, 255));
                jLabel5.setText("Departure");

                jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel6.setForeground(new java.awt.Color(255, 255, 255));
                jLabel6.setText("Duration");

                flightName.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                flightNameActionPerformed(evt);
                        }
                });

                arrival.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                arrivalActionPerformed(evt);
                        }
                });

                duration.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                durationActionPerformed(evt);
                        }
                });

                departure.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                departureActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(23, 23, 23)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(jLabel4)
                                                                                .addComponent(jLabel5)
                                                                                .addComponent(jLabel6))
                                                                .addGap(45, 45, 45)
                                                                .addGroup(jPanel1Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addComponent(duration,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                91,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(departure)
                                                                                .addComponent(arrival)
                                                                                .addComponent(flightName)
                                                                                .addComponent(flightid))
                                                                .addContainerGap(78, Short.MAX_VALUE)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(25, 25, 25)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(flightid,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(26, 26, 26)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(flightName,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(25, 25, 25)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel4)
                                                                                .addComponent(arrival,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(24, 24, 24)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel5)
                                                                                .addComponent(departure,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(34, 34, 34)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel6)
                                                                                .addComponent(duration,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(49, Short.MAX_VALUE)));

                jPanel2.setBackground(new java.awt.Color(0, 51, 255));

                jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel8.setForeground(new java.awt.Color(255, 255, 255));
                jLabel8.setText("Seats");

                jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel9.setForeground(new java.awt.Color(255, 255, 255));
                jLabel9.setText("Fare");

                jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel10.setForeground(new java.awt.Color(255, 255, 255));
                jLabel10.setText("Date of Flight");

                fare.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                fareActionPerformed(evt);
                        }
                });

                seats.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                seatsActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(22, 22, 22)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel10)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(date,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                141,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel8)
                                                                                                .addGap(38, 38, 38)
                                                                                                .addComponent(seats,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                141,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel9)
                                                                                                .addGap(43, 43, 43)
                                                                                                .addComponent(fare,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                141,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(56, Short.MAX_VALUE)));
                jPanel2Layout.setVerticalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(26, 26, 26)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel8)
                                                                                .addComponent(seats,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(40, 40, 40)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel9)
                                                                                .addComponent(fare,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(50, 50, 50)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jLabel10)
                                                                                .addComponent(date,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(82, Short.MAX_VALUE)));

                jButton1.setText("Add");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                jButton2.setText("Cancel");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(23, 23, 23)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                .addComponent(jPanel1,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jPanel2,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE))
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(jLabel1))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(45, 45, 45)
                                                                                                .addComponent(jButton1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                101,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(58, 58, 58)
                                                                                                .addComponent(jButton2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                101,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(67, Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(17, 17, 17)
                                                                .addComponent(jLabel1)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jPanel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                34,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jButton1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                46,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jButton2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                46,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(29, 29, 29)));

                pack();
        }

        private void flightNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_flightNameActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_flightNameActionPerformed

        private void arrivalActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_arrivalActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_arrivalActionPerformed

        private void durationActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_durationActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_durationActionPerformed

        private void departureActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_departureActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_departureActionPerformed

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
                try {
                        // TODO add your handling code here:
                        String FlightID = flightid.getText();
                        String FlightName = flightName.getText();
                        String Arrival = arrival.getText();
                        String Departure = departure.getText();
                        String Duration = duration.getText();
                        String Seat = seats.getText();
                        String Fare = fare.getText();
                        DateFormat da = new SimpleDateFormat("yyy-MM-dd");
                        String Date = da.format(date.getDate());

                        Connection con;
                        PreparedStatement pre;
                        Class.forName("com.mysql.jdbc.Driver");
                        con = DriverManager.getConnection("jdbc:mysql://localhost/airline", "root", "root");

                        pre = con.prepareStatement(
                                        "insert into flight(FlightID,FlightName,Arrival,Departure,Duration,Seats,Fare,Date)values(?,?,?,?,?,?,?,?)");
                        pre.setString(1, FlightID);
                        pre.setString(2, FlightName);
                        pre.setString(3, Arrival);
                        pre.setString(4, Departure);
                        pre.setString(5, Duration);
                        pre.setString(6, Seat);
                        pre.setString(7, Fare);
                        pre.setString(8, Date);

                        pre.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Flight Added Successfully");

                } catch (ClassNotFoundException ex) {
                        Logger.getLogger(AddFlight.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                        Logger.getLogger(AddFlight.class.getName()).log(Level.SEVERE, null, ex);
                }
        }// GEN-LAST:event_jButton1ActionPerformed

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_jButton2ActionPerformed

        private void fareActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_fareActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_fareActionPerformed

        private void seatsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_seatsActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_seatsActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JTextField arrival;
        // private com.toedter.calendar.JDateChooser date;
        private javax.swing.JTextField departure;
        private javax.swing.JTextField duration;
        private javax.swing.JTextField fare;
        private javax.swing.JTextField flightName;
        private javax.swing.JTextField flightid;
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JTextField seats;
        // End of variables declaration//GEN-END:variables
}
