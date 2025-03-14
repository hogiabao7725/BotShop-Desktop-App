package Chat.Client.MySwing;

import javax.swing.ImageIcon;

public class Emoji extends javax.swing.JButton {

    public Emoji(String icon) {
        setContentAreaFilled(false);
        setBorder(null);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setIcon(new ImageIcon(getClass().getResource("/Emoji/" + icon)));
        setName(icon);
    }

}
