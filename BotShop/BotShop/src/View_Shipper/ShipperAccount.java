package View_Shipper;

import DAOs.ShipperDAO;
import OtherFunction.PasswordHashingService;
import View_User.Login;
import java.awt.Color;
import java.awt.Font;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ShipperAccount extends javax.swing.JFrame {

    ShipperDAO shipperDAO = new ShipperDAO();
    
    JLabel announcement = new JLabel(); // Used to display the content of the NOTIFICATION
    Color primaryColor = new Color(76,98,146);
   
    int xx, xy;
    
    // * //
    private int shipperID;
    String[] informationShipper = new String[7];
    String passwordRememebered = String.valueOf(Login.jPasswordField1.getPassword()).toString();
    // * //
    
    public ShipperAccount() {
        initComponents();
        setLocation(710, 350);
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Phone = new javax.swing.JTextField();
        jTextField_ShipperID = new javax.swing.JTextField();
        jTextField_Address = new javax.swing.JTextField();
        jTextField_Country = new javax.swing.JTextField();
        jLabel_Phone = new javax.swing.JLabel();
        jLabel_Address = new javax.swing.JLabel();
        jLabel_Country = new javax.swing.JLabel();
        jLabel_ShipperName = new javax.swing.JLabel();
        jTextField_ShipperName = new javax.swing.JTextField();
        jTextField_Email = new javax.swing.JTextField();
        jLabel_Email = new javax.swing.JLabel();
        jLabel_Password = new javax.swing.JLabel();
        jButton_Delete = new javax.swing.JButton();
        jLabel_Back = new javax.swing.JLabel();
        jLabel_ShipperID = new javax.swing.JLabel();
        jLabel_Icon_Visible = new javax.swing.JLabel();
        jLabel_Icon_Hide = new javax.swing.JLabel();
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
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 520, -1));

        jTextField_Phone.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Phone.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTextField_Phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_PhoneKeyTyped(evt);
            }
        });
        jPanel1.add(jTextField_Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 350, 50));

        jTextField_ShipperID.setEditable(false);
        jTextField_ShipperID.setBackground(new java.awt.Color(153, 153, 153));
        jTextField_ShipperID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel1.add(jTextField_ShipperID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 350, 50));

        jTextField_Address.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Address.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel1.add(jTextField_Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 350, 50));

        jTextField_Country.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Country.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel1.add(jTextField_Country, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 350, 50));

        jLabel_Phone.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Phone.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Phone.setText("Phone");
        jPanel1.add(jLabel_Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, -1, -1));

        jLabel_Address.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Address.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Address.setText("Address");
        jPanel1.add(jLabel_Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, -1));

        jLabel_Country.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Country.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Country.setText("Country");
        jPanel1.add(jLabel_Country, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, -1, -1));

        jLabel_ShipperName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_ShipperName.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_ShipperName.setText("Shipper name");
        jPanel1.add(jLabel_ShipperName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 150, -1));

        jTextField_ShipperName.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_ShipperName.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTextField_ShipperName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_ShipperNameKeyTyped(evt);
            }
        });
        jPanel1.add(jTextField_ShipperName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 350, 50));

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
        jPanel1.add(jButton_Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, 170, 70));

        jLabel_Back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/turn-back.png"))); // NOI18N
        jLabel_Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_BackMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 80, 60));

        jLabel_ShipperID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_ShipperID.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_ShipperID.setText("Shipper ID");
        jPanel1.add(jLabel_ShipperID, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 130, 130, -1));

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
        jPanel1.add(jButton_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 170, 70));

        jPasswordField1.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 350, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void init() {
        shipperID = shipperDAO.getShipperID(ShipperDashboard.shipperEmail.getText());
        informationShipper = shipperDAO.getShipperValue(shipperID);
        setInformationShipperTable();
        
        announcement.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
        jLabel_Icon_Visible.setVisible(false);
        jLabel_Icon_Hide.setVisible(true);
    }
    
    private void showAnnouncement(String text, String title, int messageType) {
        announcement.setText(text);
        JOptionPane.showMessageDialog(this, announcement, title, messageType);
    }
    
    private void setInformationShipperTable() {
        jTextField_ShipperID.setText(informationShipper[0]);
        jTextField_ShipperName.setText(informationShipper[1]);
        jTextField_Email.setText(informationShipper[2]);
        jPasswordField1.setText(passwordRememebered);
        jTextField_Phone.setText(informationShipper[4]);
        jTextField_Address.setText(informationShipper[5]);
        jTextField_Country.setText(informationShipper[6]);
    }
    
    public boolean isEmpty() {
        if(jTextField_ShipperName.getText().isEmpty()) {
            showAnnouncement("Shipper name is empty !", "Warning", JOptionPane.WARNING_MESSAGE);
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
    
    private boolean check() {
        String newShipperName = jTextField_ShipperName.getText();
        String newEmail = jTextField_Email.getText();
        String newPhone = jTextField_Phone.getText();
        String oldShipperName = informationShipper[1];
        String oldEmail = informationShipper[2];
        String oldPhone = informationShipper[4];
        
        if(newShipperName.equals(oldShipperName) && newEmail.equals(oldEmail) && newPhone.equals(oldPhone)) {
            return false;
        } else {
            if(!newShipperName.equals(oldShipperName)) {
                boolean x = shipperDAO.isEmailExist(newShipperName);
                if(x) {
                    showAnnouncement("This Shipper Name already exist", "Warning", JOptionPane.WARNING_MESSAGE);
                }
                return x;
            }
            if(!newEmail.equals(oldEmail)) {
                boolean x = shipperDAO.isEmailExist(newEmail);
                if(x) {
                    showAnnouncement("This email already exist", "Warning", JOptionPane.WARNING_MESSAGE);
                }
                return x;
            }
            if(!newPhone.equals(oldPhone)) {
                boolean x = shipperDAO.isPhoneNumberExist(newPhone);
                if(x) {
                    showAnnouncement("This Phone number already exist", "Warning", JOptionPane.WARNING_MESSAGE);
                }
                return x;
            }
        }
        return false;
    }
    
    // event of "Delete" button
    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed
        announcement.setText("Are you sure to delete this Account ?");
        int x = JOptionPane.showConfirmDialog(this, announcement, "Delete Account", JOptionPane.OK_CANCEL_OPTION, 0);
        int userID = Integer.parseInt(jTextField_ShipperID.getText());
        if (x == JOptionPane.OK_OPTION) {
            shipperDAO.delete(userID);
            showAnnouncement("Account Deleted", "Delete Account", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jButton_DeleteActionPerformed

    // event of "Update" button
    private void jButton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateActionPerformed
        if(isEmpty()) {
            if(!check()) {
                int id = Integer.parseInt(jTextField_ShipperID.getText());
                String shipperName = jTextField_ShipperName.getText();
                String email = jTextField_Email.getText();
                String password = String.valueOf(jPasswordField1.getPassword()).toString();
                String phone = jTextField_Phone.getText();
                String address = jTextField_Address.getText();
                String country = jTextField_Country.getText();
                
                try {
                    Login.jPasswordField1.setText(password);
                    String hashedPassword = PasswordHashingService.generatePasswordHash(password);
                    if(shipperDAO.update(id, shipperName, email, hashedPassword, phone, address, country)) {
                        showAnnouncement("Update Successful", "Announcement", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        showAnnouncement("Updated Failed", "Announcement", JOptionPane.INFORMATION_MESSAGE);
                    }
                    this.dispose();
                    setDefault();
                } catch (NoSuchAlgorithmException ex) {
                    Logger.getLogger(ShipperAccount.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InvalidKeySpecException ex) {
                    Logger.getLogger(ShipperAccount.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jButton_UpdateActionPerformed

    private void jLabel_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BackMouseClicked
        setVisible(false);
        setDefault();
    }//GEN-LAST:event_jLabel_BackMouseClicked

    private void setDefault() {
        ShipperDashboard.jPanel5.setBackground(primaryColor);
        ShipperDashboard.jPanel6.setBackground(primaryColor);
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for(double i = 0.1; i <= 1.0; i += 0.1) {
            String s = "" + i;
            float f = Float.parseFloat(s);
            this.setOpacity(f);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(ShipperAccount.class.getName()).log(Level.SEVERE, null, ex);
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

    // event of "Visible" icon
    private void jLabel_Icon_VisibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Icon_VisibleMouseClicked
        jPasswordField1.setEchoChar('\u2022');
        jLabel_Icon_Hide.setVisible(true);
        jLabel_Icon_Visible.setVisible(false);
    }//GEN-LAST:event_jLabel_Icon_VisibleMouseClicked

    // event of "Hide" icon
    private void jLabel_Icon_HideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Icon_HideMouseClicked
        jPasswordField1.setEchoChar((char) 0);
        jLabel_Icon_Hide.setVisible(false);
        jLabel_Icon_Visible.setVisible(true);
    }//GEN-LAST:event_jLabel_Icon_HideMouseClicked

    private void jTextField_ShipperNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ShipperNameKeyTyped
        char input = evt.getKeyChar();
        if(!(input < '0' || input > '9') && input != '\b') {
            evt.consume();
            showAnnouncement("Username doesn't contain any numbers !", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jTextField_ShipperNameKeyTyped

    private void jTextField_PhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PhoneKeyTyped
        if(!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_PhoneKeyTyped

//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ShipperAccount().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Address;
    private javax.swing.JLabel jLabel_Back;
    private javax.swing.JLabel jLabel_Country;
    private javax.swing.JLabel jLabel_Email;
    private javax.swing.JLabel jLabel_Icon_Hide;
    private javax.swing.JLabel jLabel_Icon_Visible;
    private javax.swing.JLabel jLabel_Password;
    private javax.swing.JLabel jLabel_Phone;
    private javax.swing.JLabel jLabel_ShipperID;
    private javax.swing.JLabel jLabel_ShipperName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField_Address;
    private javax.swing.JTextField jTextField_Country;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_Phone;
    private javax.swing.JTextField jTextField_ShipperID;
    private javax.swing.JTextField jTextField_ShipperName;
    // End of variables declaration//GEN-END:variables
}
