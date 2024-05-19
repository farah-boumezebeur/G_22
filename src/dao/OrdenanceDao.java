/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Medicament;
import model.Model;
import model.Ordonance;
import model.Patient;

/**
 *
 * @author PC
 */
public class OrdenanceDao implements Idao {

    public boolean saveMedicament(Medicament medicament) {
        try {
            String query = "INSERT INTO medicaments(id_ordenance, medicament, quantite, valeur) VALUES('" + medicament.getIdOrdenance() + "','" + medicament.getMedicament() + "','" + medicament.getQunatite() + "','" + medicament.getValue() + "')";
            DbOperation.setDataOrDelete(query, "");
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    @Override
    public void save(Model model) {
        // Save ordenance and medicaments 
        int idOrdenance = -1;
        Ordonance  ord = (Ordonance) model;
        String query = "INSERT INTO ordenances(id_consultation) VALUES('" + ord.getIdConsultation()+ "')";
        idOrdenance = DbOperation.getLastId("ordenances");
        for(Medicament med: ord.getMedicaments() ){
            med.setIdOrdenance(idOrdenance);
            this.saveMedicament(med);
        }
        DbOperation.setDataOrDelete(query, "OrdenanceAddSecssfully added Secssfully");
    }

    @Override
    public void edit(Model model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
