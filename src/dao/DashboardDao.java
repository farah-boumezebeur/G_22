/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class DashboardDao {

    public int count(String table, boolean withDate) {
        try {
            String query = "SELECT COUNT(*) FROM " + table;
            if (withDate) {
                LocalDate dt = LocalDate.now();
                // Assuming your 'date' column is of a date-compatible type (e.g., DATE, TIMESTAMP)
                // You might need to adjust the date formatting based on your database
                query += " WHERE date = '" + dt + "'"; 
            }
            ResultSet res = DbOperation.getData(query);

            if (res.next()) {
                return res.getInt(1);
            } else {
                return 0;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return 0;
    }

}