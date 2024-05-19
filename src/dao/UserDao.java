/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.swing.JOptionPane;
import model.AdminUser;
import java.sql.*;
import model.Model;
/**
 *
 * @author PC
 */
public class UserDao implements Idao{
    @Override
    public   void save(Model model){
        AdminUser adminUser = (AdminUser)model;
        String query = "INSERT INTO users(fname, lname, email, password, userType) VALUES('"+adminUser.getFname()+"','"+adminUser.getLname()+"','"+adminUser.getEmail()+"','"+adminUser.getPassword()+"','"+adminUser.getUserType()+"')";
        DbOperation.setDataOrDelete(query, "Register Secssfully");
    }
 
    
    public static AdminUser Login(String email, String password){
        AdminUser adminUser = null;
        try{
               ResultSet res = DbOperation.getData("SELECT * FROM users WHERE email = '"+email+"'");
               while(res.next()){
                   adminUser = new AdminUser();
                   adminUser.setEmail(res.getString("email"));
                   adminUser.setPassword(res.getString("password"));
                   adminUser.setFname(res.getString("fname"));
                   adminUser.setLname(res.getString("lname"));
                   adminUser.setUserType(res.getInt("userType"));
               }
               if(adminUser !=  null){
                   if(!adminUser.getPassword().equals(password)){
                       JOptionPane.showMessageDialog(null, "Wrong password");
                       adminUser = null;
                   }
               }else{
                       JOptionPane.showMessageDialog(null, "This email is not exisit");
               }
               
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return adminUser;
            
    }
    
    @Override
    public void edit(Model model){};
    @Override
    public void delete(){};


}
