package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;


public class databasehelper {
    public static Connection opConnection(){
        String connectionURL = "jdbc:jtds:sqlserver://localhost:1433/NganHangJavanc";
        String userName = "sa";
        String password = "12345";
        
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            return DriverManager.getConnection(connectionURL, userName, password);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(SQLServerConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }    
        ////  Kiểm tra kêt nối DB
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection conn = opConnection();
        
        System.out.println("Get connection " + conn);
        if (conn != null)
            System.out.println("Done!");
        else
            System.out.println("Error!");
    }
}
