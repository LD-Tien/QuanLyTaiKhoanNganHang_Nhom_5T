/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author LÊ VĂN THẮNG
 */
public class databasehelper {
    public static Connection opConnection() {
        final String Url = "jdbc:sqlserver://PC1\\SQLEXPRESS\\SQLEXPRESS:1433;databaseName=NganHangJavanc";
        final String user = "sa";
        final String pass = "12345";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(Url, user, pass);
        }  catch (ClassNotFoundException | SQLException e) {
        }
      return null;
    }
    public static void main(String[] args) {
        Connection connection = opConnection();
       if (connection !=  null){
           System.out.println("thanh cong");
           
       }
       else 
            System.out.println("that bai");
    }
}
