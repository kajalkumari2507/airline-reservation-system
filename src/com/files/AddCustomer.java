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

public class AddCustomer extends javax.swing.JInternalFrame {
        private JDateChooser date;

        /**
         * Creates new form AddCustomer
         */
        public AddCustomer() {
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
                        pre = con.prepareStatement("Select MAX(CustomerID) from customer");
                        ResultSet rs = pre.executeQuery();
                        rs.next();
                        if (rs.getString("MAX(CustomerID)") == null) {
                                custID.setText("CS001");
                        } else {
                                long id = Long.parseLong(rs.getString("MAX(CustomerID)").substring(2,
                                                rs.getString("MAX(CustomerID)").length()));
                                id++;
                                custID.setText("CS" + String.format("%03d", id));
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
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                firstname = new javax.swing.JTextField();
                lastname = new javax.swing.JTextField();
                nationalid = new javax.swing.JTextField();
                passport = new javax.swing.JTextField();
                jScrollPane1 = new javax.swing.JScrollPane();
                address = new javax.swing.JTextArea();
                custID = new javax.swing.JTextField();
                jPanel2 = new javax.swing.JPanel();
                jLabel8 = new javax.swing.JLabel();
                jLabel9 = new javax.swing.JLabel();
                male = new javax.swing.JRadioButton();
                female = new javax.swing.JRadioButton();
                jLabel10 = new javax.swing.JLabel();
                contact = new javax.swing.JTextField();
                // date = new com.toedter.calendar.JDateChooser();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();

                setClosable(true);

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setText("Welcome to the Customer Panel");

                jPanel1.setBackground(new java.awt.Color(51, 51, 255));

                jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(255, 255, 255));
                jLabel2.setText("Customer ID");

                jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(255, 255, 255));
                jLabel3.setText("First Name");

                jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(255, 255, 255));
                jLabel4.setText("Last Name");

                jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel5.setForeground(new java.awt.Color(255, 255, 255));
                jLabel5.setText("Passport No.");

                jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel6.setForeground(new java.awt.Color(255, 255, 255));
                jLabel6.setText("National ID");

                jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel7.setForeground(new java.awt.Color(255, 255, 255));
                jLabel7.setText("Address");

                firstname.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                firstnameActionPerformed(evt);
                        }
                });

                lastname.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                lastnameActionPerformed(evt);
                        }
                });

                nationalid.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                nationalidActionPerformed(evt);
                        }
                });

                passport.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                passportActionPerformed(evt);
                        }
                });

                address.setColumns(20);
                address.setRows(5);
                jScrollPane1.setViewportView(address);

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
                                                                                .addComponent(jLabel6)
                                                                                .addComponent(jLabel7))
                                                                .addGap(45, 45, 45)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                false)
                                                                                                .addComponent(nationalid,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                91,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(passport)
                                                                                                .addComponent(lastname)
                                                                                                .addComponent(firstname)
                                                                                                .addComponent(custID,
                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING))
                                                                                .addComponent(jScrollPane1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                153,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(16, Short.MAX_VALUE)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(25, 25, 25)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(custID,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(26, 26, 26)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(firstname,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(25, 25, 25)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel4)
                                                                                .addComponent(lastname,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(24, 24, 24)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel5)
                                                                                .addComponent(passport,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(34, 34, 34)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel6)
                                                                                .addComponent(nationalid,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel7)
                                                                                .addComponent(jScrollPane1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                76,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                jPanel2.setBackground(new java.awt.Color(0, 51, 255));

                jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel8.setForeground(new java.awt.Color(255, 255, 255));
                jLabel8.setText("Contact");

                jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel9.setForeground(new java.awt.Color(255, 255, 255));
                jLabel9.setText("Gender");

                male.setForeground(new java.awt.Color(255, 255, 255));
                male.setText("Male");
                male.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                maleActionPerformed(evt);
                        }
                });

                female.setForeground(new java.awt.Color(255, 255, 255));
                female.setText("Female");
                female.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                femaleActionPerformed(evt);
                        }
                });

                jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel10.setForeground(new java.awt.Color(255, 255, 255));
                jLabel10.setText("Date of Birth");

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
                                                                                                .addGroup(jPanel2Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel9)
                                                                                                                .addComponent(jLabel10))
                                                                                                .addGap(31, 31, 31)
                                                                                                .addGroup(jPanel2Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                .addGroup(jPanel2Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGroup(jPanel2Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                .addComponent(female)
                                                                                                                                                .addComponent(male,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                60,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                .addGap(17, 17, 17))
                                                                                                                .addGroup(jPanel2Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(date,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                0,
                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                .addContainerGap())))
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel8)
                                                                                                .addGap(33, 33, 33)
                                                                                                .addComponent(contact)
                                                                                                .addContainerGap()))));
                jPanel2Layout.setVerticalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(20, 20, 20)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel8)
                                                                                .addComponent(contact,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel9)
                                                                                .addComponent(male))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(female)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jLabel10)
                                                                                .addComponent(date,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(81, Short.MAX_VALUE)));

                jButton1.setText("Add");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                jButton2.setText("Delete");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(60, 60, 60)
                                                                                                .addComponent(jPanel1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(0, 106, Short.MAX_VALUE))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addContainerGap(
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jLabel1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                318,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(jPanel2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(jButton1)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jButton2)))
                                                                .addGap(21, 21, 21)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jPanel1,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(jPanel2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(141, 141, 141)
                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jButton1)
                                                                                                                .addComponent(jButton2))
                                                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                                .addContainerGap()));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_firstnameActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_firstnameActionPerformed

        private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_lastnameActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_lastnameActionPerformed

        private void nationalidActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nationalidActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_nationalidActionPerformed

        private void passportActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_passportActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_passportActionPerformed

        private void maleActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_maleActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_maleActionPerformed

        private void femaleActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_femaleActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_femaleActionPerformed

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
                try {
                        // TODO add your handling code here:
                        String Customerid = contact.getText();
                        String FirstName = firstname.getText();
                        String LastName = lastname.getText();
                        String Passport = passport.getText();
                        String NationalID = nationalid.getText();
                        String Address = address.getText();
                        String Contact = contact.getText();
                        String Gender = "";
                        if (male.isSelected()) {
                                Gender = "male";
                        } else {
                                Gender = "female";
                        }
                        DateFormat da = new SimpleDateFormat("yyyy-MM-dd");
                        String Date = da.format(date.getDate());

                        Connection con;
                        PreparedStatement pre;
                        Class.forName("com.mysql.jdbc.Driver");
                        con = DriverManager.getConnection("jdbc:mysql://localhost/airline", "root", "root");

                        pre = con.prepareStatement(
                                        "insert into customer(CustomerID,FirstName,LastName,Passport,NationalID,Address,Contact,Gender,DOB)values(?,?,?,?,?,?,?,?,?)");
                        pre.setString(1, Customerid);
                        pre.setString(2, FirstName);
                        pre.setString(3, LastName);
                        pre.setString(4, Passport);
                        pre.setString(5, NationalID);
                        pre.setString(6, Address);
                        pre.setString(7, Contact);
                        pre.setString(8, Gender);
                        pre.setString(9, Date);

                        pre.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Customer Added Successfully");

                } catch (ClassNotFoundException ex) {
                        Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                        Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
                }
        }// GEN-LAST:event_jButton1ActionPerformed

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_jButton2ActionPerformed

        private javax.swing.JTextArea address;
        private javax.swing.JTextField contact;
        private javax.swing.JTextField custID;
        private javax.swing.JRadioButton female;
        private javax.swing.JTextField firstname;
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
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
        private javax.swing.JPanel jPanel2;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTextField lastname;
        private javax.swing.JRadioButton male;
        private javax.swing.JTextField nationalid;
        private javax.swing.JTextField passport;
}
