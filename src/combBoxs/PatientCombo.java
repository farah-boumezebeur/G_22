/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package combBoxs;

/**
 *
 * @author PC
 */
public class PatientCombo {
    private int idPatient;
    private String patientName;

    public PatientCombo(int idPatient, String patientName) {
        this.idPatient = idPatient;
        this.patientName = patientName;
    }

    public int getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    @Override
    public String toString() {
        return patientName;
    }
    
    
}
