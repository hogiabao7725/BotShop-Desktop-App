package View_User;

import Controller.PurchaseDetailsController;
import DAOs.ProductDAO;
import DAOs.PurchaseDAO;
import DAOs.ShipperDAO;
import DAOs.StatisticDAO;
import DAOs.UserDAO;
import java.awt.Color;
import java.awt.Font;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PurchaseDetail extends javax.swing.JFrame {

    StatisticDAO statisticDAO = new StatisticDAO();
    UserDAO userDAO = new UserDAO();
    PurchaseDAO purchaseDAO = new PurchaseDAO();
    ProductDAO productDAO = new ProductDAO();
    ShipperDAO shipperDAO = new ShipperDAO();
    PurchaseDetailsController pdc = new PurchaseDetailsController();
    
    JLabel announcement = new JLabel();
    Color primaryColor = new Color(76,98,146);
    
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
    Date date = new Date();
    
    DefaultTableModel model;
    int rowIndex;
    int xx, xy;
    
    private int uID; // ID of User
    
    public PurchaseDetail() {
        initComponents();
        setLocation(560, 250);
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_Back = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField_Search = new javax.swing.JTextField();
        jButton_Clear = new javax.swing.JButton();
        jButton_Refund = new javax.swing.JButton();
        jTextField_PurchaseID = new javax.swing.JTextField();
        jTextField_CurDate = new javax.swing.JTextField();
        jLabel_CurDate = new javax.swing.JLabel();
        jLabel_ProdcutID = new javax.swing.JLabel();
        jLabel_ReceiDate = new javax.swing.JLabel();
        jLabel_Search = new javax.swing.JLabel();
        jTextField_ReceiDate = new javax.swing.JTextField();

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

        jLabel_Back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/turn-back.png"))); // NOI18N
        jLabel_Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_BackMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, 70, 60));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Purchase ID", "Product ID", "Product Name", "Quantity", "Price", "Total", "Purchase Date", "Received Date", "Supplier Name", "Status   "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 730, 570));

        jTextField_Search.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Search.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTextField_Search.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_SearchKeyReleased(evt);
            }
        });
        jPanel1.add(jTextField_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, 390, 50));

        jButton_Clear.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Clear.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jButton_Clear.setForeground(new java.awt.Color(35, 166, 97));
        jButton_Clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/clear.png"))); // NOI18N
        jButton_Clear.setText(" Clear");
        jButton_Clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Clear.setMargin(new java.awt.Insets(2, 0, 3, 64));
        jButton_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClearActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 310, 70));

        jButton_Refund.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Refund.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jButton_Refund.setForeground(new java.awt.Color(35, 166, 97));
        jButton_Refund.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/refund.png"))); // NOI18N
        jButton_Refund.setText(" Refund");
        jButton_Refund.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Refund.setMargin(new java.awt.Insets(2, 0, 3, 60));
        jButton_Refund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RefundActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Refund, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 310, 70));

        jTextField_PurchaseID.setEditable(false);
        jTextField_PurchaseID.setBackground(new java.awt.Color(153, 153, 153));
        jTextField_PurchaseID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTextField_PurchaseID.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTextField_PurchaseID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 310, 50));

        jTextField_CurDate.setEditable(false);
        jTextField_CurDate.setBackground(new java.awt.Color(153, 153, 153));
        jTextField_CurDate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTextField_CurDate.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTextField_CurDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 310, 50));

        jLabel_CurDate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel_CurDate.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_CurDate.setText("Current Date");
        jPanel1.add(jLabel_CurDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel_ProdcutID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel_ProdcutID.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_ProdcutID.setText("Purchase ID");
        jPanel1.add(jLabel_ProdcutID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel_ReceiDate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel_ReceiDate.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_ReceiDate.setText("Received Date");
        jPanel1.add(jLabel_ReceiDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel_Search.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel_Search.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Search.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/search.png"))); // NOI18N
        jLabel_Search.setText("Search");
        jPanel1.add(jLabel_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, -1, -1));

        jTextField_ReceiDate.setEditable(false);
        jTextField_ReceiDate.setBackground(new java.awt.Color(153, 153, 153));
        jTextField_ReceiDate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTextField_ReceiDate.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTextField_ReceiDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 310, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1129, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void showAnnouncement(String text, String title, int messageType) {
        announcement.setText(text);
        JOptionPane.showMessageDialog(this, announcement, title, messageType);
    }
    
    private void init() {
        jTextField_CurDate.setText(df.format(date));
        uID = userDAO.getUserID(UserDashboard.userEmail.getText());
        purchaseDetailsTable();
        announcement.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
    }
    
    private void purchaseDetailsTable() {
        setInformationTable("");
        jTable1.setRowHeight(30);
        jTable1.setShowGrid(true);
        jTable1.setGridColor(Color.BLACK);
        jTable1.setBackground(Color.WHITE);
        jTable1.setSelectionBackground(Color.LIGHT_GRAY);
    }
    
    private void setInformationTable(String text) {
        model = (DefaultTableModel) jTable1.getModel();
        ArrayList<Model.Purchase> allPurchase = pdc.searchPurchaseInUser(text);
        Object[] row = new Object[10];
        for(var p : allPurchase) {
            row[0] = p.getID();
            row[1] = p.getPID();
            row[2] = productDAO.getProductName(p.getPID());
            row[3] = p.getQuantity();
            row[4] = p.getPrice();
            row[5] = String.valueOf(p.getQuantity()*(double)(p.getPrice()));
            row[6] = p.getP_date();
            row[7] = p.getReceivedDate();
            row[8] = shipperDAO.getShipperName(p.getShipperID());
            row[9] = p.getStatus();
            model.addRow(row);
        }
    }
    
    private void clear() {
        jTextField_PurchaseID.setText("");
        jTextField_ReceiDate.setText("");
        jTextField_CurDate.setText(df.format(date));
        jTextField_Search.setText("");
        jTable1.clearSelection();
    }
    
    private void jLabel_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BackMouseClicked
        setVisible(false);
        UserDashboard.jPanel9.setBackground(primaryColor);
        UserDashboard.jPanel10.setBackground(primaryColor);
    }//GEN-LAST:event_jLabel_BackMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for(double i = 0.1; i <= 1.0; i += 0.1) {
            String s = "" + i;
            float f = Float.parseFloat(s);
            this.setOpacity(f);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(PurchaseDetail.class.getName()).log(Level.SEVERE, null, ex);
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

    // event when we click on Table
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        model = (DefaultTableModel) jTable1.getModel();
        rowIndex = jTable1.getSelectedRow();
        jTextField_PurchaseID.setText(model.getValueAt(rowIndex, 0).toString());
        if(model.getValueAt(rowIndex, 7) == null) { // check receivedDate
            jTextField_ReceiDate.setText(null);
        } else {
            jTextField_ReceiDate.setText(model.getValueAt(rowIndex, 7).toString());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    // event of "Refund" button
    private void jButton_RefundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RefundActionPerformed
        if(jTextField_PurchaseID.getText().isEmpty() || jTextField_ReceiDate.getText().isEmpty()) {
            showAnnouncement("Purchase ID or Received date is empty", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String receivedDate = jTextField_ReceiDate.getText();
            String currentDate = jTextField_CurDate.getText();
            try {
                Date d1 = df.parse(receivedDate); // convert string --> date
                Date d2 = df.parse(currentDate);
                //System.out.println(d1 + " " + d2);
                long dateReceivedInMs = d1.getTime();
                long dateCurrentInMs = d2.getTime(); // get seconds
                //System.out.println(dateCurrentInMs + " " + dateReceivedInMs);
                long timediff = dateCurrentInMs - dateReceivedInMs;
                long daydiff = TimeUnit.DAYS.convert(timediff, TimeUnit.MILLISECONDS);
                
                if(daydiff > 30) {
                    showAnnouncement("Sorry refund time is over \n "
                            + "Refund applicable 30 days from the received day", "Annoucenemt", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(this, "Sorry refund time is over \n Refund applicable 30 days from the received day");
                } else {
                    announcement.setText("Are you sure refund this product ?");
                    int x = JOptionPane.showConfirmDialog(null, announcement, "Refund", JOptionPane.OK_CANCEL_OPTION);
                    if(x == JOptionPane.OK_OPTION) {
                        int id = Integer.parseInt(jTextField_PurchaseID.getText());
                        if(purchaseDAO.refund(id)) {
                            showAnnouncement("Product refund sucessfully", "Announcement", JOptionPane.INFORMATION_MESSAGE);
                            statisticDAO.user(UserDashboard.userEmail.getText());
                        } else {
                            showAnnouncement("Refund Fail", "Announcement", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    // update again table
                    jTable1.setModel(new DefaultTableModel(null, new Object[] {"Purchase ID", "Product ID", "Product Name", "Quantity", "Price", "Total", "Purchase Date",
                            "Received Date", "Supplier Name", "Status"}));
                    setInformationTable(""); // update table
                    statisticDAO.user(UserDashboard.userEmail.getText()); // update statistics of dashboard
                    clear();
                }
                
            } catch (ParseException ex) {
                Logger.getLogger(PurchaseDetail.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton_RefundActionPerformed

    // event of "Search" jTextField
    private void jTextField_SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_SearchKeyReleased
        jTable1.setModel(new DefaultTableModel(null, new Object[] {"Purchase ID", "Product ID", "Product Name", "Quantity", "Price", "Total", "Purchase Date",
                            "Received Date", "Supplier Name", "Status"}));
        setInformationTable(jTextField_Search.getText());
    }//GEN-LAST:event_jTextField_SearchKeyReleased

    // event of "Clear" button
    private void jButton_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClearActionPerformed
        clear();
        jTable1.setModel(new DefaultTableModel(null, new Object[] {"Purchase ID", "Product ID", "Product Name", "Quantity", "Price", "Total", "Purchase Date",
        "Received Date", "Supplier Name", "Status"}));
        setInformationTable(""); // update table
    }//GEN-LAST:event_jButton_ClearActionPerformed

//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new PurchaseDetail().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Clear;
    private javax.swing.JButton jButton_Refund;
    private javax.swing.JLabel jLabel_Back;
    private javax.swing.JLabel jLabel_CurDate;
    private javax.swing.JLabel jLabel_ProdcutID;
    private javax.swing.JLabel jLabel_ReceiDate;
    private javax.swing.JLabel jLabel_Search;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_CurDate;
    private javax.swing.JTextField jTextField_PurchaseID;
    private javax.swing.JTextField jTextField_ReceiDate;
    private javax.swing.JTextField jTextField_Search;
    // End of variables declaration//GEN-END:variables
}
