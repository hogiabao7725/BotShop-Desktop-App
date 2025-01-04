package View_User;

import java.awt.Color;
import java.awt.Font;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import ConnectDatabase.MyConnect;
import DAOs.CurrentLoginsDAO;
import DAOs.StatisticDAO;
import OtherFunction.PasswordHashingService;
import View_Admin.AdminDashboard;
import View_Shipper.ShipperDashboard;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.SQLException;

public class Login extends javax.swing.JFrame {

    StatisticDAO statisticDAO = new StatisticDAO();
    CurrentLoginsDAO currentLoginsDAO = new CurrentLoginsDAO();

    ButtonGroup bg = new ButtonGroup(); //Used to group 3 buttons User - Shipper - Admin

    JLabel announcement = new JLabel(); // Used to display the content of the NOTIFICATION

    public Login() {
        initComponents();
        init();
    }

    private void icons() {
        jLabel_Icon_Hide.setVisible(true);
        jLabel_Icon_Visible.setVisible(false);
    }

    public void init() {
        announcement.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
        icons();
        bg.add(Button_User);
        bg.add(Button_Shipper);
        bg.add(Button_Admin);
        Button_User.setSelected(true);
        jPasswordField1.setEchoChar('\u2022');
    }

    private void showAnnouncement(String text, String title, int messageType) {
        announcement.setText(text);
        JOptionPane.showMessageDialog(this, announcement, title, messageType);
    }

