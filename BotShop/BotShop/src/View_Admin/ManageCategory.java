package View_Admin;

import Controller.CategoryController;
import DAOs.CategoryDAO;
import DAOs.StatisticDAO;
import Model.Category;
import View_User.Login;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManageCategory extends javax.swing.JFrame {
    
    StatisticDAO statisticDAO = new StatisticDAO();
    CategoryDAO categoryDAO = new CategoryDAO();
    CategoryController categoryController = new CategoryController();
    
    JLabel announcement = new JLabel(); // Used to display the content of the NOTIFICATION
    Color primaryColor = new Color(76,98,146);
    Color notEdit = new Color(204, 204, 204);
    
    DefaultTableModel model;
    int rowIndex;
    
    int xx, xy;
    
    public ManageCategory() {
        initComponents();
        setLocation(600, 270);
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
        jTextField_CategoryID = new javax.swing.JTextField();
        jTextField_CategoryName = new javax.swing.JTextField();
        jTextField_Description = new javax.swing.JTextField();
        jLabel_CategoryID = new javax.swing.JLabel();
        jLabel_Description = new javax.swing.JLabel();
        jLabel_CategoryName = new javax.swing.JLabel();
        jButton_Add = new javax.swing.JButton();
        jButton_Purchase = new javax.swing.JButton();
        jButton_Clear = new javax.swing.JButton();
        jButton_Delete = new javax.swing.JButton();

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
        jLabel_Title.setText("Category");

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category ID", "Category Name", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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

        jTextField_CategoryID.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_CategoryID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTextField_CategoryID.setForeground(new java.awt.Color(0, 0, 0));

        jTextField_CategoryName.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_CategoryName.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTextField_CategoryName.setForeground(new java.awt.Color(0, 0, 0));

        jTextField_Description.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Description.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTextField_Description.setForeground(new java.awt.Color(0, 0, 0));

        jLabel_CategoryID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel_CategoryID.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_CategoryID.setText("Category ID");

        jLabel_Description.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel_Description.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Description.setText("Description");

        jLabel_CategoryName.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel_CategoryName.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_CategoryName.setText("Category Name");

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

        jButton_Purchase.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Purchase.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jButton_Purchase.setForeground(new java.awt.Color(35, 166, 97));
        jButton_Purchase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/updated.png"))); // NOI18N
        jButton_Purchase.setText("Update");
        jButton_Purchase.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PurchaseActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(317, 317, 317)
                .addComponent(jLabel_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_CategoryID, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_CategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Description, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_CategoryID)
                    .addComponent(jLabel_Description)
                    .addComponent(jLabel_CategoryName)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton_Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_Purchase, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(jButton_Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_Search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Search, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Search, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel_CategoryID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_CategoryID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_CategoryName)
                        .addGap(1, 1, 1)
                        .addComponent(jTextField_CategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Description)
                        .addGap(4, 4, 4)
                        .addComponent(jTextField_Description, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void init() {
        jTextField_CategoryID.setBackground(notEdit);
        jTextField_CategoryID.setEditable(false);
        jTextField_CategoryID.setText(String.valueOf(categoryDAO.getMaxRox()));
        categoryTable();
        announcement.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
    }
    
    private void showAnnouncement(String text, String title, int messageType) {
        announcement.setText(text);
        JOptionPane.showMessageDialog(this, announcement, title, messageType);
    }
    
    private void categoryTable() {
        setInformationCategoryTable("");
        jTable1.setRowHeight(30);
        jTable1.setShowGrid(true);
        jTable1.setGridColor(Color.BLACK);
        jTable1.setBackground(Color.WHITE);
        jTable1.setSelectionBackground(Color.LIGHT_GRAY);
    }
    
    private void setInformationCategoryTable(String text) {
        model = (DefaultTableModel) jTable1.getModel();
        ArrayList<Category> result = categoryController.getAllCategories(text);
        Object[] row;
        for(var x : result) {
            row = new Object[3];
            row[0] = x.getCID();
            row[1] = x.getCName();
            row[2] = x.getCDecrip();
            model.addRow(row);
        }
    }
    
    private void clear() {
        jTextField_CategoryID.setText(String.valueOf(categoryDAO.getMaxRox()));
        jTextField_CategoryName.setText("");
        jTextField_Description.setText("");
        jTextField_Search.setText("");
        jTable1.clearSelection();
        jTable1.setModel(new DefaultTableModel(null, new Object[] {"Category ID", "Category Name", "Description"}));
        setInformationCategoryTable("");
        statisticDAO.admin();
    }
    
    private boolean isEmpty() {
        if(jTextField_CategoryName.getText().isEmpty()) {
            showAnnouncement("Category name is Empty !", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(jTextField_Description.getText().isEmpty()) {
            showAnnouncement("Description of Category is Empty !", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
    
    private boolean check() {
        String newCategory = jTextField_CategoryName.getText();
        String oldCategory = model.getValueAt(rowIndex, 1).toString();
        
        if(newCategory.equals(oldCategory)) {
            return false;
        } else {
            if(!newCategory.equals(oldCategory)) {
                boolean x = categoryDAO.isCategoryNameExist(newCategory);
                if(x) {
                    showAnnouncement("This Category Name already exist", "Warning", JOptionPane.WARNING_MESSAGE);
                }
                return x;
            }
        }
        return false;
    }
    
    private void jLabel_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BackMouseClicked
        setVisible(false);
        AdminDashboard.jPanel16.setBackground(primaryColor);
        AdminDashboard.jPanel17.setBackground(primaryColor);
    }//GEN-LAST:event_jLabel_BackMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for(double i = 0.1; i <= 1.0; i += 0.1) {
            String s = "" + i;
            float f = Float.parseFloat(s);
            this.setOpacity(f);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(ManageCategory.class.getName()).log(Level.SEVERE, null, ex);
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

    private void jButton_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddActionPerformed
        if(isEmpty()) {
                int id = Integer.parseInt(jTextField_CategoryID.getText());
                if(!categoryDAO.isCategoryIdExists(id)) {
                    String name = jTextField_CategoryName.getText();
                    String des = jTextField_Description.getText();
                    if(!categoryDAO.isCategoryNameExist(name)) {
                        if(categoryDAO.insert(id, name, des)) {
                            showAnnouncement("Category added successfully !", "Announcement", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            showAnnouncement("Failed to Add category data !", "Announcement", JOptionPane.WARNING_MESSAGE);
                        }
                        jTable1.setModel(new DefaultTableModel(null, new Object[] {"Category ID", "Category Name", "Description"}));
                        setInformationCategoryTable("");
                        clear();
                    } else {
                        showAnnouncement("This Category Name already exist", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    showAnnouncement("Category ID has used", "Warning", JOptionPane.WARNING_MESSAGE);
                }    
        }
    }//GEN-LAST:event_jButton_AddActionPerformed

    private void jButton_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClearActionPerformed
        clear();
    }//GEN-LAST:event_jButton_ClearActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        model = (DefaultTableModel) jTable1.getModel();
        rowIndex = jTable1.getSelectedRow();
        jTextField_CategoryID.setText(model.getValueAt(rowIndex, 0).toString());
        jTextField_CategoryName.setText(model.getValueAt(rowIndex, 1).toString());
        jTextField_Description.setText(model.getValueAt(rowIndex, 2).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    // event of "Purchase" button
    private void jButton_PurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PurchaseActionPerformed
        if(isEmpty()) {
            if(!check()) {
                int id = Integer.parseInt(jTextField_CategoryID.getText());
                String name = jTextField_CategoryName.getText();
                String description = jTextField_Description.getText();
                if(categoryDAO.update(id, name, description)) {
                    showAnnouncement("Category data successfully updated", "Announcement", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    showAnnouncement("Failed to update category data", "Announcement", JOptionPane.INFORMATION_MESSAGE);
                }
                jTable1.setModel(new DefaultTableModel(null, new Object[] {"Category ID", "Category Name", "Description"}));
                setInformationCategoryTable("");
                clear();
            }
        }
    }//GEN-LAST:event_jButton_PurchaseActionPerformed

    // event of "Search" jTextField
    private void jTextField_SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_SearchKeyReleased
        jTable1.setModel(new DefaultTableModel(null, new Object[] {"Category ID", "Category Name", "Description"}));
        setInformationCategoryTable(jTextField_Search.getText());
    }//GEN-LAST:event_jTextField_SearchKeyReleased

    // event of "Delete" button
    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed
        int categoryID = Integer.parseInt(jTextField_CategoryID.getText());
        
        if (!categoryDAO.isCategoryIdExists(categoryID)) {
            showAnnouncement("Please select a Category", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            announcement.setText("Are you sure to delete this Account ?");
            int x = JOptionPane.showConfirmDialog(this, announcement, "Delete", JOptionPane.OK_CANCEL_OPTION, 0);
            if (x == JOptionPane.OK_OPTION) {
                if (categoryDAO.isCategoryIdExists(categoryID)) {
                    categoryDAO.delete(categoryID);
                    showAnnouncement("This Category Deleted", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    showAnnouncement("Category doesn't exist", "Warning", JOptionPane.WARNING_MESSAGE);
                }
                clear();
            }
        }
    }//GEN-LAST:event_jButton_DeleteActionPerformed

//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ManageCategory().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add;
    private javax.swing.JButton jButton_Clear;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_Purchase;
    private javax.swing.JLabel jLabel_Back;
    private javax.swing.JLabel jLabel_CategoryID;
    private javax.swing.JLabel jLabel_CategoryName;
    private javax.swing.JLabel jLabel_Description;
    private javax.swing.JLabel jLabel_Search;
    private javax.swing.JLabel jLabel_Title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_CategoryID;
    private javax.swing.JTextField jTextField_CategoryName;
    private javax.swing.JTextField jTextField_Description;
    private javax.swing.JTextField jTextField_Search;
    // End of variables declaration//GEN-END:variables
}
