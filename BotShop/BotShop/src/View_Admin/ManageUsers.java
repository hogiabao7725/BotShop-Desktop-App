package View_Admin;

import Controller.UserController;
import DAOs.StatisticDAO;
import DAOs.UserDAO;
import Model.User;
import OtherFunction.PasswordHashingService;
import java.awt.Color;
import java.awt.Font;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManageUsers extends javax.swing.JFrame {

    UserDAO userDAO = new UserDAO();
    UserController userController = new UserController();
    StatisticDAO statisticDAO = new StatisticDAO();

    JLabel announcement = new JLabel(); // Used to display the content of the NOTIFICATION
    Color primaryColor = new Color(76, 98, 146);

    DefaultTableModel model;
    int rowIndex;

    int xx, xy;

    public ManageUsers() {
        initComponents();
        setLocation(710, 40);
        init();
    }

    private void init() {
        usersTable();
        announcement.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
        jLabel_Icon_Visible.setVisible(false);
        jLabel_Icon_Hide.setVisible(true);
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
        jButton_Clear = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField_Search = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
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
        jLabel1.setText("Manage Users");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 360, -1));

        jTextField_Phone.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Phone.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTextField_Phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_PhoneKeyTyped(evt);
            }
        });
        jPanel1.add(jTextField_Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 350, 50));

        jTextField_UserID.setEditable(false);
        jTextField_UserID.setBackground(new java.awt.Color(153, 153, 153));
        jTextField_UserID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel1.add(jTextField_UserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 350, 50));

        jTextField_Ser_Ques.setEditable(false);
        jTextField_Ser_Ques.setBackground(new java.awt.Color(153, 153, 153));
        jTextField_Ser_Ques.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel1.add(jTextField_Ser_Ques, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 350, 50));

        jTextField_Address.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Address.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel1.add(jTextField_Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 350, 50));

        jTextField_Country.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Country.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel1.add(jTextField_Country, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 350, 50));

        jLabel_Phone.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Phone.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Phone.setText("Phone");
        jPanel1.add(jLabel_Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        jLabel_Secu_Ques.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Secu_Ques.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Secu_Ques.setText("Security Question");
        jPanel1.add(jLabel_Secu_Ques, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 160, -1));

        jLabel_Answer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Answer.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Answer.setText("Answer");
        jPanel1.add(jLabel_Answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 100, -1));

        jLabel_Address.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Address.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Address.setText("Address");
        jPanel1.add(jLabel_Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, -1, -1));

        jLabel_Country.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Country.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Country.setText("Country");
        jPanel1.add(jLabel_Country, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, -1, -1));

        jLabel_Username.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Username.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Username.setText("Username");
        jPanel1.add(jLabel_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 100, -1));

        jTextField_Username.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Username.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTextField_Username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_UsernameKeyTyped(evt);
            }
        });
        jPanel1.add(jTextField_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 350, 50));

        jTextField_Email.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Email.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel1.add(jTextField_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 350, 50));

        jLabel_Email.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Email.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Email.setText("Email");
        jPanel1.add(jLabel_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel_Password.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Password.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Password.setText("Password");
        jPanel1.add(jLabel_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

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
        jPanel1.add(jButton_Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 520, 170, 70));

        jLabel_Back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/turn-back.png"))); // NOI18N
        jLabel_Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_BackMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 60, 60));

        jLabel_UserID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_UserID.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_UserID.setText("User ID");
        jPanel1.add(jLabel_UserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 70, -1));

        jLabel_Icon_Visible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/visible.png"))); // NOI18N
        jLabel_Icon_Visible.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Icon_Visible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Icon_VisibleMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel_Icon_Visible, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, -1, -1));

        jLabel_Icon_Hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/hide.png"))); // NOI18N
        jLabel_Icon_Hide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Icon_Hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Icon_HideMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel_Icon_Hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, -1, -1));

        jTextField_Answer.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Answer.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel1.add(jTextField_Answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 350, 50));

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
        jPanel1.add(jButton_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 520, 170, 70));

        jButton_Clear.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Clear.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jButton_Clear.setForeground(new java.awt.Color(35, 166, 97));
        jButton_Clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/clear.png"))); // NOI18N
        jButton_Clear.setText("Clear");
        jButton_Clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClearActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 610, 350, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI Variable", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("___________________________________________________");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 660, 680, 40));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "User Name", "Email", "Password", "Phone", "Security Question", "Answer", "Address", "Country"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 770, 860, 270));

        jTextField_Search.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Search.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTextField_Search.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_SearchKeyReleased(evt);
            }
        });
        jPanel1.add(jTextField_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 710, 330, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Search");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 720, -1, -1));

        jPasswordField1.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 350, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1053, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void showAnnouncement(String text, String title, int messageType) {
        announcement.setText(text);
        JOptionPane.showMessageDialog(this, announcement, title, messageType);
    }

    private void usersTable() {
        setInformationUsersTable("");
        jTable1.setRowHeight(30);
        jTable1.setShowGrid(true);
        jTable1.setGridColor(Color.BLACK);
        jTable1.setBackground(Color.WHITE);
        jTable1.setSelectionBackground(Color.LIGHT_GRAY);
    }

    private void setInformationUsersTable(String text) {
        model = (DefaultTableModel) jTable1.getModel();
        ArrayList<User> result = userController.getAllUsers(text);
        Object[] row;
        for (var user : result) {
            row = new Object[9];
            row[0] = user.getUID();
            row[1] = user.getUName();
            row[2] = user.getUEmail();
            row[3] = user.getUPassword();
            row[4] = user.getUPhone();
            row[5] = user.getUSecuQues();
            row[6] = user.getUAnswer();
            row[7] = user.getUAddress();
            row[8] = user.getUCountry();
            model.addRow(row);
        }
    }

    public boolean isEmpty() {
        if (jTextField_UserID.getText().isEmpty()) {
            announcement.setText("Please select a User !");
            JOptionPane.showMessageDialog(this, announcement, "Warning", 2);
            return false;
        }
        if (jTextField_Username.getText().isEmpty()) {
            announcement.setText("Username is empty !");
            JOptionPane.showMessageDialog(this, announcement, "Warning", 2);
            return false;
        }
        if (jTextField_Email.getText().isEmpty()) {
            announcement.setText("Email address is empty !");
            JOptionPane.showMessageDialog(this, announcement, "Warning", 2);
            return false;
        }
        if (!jTextField_Email.getText().matches("^[a-zA-Z0-9._%+-]+@gmail\\.com$")) {
            announcement.setText("Invalid Email Address");
            JOptionPane.showMessageDialog(this, announcement, "Warning", 2);
            return false;
        }
        if (jTextField_Phone.getText().isEmpty()) {
            announcement.setText("Phone number is empty !");
            JOptionPane.showMessageDialog(this, announcement, "Warning", 2);
            return false;
        }
        if (jTextField_Phone.getText().length() != 10) {
            announcement.setText("Phone number includes 10 digits !");
            JOptionPane.showMessageDialog(this, announcement, "Warning", 2);
            return false;
        }
        if (jTextField_Answer.getText().isEmpty()) {
            announcement.setText("Security Answer is empty !");
            JOptionPane.showMessageDialog(this, announcement, "Warning", 2);
            return false;
        }
        if (jTextField_Address.getText().isEmpty()) {
            announcement.setText("Address is empty !");
            JOptionPane.showMessageDialog(this, announcement, "Warning", 2);
            return false;
        }
        if (jTextField_Country.getText().isEmpty()) {
            announcement.setText("Country is empty !");
            JOptionPane.showMessageDialog(this, announcement, "Warning", 2);
            return false;
        }
        return true;
    }

    private boolean check() {
        String newEmail = jTextField_Email.getText();
        String newPhone = jTextField_Phone.getText();
        String oldEmail = model.getValueAt(rowIndex, 2).toString();
        String oldPhone = model.getValueAt(rowIndex, 4).toString();

        if (newEmail.equals(oldEmail) && newPhone.equals(oldPhone)) {
            return false;
        } else {
            if (!newEmail.equals(oldEmail)) {
                boolean x = userDAO.isEmailExist(newEmail);
                if (x) {
                    announcement.setText("This email already exist");
                    JOptionPane.showMessageDialog(this, announcement, "Warning", 2);
                }
                return x;
            }
            if (!newPhone.equals(oldPhone)) {
                boolean x = userDAO.isPhoneNumberExist(newPhone);
                if (x) {
                    announcement.setText("This Phone number already exist");
                    JOptionPane.showMessageDialog(this, announcement, "Warning", 2);
                }
                return x;
            }
        }
        return false;
    }

    private void clear() {
        jTextField_UserID.setText("");
        jTextField_Username.setText("");
        jTextField_Email.setText("");
        jPasswordField1.setText("");
        jTextField_Phone.setText("");
        jTextField_Ser_Ques.setText("");
        jTextField_Answer.setText("");
        jTextField_Address.setText("");
        jTextField_Country.setText("");
        statisticDAO.admin();
    }

    // event of "Delete" button
    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed
        if (isEmpty()) {
            announcement.setText("Are you sure to delete this Account ?");
            int x = JOptionPane.showConfirmDialog(this, announcement, "Delete", JOptionPane.OK_CANCEL_OPTION, 0);
            int userID = Integer.parseInt(jTextField_UserID.getText());
            if (x == JOptionPane.OK_OPTION) {
                showAnnouncement("Delete Successful", "Delete Account", JOptionPane.INFORMATION_MESSAGE);
                userDAO.delete(userID);
                jTable1.setModel(new DefaultTableModel(null, new Object[]{"User ID", "User Name", "Email", "Password", "Phone", "Security Question",
                    "Answer", "Address", "Country"}));
                setInformationUsersTable("");
                clear();

            }
        }
    }//GEN-LAST:event_jButton_DeleteActionPerformed

    // event of "Update" button
    private void jButton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateActionPerformed
        if (isEmpty()) {
            if (!check()) {
                int id = Integer.parseInt(jTextField_UserID.getText());
                String userName = jTextField_Username.getText();
                String email = jTextField_Email.getText();
                String password = String.valueOf(jPasswordField1.getPassword()).toString();
                String phone = jTextField_Phone.getText();
                String secuQues = jTextField_Ser_Ques.getText();
                String ans = jTextField_Answer.getText();
                String address = jTextField_Address.getText();
                String country = jTextField_Country.getText();

                if (String.valueOf(jPasswordField1.getPassword()).toString().isEmpty()) {
                    if (userDAO.updateUserWithoutPassword(id, userName, email, phone, secuQues, ans, address, country)) {
                        showAnnouncement("User data successfully updated without changing password.", "Update Successful", JOptionPane.INFORMATION_MESSAGE);
                        jTable1.setModel(new DefaultTableModel(null, new Object[]{"User ID", "User Name", "Email", "Password", "Phone", "Security Question",
                            "Answer", "Address", "Country"}));
                        setInformationUsersTable("");
                        clear();
                    } else {
                        showAnnouncement("Error updating user data", "Update Error", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    try {
                        String hashedPassword = PasswordHashingService.generatePasswordHash(password);
                        if (userDAO.update(id, userName, email, hashedPassword, phone, secuQues, ans, address, country)) {
                            showAnnouncement("Update Successful", "Update Successful", JOptionPane.INFORMATION_MESSAGE);
                            jTable1.setModel(new DefaultTableModel(null, new Object[]{"User ID", "User Name", "Email", "Password", "Phone", "Security Question",
                                "Answer", "Address", "Country"}));
                            setInformationUsersTable("");
                            clear();
                        }
                    } catch (NoSuchAlgorithmException ex) {
                        Logger.getLogger(ManageUsers.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (InvalidKeySpecException ex) {
                        Logger.getLogger(ManageUsers.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton_UpdateActionPerformed

    // event of "Clear" button
    private void jButton_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClearActionPerformed
        clear();
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"User ID", "User Name", "Email", "Password", "Phone", "Security Question",
            "Answer", "Address", "Country"}));
        setInformationUsersTable("");
    }//GEN-LAST:event_jButton_ClearActionPerformed

    private void jLabel_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BackMouseClicked
        setVisible(false);
        AdminDashboard.jPanel9.setBackground(primaryColor);
        AdminDashboard.jPanel10.setBackground(primaryColor);
    }//GEN-LAST:event_jLabel_BackMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.1; i <= 1.0; i += 0.1) {
            String s = "" + i;
            float f = Float.parseFloat(s);
            this.setOpacity(f);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(ManageUsers.class.getName()).log(Level.SEVERE, null, ex);
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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        model = (DefaultTableModel) jTable1.getModel();
        rowIndex = jTable1.getSelectedRow();
        jTextField_UserID.setText(model.getValueAt(rowIndex, 0).toString());
        jTextField_Username.setText(model.getValueAt(rowIndex, 1).toString());
        jTextField_Email.setText(model.getValueAt(rowIndex, 2).toString());
        jPasswordField1.setText("");
        jTextField_Phone.setText(model.getValueAt(rowIndex, 4).toString());
        jTextField_Ser_Ques.setText(model.getValueAt(rowIndex, 5).toString());
        jTextField_Answer.setText(model.getValueAt(rowIndex, 6).toString());
        jTextField_Address.setText(model.getValueAt(rowIndex, 7).toString());
        jTextField_Country.setText(model.getValueAt(rowIndex, 8).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField_UsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_UsernameKeyTyped
        char input = evt.getKeyChar();
        if (!(input < '0' || input > '9') && input != '\b') {
            evt.consume();
            announcement.setText("Username doesn't contain any numbers !");
            JOptionPane.showMessageDialog(this, announcement, "Warning", 2);
        }
    }//GEN-LAST:event_jTextField_UsernameKeyTyped


    private void jTextField_PhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PhoneKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_PhoneKeyTyped

    // event of "Search" jTextField
    private void jTextField_SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_SearchKeyReleased
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"User ID", "User Name", "Email", "Password", "Phone", "Security Question",
            "Answer", "Address", "Country"}));
        setInformationUsersTable(jTextField_Search.getText());
    }//GEN-LAST:event_jTextField_SearchKeyReleased

//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ManageUsers().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Clear;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_Address;
    private javax.swing.JTextField jTextField_Answer;
    private javax.swing.JTextField jTextField_Country;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_Phone;
    private javax.swing.JTextField jTextField_Search;
    private javax.swing.JTextField jTextField_Ser_Ques;
    private javax.swing.JTextField jTextField_UserID;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables
}
