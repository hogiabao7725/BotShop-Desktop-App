package View_Admin;

import Chat.Client.Function.Method;
import Chat.Client.RunClient.MainChat;
import DAOs.CurrentLoginsDAO;
import OtherFunction.ChatLoginSystem;
import OtherFunction.IPv4AddressHelper;
import View_User.Login;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AdminDashboard extends javax.swing.JFrame {

    private String role;
    private String email;
    
    CurrentLoginsDAO currentLoginsDAO = new CurrentLoginsDAO();
    
    Color selectionColor = new Color(34, 48, 62);
    Color sideColor = new Color(64, 194, 150);
    int xx, xy;

    public AdminDashboard(String role, String email) {
        this.role = role;
        this.email = email;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel_Content2 = new javax.swing.JLabel();
        jLabel_Logout2 = new javax.swing.JLabel();
        adminEmail = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel_Dashboard = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel_DB_Manage_User = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel_DB_Transaction = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel_DB_Manage_Pro = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel_DB_Manage_Cate = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel_DB_Add_Supp = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel_DB_Manage_Supp = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel_DB_Select_Supp = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel_Statistic = new javax.swing.JLabel();
        jLabel_Total_Cates = new javax.swing.JLabel();
        jLabel_total_Product = new javax.swing.JLabel();
        jLabel_Total_Sales = new javax.swing.JLabel();
        jLabel_Num_Total_Cate = new javax.swing.JLabel();
        jLabel_Num_TT_Product = new javax.swing.JLabel();
        jLabel_Num_TT_Sales = new javax.swing.JLabel();
        jLabel_Total_Users = new javax.swing.JLabel();
        jLabel_Num_TT_Users = new javax.swing.JLabel();
        jLabel_Total_Supp = new javax.swing.JLabel();
        jLabel_Num_TT_Supp = new javax.swing.JLabel();
        jLabel_Total_Today_Sales = new javax.swing.JLabel();
        jLabel_Num_TT_Today_Sales = new javax.swing.JLabel();
        label_chat = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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

        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(35, 166, 97));
        jPanel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel6MouseDragged(evt);
            }
        });
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel6MousePressed(evt);
            }
        });

        jLabel_Content2.setFont(new java.awt.Font("Monotype Corsiva", 0, 48)); // NOI18N
        jLabel_Content2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Content2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/bot.png"))); // NOI18N
        jLabel_Content2.setText("  BotShop");

        jLabel_Logout2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel_Logout2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Logout2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logout (2).png"))); // NOI18N
        jLabel_Logout2.setText("Logout");
        jLabel_Logout2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Logout2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Logout2MouseClicked(evt);
            }
        });

        adminEmail.setFont(new java.awt.Font("Segoe UI Semibold", 0, 22)); // NOI18N
        adminEmail.setForeground(new java.awt.Color(255, 255, 255));
        adminEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/user.png"))); // NOI18N
        adminEmail.setText("admin@gmail.com");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel_Content2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 705, Short.MAX_VALUE)
                .addComponent(adminEmail)
                .addGap(164, 164, 164)
                .addComponent(jLabel_Logout2)
                .addGap(34, 34, 34))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel_Logout2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(adminEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Content2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1610, 80));

        jPanel7.setBackground(new java.awt.Color(76, 98, 146));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(35, 166, 97));

        jLabel_Dashboard.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel_Dashboard.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/dashboard.png"))); // NOI18N
        jLabel_Dashboard.setText("Dashboard");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel_Dashboard)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 350, 80));

        jPanel9.setBackground(new java.awt.Color(76, 98, 146));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_DB_Manage_User.setFont(new java.awt.Font("Segoe UI Semibold", 0, 22)); // NOI18N
        jLabel_DB_Manage_User.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_DB_Manage_User.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_DB_Manage_User.setText("                   Manage Users");
        jLabel_DB_Manage_User.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_DB_Manage_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_DB_Manage_UserMouseClicked(evt);
            }
        });
        jPanel9.add(jLabel_DB_Manage_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 60));

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

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/manage_users.png"))); // NOI18N
        jPanel9.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 50, 60));

        jPanel7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 350, 60));

        jPanel11.setBackground(new java.awt.Color(76, 98, 146));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_DB_Transaction.setFont(new java.awt.Font("Segoe UI Semibold", 0, 22)); // NOI18N
        jLabel_DB_Transaction.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_DB_Transaction.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_DB_Transaction.setText("                   Transaction");
        jLabel_DB_Transaction.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_DB_Transaction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_DB_TransactionMouseClicked(evt);
            }
        });
        jPanel11.add(jLabel_DB_Transaction, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 60));

        jPanel12.setBackground(new java.awt.Color(76, 98, 146));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 60));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/transaction.png"))); // NOI18N
        jPanel11.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 50, 60));

        jPanel7.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 350, 60));

        jPanel13.setBackground(new java.awt.Color(76, 98, 146));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_DB_Manage_Pro.setFont(new java.awt.Font("Segoe UI Semibold", 0, 22)); // NOI18N
        jLabel_DB_Manage_Pro.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_DB_Manage_Pro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_DB_Manage_Pro.setText("                   Manage Products");
        jLabel_DB_Manage_Pro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_DB_Manage_Pro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_DB_Manage_ProMouseClicked(evt);
            }
        });
        jPanel13.add(jLabel_DB_Manage_Pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 60));

        jPanel14.setBackground(new java.awt.Color(76, 98, 146));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 60));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/box.png"))); // NOI18N
        jPanel13.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, 60));

        jPanel7.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 350, 60));

        jPanel16.setBackground(new java.awt.Color(76, 98, 146));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_DB_Manage_Cate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 22)); // NOI18N
        jLabel_DB_Manage_Cate.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_DB_Manage_Cate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_DB_Manage_Cate.setText("                   Manage Categories");
        jLabel_DB_Manage_Cate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_DB_Manage_Cate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_DB_Manage_CateMouseClicked(evt);
            }
        });
        jPanel16.add(jLabel_DB_Manage_Cate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 60));

        jPanel17.setBackground(new java.awt.Color(76, 98, 146));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel16.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 60));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/categories.png"))); // NOI18N
        jPanel16.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 50, 60));

        jPanel7.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 350, 60));

        jPanel18.setBackground(new java.awt.Color(76, 98, 146));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_DB_Add_Supp.setFont(new java.awt.Font("Segoe UI Semibold", 0, 22)); // NOI18N
        jLabel_DB_Add_Supp.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_DB_Add_Supp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_DB_Add_Supp.setText("                   Add Shipper");
        jLabel_DB_Add_Supp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_DB_Add_Supp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_DB_Add_SuppMouseClicked(evt);
            }
        });
        jPanel18.add(jLabel_DB_Add_Supp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 60));

        jPanel19.setBackground(new java.awt.Color(76, 98, 146));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel18.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 60));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/delivery-man (1).png"))); // NOI18N
        jPanel18.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 50, 60));

        jPanel7.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 350, 60));

        jPanel20.setBackground(new java.awt.Color(76, 98, 146));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_DB_Manage_Supp.setFont(new java.awt.Font("Segoe UI Semibold", 0, 22)); // NOI18N
        jLabel_DB_Manage_Supp.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_DB_Manage_Supp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_DB_Manage_Supp.setText("                   Manage Shippers");
        jLabel_DB_Manage_Supp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_DB_Manage_Supp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_DB_Manage_SuppMouseClicked(evt);
            }
        });
        jPanel20.add(jLabel_DB_Manage_Supp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 60));

        jPanel21.setBackground(new java.awt.Color(76, 98, 146));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel20.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 60));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/manage_users.png"))); // NOI18N
        jPanel20.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 50, 60));

        jPanel7.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 350, 60));

        jPanel22.setBackground(new java.awt.Color(76, 98, 146));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_DB_Select_Supp.setFont(new java.awt.Font("Segoe UI Semibold", 0, 22)); // NOI18N
        jLabel_DB_Select_Supp.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_DB_Select_Supp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_DB_Select_Supp.setText("                   Select Shipper");
        jLabel_DB_Select_Supp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_DB_Select_Supp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_DB_Select_SuppMouseClicked(evt);
            }
        });
        jPanel22.add(jLabel_DB_Select_Supp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 60));

        jPanel23.setBackground(new java.awt.Color(76, 98, 146));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel22.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 60));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Select_Supplier.png"))); // NOI18N
        jPanel22.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 50, 60));

        jPanel7.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 350, 60));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 350, 870));

        jPanel15.setBackground(new java.awt.Color(204, 204, 204));
        jPanel15.setForeground(new java.awt.Color(0, 0, 0));

        jLabel_Statistic.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel_Statistic.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Statistic.setText("Statistics");

        jLabel_Total_Cates.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel_Total_Cates.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Total_Cates.setText("Total Categories : ");

        jLabel_total_Product.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel_total_Product.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_total_Product.setText("Total Products : ");

        jLabel_Total_Sales.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel_Total_Sales.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Total_Sales.setText("Total Sales : ");

        jLabel_Num_Total_Cate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel_Num_Total_Cate.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Num_Total_Cate.setText("0");

        jLabel_Num_TT_Product.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel_Num_TT_Product.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Num_TT_Product.setText("0");

        jLabel_Num_TT_Sales.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel_Num_TT_Sales.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Num_TT_Sales.setText("0");

        jLabel_Total_Users.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel_Total_Users.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Total_Users.setText("Total Users : ");

        jLabel_Num_TT_Users.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel_Num_TT_Users.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Num_TT_Users.setText("0");

        jLabel_Total_Supp.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel_Total_Supp.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Total_Supp.setText("Total Shipper : ");

        jLabel_Num_TT_Supp.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel_Num_TT_Supp.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Num_TT_Supp.setText("0");

        jLabel_Total_Today_Sales.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel_Total_Today_Sales.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Total_Today_Sales.setText("Today Sales : ");

        jLabel_Num_TT_Today_Sales.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel_Num_TT_Today_Sales.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Num_TT_Today_Sales.setText("0");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Statistic)
                .addGap(341, 341, 341))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel_Total_Cates)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_Num_Total_Cate, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel_total_Product)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_Num_TT_Product, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel_Total_Supp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Num_TT_Supp, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel_Total_Users)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Num_TT_Users, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel_Total_Sales)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel_Num_TT_Sales, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel_Total_Today_Sales)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Num_TT_Today_Sales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel_Statistic)
                .addGap(33, 33, 33)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_Total_Users)
                        .addComponent(jLabel_Num_TT_Users))
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_Total_Cates)
                        .addComponent(jLabel_Total_Sales)
                        .addComponent(jLabel_Num_Total_Cate)
                        .addComponent(jLabel_Num_TT_Sales)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_Total_Today_Sales)
                        .addComponent(jLabel_Num_TT_Today_Sales))
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_Total_Supp)
                        .addComponent(jLabel_Num_TT_Supp))
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_total_Product)
                        .addComponent(jLabel_Num_TT_Product)))
                .addGap(41, 41, 41))
        );

        jPanel5.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 930, 230));

        label_chat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/chat.png"))); // NOI18N
        label_chat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_chat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_chatMouseClicked(evt);
            }
        });
        jPanel5.add(label_chat, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 760, 130, 140));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Chatting With People");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 710, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jLabel_Logout2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Logout2MouseClicked
        int event = JOptionPane.showConfirmDialog(this, "Do you want to Logout now ?", "Logout", JOptionPane.YES_NO_OPTION);
        if (event == 0) {
            if(currentLoginsDAO.delete(role, email)) {
                System.out.println("The user with Role = \""+ role + "\" and Email = \"" + email + "\" has logged out.");
            } else {
                System.out.println("Logout Error !");
            }
            new Login().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jLabel_Logout2MouseClicked

    //BEGIN======================= Effects and functions of "Admin DashBoard" ============================//
    private void jLabel_DB_Manage_CateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_DB_Manage_CateMouseClicked
        jPanel16.setBackground(selectionColor);
        jPanel17.setBackground(sideColor);
        ManageCategory manageCategory = new ManageCategory();
        manageCategory.setVisible(true);
        manageCategory.pack();
    }//GEN-LAST:event_jLabel_DB_Manage_CateMouseClicked

    private void jLabel_DB_Manage_ProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_DB_Manage_ProMouseClicked
        jPanel13.setBackground(selectionColor);
        jPanel14.setBackground(sideColor);
        ManageProduct manageProduct = new ManageProduct();
        manageProduct.setVisible(true);
        manageProduct.pack();
    }//GEN-LAST:event_jLabel_DB_Manage_ProMouseClicked

    private void jLabel_DB_Manage_UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_DB_Manage_UserMouseClicked
        jPanel9.setBackground(selectionColor);
        jPanel10.setBackground(sideColor);
        ManageUsers manageUsers = new ManageUsers();
        manageUsers.setVisible(true);
        manageUsers.pack();
    }//GEN-LAST:event_jLabel_DB_Manage_UserMouseClicked

    private void jLabel_DB_Add_SuppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_DB_Add_SuppMouseClicked
        jPanel18.setBackground(selectionColor);
        jPanel19.setBackground(sideColor);
        AddShipper addSupplier = new AddShipper();
        addSupplier.setVisible(true);
        addSupplier.pack();
    }//GEN-LAST:event_jLabel_DB_Add_SuppMouseClicked

    private void jLabel_DB_Manage_SuppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_DB_Manage_SuppMouseClicked
        jPanel20.setBackground(selectionColor);
        jPanel21.setBackground(sideColor);
        ManageShippers manageSuppliers = new ManageShippers();
        manageSuppliers.setVisible(true);
        manageSuppliers.pack();
    }//GEN-LAST:event_jLabel_DB_Manage_SuppMouseClicked

    private void jLabel_DB_Select_SuppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_DB_Select_SuppMouseClicked
        jPanel22.setBackground(selectionColor);
        jPanel23.setBackground(sideColor);
        SelectShipper selectSupplier = new SelectShipper();
        selectSupplier.setVisible(true);
        selectSupplier.pack();
    }//GEN-LAST:event_jLabel_DB_Select_SuppMouseClicked

    private void jLabel_DB_TransactionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_DB_TransactionMouseClicked
        jPanel11.setBackground(selectionColor);
        jPanel12.setBackground(sideColor);
        Transaction transaction = new Transaction();
        transaction.setVisible(true);
        transaction.pack();
    }//GEN-LAST:event_jLabel_DB_TransactionMouseClicked
    //END======================= Effects and functions of "Admin DashBoard" ============================//

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.1; i <= 1.0; i += 0.1) {
            String s = "" + i;
            float f = Float.parseFloat(s);
            this.setOpacity(f);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jPanel6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel6MouseDragged

    private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel6MousePressed

    private void label_chatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_chatMouseClicked
        ImageIcon profile_pic = new ImageIcon(getClass().getResource("/Icons/bot.png"));
        try {
            String userName = "Admin";
            String role = "Admin";
            String email = adminEmail.getText();
            
            ChatLoginSystem.ChatUser admin = new ChatLoginSystem.ChatUser(role, email);

            if(!ChatLoginSystem.isUserActive(admin)) {
                // Lấy địa chỉ IP, ở đây mặc định là localhost
            String IP = IPv4AddressHelper.getIPv4Address();

            // Kết nối và hiển thị trang chat
            Method.connect(profile_pic, userName, IP);
            MainChat main = new MainChat(role, email);
            main.main(null);
            // Đóng giao diện đăng nhập nếu cần thiết
            // this.dispose();
            
            ChatLoginSystem.addActiveUser(admin);
            
            } else {
                JOptionPane.showMessageDialog(this, "You are in the \"Chat\" group", "Warning", JOptionPane.WARNING_MESSAGE);
            }

        } catch (Exception e) {
            e.printStackTrace();
            //showStatus("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_label_chatMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        currentLoginsDAO.delete(role, email);
    }//GEN-LAST:event_formWindowClosing

//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AdminDashboard().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel adminEmail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Content2;
    private javax.swing.JLabel jLabel_DB_Add_Supp;
    private javax.swing.JLabel jLabel_DB_Manage_Cate;
    private javax.swing.JLabel jLabel_DB_Manage_Pro;
    private javax.swing.JLabel jLabel_DB_Manage_Supp;
    private javax.swing.JLabel jLabel_DB_Manage_User;
    private javax.swing.JLabel jLabel_DB_Select_Supp;
    private javax.swing.JLabel jLabel_DB_Transaction;
    private javax.swing.JLabel jLabel_Dashboard;
    private javax.swing.JLabel jLabel_Logout2;
    public static javax.swing.JLabel jLabel_Num_TT_Product;
    public static javax.swing.JLabel jLabel_Num_TT_Sales;
    public static javax.swing.JLabel jLabel_Num_TT_Supp;
    public static javax.swing.JLabel jLabel_Num_TT_Today_Sales;
    public static javax.swing.JLabel jLabel_Num_TT_Users;
    public static javax.swing.JLabel jLabel_Num_Total_Cate;
    private javax.swing.JLabel jLabel_Statistic;
    private javax.swing.JLabel jLabel_Total_Cates;
    private javax.swing.JLabel jLabel_Total_Sales;
    private javax.swing.JLabel jLabel_Total_Supp;
    private javax.swing.JLabel jLabel_Total_Today_Sales;
    private javax.swing.JLabel jLabel_Total_Users;
    private javax.swing.JLabel jLabel_total_Product;
    public static javax.swing.JPanel jPanel10;
    public static javax.swing.JPanel jPanel11;
    public static javax.swing.JPanel jPanel12;
    public static javax.swing.JPanel jPanel13;
    public static javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    public static javax.swing.JPanel jPanel16;
    public static javax.swing.JPanel jPanel17;
    public static javax.swing.JPanel jPanel18;
    public static javax.swing.JPanel jPanel19;
    public static javax.swing.JPanel jPanel20;
    public static javax.swing.JPanel jPanel21;
    public static javax.swing.JPanel jPanel22;
    public static javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    public static javax.swing.JPanel jPanel9;
    private javax.swing.JLabel label_chat;
    // End of variables declaration//GEN-END:variables
}
