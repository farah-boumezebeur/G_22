/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.ResultSet;
import model.Model;
import model.Patient;

/**
 *
 * @author PC
 */
public class PatientDao implements Idao {

    @Override
    public void save(Model model) {
        Patient patient = (Patient) model;
        String query = "INSERT INTO patients(fname, lname, dn) VALUES('" + patient.getFname() + "','" + patient.getLname() + "','" + patient.getDn() + "')";
        DbOperation.setDataOrDelete(query, "Patient added Secssfully");
    }

    @Override
    public void edit(Model model) {
        Patient patient = (Patient) model;
        String query = "UPDATE patients SET fname ='"+patient.getFname()+"' , lname = '"+patient.getLname()+"', dn = '"+patient.getDn()+"' WHERE id = '"+patient.getIdPatient()+"'";
        DbOperation.setDataOrDelete(query, "Patient Edited Secssfully");
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ResultSet all() {
        ResultSet res = DbOperation.getData("SELECT * FROM patients");
        return res;
    }

}
