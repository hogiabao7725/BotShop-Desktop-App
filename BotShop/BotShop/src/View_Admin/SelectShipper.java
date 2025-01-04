package View_Admin;

import Controller.PurchaseController;
import DAOs.ProductDAO;
import DAOs.PurchaseDAO;
import DAOs.ShipperDAO;
import DAOs.UserDAO;
import Model.Purchase;
import Model.Shipper;
import View_Shipper.ShipperDashboard;
import View_User.Login;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SelectShipper extends javax.swing.JFrame {

    ShipperDAO shipperDAO = new ShipperDAO();
    UserDAO userDAO = new UserDAO();
    ProductDAO productDAO = new ProductDAO();
    PurchaseDAO purchaseDAO = new PurchaseDAO();
    PurchaseController purchaseController = new PurchaseController();
    
    JLabel announcement = new JLabel(); // Used to display the content of the NOTIFICATION
    Color primaryColor = new Color(76,98,146);
    
    DefaultTableModel model;
    int rowIndex;
    
    int xx, xy;
    
    String[] suppliers; // name of All Suppliers
    
    public SelectShipper() {
        initComponents();
        setLocation(590, 230);
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel_Search = new javax.swing.JLabel();
        jTextField_Search = new javax.swing.JTextField();
        jLabel_Title = new javax.swing.JLabel();
        jLabel_Back = new javax.swing.JLabel();
        jLabel_Supplier = new javax.swing.JLabel();
        jComboBox_Supplier = new javax.swing.JComboBox<>();
        jButton_Select = new javax.swing.JButton();
        jButton_Clear = new javax.swing.JButton();

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

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Purchase ID", "User ID", "User Name", "User Phone", "Product ID", "Product Name", "Quantity", "Price", "Total", "Purchase Date", "Address", "Received Date", "Supplier Name", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
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

        jLabel_Search.setFont(new java.awt.Font("Segoe UI Semibold", 0, 30)); // NOI18N
        jLabel_Search.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Search.setText("Search");

        jTextField_Search.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Search.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jTextField_Search.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_SearchKeyReleased(evt);
            }
        });

        jLabel_Title.setFont(new java.awt.Font("Monotype Corsiva", 0, 65)); // NOI18N
        jLabel_Title.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Title.setText("Select Shipper");

        jLabel_Back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/turn-back.png"))); // NOI18N
        jLabel_Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_BackMouseClicked(evt);
            }
        });

        jLabel_Supplier.setFont(new java.awt.Font("Segoe UI Semibold", 0, 30)); // NOI18N
        jLabel_Supplier.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Supplier.setText("Supplier");

        jComboBox_Supplier.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_Supplier.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jComboBox_Supplier.setForeground(new java.awt.Color(0, 0, 0));

        jButton_Select.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Select.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jButton_Select.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Select.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/confirm.png"))); // NOI18N
        jButton_Select.setText("Select");
        jButton_Select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SelectActionPerformed(evt);
            }
        });

        jButton_Clear.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Clear.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jButton_Clear.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/clear.png"))); // NOI18N
        jButton_Clear.setText("Clear");
        jButton_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(299, 299, 299)
                .addComponent(jLabel_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1052, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Search)
                            .addComponent(jLabel_Supplier))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox_Supplier, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_Search, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE))
                        .addGap(123, 123, 123)
                        .addComponent(jButton_Select, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_Title)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Supplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_Supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Select, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void showAnnouncement(String text, String title, int messageType) {
        announcement.setText(text);
        JOptionPane.showMessageDialog(this, announcement, title, messageType);
    }
    
    private void init() {
        suppliers = new String[shipperDAO.countShippers()];
        setSuppliers();
        selectSupplierTable();
        announcement.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
    }
    
    private void setSuppliers() {
        suppliers = shipperDAO.getNameShippers();
        for(String s : suppliers) {
            jComboBox_Supplier.addItem(s);
        }
    }
    // set up information for "Select Shipper" Table
    private void selectSupplierTable() {
        setInformationSelectSupplierTable("");
        jTable1.setRowHeight(30);
        jTable1.setShowGrid(true);
        jTable1.setGridColor(Color.BLACK);
        jTable1.setBackground(Color.WHITE);
        jTable1.setSelectionBackground(Color.LIGHT_GRAY);
    }
    
    private void setInformationSelectSupplierTable(String text) {
        model = (DefaultTableModel) jTable1.getModel();
        ArrayList<Purchase> result = purchaseController.getPurchasePending(text);
        Object[] row;
        for(var purchase : result ) {
            row = new Object[14];
            row[0] = purchase.getID();
            row[1] = purchase.getUserID();
            row[2] = userDAO.getUserName(purchase.getUserID());
            row[3] = userDAO.getPhoneNumber(purchase.getUserID());
            row[4] = purchase.getPID();
            row[5] = productDAO.getProductName(purchase.getPID());
            row[6] = purchase.getQuantity();
            row[7] = purchase.getPrice();
            row[8] = String.valueOf(purchase.getQuantity()*(double)(purchase.getQuantity()));
            row[9] = purchase.getP_date();
            row[10] = userDAO.getAddress(purchase.getUserID());
            row[11] = purchase.getReceivedDate();
            row[12] = shipperDAO.getShipperName(purchase.getShipperID());
            row[13] = purchase.getStatus();
            model.addRow(row);
        }
    }
    
    // event of "Back" icon
    private void jLabel_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BackMouseClicked
        setVisible(false);
        AdminDashboard.jPanel22.setBackground(primaryColor);
        AdminDashboard.jPanel23.setBackground(primaryColor);
    }//GEN-LAST:event_jLabel_BackMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for(double i = 0.1; i <= 1.0; i += 0.1) {
            String s = "" + i;
            float f = Float.parseFloat(s);
            this.setOpacity(f);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(SelectShipper.class.getName()).log(Level.SEVERE, null, ex);
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

    // event of "Search" jTextField
    private void jTextField_SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_SearchKeyReleased
        jTable1.setModel(new DefaultTableModel(null, new Object[] {"Purchase ID", "User ID", "User Name", "User Phone", "Product ID", "Product Name",
                            "Quantity", "Price", "Total", "Purchase Date", "Address",
                            "Received Date", "Supplier Name", "Status"}));

        setInformationSelectSupplierTable(jTextField_Search.getText());
    }//GEN-LAST:event_jTextField_SearchKeyReleased

    // event of "Clear" button
    private void jButton_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClearActionPerformed
        jTextField_Search.setText("");
        jTable1.clearSelection();
        jTable1.setModel(new DefaultTableModel(null, new Object[] {"Purchase ID", "User ID", "User Name", "User Phone", "Product ID", "Product Name",
                            "Quantity", "Price", "Total", "Purchase Date", "Address",
                            "Received Date", "Supplier Name", "Status"}));

        setInformationSelectSupplierTable("");
    }//GEN-LAST:event_jButton_ClearActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        model = (DefaultTableModel) jTable1.getModel();
        rowIndex = jTable1.getSelectedRow();
    }//GEN-LAST:event_jTable1MouseClicked

    // event of "Select" button
    private void jButton_SelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SelectActionPerformed
        model = (DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRow() >= 0 ) {
            rowIndex = jTable1.getSelectedRow();
            int id = Integer.valueOf(model.getValueAt(rowIndex, 0).toString());
            String shipperName = jComboBox_Supplier.getSelectedItem().toString();
            int shipperID = shipperDAO.getShipperIDByName(shipperName);
            String status = "On the way";
            
            if(purchaseDAO.setSuppStatus(id, shipperID, status)) {
                showAnnouncement("Supplier sucessfully selected", "Announcement", JOptionPane.INFORMATION_MESSAGE);
            } else {
                showAnnouncement("Error !", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            
            // update Table again
            jTable1.setModel(new DefaultTableModel(null, new Object[] {"Purchase ID", "User ID", "User Name", "User Phone", "Product ID", "Product Name",
                            "Quantity", "Price", "Total", "Purchase Date", "Address",
                            "Received Date", "Supplier Name", "Status"}));

            setInformationSelectSupplierTable("");
        } else {
            showAnnouncement("No Shipper has been selected", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton_SelectActionPerformed

//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SelectShipper().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Clear;
    private javax.swing.JButton jButton_Select;
    private javax.swing.JComboBox<String> jComboBox_Supplier;
    private javax.swing.JLabel jLabel_Back;
    private javax.swing.JLabel jLabel_Search;
    private javax.swing.JLabel jLabel_Supplier;
    private javax.swing.JLabel jLabel_Title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_Search;
    // End of variables declaration//GEN-END:variables
}
