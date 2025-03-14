package Chat.Client.MySwing;

import Chat.Client.Function.Method;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;

public class Get_File_New extends javax.swing.JPanel {

    public int getFileID() {
        return fileID;
    }

    public void setFileID(int fileID) {
        this.fileID = fileID;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public Get_File_New() {
        initComponents();
    }
    private int fileID;
    private String fileName;
    private String fileSize;

    public void set(int ID, String fileName, ImageIcon icon) {
        this.fileID = Integer.valueOf(fileName.split("!")[0]);
        this.fileName = fileName.split("!")[1];
        this.fileSize = fileName.split("!")[2];
        lbFileName.setIcon(icon);
        lbFileName.setText(this.fileName);
        if (Method.getFriends().get(ID).getImage() != null) {
            profile.setIcon(Method.getFriends().get(ID).getImage());
        }
        lbName.setText(Method.getFriends().get(ID).getfName());
        lbFileName.setToolTipText(fileSize);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        border = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        lbFileName = new javax.swing.JButton(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g;
                g2.setColor(new java.awt.Color(195, 191, 191));
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
                g2.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 20, 20);
            }
        };

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(600, 72));

        jLayeredPane1.setLayout(new javax.swing.OverlayLayout(jLayeredPane1));

        border.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        border.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Chat/Client/Icon/border_small.png"))); // NOI18N
        jLayeredPane1.add(border);

        profile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Chat/Client/Icon/profile_small.png"))); // NOI18N
        jLayeredPane1.add(profile);

        lbName.setFont(new java.awt.Font("Khmer SBBIC Serif", 1, 12)); // NOI18N
        lbName.setForeground(new java.awt.Color(29, 118, 206));
        lbName.setText("Name");

        lbFileName.setFont(new java.awt.Font("Khmer SBBIC Serif", 0, 13)); // NOI18N
        lbFileName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Chat/Client/Icon/file_1.png"))); // NOI18N
        lbFileName.setText("File name.rar");
        lbFileName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 20));
        lbFileName.setContentAreaFilled(false);
        lbFileName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbFileName.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        lbFileName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbFileNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbFileName)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbName)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbFileName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lbFileNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbFileNameActionPerformed
        Method.downloadFile(fileID, fileName);
    }//GEN-LAST:event_lbFileNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel border;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JButton lbFileName;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel profile;
    // End of variables declaration//GEN-END:variables
}
