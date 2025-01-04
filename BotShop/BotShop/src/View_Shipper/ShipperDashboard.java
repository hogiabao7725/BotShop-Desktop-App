package View_Shipper;

import Chat.Client.Function.Method;
import OtherFunction.ChatLoginSystem;
import Chat.Client.RunClient.MainChat;
import DAOs.CurrentLoginsDAO;
import DAOs.ShipperDAO;
import OtherFunction.IPv4AddressHelper;
import View_User.Login;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ShipperDashboard extends javax.swing.JFrame {

    private String role;
    private String email;
    
    CurrentLoginsDAO currentLoginsDAO = new CurrentLoginsDAO();
    
    Color selectionColor = new Color(34, 48, 62);
    Color sideColor = new Color(64, 194, 150);
    int xx, xy;
    
    ShipperDAO shipperDAO = new ShipperDAO();
    
    public ShipperDashboard(String role, String email) {
        this.role = role;
        this.email = email;
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_Content = new javax.swing.JLabel();
        jLabel_Logout = new javax.swing.JLabel();
        shipperEmail = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel_Dashboard = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel_DB_My_Account = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel_DB_Delivery = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel_DB_MyDeliveries = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel_Statistic = new javax.swing.JLabel();
        jLabel_Total_Cates = new javax.swing.JLabel();
        jLabel_Total_Deliveries = new javax.swing.JLabel();
        label_chat = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(35, 166, 97));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel_Content.setFont(new java.awt.Font("Monotype Corsiva", 0, 48)); // NOI18N
        jLabel_Content.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Content.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/bot.png"))); // NOI18N
        jLabel_Content.setText("  BotShop");

        jLabel_Logout.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel_Logout.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logout (2).png"))); // NOI18N
        jLabel_Logout.setText("Logout");
        jLabel_Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_LogoutMouseClicked(evt);
            }
        });

        shipperEmail.setFont(new java.awt.Font("Segoe UI Semibold", 0, 22)); // NOI18N
        shipperEmail.setForeground(new java.awt.Color(255, 255, 255));
        shipperEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/user.png"))); // NOI18N
        shipperEmail.setText("supplier@gmail.com");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel_Content, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 700, Short.MAX_VALUE)
                .addComponent(shipperEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel_Logout)
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(shipperEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel_Content, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1610, 80));

        jPanel3.setBackground(new java.awt.Color(76, 98, 146));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(35, 166, 97));

        jLabel_Dashboard.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel_Dashboard.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/dashboard.png"))); // NOI18N
        jLabel_Dashboard.setText("Dashboard");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel_Dashboard)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 350, 80));

        jPanel5.setBackground(new java.awt.Color(76, 98, 146));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_DB_My_Account.setFont(new java.awt.Font("Segoe UI Semibold", 0, 22)); // NOI18N
        jLabel_DB_My_Account.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_DB_My_Account.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_DB_My_Account.setText("                   My Account");
        jLabel_DB_My_Account.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_DB_My_Account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_DB_My_AccountMouseClicked(evt);
            }
        });
        jPanel5.add(jLabel_DB_My_Account, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 60));

        jPanel6.setBackground(new java.awt.Color(76, 98, 146));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 60));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/delivery-man.png"))); // NOI18N
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 50, 60));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 350, 60));

        jPanel7.setBackground(new java.awt.Color(76, 98, 146));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_DB_Delivery.setFont(new java.awt.Font("Segoe UI Semibold", 0, 22)); // NOI18N
        jLabel_DB_Delivery.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_DB_Delivery.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_DB_Delivery.setText("                   Delivery");
        jLabel_DB_Delivery.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_DB_Delivery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_DB_DeliveryMouseClicked(evt);
            }
        });
        jPanel7.add(jLabel_DB_Delivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 60));

        jPanel8.setBackground(new java.awt.Color(76, 98, 146));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 60));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/fast-delivery.png"))); // NOI18N
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 50, 60));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 350, 60));

        jPanel9.setBackground(new java.awt.Color(76, 98, 146));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_DB_MyDeliveries.setFont(new java.awt.Font("Segoe UI Semibold", 0, 22)); // NOI18N
        jLabel_DB_MyDeliveries.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_DB_MyDeliveries.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_DB_MyDeliveries.setText("                   My Deliveries");
        jLabel_DB_MyDeliveries.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_DB_MyDeliveries.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_DB_MyDeliveriesMouseClicked(evt);
            }
        });
        jPanel9.add(jLabel_DB_MyDeliveries, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 60));

        jPanel10.setBackground(new java.awt.Color(76, 98, 146));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 60));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/details.png"))); // NOI18N
        jPanel9.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, 60));

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 350, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("----------------------------------------------------------");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 180, -1, 0));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 350, 870));

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));
        jPanel11.setForeground(new java.awt.Color(0, 0, 0));

        jLabel_Statistic.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel_Statistic.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Statistic.setText("My Statistics");

        jLabel_Total_Cates.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel_Total_Cates.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Total_Cates.setText("My Deliveries : ");

        jLabel_Total_Deliveries.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel_Total_Deliveries.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Total_Deliveries.setText("0");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(363, Short.MAX_VALUE)
                .addComponent(jLabel_Statistic)
                .addGap(341, 341, 341))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel_Total_Cates, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_Total_Deliveries, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel_Statistic)
                .addGap(33, 33, 33)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Total_Cates)
                    .addComponent(jLabel_Total_Deliveries))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 910, 230));

        label_chat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/chat.png"))); // NOI18N
        label_chat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_chat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_chatMouseClicked(evt);
            }
        });
        jPanel1.add(label_chat, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 760, 130, 140));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Chatting With People");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 710, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // event of "Logout" label
    private void jLabel_LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_LogoutMouseClicked
        int event = JOptionPane.showConfirmDialog(this, "Do you want to Logout now ?", "Logout", JOptionPane.YES_NO_OPTION);
        if(event == 0) {
            if(currentLoginsDAO.delete(role, email)) {
                System.out.println("The user with Role = \""+ role + "\" and Email = \"" + email + "\" has logged out.");
            } else {
                System.out.println("Logout Error !");
            }
            new Login().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jLabel_LogoutMouseClicked

    //BEGIN======================= Effects and functions of "Supplier DashBoard" ============================//
    private void jLabel_DB_DeliveryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_DB_DeliveryMouseClicked
        jPanel7.setBackground(selectionColor);
        jPanel8.setBackground(sideColor);
        Delivery delivery = new Delivery();
        delivery.setVisible(true);
        delivery.pack();
    }//GEN-LAST:event_jLabel_DB_DeliveryMouseClicked

    private void jLabel_DB_MyDeliveriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_DB_MyDeliveriesMouseClicked
        jPanel9.setBackground(selectionColor);
        jPanel10.setBackground(sideColor);
        MyDeliveries myDeliveries = new MyDeliveries();
        myDeliveries.setVisible(true);
        myDeliveries.pack();
    }//GEN-LAST:event_jLabel_DB_MyDeliveriesMouseClicked

    private void jLabel_DB_My_AccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_DB_My_AccountMouseClicked
        jPanel5.setBackground(selectionColor);
        jPanel6.setBackground(sideColor);
        ShipperAccount supplierAccount = new ShipperAccount();
        supplierAccount.setVisible(true);
        supplierAccount.pack();
    }//GEN-LAST:event_jLabel_DB_My_AccountMouseClicked
    //END======================= Effects and functions of "Supplier DashBoard" ============================//
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for(double i = 0.1; i <= 1.0; i += 0.1) {
            String s = "" + i;
            float f = Float.parseFloat(s);
            this.setOpacity(f);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(ShipperDashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void label_chatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_chatMouseClicked
        ImageIcon profile_pic = new ImageIcon(getClass().getResource("/Icons/delivery-man.png"));
        try {
            String role = "Shipper";
            String email = ShipperDashboard.shipperEmail.getText();
            String userName = shipperDAO.getShipperName(email);

            ChatLoginSystem.ChatUser shipper = new ChatLoginSystem.ChatUser(role, email);

            if(!ChatLoginSystem.isUserActive(shipper)) {
                // Lấy địa chỉ IP, ở đây mặc định là localhost
            String IP = IPv4AddressHelper.getIPv4Address();

            // Kết nối và hiển thị trang chat
            Method.connect(profile_pic, userName, IP);
            MainChat main = new MainChat(role, email);
            main.main(null);
            // Đóng giao diện đăng nhập nếu cần thiết
            // this.dispose();
            
            ChatLoginSystem.addActiveUser(shipper);
            
            } else {
                JOptionPane.showMessageDialog(this, "You are in the \"Chat\" group", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
//            showStatus("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_label_chatMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        currentLoginsDAO.delete(role, email);
    }//GEN-LAST:event_formWindowClosing
    
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ShipperDashboard().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Content;
    private javax.swing.JLabel jLabel_DB_Delivery;
    private javax.swing.JLabel jLabel_DB_MyDeliveries;
    private javax.swing.JLabel jLabel_DB_My_Account;
    private javax.swing.JLabel jLabel_Dashboard;
    private javax.swing.JLabel jLabel_Logout;
    private javax.swing.JLabel jLabel_Statistic;
    private javax.swing.JLabel jLabel_Total_Cates;
    public static javax.swing.JLabel jLabel_Total_Deliveries;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JPanel jPanel5;
    public static javax.swing.JPanel jPanel6;
    public static javax.swing.JPanel jPanel7;
    public static javax.swing.JPanel jPanel8;
    public static javax.swing.JPanel jPanel9;
    private javax.swing.JLabel label_chat;
    public static javax.swing.JLabel shipperEmail;
    // End of variables declaration//GEN-END:variables
}