    // check the "Email" and "Password" 
    private boolean isEmpty() {
        if (jTextField_Email.getText().isEmpty()) {
            showAnnouncement("Email address is empty !", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (!jTextField_Email.getText().matches("^[a-zA-Z0-9._%+-]+@gmail\\.com$")) {
            showAnnouncement("Invalid Email Address", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (String.valueOf(jPasswordField1.getPassword()).isEmpty()) {
            showAnnouncement("Password is empty !", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel_Title = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel_Login = new javax.swing.JLabel();
        jTextField_Email = new javax.swing.JTextField();
        jLabel_Email = new javax.swing.JLabel();
        jLabel_Password = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        Button_User = new javax.swing.JRadioButton();
        Button_Shipper = new javax.swing.JRadioButton();
        Button_Admin = new javax.swing.JRadioButton();
        jButton_Login = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel_Forgot_Ps = new javax.swing.JLabel();
        jLabel_SignUp = new javax.swing.JLabel();
        jLabel_Icon_Visible = new javax.swing.JLabel();
        jLabel_Icon_Hide = new javax.swing.JLabel();
        jLabel_Exit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(35, 166, 97));

        jLabel_Title.setFont(new java.awt.Font("Monotype Corsiva", 0, 60)); // NOI18N
        jLabel_Title.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Title.setText("BotShop");
        jLabel_Title.setToolTipText("");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/shopping-cart.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel10)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel_Title)
                .addGap(60, 60, 60)
                .addComponent(jLabel10)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Login.setFont(new java.awt.Font("Monotype Corsiva", 0, 65)); // NOI18N
        jLabel_Login.setForeground(new java.awt.Color(35, 166, 97));
        jLabel_Login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Login.setText("Login");
        jPanel1.add(jLabel_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 28, 360, -1));

        jTextField_Email.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Email.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTextField_Email.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_Email.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(35, 166, 97), 2, true));
        jTextField_Email.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_EmailActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 135, 339, 50));

        jLabel_Email.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Email.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel_Email.setForeground(new java.awt.Color(35, 166, 97));
        jLabel_Email.setText("Email");
        jPanel1.add(jLabel_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 108, -1, 21));

        jLabel_Password.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Password.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel_Password.setForeground(new java.awt.Color(35, 166, 97));
        jLabel_Password.setText("Password");
        jPanel1.add(jLabel_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 197, -1, 21));

        jPasswordField1.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(0, 0, 0));
        jPasswordField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(35, 166, 97), 2, true));
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 224, 339, 50));

        Button_User.setBackground(new java.awt.Color(255, 255, 255));
        Button_User.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        Button_User.setForeground(new java.awt.Color(35, 166, 97));
        Button_User.setText("User");
        Button_User.setToolTipText("");
        Button_User.setContentAreaFilled(false);
        Button_User.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(Button_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 286, 64, -1));

        Button_Shipper.setBackground(new java.awt.Color(255, 255, 255));
        Button_Shipper.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        Button_Shipper.setForeground(new java.awt.Color(35, 166, 97));
        Button_Shipper.setText("Shipper");
        Button_Shipper.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(Button_Shipper, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 286, 103, -1));

        Button_Admin.setBackground(new java.awt.Color(255, 255, 255));
        Button_Admin.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        Button_Admin.setForeground(new java.awt.Color(35, 166, 97));
        Button_Admin.setText("Admin");
        Button_Admin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(Button_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 286, -1, -1));

        jButton_Login.setBackground(new java.awt.Color(35, 166, 97));
        jButton_Login.setFont(new java.awt.Font("Segoe UI Symbol", 1, 30)); // NOI18N
        jButton_Login.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Login.setText("Login");
        jButton_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LoginActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 334, 403, 56));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(35, 166, 97));
        jLabel6.setText("Don't have an account ?");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 408, -1, -1));

        jLabel_Forgot_Ps.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Forgot_Ps.setForeground(new java.awt.Color(35, 166, 97));
        jLabel_Forgot_Ps.setText("Forgot Password");
        jLabel_Forgot_Ps.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Forgot_Ps.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Forgot_PsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_Forgot_PsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_Forgot_PsMouseExited(evt);
            }
        });
        jPanel1.add(jLabel_Forgot_Ps, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 439, -1, -1));

        jLabel_SignUp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_SignUp.setForeground(new java.awt.Color(35, 166, 97));
        jLabel_SignUp.setText("Sign Up");
        jLabel_SignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_SignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_SignUpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_SignUpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_SignUpMouseExited(evt);
            }
        });
        jPanel1.add(jLabel_SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 408, -1, -1));

        jLabel_Icon_Visible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/visible.png"))); // NOI18N
        jLabel_Icon_Visible.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Icon_Visible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Icon_VisibleMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel_Icon_Visible, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 224, -1, -1));

        jLabel_Icon_Hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/hide.png"))); // NOI18N
        jLabel_Icon_Hide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Icon_Hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Icon_HideMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel_Icon_Hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 224, -1, -1));

        jLabel_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/out.png"))); // NOI18N
        jLabel_Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ExitMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 40, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 470, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_EmailActionPerformed

    // Login
    private void jButton_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LoginActionPerformed

        if (isEmpty()) {
            String email = jTextField_Email.getText();
            String password = String.valueOf(jPasswordField1.getPassword());
            try {
                Connection conn = MyConnect.getConnection();
                PreparedStatement ps;
                ResultSet rs;
                if (Button_User.isSelected()) {                                      // "User" right
                    ps = conn.prepareStatement("SELECT UPassword, UID, UEmail FROM [User] WHERE UEmail = ?");
                    ps.setString(1, email);
                    rs = ps.executeQuery();
                    if (rs.next()) {
                        String storedPassword = rs.getString("UPassword");
                        try {
                            if (PasswordHashingService.validatePassword(password, storedPassword)) { // kiem tra co phai la mat khau dung
                                if (!currentLoginsDAO.isExist("User", email)) {
                                    if (currentLoginsDAO.insert("User", email)) {
                                        System.out.println("The user with Role = \"User\" and Email = \"" + email + "\" has logged in.");
                                    } else {
                                        System.out.println("Login Error");
                                    }

                                    UserDashboard userDashboard = new UserDashboard("User", email);
                                    userDashboard.setVisible(true);
                                    userDashboard.pack();
                                    UserDashboard.userEmail.setText(email);
                                    statisticDAO.user(rs.getString(3));
                                    this.dispose();
                                } else {
                                    showAnnouncement("Your account has been logged in from another location !", "Warning", JOptionPane.WARNING_MESSAGE);
                                }
                            } else {
                                showAnnouncement("Incorrect Email or Password !", "Warning", JOptionPane.WARNING_MESSAGE);
                            }
                        } catch (NoSuchAlgorithmException ex) {
                            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (InvalidKeySpecException ex) {
                            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        showAnnouncement("Incorrect Email or Password !", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                } else if (Button_Shipper.isSelected()) {                          // "Shipper" right
                    ps = conn.prepareStatement("SELECT SPassword, SID FROM Shipper WHERE SEmail = ?");
                    ps.setString(1, email);
                    rs = ps.executeQuery();
                    if (rs.next()) {
                        String storedPassword = rs.getString("SPassword");
                        if (PasswordHashingService.validatePassword(password, storedPassword)) {
                            if (!currentLoginsDAO.isExist("Shipper", email)) {
                                if (currentLoginsDAO.insert("Shipper", email)) {
                                    System.out.println("The user with Role = \"Shipper\" and Email = \"" + email + "\" has logged in.");
                                } else {
                                    System.out.println("Login Error");
                                }

                                ShipperDashboard shipperDashboard = new ShipperDashboard("Shipper", email);
                                shipperDashboard.setVisible(true);
                                shipperDashboard.pack();
                                ShipperDashboard.shipperEmail.setText(email);
                                statisticDAO.shipper(email);
                                this.dispose();
                            } else {
                                showAnnouncement("Your account has been logged in from another location !", "Warning", JOptionPane.WARNING_MESSAGE);
                            }
                        } else {
                            showAnnouncement("Incorrect Email or Password !", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        showAnnouncement("Incorrect Email or Password !", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                } else if (Button_Admin.isSelected()) {                             // "Admin" right
                    ps = conn.prepareStatement("SELECT Password, ID FROM Admin WHERE Email = ?");
                    ps.setString(1, email);
                    rs = ps.executeQuery();
                    if (rs.next()) {
                        String storedPassword = rs.getString("Password");
                        if (PasswordHashingService.validatePassword(password, storedPassword)) {
                            if (!currentLoginsDAO.isExist("Admin", email)) {
                                if (currentLoginsDAO.insert("Admin", email)) {
                                    System.out.println("The user with Role = \"Admin\" and Email = \"" + email + "\" has logged in.");
                                } else {
                                    System.out.println("Login Error");
                                }

                                AdminDashboard adminDashboard = new AdminDashboard("Admin", email);
                                adminDashboard.setVisible(true);
                                adminDashboard.pack();
                                AdminDashboard.adminEmail.setText(email);
                                statisticDAO.admin();
                                this.dispose();
                            } else {
                                showAnnouncement("Your account has been logged in from another location !", "Warning", JOptionPane.WARNING_MESSAGE);
                            }
                        } else {
                            showAnnouncement("Incorrect Email or Password !", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        showAnnouncement("Incorrect Email or Password !", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                }
            } catch (SQLException | NoSuchAlgorithmException | InvalidKeySpecException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton_LoginActionPerformed

    private void jLabel_SignUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SignUpMouseEntered
        jLabel_SignUp.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(35, 166, 97)));
    }//GEN-LAST:event_jLabel_SignUpMouseEntered

    private void jLabel_SignUpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SignUpMouseExited
        jLabel_SignUp.setBorder(null);
    }//GEN-LAST:event_jLabel_SignUpMouseExited

    private void jLabel_Forgot_PsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Forgot_PsMouseEntered
        jLabel_Forgot_Ps.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(35, 166, 97)));
    }//GEN-LAST:event_jLabel_Forgot_PsMouseEntered

    private void jLabel_Forgot_PsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Forgot_PsMouseExited
        jLabel_Forgot_Ps.setBorder(null);
    }//GEN-LAST:event_jLabel_Forgot_PsMouseExited

    // "X" button event to turn off the program
    private void jLabel_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel_ExitMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.1; i <= 1.0; i += 0.1) {
            String s = "" + i;
            float f = Float.parseFloat(s);
            this.setOpacity(f);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    // Event of "Sign Up" JLabel
    private void jLabel_SignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SignUpMouseClicked
        new SignUp().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jLabel_SignUpMouseClicked
    // Event of "Forgor Password" JLabel
    private void jLabel_Forgot_PsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Forgot_PsMouseClicked
        new ForgotPassword().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel_Forgot_PsMouseClicked
    // Event of icon "Visible"
    private void jLabel_Icon_VisibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Icon_VisibleMouseClicked
        jPasswordField1.setEchoChar('\u2022');
        jLabel_Icon_Hide.setVisible(true);
        jLabel_Icon_Visible.setVisible(false);
    }//GEN-LAST:event_jLabel_Icon_VisibleMouseClicked
    // Event of icon "Hide"
    private void jLabel_Icon_HideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Icon_HideMouseClicked
        jPasswordField1.setEchoChar((char) 0);
        jLabel_Icon_Hide.setVisible(false);
        jLabel_Icon_Visible.setVisible(true);
    }//GEN-LAST:event_jLabel_Icon_HideMouseClicked

    public static void main(String args[]) {
        System.setProperty("sun.java2d.uiScale", "1.0");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Button_Admin;
    private javax.swing.JRadioButton Button_Shipper;
    private javax.swing.JRadioButton Button_User;
    private javax.swing.JButton jButton_Login;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_Email;
    private javax.swing.JLabel jLabel_Exit;
    private javax.swing.JLabel jLabel_Forgot_Ps;
    private javax.swing.JLabel jLabel_Icon_Hide;
    private javax.swing.JLabel jLabel_Icon_Visible;
    private javax.swing.JLabel jLabel_Login;
    private javax.swing.JLabel jLabel_Password;
    private javax.swing.JLabel jLabel_SignUp;
    private javax.swing.JLabel jLabel_Title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField_Email;
    // End of variables declaration//GEN-END:variables
}
