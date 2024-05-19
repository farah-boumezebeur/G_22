/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Ordonance extends Model{
    private int idConsultation;
    private int idOrdenance;
    private ArrayList<Medicament> medicaments;

    public ArrayList<Medicament> getMedicaments() {
        return medicaments;
    }

    public void setMedicaments(ArrayList<Medicament> medicaments) {
        this.medicaments = medicaments;
    }

    public int getIdConsultation() {
        return idConsultation;
    }

    public void setIdConsultation(int idConsultation) {
        this.idConsultation = idConsultation;
    }

    public int getIdOrdenance() {
        return idOrdenance;
    }

    public void setIdOrdenance(int idOrdenance) {
        this.idOrdenance = idOrdenance;
    }
    
    
    
}
