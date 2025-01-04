package View_User;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import DAOs.UserDAO;
import OtherFunction.PasswordHashingService;
import java.awt.Font;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.swing.JOptionPane;

public class SignUp extends javax.swing.JFrame {
    
    UserDAO userDAO = new UserDAO();
    
    JLabel announcement = new JLabel(); // Used to display the content of the NOTIFICATION
    
    Color notEdit = new Color(204, 204, 204);
    
    int xx, xy;
    
    public SignUp() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Phone = new javax.swing.JTextField();
        jTextField_UserID = new javax.swing.JTextField();
        jTextField_Answer = new javax.swing.JTextField();
        jTextField_Address = new javax.swing.JTextField();
        jTextField_Country = new javax.swing.JTextField();
        jLabel_Phone = new javax.swing.JLabel();
        jLabel_Secu_Ques = new javax.swing.JLabel();
        jLabel_Answer = new javax.swing.JLabel();
        jLabel_Address = new javax.swing.JLabel();
        jLabel_Country = new javax.swing.JLabel();
        jLabel_Username = new javax.swing.JLabel();
        jTextField_Username = new javax.swing.JTextField();
        jTextField_Email = new javax.swing.JTextField();
        jLabel_Email = new javax.swing.JLabel();
        jLabel_Password = new javax.swing.JLabel();
        jButton_Registe = new javax.swing.JButton();
        jComboBox_Secu_Ques = new javax.swing.JComboBox<>();
        jLabel_Back = new javax.swing.JLabel();
        jLabel_UserID = new javax.swing.JLabel();
        jLabel_Icon_Visible = new javax.swing.JLabel();
        jLabel_Icon_Hide = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(35, 166, 97));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51), 8));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 0, 65)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sign Up");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 310, -1));

        jTextField_Phone.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Phone.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTextField_Phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_PhoneKeyTyped(evt);
            }
        });
        jPanel1.add(jTextField_Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 350, 50));

        jTextField_UserID.setEditable(false);
        jTextField_UserID.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_UserID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel1.add(jTextField_UserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 350, 50));

        jTextField_Answer.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Answer.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel1.add(jTextField_Answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 350, 50));

        jTextField_Address.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Address.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel1.add(jTextField_Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 350, 50));

        jTextField_Country.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Country.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel1.add(jTextField_Country, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, 350, 50));

        jLabel_Phone.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Phone.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Phone.setText("Phone");
        jPanel1.add(jLabel_Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, -1));

        jLabel_Secu_Ques.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Secu_Ques.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Secu_Ques.setText("Security Question");
        jPanel1.add(jLabel_Secu_Ques, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 160, -1));

        jLabel_Answer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Answer.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Answer.setText("Answer");
        jPanel1.add(jLabel_Answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 100, -1));

        jLabel_Address.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Address.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Address.setText("Address");
        jPanel1.add(jLabel_Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, -1, -1));

        jLabel_Country.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Country.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Country.setText("Country");
        jPanel1.add(jLabel_Country, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, -1, -1));

        jLabel_Username.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Username.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Username.setText("Username");
        jPanel1.add(jLabel_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 100, -1));

        jTextField_Username.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Username.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTextField_Username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_UsernameKeyTyped(evt);
            }
        });
        jPanel1.add(jTextField_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 350, 50));

        jTextField_Email.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Email.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel1.add(jTextField_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 350, 50));

        jLabel_Email.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Email.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Email.setText("Email");
        jPanel1.add(jLabel_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel_Password.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Password.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Password.setText("Password");
        jPanel1.add(jLabel_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        jButton_Registe.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Registe.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jButton_Registe.setForeground(new java.awt.Color(35, 166, 97));
        jButton_Registe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/confirm.png"))); // NOI18N
        jButton_Registe.setText("Complete registration");
        jButton_Registe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Registe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegisteActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Registe, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 550, 350, 60));

        jComboBox_Secu_Ques.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_Secu_Ques.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jComboBox_Secu_Ques.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox_Secu_Ques.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What your favourite color ?" }));
        jPanel1.add(jComboBox_Secu_Ques, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 350, 50));

        jLabel_Back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/turn-back.png"))); // NOI18N
        jLabel_Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_BackMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 70, 60));

        jLabel_UserID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_UserID.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_UserID.setText("User ID");
        jPanel1.add(jLabel_UserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 130, 70, -1));

        jLabel_Icon_Visible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/visible.png"))); // NOI18N
        jLabel_Icon_Visible.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Icon_Visible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Icon_VisibleMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel_Icon_Visible, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, -1, -1));

        jLabel_Icon_Hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/hide.png"))); // NOI18N
        jLabel_Icon_Hide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Icon_Hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Icon_HideMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel_Icon_Hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, -1, -1));

        jPasswordField1.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 350, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void icons() {
        jLabel_Icon_Visible.setVisible(false);
        jLabel_Icon_Hide.setVisible(true);
    }
    
    private void init() {
        icons();
        jTextField_UserID.setBackground(notEdit);
        jTextField_UserID.setText(String.valueOf(userDAO.getMaxRox()));
        announcement.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
        jPasswordField1.setEchoChar('\u2022');
        jComboBox_Secu_Ques.setSelectedIndex(-1);
    }
    
    public boolean isEmpty() {
        if(jTextField_Username.getText().isEmpty()) {
            announcement.setText("Username is empty !");
            JOptionPane.showMessageDialog(this, announcement, "Warning", 2);
            return false;
        }
        if(jTextField_Email.getText().isEmpty()) {
            announcement.setText("Email address is empty !");
            JOptionPane.showMessageDialog(this, announcement, "Warning", 2);
            return false;
        }
        if(!jTextField_Email.getText().matches("^[a-zA-Z0-9._%+-]+@gmail\\.com$")) {
            announcement.setText("Invalid Email Address");
            JOptionPane.showMessageDialog(this, announcement, "Warning", 2);
            return false;
        }
        if(String.valueOf(jPasswordField1.getPassword()).isEmpty()) {
            announcement.setText("Password is empty !");
            JOptionPane.showMessageDialog(this, announcement, "Warning", 2);
            return false;
        }
        if(jTextField_Phone.getText().isEmpty()) {
            announcement.setText("Phone number is empty !");
            JOptionPane.showMessageDialog(this, announcement, "Warning", 2);
            return false;
        }
        if(jTextField_Phone.getText().length() != 10) {
            announcement.setText("Phone number includes 10 digits !");
            JOptionPane.showMessageDialog(this, announcement, "Warning", 2);
            return false;
        }
        if(jComboBox_Secu_Ques.getSelectedIndex() == -1) {
            announcement.setText("Security Question is empty !");
            JOptionPane.showMessageDialog(this, announcement, "Warning", 2);
            return false;
        }
        if(jTextField_Answer.getText().isEmpty()) {
            announcement.setText("Security Answer is empty !");
            JOptionPane.showMessageDialog(this, announcement, "Warning", 2);
            return false;
        }
        if(jTextField_Address.getText().isEmpty()) {
            announcement.setText("Address is empty !");
            JOptionPane.showMessageDialog(this, announcement, "Warning", 2);
            return false;
        }
        if(jTextField_Country.getText().isEmpty()) {
            announcement.setText("Country is empty !");
            JOptionPane.showMessageDialog(this, announcement, "Warning", 2);
            return false;
        }  
        return true;
    }
    
    private void jButton_RegisteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegisteActionPerformed
        if(isEmpty()) {
            int id = Integer.parseInt(jTextField_UserID.getText());
            String userName = jTextField_Username.getText();
            String email = jTextField_Email.getText();
            String password = String.valueOf(jPasswordField1.getPassword()).toString();
            String phone = jTextField_Phone.getText();
            String secuQues = jComboBox_Secu_Ques.getSelectedItem().toString();
            String ans = jTextField_Answer.getText();
            String address = jTextField_Address.getText();
            String country = jTextField_Country.getText();
            String hashedPassword;
            
            try {
                hashedPassword = PasswordHashingService.generatePasswordHash(password);
                if (!userDAO.isEmailExist(email)) {
                    if (!userDAO.isPhoneNumberExist(phone)) {
                        if(userDAO.insert(id, userName, email, hashedPassword, phone, secuQues, ans, address, country) == true) {
                            announcement.setText("User added successfully !");
                            JOptionPane.showMessageDialog(this, announcement);
                            new Login().setVisible(true);
                            this.dispose();
                        } else {
                            announcement.setText("Registration error !");
                            JOptionPane.showMessageDialog(this, announcement, "Warning", 2);
                        }
                    } else {
                        announcement.setText("This Phone Number already exists");
                        JOptionPane.showMessageDialog(this, announcement, "Warning", 2);
                    }
                } else {
                    announcement.setText("This Email address already exists");
                    JOptionPane.showMessageDialog(this, announcement, "Warning", 2);
                }
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvalidKeySpecException ex) {
                Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton_RegisteActionPerformed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for(double i = 0.1; i <= 1.0; i += 0.1) {
            String s = "" + i;
            float f = Float.parseFloat(s);
            this.setOpacity(f);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jLabel_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BackMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel_BackMouseClicked

    private void jTextField_UsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_UsernameKeyTyped
        char input = evt.getKeyChar();
        if(!(input < '0' || input > '9') && input != '\b') {
            evt.consume();
            announcement.setText("Username doesn't contain any numbers !");
            JOptionPane.showMessageDialog(this, announcement, "Warning", 2);
        }
    }//GEN-LAST:event_jTextField_UsernameKeyTyped

    private void jTextField_PhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PhoneKeyTyped
        if(!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_PhoneKeyTyped

    private void jLabel_Icon_VisibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Icon_VisibleMouseClicked
        jPasswordField1.setEchoChar('\u2022');
        jLabel_Icon_Hide.setVisible(true);
        jLabel_Icon_Visible.setVisible(false);
    }//GEN-LAST:event_jLabel_Icon_VisibleMouseClicked

    private void jLabel_Icon_HideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Icon_HideMouseClicked
        jPasswordField1.setEchoChar((char) 0);
        jLabel_Icon_Hide.setVisible(false);
        jLabel_Icon_Visible.setVisible(true);
    }//GEN-LAST:event_jLabel_Icon_HideMouseClicked

//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SignUp().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Registe;
    private javax.swing.JComboBox<String> jComboBox_Secu_Ques;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Address;
    private javax.swing.JLabel jLabel_Answer;
    private javax.swing.JLabel jLabel_Back;
    private javax.swing.JLabel jLabel_Country;
    private javax.swing.JLabel jLabel_Email;
    private javax.swing.JLabel jLabel_Icon_Hide;
    private javax.swing.JLabel jLabel_Icon_Visible;
    private javax.swing.JLabel jLabel_Password;
    private javax.swing.JLabel jLabel_Phone;
    private javax.swing.JLabel jLabel_Secu_Ques;
    private javax.swing.JLabel jLabel_UserID;
    private javax.swing.JLabel jLabel_Username;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField_Address;
    private javax.swing.JTextField jTextField_Answer;
    private javax.swing.JTextField jTextField_Country;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_Phone;
    private javax.swing.JTextField jTextField_UserID;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables
}
