/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;
/**
 *
 * @author PC
 */
public class ConnectionProvider {
    public static Connection connectionDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_cabinet?useSSL=false","root","farahBMZ.2106");
            return con;
            
        }
        catch(ClassNotFoundException | SQLException e){
            return null;
        }
    }
}
