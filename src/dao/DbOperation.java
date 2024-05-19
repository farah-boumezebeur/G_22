/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author PC
 */
public class DbOperation {

    public static void setDataOrDelete(String query, String msg) {
        try {
            Connection con = ConnectionProvider.connectionDb();
            Statement st = con.createStatement();
            st.executeUpdate(query);
            if (!msg.equals("")) {
                JOptionPane.showMessageDialog(null, msg);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Message", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static ResultSet getData(String query) {
        try {
            Connection con = ConnectionProvider.connectionDb();
            Statement st = con.createStatement();
            ResultSet res = st.executeQuery(query);
            return res;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Message", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public static int getLastId(String table) {
        int lastId = -1;
        try {
            Connection con = ConnectionProvider.connectionDb();
            Statement st = con.createStatement();
            ResultSet res = st.executeQuery("SELECT MAX(id) FROM " + table);

            if (res.next()) {
                lastId = res.getInt(1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Message", JOptionPane.ERROR_MESSAGE);
        }
        return lastId;
    }

}
