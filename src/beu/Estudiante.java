/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beu;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author labctr
 */
public class Estudiante extends Castillo.Persona {
    
    private String carrera;
    private final List<String> clubes = new ArrayList<>();

    public Estudiante() {
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    public void addClub(String club){
        if(!club.isEmpty()){
            this.clubes.add(club);
        }       
    }

    public List<String> getClubes() {
        return clubes;
    }
    
    
    
    
}
