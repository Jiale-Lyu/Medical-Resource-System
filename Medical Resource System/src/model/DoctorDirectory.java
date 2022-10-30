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
    
//    public Doctor addDoctor(){
//        Doctor newDoctor = new Doctor("bbb","ccc",25);
//        doctorDirectory.add(newDoctor);
//        return newDoctor;
//    }
    public boolean addDoctor(Doctor doctor){
//        Doctor newDoctor = new Doctor(name,gender,age);
//        newDoctor.setName(name);
//        newDoctor.setAge(age);
//        newDoctor.setGender(gender);
       
        return  doctorDirectory.add(doctor);
    }
    
    public void removeDoctor(Doctor doctor) {
        doctorDirectory.remove(doctor);
    }
    
    public boolean isEmpty(){
        return doctorDirectory.isEmpty();
    }
}
