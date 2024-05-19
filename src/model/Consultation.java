/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC
 */
public class Consultation extends Model{
        private int idConsultation ;
        private int idPatient;
        private String diagnostique;
        private String date;

    public int getIdConsultation() {
        return idConsultation;
    }

    public void setIdConsultation(int idConsultation) {
        this.idConsultation = idConsultation;
    }

    public int getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(int idUser) {
        this.idPatient = idUser;
    }

    public String getDiagnostique() {
        return diagnostique;
    }

    public void setDiagnostique(String diagnostic) {
        this.diagnostique = diagnostic;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
        
           
}
