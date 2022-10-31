/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
//import java.util.List;

/**
 *
 * @author Jiale Lyu
 */
public class DoctorDirectory {
    ArrayList<Doctor> doctorDirectory;
    
    public DoctorDirectory(){
        doctorDirectory = new ArrayList<Doctor>();
    }

    /**
     *
     * @return
     */
    public ArrayList<Doctor> getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(ArrayList<Doctor> doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }
    

    public boolean addDoctor(Doctor doctor){
        return  doctorDirectory.add(doctor);
    }
    
    public void removeDoctor(Doctor doctor) {
        doctorDirectory.remove(doctor);
    }
    
    public boolean isEmpty(){
        return doctorDirectory.isEmpty();
    }
    public int getSize(){
       return doctorDirectory.size();
    }
}
