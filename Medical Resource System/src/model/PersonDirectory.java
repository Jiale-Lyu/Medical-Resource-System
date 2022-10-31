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
public class PersonDirectory {
    ArrayList<Person> personDirectory;
    
    public PersonDirectory(){
        personDirectory = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(ArrayList<Person> personDirectory) {
        this.personDirectory = personDirectory;
    }
    
    public boolean addPerson(Person person){
        return  personDirectory.add(person);
    }
    
    public void removePerson(Person person) {
        personDirectory.remove(person);
    }
    
    public boolean isEmpty(){
        return personDirectory.isEmpty();
    }
    public int getSize(){
       return personDirectory.size();
    }

}
