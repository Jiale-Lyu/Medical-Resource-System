/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Jiale Lyu
 */
public class Patient extends Person{
    
    EncounterHistory history;
    
    public Patient(String id, String name, String gender, int age, String city) {
        super(id, name, gender, age, city);
    }

    public Patient(){
        
    }

    public EncounterHistory getHistory() {
        return history;
    }

    public void setHistory(EncounterHistory history) {
        this.history = history;
    }
   
    
    
}

