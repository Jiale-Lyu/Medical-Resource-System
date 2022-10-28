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
public class DoctorDirectory {
    ArrayList<Doctor> doctorDirectory;
    
    public DoctorDirectory(){
        doctorDirectory = new ArrayList<Doctor>();
    }

    public ArrayList<Doctor> getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(ArrayList<Doctor> doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }
    
    public void addDoctor(Doctor doctor){
        doctorDirectory.add(doctor);
    }
}
