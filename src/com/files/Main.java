package com.files;

import javax.swing.*;

public class Main extends JFrame {

    private JDesktopPane Desktop;
    private JMenuBar jMenuBar1;
    private JMenu jMenu1, jMenu2, jMenu3, jMenu4;
    private JMenuItem jMenuItem1, jMenuItem2, jMenuItem3, jMenuItem4, jMenuItem5, jMenuItem6;

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        Desktop = new JDesktopPane();
        jMenuBar1 = new JMenuBar();
        jMenu1 = new JMenu("Customer");
        jMenuItem1 = new JMenuItem("Add Customer");
        jMenuItem2 = new JMenuItem("Search Customer");
        jMenu2 = new JMenu("Flight");
        jMenuItem3 = new JMenuItem("Add Flight");
        jMenuItem4 = new JMenuItem("Book Flight");
        jMenu3 = new JMenu("Ticket");
        jMenuItem5 = new JMenuItem("View Ticket");
        jMenu4 = new JMenu("root");
        jMenuItem6 = new JMenuItem("Add Admin");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Set up the desktop layout
        GroupLayout DesktopLayout = new GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
                DesktopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 919, Short.MAX_VALUE));
        DesktopLayout.setVerticalGroup(
                DesktopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 884, Short.MAX_VALUE));

        // Add menu items to menus
        jMenuItem1.addActionListener(this::jMenuItem1ActionPerformed);
        jMenu1.add(jMenuItem1);

        jMenuItem2.addActionListener(this::jMenuItem2ActionPerformed);
        jMenu1.add(jMenuItem2);

        jMenuItem3.addActionListener(this::jMenuItem3ActionPerformed);
        jMenu2.add(jMenuItem3);

        jMenuItem4.addActionListener(this::jMenuItem4ActionPerformed);
        jMenu2.add(jMenuItem4);

        jMenuItem5.addActionListener(this::jMenuItem5ActionPerformed);
        jMenu3.add(jMenuItem5);

        jMenuItem6.addActionListener(this::jMenuItem6ActionPerformed);
        jMenu4.add(jMenuItem6);

        // Add menus to menu bar
        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);
        jMenuBar1.add(jMenu3);
        jMenuBar1.add(jMenu4);

        // Set the menu bar
        setJMenuBar(jMenuBar1);

        // Set the layout of the content pane
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(Desktop));
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(Desktop));

        pack();
    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
        AddCustomer customer = new AddCustomer();
        Desktop.add(customer);
        customer.setVisible(true);
    }

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
        SearchCustomer search = new SearchCustomer();
        Desktop.add(search);
        search.setVisible(true);
    }

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
        AddFlight flight = new AddFlight();
        Desktop.add(flight);
        flight.setVisible(true);
    }

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {
        BookTicket newTicket = new BookTicket();
        Desktop.add(newTicket);
        newTicket.setVisible(true);
    }

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {
        GetTicket ticket = new GetTicket();
        Desktop.add(ticket);
        ticket.setVisible(true);
    }

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {
        AddAdmin admin = new AddAdmin();
        Desktop.add(admin);
        admin.setVisible(true);
    }

    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new Main().setVisible(true));
    }

    // public static void main(String[] args) {
    // try {
    // UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    // } catch (Exception e) {
    // e.printStackTrace();
    // }

    // SwingUtilities.invokeLater(new Runnable() {
    // public void run() {
    // LoginFrame login = new LoginFrame();
    // login.setVisible(true);
    // }
    // });
    // }
}
