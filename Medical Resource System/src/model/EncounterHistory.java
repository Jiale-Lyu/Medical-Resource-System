/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Jiale Lyu
 */
public class EncounterHistory {
    ArrayList<Encounter> encounterHistory = null;
    
    public EncounterHistory(){
        encounterHistory = new ArrayList<Encounter>();
        
    }

    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    public void addEncounter(Encounter e){
        encounterHistory.add(e);
    }
    
}
