package View_Admin;

import Controller.ProductController;
import DAOs.CategoryDAO;
import DAOs.ProductDAO;
import DAOs.StatisticDAO;
import Model.Product;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManageProduct extends javax.swing.JFrame {

    CategoryDAO categoryDAO = new CategoryDAO();
    ProductDAO productDAO = new ProductDAO();
    ProductController productController = new ProductController();
    StatisticDAO statisticDAO = new StatisticDAO();
    
    JLabel announcement = new JLabel();
    Color primaryColor = new Color(76,98,146);
    Color notEdit = new Color(204, 204, 204);
    
    DefaultTableModel model;
    int rowIndex;
    int xx, xy;
    
    String oldPName;
    String oldCName;
    
    // * //
    String[] categories; // information about All Categories
    // *//
    public ManageProduct() {
        initComponents();
        setLocation(600, 200);
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_Back = new javax.swing.JLabel();
        jLabel_Title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField_Search = new javax.swing.JTextField();
        jLabel_Search = new javax.swing.JLabel();
        jTextField_ProductID = new javax.swing.JTextField();
        jTextField_ProductName = new javax.swing.JTextField();
        jLabel_ProductID = new javax.swing.JLabel();
        jLabel_Category = new javax.swing.JLabel();
        jLabel_ProductName = new javax.swing.JLabel();
        jButton_Add = new javax.swing.JButton();
        jButton_Update = new javax.swing.JButton();
        jButton_Clear = new javax.swing.JButton();
        jButton_Delete = new javax.swing.JButton();
        jLabel_Quantity = new javax.swing.JLabel();
        jTextField_Quantity = new javax.swing.JTextField();
        jComboBox_Category = new javax.swing.JComboBox<>();
        jLabel_Price = new javax.swing.JLabel();
        jTextField_Price = new javax.swing.JTextField();

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

        jLabel_Back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/turn-back.png"))); // NOI18N
        jLabel_Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_BackMouseClicked(evt);
            }
        });

        jLabel_Title.setFont(new java.awt.Font("Monotype Corsiva", 0, 65)); // NOI18N
        jLabel_Title.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Title.setText("Product");

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Category", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        jTextField_Search.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Search.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTextField_Search.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_SearchKeyReleased(evt);
            }
        });

        jLabel_Search.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel_Search.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Search.setText("Search");

        jTextField_ProductID.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_ProductID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTextField_ProductID.setForeground(new java.awt.Color(0, 0, 0));

        jTextField_ProductName.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_ProductName.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTextField_ProductName.setForeground(new java.awt.Color(0, 0, 0));

        jLabel_ProductID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel_ProductID.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_ProductID.setText("Product ID");

        jLabel_Category.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel_Category.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Category.setText("Category");

        jLabel_ProductName.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel_ProductName.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_ProductName.setText("Product Name");

        jButton_Add.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Add.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jButton_Add.setForeground(new java.awt.Color(35, 166, 97));
        jButton_Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add-button.png"))); // NOI18N
        jButton_Add.setText("Save");
        jButton_Add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Add.setMargin(new java.awt.Insets(2, 9, 3, 14));
        jButton_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddActionPerformed(evt);
            }
        });

        jButton_Update.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Update.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jButton_Update.setForeground(new java.awt.Color(35, 166, 97));
        jButton_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/updated.png"))); // NOI18N
        jButton_Update.setText("Update");
        jButton_Update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdateActionPerformed(evt);
            }
        });

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

        jButton_Delete.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Delete.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jButton_Delete.setForeground(new java.awt.Color(35, 166, 97));
        jButton_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/bin.png"))); // NOI18N
        jButton_Delete.setText("Delete");
        jButton_Delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteActionPerformed(evt);
            }
        });

        jLabel_Quantity.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel_Quantity.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Quantity.setText("Quantity");

        jTextField_Quantity.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Quantity.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTextField_Quantity.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_Quantity.setText("0");
        jTextField_Quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_QuantityKeyTyped(evt);
            }
        });

        jComboBox_Category.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_Category.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jComboBox_Category.setForeground(new java.awt.Color(0, 0, 0));

        jLabel_Price.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel_Price.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Price.setText("Price");

        jTextField_Price.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Price.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTextField_Price.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_Price.setText("0.0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_ProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_ProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_ProductID)
                                    .addComponent(jLabel_ProductName)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jButton_Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton_Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton_Update, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                            .addComponent(jButton_Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jLabel_Category))
                                .addGap(26, 26, 26))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_Quantity))))
                        .addGap(1, 1, 1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_Category, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Price))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(310, 310, 310)
                        .addComponent(jLabel_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel_Search)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel_Title)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Search, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Search, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel_ProductID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_ProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_ProductName)
                        .addGap(1, 1, 1)
                        .addComponent(jTextField_ProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Category)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_Category, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Quantity)
                        .addGap(4, 4, 4)
                        .addComponent(jTextField_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_Price)
                        .addGap(4, 4, 4)
                        .addComponent(jTextField_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21))
        );

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

    private void init() {
        jTextField_ProductID.setBackground(notEdit);
        jTextField_ProductID.setEditable(false);
        jTextField_ProductID.setText(String.valueOf(productDAO.getMaxRox()));
        
        categories = new String[productDAO.countCategories()];
        setCategories();
        
        announcement.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
        productTable();
    }
    
    private void setCategories() {
        categories = productDAO.getCategories();
        for(String s : categories) {
            jComboBox_Category.addItem(s);
        }
    }
    
    private void productTable() {
        setInformationProductTable("");
        jTable1.setRowHeight(30);
        jTable1.setShowGrid(true);
        jTable1.setGridColor(Color.BLACK);
        jTable1.setBackground(Color.WHITE);
        jTable1.setSelectionBackground(Color.LIGHT_GRAY);
    }
    
    private void setInformationProductTable(String text) {
        model = (DefaultTableModel) jTable1.getModel();
        ArrayList<Product> products = productController.searchInformationForProductTable(text);
        Object[] row = new Object[5];
        for(var x : products) {
            row[0] = x.getPID();
            row[1] = x.getPName();
            row[2] = categoryDAO.getCategoryName(x.getCID());
            row[3] = x.getPQuantity();
            row[4] = x.getPPrice();
            model.addRow(row);
        }
    }
    
    private void showAnnouncement(String text, String title, int messageType) {
        announcement.setText(text);
        JOptionPane.showMessageDialog(this, announcement, title, messageType);
    }
    
    private void clear() {
        jTextField_Search.setText("");
        jTextField_ProductID.setText(String.valueOf(productDAO.getMaxRox()));
        jTextField_ProductName.setText("");
        jComboBox_Category.setSelectedIndex(0);
        jTextField_Quantity.setText("0");
        jTextField_Price.setText("0.0");
        jTable1.clearSelection();
        statisticDAO.admin();
    }
    
    private boolean isEmpty() {
        if(jTextField_ProductName.getText().isEmpty()) {
            showAnnouncement("Product Name is Empty !", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(Integer.parseInt(jTextField_Quantity.getText()) <= 0) {
            showAnnouncement("Please, increase the product Quantity !", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(jTextField_Quantity.getText().isEmpty()) {
            showAnnouncement("Quantity is Empty !", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(jTextField_Price.getText().equals("0.0") || jTextField_Price.getText().isEmpty()) {
            showAnnouncement("Product Price is required !", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
    
    private boolean check() {
        String newProduct = jTextField_ProductName.getText();
        String oldProduct = model.getValueAt(rowIndex, 1).toString();
        String newCategory = jComboBox_Category.getSelectedItem().toString();
        String oldCategory = model.getValueAt(rowIndex, 2).toString();
        
        if(newCategory.equals(oldCategory) && newProduct.equals(oldProduct)) {
            return false;
        } else {
            if(!newCategory.equals(oldCategory)) {
                int categoryID = categoryDAO.getCategoryID(newCategory);
                boolean x = productDAO.isProAndCatExists(newProduct, categoryID);
                if(x) {
                    showAnnouncement("This Product name and Category already exist", "Warning", JOptionPane.WARNING_MESSAGE);
                    return x;
                }
            }
        }
        return false;
    }
    
    private boolean isNumeric(String s) {
        try {
            double d = Double.parseDouble(s);
            return true;
        } catch(NumberFormatException e) {
            showAnnouncement("Numeric value is required for the price field !", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        return false;
    }
    
    private void jLabel_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BackMouseClicked
        setVisible(false);
        AdminDashboard.jPanel13.setBackground(primaryColor);
        AdminDashboard.jPanel14.setBackground(primaryColor);
    }//GEN-LAST:event_jLabel_BackMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for(double i = 0.1; i <= 1.0; i += 0.1) {
            String s = "" + i;
            float f = Float.parseFloat(s);
            this.setOpacity(f);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(ManageProduct.class.getName()).log(Level.SEVERE, null, ex);
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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        model = (DefaultTableModel) jTable1.getModel();
        rowIndex = jTable1.getSelectedRow();
        jTextField_ProductID.setText(model.getValueAt(rowIndex, 0).toString());
        jTextField_ProductName.setText(model.getValueAt(rowIndex, 1).toString());
        
        String category = model.getValueAt(rowIndex, 2).toString();
        for(int i = 0; i < jComboBox_Category.getItemCount(); i++) {
            if(jComboBox_Category.getItemAt(i).equals(category)) {
                jComboBox_Category.setSelectedIndex(i);
                break;
            }
        }
        
        jTextField_Quantity.setText(model.getValueAt(rowIndex, 3).toString());
        jTextField_Price.setText(model.getValueAt(rowIndex, 4).toString());
        
        oldPName = model.getValueAt(rowIndex, 1).toString();
        oldCName = jComboBox_Category.getSelectedItem().toString();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField_QuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_QuantityKeyTyped
        if(!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_QuantityKeyTyped

    // event of "Add" button
    private void jButton_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddActionPerformed
        if(isEmpty()) {
            int id = Integer.parseInt(jTextField_ProductID.getText());
            String pname = jTextField_ProductName.getText();
            String category = jComboBox_Category.getSelectedItem().toString();
            int quantity = Integer.parseInt(jTextField_Quantity.getText());
            if(isNumeric(jTextField_Price.getText())) {
                double price = Double.parseDouble(jTextField_Price.getText());
                if(!productDAO.isProductIdExists(id)) {
                    int categoryID = categoryDAO.getCategoryID(category);
                    if(!productDAO.isProAndCatExists(pname, categoryID)) {
                        //int categoryID = categoryDAO.getCategoryID(category);
                        if(productDAO.insert(id, pname, categoryID, quantity, price)) {
                            showAnnouncement("Product added successfully !", "Announcement", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            showAnnouncement("Add Failed", "Announcement", JOptionPane.INFORMATION_MESSAGE);
                        }
                        jTable1.setModel(new DefaultTableModel(null, new Object[] {"Product ID","Product Name", "Category", "Quantity", "Price"}));
                        setInformationProductTable("");
                        clear();
                    } else {
                        showAnnouncement("Product and Category already exist !", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    showAnnouncement("Product ID already exist !", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jButton_AddActionPerformed

    // event of "Search" field
    private void jTextField_SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_SearchKeyReleased
        jTable1.setModel(new DefaultTableModel(null, new Object[] {"Product ID","Product Name", "Category", "Quantity", "Price"}));
        setInformationProductTable(jTextField_Search.getText());
    }//GEN-LAST:event_jTextField_SearchKeyReleased

    // event of "Update" button
    private void jButton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateActionPerformed
        try {
            int id = Integer.parseInt(jTextField_ProductID.getText().trim());
            if (!productDAO.isProductIdExists(id)) {
                showAnnouncement("Product ID does not exist", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (isEmpty()) {  // Assuming validateInputs() is a method that ensures all inputs are not empty and are valid
                String newPName = jTextField_ProductName.getText().trim();
                String newCName = jComboBox_Category.getSelectedItem().toString();
                int newCategoryID = categoryDAO.getCategoryID(newCName);
                
                int qty = Integer.parseInt(jTextField_Quantity.getText().trim());
                if (isNumeric(jTextField_Price.getText())) {
                    double price = Double.parseDouble(jTextField_Price.getText().trim());
                    if (newPName.equals(oldPName) && newCName.equals(oldCName)) {
                        productDAO.update(id, newPName, newCategoryID, qty, price);
                        showAnnouncement("Product data successfully updated1", "Announcement", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        if (!productDAO.isProAndCatExists(newPName, newCategoryID)) {
                            productDAO.update(id, newPName, newCategoryID, qty, price);
                            showAnnouncement("Product data successfully updated2", "Announcement", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            showAnnouncement("Information of product already exists in the table.", "Warning", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                    }
                    clear();
                    jTable1.setModel(new DefaultTableModel(null, new Object[]{"Product ID", "Product Name", "Category", "Quantity", "Price"}));
                    setInformationProductTable("");
                } else {
                    showAnnouncement("Price must be a valid number", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (NumberFormatException e) {
            showAnnouncement("Please enter valid numbers for ID, Quantity, and Price", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton_UpdateActionPerformed

    // event of "Clear" button
    private void jButton_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClearActionPerformed
        clear();
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"Product ID", "Product Name", "Category", "Quantity", "Price"}));
        setInformationProductTable("");
    }//GEN-LAST:event_jButton_ClearActionPerformed

    // event of "Delete" button
    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed
        int productID = Integer.parseInt(jTextField_ProductID.getText());
        if(productDAO.isProductIdExists(productID)) {
            announcement.setText("Are you sure to delete this Account ?");
            int x = JOptionPane.showConfirmDialog(this, announcement, "Delete", JOptionPane.OK_CANCEL_OPTION, 0);
            if (x == JOptionPane.OK_OPTION) {
                productDAO.delete(productID);
                showAnnouncement("This Product Deleted", "Announcement", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            showAnnouncement("Product ID does not exist.\nPlease select a Product in Table.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"Product ID", "Product Name", "Category", "Quantity", "Price"}));
        setInformationProductTable("");
        clear();
    }//GEN-LAST:event_jButton_DeleteActionPerformed

    
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ManageProduct().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add;
    private javax.swing.JButton jButton_Clear;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_Update;
    private javax.swing.JComboBox<String> jComboBox_Category;
    private javax.swing.JLabel jLabel_Back;
    private javax.swing.JLabel jLabel_Category;
    private javax.swing.JLabel jLabel_Price;
    private javax.swing.JLabel jLabel_ProductID;
    private javax.swing.JLabel jLabel_ProductName;
    private javax.swing.JLabel jLabel_Quantity;
    private javax.swing.JLabel jLabel_Search;
    private javax.swing.JLabel jLabel_Title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_Price;
    private javax.swing.JTextField jTextField_ProductID;
    private javax.swing.JTextField jTextField_ProductName;
    private javax.swing.JTextField jTextField_Quantity;
    private javax.swing.JTextField jTextField_Search;
    // End of variables declaration//GEN-END:variables
}
