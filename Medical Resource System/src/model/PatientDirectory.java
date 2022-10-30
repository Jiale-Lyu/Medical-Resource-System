/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Jiale Lyu
 */
public class PatientDirectory {
    private ArrayList<Patient> patientDirectory;
    
    public PatientDirectory(){
        patientDirectory = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<Patient> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    public boolean addPatient(Patient patient){
        return  patientDirectory.add(patient);
    }
    
    public void removePatient(Patient patient) {
        patientDirectory.remove(patient);
    }
    
   
}
