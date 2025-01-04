package View_User;

import Controller.ProductController;
import DAOs.CategoryDAO;
import DAOs.ProductDAO;
import DAOs.PurchaseDAO;
import DAOs.StatisticDAO;
import DAOs.UserDAO;
import Model.Product;
import java.awt.Color;
import java.awt.Font;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Purchase extends javax.swing.JFrame {

    StatisticDAO statisticDAO = new StatisticDAO();
    
    UserDAO userDAO = new UserDAO();
    PurchaseDAO purchaseDAO = new PurchaseDAO();
    ProductDAO productDAO = new ProductDAO();
    CategoryDAO categoryDAO = new CategoryDAO();
    
    ProductController productController = new ProductController();
    
    Color primaryColor = new Color(76,98,146);
    JLabel announcement = new JLabel();
    
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
    Date date = new Date();
    
    DefaultTableModel model;
    int rowIndex;
    
    int xx, xy;
    
    private int quantity = 0;
    private double price = 0.0;
    private double total = 0.0;
    private int pID;
    
    public Purchase() {
        initComponents();
        setLocation(540, 209);
        init();
    }

    // Method to get and print the position of the JFrame
//    private void printFrameLocation() {
//        Point location = this.getLocationOnScreen();
//        System.out.println("Vị trí của JFrame: " + location);
//    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_Back = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField_Search = new javax.swing.JTextField();
        jButton_Clear = new javax.swing.JButton();
        jButton_Add = new javax.swing.JButton();
        jButton_Print = new javax.swing.JButton();
        jButton_Purchase = new javax.swing.JButton();
        jTextField_Quantity = new javax.swing.JTextField();
        ProductID = new javax.swing.JTextField();
        jTextField_ProductName = new javax.swing.JTextField();
        jLabel_Quantity = new javax.swing.JLabel();
        jLabel_ProdcutID = new javax.swing.JLabel();
        jLabel_ProductName = new javax.swing.JLabel();
        jLabel_Search = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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
        jPanel1.add(jLabel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 10, 70, 60));

        jTable2.setBackground(new java.awt.Color(255, 255, 255));
        jTable2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTable2.setForeground(new java.awt.Color(0, 0, 0));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Purchase ID", "Product ID", "Product Name", "Quantity", "Price", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, 770, 290));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Category", "Description", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 770, 280));

        jTextField_Search.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Search.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTextField_Search.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_SearchKeyReleased(evt);
            }
        });
        jPanel1.add(jTextField_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, 390, 50));

        jButton_Clear.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Clear.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jButton_Clear.setForeground(new java.awt.Color(35, 166, 97));
        jButton_Clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/clear.png"))); // NOI18N
        jButton_Clear.setText("Clear");
        jButton_Clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Clear.setMargin(new java.awt.Insets(2, 0, 3, 14));
        jButton_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClearActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 660, 160, 60));

        jButton_Add.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Add.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jButton_Add.setForeground(new java.awt.Color(35, 166, 97));
        jButton_Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add-button.png"))); // NOI18N
        jButton_Add.setText("Add");
        jButton_Add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Add.setMargin(new java.awt.Insets(2, 9, 3, 14));
        jButton_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 140, 60));

        jButton_Print.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Print.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jButton_Print.setForeground(new java.awt.Color(35, 166, 97));
        jButton_Print.setText("Print");
        jButton_Print.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PrintActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Print, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, 140, 60));

        jButton_Purchase.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Purchase.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jButton_Purchase.setForeground(new java.awt.Color(35, 166, 97));
        jButton_Purchase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buy.png"))); // NOI18N
        jButton_Purchase.setText("Purchase");
        jButton_Purchase.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PurchaseActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Purchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, 160, 60));

        jTextField_Quantity.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Quantity.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTextField_Quantity.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_Quantity.setText("0");
        jTextField_Quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_QuantityKeyTyped(evt);
            }
        });
        jPanel1.add(jTextField_Quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 310, 50));

        ProductID.setEditable(false);
        ProductID.setBackground(new java.awt.Color(153, 153, 153));
        ProductID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        ProductID.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(ProductID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 310, 50));

        jTextField_ProductName.setEditable(false);
        jTextField_ProductName.setBackground(new java.awt.Color(153, 153, 153));
        jTextField_ProductName.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTextField_ProductName.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTextField_ProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 310, 50));

        jLabel_Quantity.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel_Quantity.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Quantity.setText("Quantity");
        jPanel1.add(jLabel_Quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel_ProdcutID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel_ProdcutID.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_ProdcutID.setText("Purchase ID");
        jPanel1.add(jLabel_ProdcutID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel_ProductName.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel_ProductName.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_ProductName.setText("Product Name");
        jPanel1.add(jLabel_ProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel_Search.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel_Search.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Search.setText("Search");
        jPanel1.add(jLabel_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Total : 0.0");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 770, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1166, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setDefault() {
        setVisible(false);
        UserDashboard.jPanel7.setBackground(primaryColor);
        UserDashboard.jPanel8.setBackground(primaryColor);
    }
    
    private void init() {
        ProductID.setText(String.valueOf(purchaseDAO.getMaxRox()));
        productTable();
        purchaseTable();
        pID = purchaseDAO.getMaxRox();
        announcement.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
    }
    
    private void showAnnouncement(String text, String title, int messageType) {
        announcement.setText(text);
        JOptionPane.showMessageDialog(this, announcement, title, messageType);
    }
    
    private void productTable() {
        setInformationProductTable("");
        jTable1.setRowHeight(30);
        jTable1.setShowGrid(true);
        jTable1.setGridColor(Color.BLACK);
        jTable1.setBackground(Color.WHITE);
        jTable1.setSelectionBackground(Color.LIGHT_GRAY);
    }
    
    private void purchaseTable() {
        model = (DefaultTableModel) jTable2.getModel();
        jTable2.setRowHeight(30);
        jTable2.setShowGrid(true);
        jTable2.setGridColor(Color.BLACK);
        jTable2.setBackground(Color.WHITE);
        jTable2.setSelectionBackground(Color.LIGHT_GRAY);
    }
    
    private void setInformationProductTable(String text) {
        model = (DefaultTableModel) jTable1.getModel();
        ArrayList<Product> products = productController.searchInformationForProductTable(text);
        Object[] row = new Object[6];
        for(var x : products) {
            row[0] = x.getPID();
            row[1] = x.getPName();
            row[2] = categoryDAO.getCategoryName(x.getCID());
            row[3] = categoryDAO.getDescription(x.getCID());
            row[4] = x.getPQuantity();
            row[5] = x.getPPrice();
            model.addRow(row);
        }
    }
    
    private void clear() {
        ProductID.setText(String.valueOf(purchaseDAO.getMaxRox()));
        jTextField_ProductName.setText("");
        jTextField_Quantity.setText("0");
        jTable1.clearSelection();
        price = 0.0;
        quantity = 0;
    }
    
    private void jLabel_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BackMouseClicked
        setVisible(false);
        UserDashboard.jPanel7.setBackground(primaryColor);
        UserDashboard.jPanel8.setBackground(primaryColor);
    }//GEN-LAST:event_jLabel_BackMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for(double i = 0.1; i <= 1.0; i += 0.1) {
            String s = "" + i;
            float f = Float.parseFloat(s);
            this.setOpacity(f);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(Purchase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
        
        //printFrameLocation();
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jTextField_QuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_QuantityKeyTyped
        if(!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_QuantityKeyTyped

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        model = (DefaultTableModel) jTable1.getModel();
        rowIndex = jTable1.getSelectedRow();
        jTextField_ProductName.setText(model.getValueAt(rowIndex, 1).toString());
        String s1 = model.getValueAt(rowIndex, 4).toString();
        String s2 = model.getValueAt(rowIndex, 5).toString();
        quantity = Integer.parseInt(s1);
        price = Double.parseDouble(s2);
    }//GEN-LAST:event_jTable1MouseClicked

    private boolean isProductExist(int proID) {
        model = (DefaultTableModel) jTable2.getModel();
        if(model.getRowCount() > 0) {
            for(int i = 0; i < model.getRowCount(); i++) {
                int newProID = Integer.parseInt(model.getValueAt(i, 1).toString());
                if(newProID == proID) {
                    return true;
                }
            }
        }
        return false;
    }
    
    // event of "Add" button
    private void jButton_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddActionPerformed
        if(jTextField_ProductName.getText().isEmpty()) {
            showAnnouncement("Please select a Product", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (jTextField_Quantity.getText().isEmpty()) {
            showAnnouncement("Quantity is Empty !", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            model = (DefaultTableModel) jTable1.getModel();
            int proID = Integer.parseInt(model.getValueAt(rowIndex, 0).toString());
            if(!isProductExist(proID)) {
                if(!(quantity <= 0)) {
                    int newQuantity = Integer.parseInt(jTextField_Quantity.getText());
                    if(newQuantity != 0) {
                        if(!(newQuantity > quantity)) {
                            String pName = jTextField_ProductName.getText();
                            String t = String.format("%.2f", price*(double)newQuantity);
                            Object[] data = {pID, proID, pName, newQuantity,price, t};
                            pID = pID + 1;
                            model = (DefaultTableModel) jTable2.getModel();
                            model.addRow(data);
                            total += price * (double) newQuantity;
                            jLabel1.setText(String.format("Total : " + "%.2f", total) + " $");
                            clear();
                            ProductID.setText(String.valueOf(purchaseDAO.getMaxRox()));
                        } else {
                            showAnnouncement("Not enough quantity of this product", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        showAnnouncement("Please increasing Quantity of product", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    showAnnouncement("Please increasing Quantity of product", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                showAnnouncement("Product ID aldready exist in Purchase's Table", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton_AddActionPerformed

    // event of "Purchase" button
    private void jButton_PurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PurchaseActionPerformed
        model = (DefaultTableModel) jTable2.getModel();
        if (model.getRowCount() > 0) {
            String[] value = new String[5];
            String email = UserDashboard.userEmail.getText();
            value = purchaseDAO.getUserValue(email);
            int uid = Integer.parseInt(value[0]);
            String purchaseDate = df.format(date);
            for (int i = 0; i < model.getRowCount(); i++) {
                int id = Integer.parseInt(model.getValueAt(i, 0).toString());
                int pid = Integer.parseInt(model.getValueAt(i, 1).toString());
                int qtt = Integer.parseInt(model.getValueAt(i, 3).toString());
                double pri = Double.parseDouble(model.getValueAt(i, 4).toString());

                if (purchaseDAO.insert(id, uid, pid, qtt, pri, purchaseDate, null, 0, "Pending")) {
                    int newQuantity = purchaseDAO.getQuantity(pid) - qtt;
                    purchaseDAO.quantityUpdate(pid, newQuantity);
                }
            }
            statisticDAO.user(UserDashboard.userEmail.getText()); // update information about " UserDashboard "
            showAnnouncement("Successfully purchased", "Announcement", JOptionPane.WARNING_MESSAGE);
            setDefault();
        } else {
            showAnnouncement("No have product in Table 2", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton_PurchaseActionPerformed

    // event of "Add" button
    private void jButton_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClearActionPerformed
        clear();
    }//GEN-LAST:event_jButton_ClearActionPerformed

    // event of "Print" button
    private void jButton_PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PrintActionPerformed
        String email = UserDashboard.userEmail.getText();
        MessageFormat header = new MessageFormat("Receipt -->  " + "Email" + email +"      " + "Total : " + total);
        MessageFormat footer = new MessageFormat("Page{0, number, integer}");
        try {
            jTable2.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (PrinterException ex) {
            Logger.getLogger(Purchase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_PrintActionPerformed

    private void jTextField_SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_SearchKeyReleased
        jTable1.setModel(new DefaultTableModel(null, new Object[] {"Product ID", "Product Name", "Category", "Quantity", "Price"}));
        setInformationProductTable(jTextField_Search.getText());
    }//GEN-LAST:event_jTextField_SearchKeyReleased

    
    
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Purchase().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ProductID;
    private javax.swing.JButton jButton_Add;
    private javax.swing.JButton jButton_Clear;
    private javax.swing.JButton jButton_Print;
    private javax.swing.JButton jButton_Purchase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Back;
    private javax.swing.JLabel jLabel_ProdcutID;
    private javax.swing.JLabel jLabel_ProductName;
    private javax.swing.JLabel jLabel_Quantity;
    private javax.swing.JLabel jLabel_Search;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField_ProductName;
    private javax.swing.JTextField jTextField_Quantity;
    private javax.swing.JTextField jTextField_Search;
    // End of variables declaration//GEN-END:variables
}
