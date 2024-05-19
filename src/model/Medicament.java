/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC
 */
public class Medicament {
    private int idMedicament;
    private int idOrdenance;
    private String medicament;
    private String qunatite;
    private String value;

    public int getIdMedicament() {
        return idMedicament;
    }

    public void setIdMedicament(int idMedicament) {
        this.idMedicament = idMedicament;
    }

    public int getIdOrdenance() {
        return idOrdenance;
    }

    public void setIdOrdenance(int idOrdenance) {
        this.idOrdenance = idOrdenance;
    }

    public String getMedicament() {
        return medicament;
    }

    public void setMedicament(String medicament) {
        this.medicament = medicament;
    }

    public String getQunatite() {
        return qunatite;
    }

    public void setQunatite(String qunatite) {
        this.qunatite = qunatite;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
}