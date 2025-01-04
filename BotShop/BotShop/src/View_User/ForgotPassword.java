package View_User;

import DAOs.ForgotPasswordDAO;
import OtherFunction.PasswordHashingService;
import OtherFunction.SendEmailOTP;
import java.awt.Color;
import java.awt.Font;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ForgotPassword extends javax.swing.JFrame {

    ForgotPasswordDAO forgotPasswordDAO = new ForgotPasswordDAO();

    JLabel announcement = new JLabel(); // Used to display the content of the NOTIFICATION
    int xx, xy;
    Color notEdit = new Color(204, 204, 204);
    Color edit = new Color(255, 255, 255);

    public ForgotPassword() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_FP_Email = new javax.swing.JTextField();
        jLabel_FP_Ser_Ques = new javax.swing.JLabel();
        jTextField_FP_Ser_Ques = new javax.swing.JTextField();
        jTextField_FP_Answer = new javax.swing.JTextField();
        Answer = new javax.swing.JLabel();
        jLabel_FP_NewPassword = new javax.swing.JLabel();
        jButton_Change_Password = new javax.swing.JButton();
        jLabel_Back = new javax.swing.JLabel();
        jLabel__FP_Email = new javax.swing.JLabel();
        jLabel_Icon_Visible = new javax.swing.JLabel();
        jLabel_Icon_Hide = new javax.swing.JLabel();
        jPasswordField_FP_Newpassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jTextField_FP_OTP = new javax.swing.JTextField();
        label_OTP = new javax.swing.JLabel();

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

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 0, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Forgot Password");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 410, 60));

        jTextField_FP_Email.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_FP_Email.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel1.add(jTextField_FP_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 350, 50));

        jLabel_FP_Ser_Ques.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_FP_Ser_Ques.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_FP_Ser_Ques.setText("Security Question");
        jPanel1.add(jLabel_FP_Ser_Ques, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 180, -1));

        jTextField_FP_Ser_Ques.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_FP_Ser_Ques.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel1.add(jTextField_FP_Ser_Ques, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 350, 50));

        jTextField_FP_Answer.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_FP_Answer.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel1.add(jTextField_FP_Answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 350, 50));

        Answer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Answer.setForeground(new java.awt.Color(255, 255, 255));
        Answer.setText("Answer");
        jPanel1.add(Answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel_FP_NewPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_FP_NewPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_FP_NewPassword.setText("New Password");
        jPanel1.add(jLabel_FP_NewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, -1));

        jButton_Change_Password.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Change_Password.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jButton_Change_Password.setForeground(new java.awt.Color(35, 166, 97));
        jButton_Change_Password.setText("Change the Password");
        jButton_Change_Password.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Change_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Change_PasswordActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Change_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 430, 60));

        jLabel_Back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/turn-back.png"))); // NOI18N
        jLabel_Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_BackMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 70, 60));

        jLabel__FP_Email.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel__FP_Email.setForeground(new java.awt.Color(255, 255, 255));
        jLabel__FP_Email.setText("Email");
        jPanel1.add(jLabel__FP_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 130, 70, -1));

        jLabel_Icon_Visible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/visible.png"))); // NOI18N
        jLabel_Icon_Visible.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Icon_Visible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Icon_VisibleMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel_Icon_Visible, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 560, -1, -1));

        jLabel_Icon_Hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/hide.png"))); // NOI18N
        jLabel_Icon_Hide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Icon_Hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Icon_HideMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel_Icon_Hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 560, -1, -1));

        jPasswordField_FP_Newpassword.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField_FP_Newpassword.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel1.add(jPasswordField_FP_Newpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 350, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/find.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        jTextField_FP_OTP.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_FP_OTP.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTextField_FP_OTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FP_OTPActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_FP_OTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 350, 50));

        label_OTP.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_OTP.setForeground(new java.awt.Color(255, 255, 255));
        label_OTP.setText("Confirmation OTP Code");
        jPanel1.add(label_OTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
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
        announcement.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
        jTextField_FP_Ser_Ques.setBackground(notEdit);
        jTextField_FP_Answer.setBackground(notEdit);
        jPasswordField_FP_Newpassword.setBackground(notEdit);
        jTextField_FP_OTP.setBackground(notEdit);
        jTextField_FP_Ser_Ques.setEditable(false);
        jTextField_FP_Answer.setEditable(false);
        jPasswordField_FP_Newpassword.setEditable(false);
        jTextField_FP_OTP.setEditable(false);
        jButton_Change_Password.setEnabled(false);
    }
    
    private void showAnnouncement(String text) {
        announcement.setText(text);
        JOptionPane.showMessageDialog(this, announcement, "Warning", 2);
    }

    private boolean isEmpty() {
        if (jTextField_FP_Answer.getText().isEmpty()) {
            showAnnouncement("Security answer is Empty");
            return false;
        }
        if (jTextField_FP_OTP.getText().isEmpty()) {
            showAnnouncement("Please enter OTP");
            return false;
        }
        if (String.valueOf(jPasswordField_FP_Newpassword.getPassword()).isEmpty()) {
            showAnnouncement("Please enter new password");
            return false;
        }
        return true;
    }

    private boolean emailValidation() {
        if (jTextField_FP_Email.getText().isEmpty()) {
            showAnnouncement("Please enter your Email !");
            return false;
        }
        if (!jTextField_FP_Email.getText().matches("^[a-zA-Z0-9._%+-]+@gmail\\.com$")) {
            showAnnouncement("Invalid Email Address");
            return false;
        }
        return true;
    }

    // event of "change password" button
    private void jButton_Change_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Change_PasswordActionPerformed
        if (isEmpty()) {
            String email = jTextField_FP_Email.getText();
            String ans = jTextField_FP_Answer.getText();

            String OTP = jTextField_FP_OTP.getText();
            String OTPEmail = SendEmailOTP.getCode();

            if (forgotPasswordDAO.isCorrectAnswer(email, ans) && OTP.equals(OTPEmail)) {
                String newPass = String.valueOf(jPasswordField_FP_Newpassword.getPassword());
                String hashedNewPass;
                try {
                    hashedNewPass = PasswordHashingService.generatePasswordHash(newPass);
                    if (forgotPasswordDAO.setNewPassword(email, hashedNewPass) == true) {
                        showAnnouncement("Password Successfully updated");
                        new Login().setVisible(true);
                        this.dispose();
                    } else {
                        showAnnouncement("Password update failed !");
                    }
                } catch (NoSuchAlgorithmException ex) {
                    Logger.getLogger(ForgotPassword.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InvalidKeySpecException ex) {
                    Logger.getLogger(ForgotPassword.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                showAnnouncement("Your Answer or OTP Code is not CORRECT !");
            }
        }
    }//GEN-LAST:event_jButton_Change_PasswordActionPerformed


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.1; i <= 1.0; i += 0.1) {
            String s = "" + i;
            float f = Float.parseFloat(s);
            this.setOpacity(f);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(ForgotPassword.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jLabel_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BackMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel_BackMouseClicked

    private void jLabel_Icon_VisibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Icon_VisibleMouseClicked
        jPasswordField_FP_Newpassword.setEchoChar('\u2022');
        jLabel_Icon_Hide.setVisible(true);
        jLabel_Icon_Visible.setVisible(false);
    }//GEN-LAST:event_jLabel_Icon_VisibleMouseClicked

    private void jLabel_Icon_HideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Icon_HideMouseClicked
        jPasswordField_FP_Newpassword.setEchoChar((char) 0);
        jLabel_Icon_Hide.setVisible(false);
        jLabel_Icon_Visible.setVisible(true);
    }//GEN-LAST:event_jLabel_Icon_HideMouseClicked

    // event of "Search" icon  
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if (emailValidation()) {
            if (forgotPasswordDAO.isEmailExist(jTextField_FP_Email.getText())) {
                
                SendEmailOTP.sendToEmail(jTextField_FP_Email.getText());
                showAnnouncement("OTP code has been sent to your Email");
                
                jTextField_FP_Email.setBackground(notEdit);
                jTextField_FP_Email.setEditable(false);
                jTextField_FP_Answer.setBackground(edit);
                jTextField_FP_Answer.setEditable(true);
                jPasswordField_FP_Newpassword.setBackground(edit);
                jPasswordField_FP_Newpassword.setEditable(true);
                jTextField_FP_OTP.setBackground(edit);
                jTextField_FP_OTP.setEditable(true);
                jButton_Change_Password.setEnabled(true);
            } else {
                showAnnouncement("Email address doesn't exist !");
            }
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jTextField_FP_OTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FP_OTPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FP_OTPActionPerformed

//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ForgotPassword().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Answer;
    private javax.swing.JButton jButton_Change_Password;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Back;
    private javax.swing.JLabel jLabel_FP_NewPassword;
    private javax.swing.JLabel jLabel_FP_Ser_Ques;
    private javax.swing.JLabel jLabel_Icon_Hide;
    private javax.swing.JLabel jLabel_Icon_Visible;
    private javax.swing.JLabel jLabel__FP_Email;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_FP_Newpassword;
    private javax.swing.JTextField jTextField_FP_Answer;
    private javax.swing.JTextField jTextField_FP_Email;
    private javax.swing.JTextField jTextField_FP_OTP;
    public static javax.swing.JTextField jTextField_FP_Ser_Ques;
    private javax.swing.JLabel label_OTP;
    // End of variables declaration//GEN-END:variables
}
