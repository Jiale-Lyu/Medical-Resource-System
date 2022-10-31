/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Jiale Lyu
 */
public class Encounter {
    private String id;
    private Date date;
    private int pulse;
    private int pressure;
    private double temperature;
    private String diagnose;
    
    public Encounter(){
        
    }

    public Encounter(String id, Date date, int pulse, int pressure, double temperature, String diagnose) {
        this.id = id;
        this.date = date;
        this.pulse = pulse;
        this.pressure = pressure;
        this.temperature = temperature;
        this.diagnose = diagnose;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }
    @Override
    public String toString(){
        return id;
    }
}
