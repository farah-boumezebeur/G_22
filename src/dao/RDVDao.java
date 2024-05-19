/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.ResultSet;
import model.Model;

/**
 *
 * @author PC
 */
public class RDVDao implements Idao{

    @Override
    public void save(Model model) {
        model.RDV rdv = (model.RDV)model;
     String query = "INSERT INTO rdvs(id_patient, date, temps) VALUES('"+rdv.getIdPatient()+"','"+rdv.getDate()+"','"+rdv.getTime()+"')";
        DbOperation.setDataOrDelete(query, "Rdv added Secssfully");
    }

    @Override
    public void edit(Model model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
      public ResultSet all(){
        ResultSet res = DbOperation.getData("SELECT * FROM rdvs JOIN patients ON rdvs.id_patient = patients.id");
        return res;
    }
    
}
