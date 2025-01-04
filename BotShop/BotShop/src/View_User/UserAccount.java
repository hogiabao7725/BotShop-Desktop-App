package View_User;

import DAOs.UserDAO;
import OtherFunction.PasswordHashingService;
import java.awt.Color;
import java.awt.Font;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class UserAccount extends javax.swing.JFrame {

    UserDAO userDAO = new UserDAO();
    
    JLabel announcement = new JLabel(); // Used to display the content of the NOTIFICATION
    Color primaryColor = new Color(76,98,146);
    
    int xx, xy; // coordinates of JFrame
    
    // Data about "User" information //
    private int userID;
    String[] informationUser = new String[9];
    String passwordRemembered = String.valueOf(Login.jPasswordField1.getPassword()).toString();
    // ============================ //
    
    public UserAccount() {
        initComponents();
        setLocation(700, 290);
        init();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Phone = new javax.swing.JTextField();
        jTextField_UserID = new javax.swing.JTextField();
        jTextField_Ser_Ques = new javax.swing.JTextField();
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
        jButton_Delete = new javax.swing.JButton();
        jLabel_Back = new javax.swing.JLabel();
        jLabel_UserID = new javax.swing.JLabel();
        jLabel_Icon_Visible = new javax.swing.JLabel();
        jLabel_Icon_Hide = new javax.swing.JLabel();
        jTextField_Answer = new javax.swing.JTextField();
        jButton_Update = new javax.swing.JButton();
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
        jLabel1.setText("Account Management");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 570, -1));

        jTextField_Phone.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Phone.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTextField_Phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_PhoneKeyTyped(evt);
            }
        });
        jPanel1.add(jTextField_Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 350, 50));

        jTextField_UserID.setEditable(false);
        jTextField_UserID.setBackground(new java.awt.Color(153, 153, 153));
        jTextField_UserID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel1.add(jTextField_UserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 350, 50));

        jTextField_Ser_Ques.setEditable(false);
        jTextField_Ser_Ques.setBackground(new java.awt.Color(153, 153, 153));
        jTextField_Ser_Ques.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel1.add(jTextField_Ser_Ques, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 350, 50));

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

        jButton_Delete.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Delete.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jButton_Delete.setForeground(new java.awt.Color(35, 166, 97));
        jButton_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/bin.png"))); // NOI18N
        jButton_Delete.setText("Delete");
        jButton_Delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 540, 170, 70));

        jLabel_Back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/turn-back.png"))); // NOI18N
        jLabel_Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_BackMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 80, 60));

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

        jTextField_Answer.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Answer.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel1.add(jTextField_Answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 350, 50));

        jButton_Update.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Update.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jButton_Update.setForeground(new java.awt.Color(35, 166, 97));
        jButton_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/updated.png"))); // NOI18N
        jButton_Update.setText("Update");
        jButton_Update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdateActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 540, 170, 70));

        jPasswordField1.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 462, 350, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void init() {
        announcement.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
        icons();
        userID = userDAO.getUserID(UserDashboard.userEmail.getText());
        informationUser = userDAO.getInformationUser(userID);
        setInformation();
    }
    
    private void showAnnouncement(String text, String title, int messageType) {
        announcement.setText(text);
        JOptionPane.showMessageDialog(this, announcement, title, messageType);
    }
    
    private void setDefault() {
        UserDashboard.jPanel5.setBackground(primaryColor);
        UserDashboard.jPanel6.setBackground(primaryColor);
    }
    
    private void setInformation() {
        jTextField_UserID.setText(informationUser[0]);
        jTextField_Username.setText(informationUser[1]);
        jTextField_Email.setText(informationUser[2]);
        jPasswordField1.setText(passwordRemembered);
        jTextField_Phone.setText(informationUser[4]);
        jTextField_Ser_Ques.setText(informationUser[5]);
        jTextField_Answer.setText(informationUser[6]);
        jTextField_Address.setText(informationUser[7]);
        jTextField_Country.setText(informationUser[8]);
    }
    
    private void icons() {
        jLabel_Icon_Visible.setVisible(false);
        jLabel_Icon_Hide.setVisible(true);
    }
    
    public boolean isEmpty() {
        if(jTextField_Username.getText().isEmpty()) {
            showAnnouncement("Username is empty !", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(jTextField_Email.getText().isEmpty()) {
            showAnnouncement("Email address is empty !", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(!jTextField_Email.getText().matches("^[a-zA-Z0-9._%+-]+@gmail\\.com$")) {
            showAnnouncement("Invalid Email Address", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(String.valueOf(jPasswordField1.getPassword()).isEmpty()) {
            showAnnouncement("Password is empty !", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(jTextField_Phone.getText().isEmpty()) {
            showAnnouncement("Phone number is empty !", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(jTextField_Phone.getText().length() != 10) {
            showAnnouncement("Phone number includes 10 digits !", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(jTextField_Answer.getText().isEmpty()) {
            showAnnouncement("Security Answer is empty !", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(jTextField_Address.getText().isEmpty()) {
            showAnnouncement("Address is empty !", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(jTextField_Country.getText().isEmpty()) {
            showAnnouncement("Country is empty !", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }  
        return true;
    }
    
    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed
        announcement.setText("Are you sure to delete this Account ?");
        int x = JOptionPane.showConfirmDialog(this, announcement, "Delete", JOptionPane.OK_CANCEL_OPTION, 0);
        int userID = Integer.parseInt(jTextField_UserID.getText());
        if (x == JOptionPane.OK_OPTION) {
            showAnnouncement("Account Deleted", "Delete Account", JOptionPane.WARNING_MESSAGE);
            userDAO.delete(userID);
            System.exit(0);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jButton_DeleteActionPerformed

    private void jButton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateActionPerformed
       if(isEmpty()) {
           if(!check()) {
            int id = Integer.parseInt(jTextField_UserID.getText());
            String userName = jTextField_Username.getText();
            String email = jTextField_Email.getText();
            String password = String.valueOf(jPasswordField1.getPassword()).toString();
            String phone = jTextField_Phone.getText();
            String secuQues = jTextField_Ser_Ques.getText();
            String ans = jTextField_Answer.getText();
            String address = jTextField_Address.getText();
            String country = jTextField_Country.getText();
            
            String hashedPassword;
               try {
                   Login.jPasswordField1.setText(password);
                   hashedPassword = PasswordHashingService.generatePasswordHash(password);
                   if(userDAO.update(id, userName, email, hashedPassword, phone, secuQues, ans, address, country)) {
                       showAnnouncement("User data successfully updated", "Update Data", JOptionPane.INFORMATION_MESSAGE);
                   } else {
                       showAnnouncement("Update Failed", "Update Data", JOptionPane.WARNING_MESSAGE);
                   }
                   
                   setDefault();
                   this.dispose();
               } catch (NoSuchAlgorithmException ex) {
                   Logger.getLogger(UserAccount.class.getName()).log(Level.SEVERE, null, ex);
               } catch (InvalidKeySpecException ex) {
                   Logger.getLogger(UserAccount.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
       }
    }//GEN-LAST:event_jButton_UpdateActionPerformed

    private boolean check() {
        String newEmail = jTextField_Email.getText();
        String newPhone = jTextField_Phone.getText();
        if(newEmail.equals(informationUser[2]) && newPhone.equals(informationUser[4])) {
            return false;
        } else {
            if(!newEmail.equals(informationUser[2])) {
                boolean x = userDAO.isEmailExist(newEmail);
                if(x) {
                    showAnnouncement("This email already exist", "Warning", JOptionPane.WARNING_MESSAGE);
                }
                return x;
            }
            if(!newPhone.equals(informationUser[4])) {
                boolean x = userDAO.isPhoneNumberExist(newPhone);
                if(x) {
                    showAnnouncement("This Phone number already exist", "Warning", JOptionPane.WARNING_MESSAGE);
                }
                return x;
            }
        }
        return false;
    }
    
    private void jLabel_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BackMouseClicked
        setVisible(false);
        UserDashboard.jPanel5.setBackground(primaryColor);
        UserDashboard.jPanel6.setBackground(primaryColor);
    }//GEN-LAST:event_jLabel_BackMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for(double i = 0.1; i <= 1.0; i += 0.1) {
            String s = "" + i;
            float f = Float.parseFloat(s);
            this.setOpacity(f);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(UserAccount.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    // ===== Drag and drop the motion interface on the screen =====//
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed
    // ============================================================ //
    
    
    // event of icon "Visible"
    private void jLabel_Icon_VisibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Icon_VisibleMouseClicked
        jPasswordField1.setEchoChar('\u2022');
        jLabel_Icon_Hide.setVisible(true);
        jLabel_Icon_Visible.setVisible(false);
    }//GEN-LAST:event_jLabel_Icon_VisibleMouseClicked

    // event of icon "Hide"
    private void jLabel_Icon_HideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Icon_HideMouseClicked
        jPasswordField1.setEchoChar((char) 0);
        jLabel_Icon_Hide.setVisible(false);
        jLabel_Icon_Visible.setVisible(true);
    }//GEN-LAST:event_jLabel_Icon_HideMouseClicked

    // check Input of "Phone" JTextField
    private void jTextField_PhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PhoneKeyTyped
        if(!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_PhoneKeyTyped

    // check Input of "User ID" JTextField
    private void jTextField_UsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_UsernameKeyTyped
        char input = evt.getKeyChar();
        if(!(input < '0' || input > '9') && input != '\b') {
            evt.consume();
            showAnnouncement("Username doesn't contain any numbers !", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jTextField_UsernameKeyTyped

//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new UserAccount().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_Update;
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
    private javax.swing.JTextField jTextField_Ser_Ques;
    private javax.swing.JTextField jTextField_UserID;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables
}
