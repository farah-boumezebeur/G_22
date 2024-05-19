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
public class ConsultationDao implements Idao {

    @Override
    public void save(Model model) {
        model.Consultation consultation = (model.Consultation) model;
        String query = "INSERT INTO consultations(id_patient, diagnostique, date) VALUES('" + consultation.getIdPatient() + "','" + consultation.getDiagnostique() + "','" + consultation.getDate() + "')";
        DbOperation.setDataOrDelete(query, "Consultation added Secssfully");
    }

    @Override
    public void edit(Model model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ResultSet all(int idPatient) {
        ResultSet res = DbOperation.getData("SELECT * FROM consultations WHERE id_patient ="+idPatient);
        return res;
    }

}
