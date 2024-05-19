/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Model;
import model.Certificat;

/**
 *
 * @author PC
 */
public class CertificatDao implements Idao {

    @Override
    public void save(Model model) {
        Certificat cer = (Certificat) model;
        String query = "INSERT INTO certificats(id_patient, date_debut, date_fin, cause) VALUES('" + cer.getIdPatient() + "','" + cer.getDateDeb()+ "','" + cer.getDateFin()+ "','" + cer.getCause()+ "')";
        DbOperation.setDataOrDelete(query, "Certificate created Secssfully");
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
