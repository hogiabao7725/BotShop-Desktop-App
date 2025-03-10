package ConnectDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

// Connect to SQL Server

public class MyConnect {
    private static final String username = "sa";
    private static final String password = "Your pass word is here !";
    private static final String url = "jdbc:sqlserver://DESKTOP-G1PGCVL\\SQLEXPRESS:1433;databaseName=BotShop;encrypt=false";

    public static Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, username, password);
//            System.out.println("Connect Database Successfully"); 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "" + ex, "Cannot connect Database", JOptionPane.WARNING_MESSAGE);
            System.out.println("" + ex + " Cannot connect Database");
        }
        return con;
    }
}
