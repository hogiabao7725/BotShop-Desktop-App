package View_Shipper;

import Controller.PurchaseController;
import DAOs.ProductDAO;
import DAOs.PurchaseDAO;
import DAOs.ShipperDAO;
import DAOs.UserDAO;
import Model.Purchase;
import java.awt.Color;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class MyDeliveries extends javax.swing.JFrame {

    PurchaseController purchaseController = new PurchaseController();
    PurchaseDAO purchaseDAO = new PurchaseDAO();
    ProductDAO productDAO = new ProductDAO();
    UserDAO userDAO = new UserDAO();
    ShipperDAO shipperDAO = new ShipperDAO();
    
    Color primaryColor = new Color(76,98,146);
    int xx, xy;
    
    DefaultTableModel model;
    int rowIndex;
    
    String supplierName;
    
    public MyDeliveries() {
        initComponents();
        setLocation(580, 290);
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
        jScrollPane1.setViewportView(jTable1);

        jLabel_Search.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel_Search.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Search.setText("Product Search");

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
        jLabel_Title.setText("My Deliveries");

        jLabel_Back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/turn-back.png"))); // NOI18N
        jLabel_Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_BackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1052, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_Search)
                        .addGap(32, 32, 32)
                        .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addComponent(jLabel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_Title))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_Search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_Search))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
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

    private void init() {
        supplierName = shipperDAO.getShipperName(ShipperDashboard.shipperEmail.getText());
        myDeliveriesTable();
    }
    
    // setup information for Table
    private void myDeliveriesTable() {
        setInformationMyDeliveriesTable("");
        jTable1.setRowHeight(30);
        jTable1.setShowGrid(true);
        jTable1.setGridColor(Color.BLACK);
        jTable1.setBackground(Color.WHITE);
        jTable1.setSelectionBackground(Color.LIGHT_GRAY);
    }
    
    private void setInformationMyDeliveriesTable(String text) {
        model = (DefaultTableModel) jTable1.getModel();
        ArrayList<Purchase> allPurchase = purchaseController.getPurchaseDeliveredOfShipper(text);
        Object[] row = new Object[14];
        for(var p : allPurchase) {
            row = new Object[14];
            row[0] = p.getID();
            row[1] = p.getUserID();
            row[2] = userDAO.getUserName(p.getUserID());
            row[3] = userDAO.getPhoneNumber(p.getUserID());
            row[4] = p.getPID();
            row[5] = productDAO.getProductName(p.getPID());
            row[6] = p.getQuantity();
            row[7] = p.getPrice();
            row[8] = String.valueOf(p.getQuantity()*(double)(p.getQuantity()));
            row[9] = p.getP_date();
            row[10] = userDAO.getAddress(p.getUserID());
            row[11] = p.getReceivedDate();
            row[12] = shipperDAO.getShipperName(p.getShipperID());
            row[13] = p.getStatus();
            model.addRow(row);
        }
    }
    
    // event of "Back" icon
    private void jLabel_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BackMouseClicked
        setVisible(false);
        ShipperDashboard.jPanel9.setBackground(primaryColor);
        ShipperDashboard.jPanel10.setBackground(primaryColor);
    }//GEN-LAST:event_jLabel_BackMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for(double i = 0.1; i <= 1.0; i += 0.1) {
            String s = "" + i;
            float f = Float.parseFloat(s);
            this.setOpacity(f);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyDeliveries.class.getName()).log(Level.SEVERE, null, ex);
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
        setInformationMyDeliveriesTable(jTextField_Search.getText());
    }//GEN-LAST:event_jTextField_SearchKeyReleased

//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MyDeliveries().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_Back;
    private javax.swing.JLabel jLabel_Search;
    private javax.swing.JLabel jLabel_Title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_Search;
    // End of variables declaration//GEN-END:variables
}
