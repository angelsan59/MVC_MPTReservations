/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.Date;

/**
 * Classe metier des Représentants
 * @author sociepka
 */
public class Representation {
    int numRepresentation;
    int numSpectacle;
    String nomSpectacle;
    int numSalle;
    Date dateRepresentation;
    int tarif;

    public Representation(int numRepresentation, int tarif) {
        this.numRepresentation = numRepresentation;
        this.tarif = tarif;
    }
    
    public Representation() {
       
    }

    public int getNumRepresentation() {
        return numRepresentation;
    }

    public void setNumRepresentation(int numRepresentation) {
        this.numRepresentation = numRepresentation;
    }

    public int getNumSpectacle() {
        return numSpectacle;
    }

    public void setNumSpectacle(int numSpectacle) {
        this.numSpectacle = numSpectacle;
    }

    public int getNumSalle() {
        return numSalle;
    }
    
     public String getNomSpectacle() {
        return nomSpectacle;
    }

    public void setNomSpectacle(String nomSpectacle) {
        this.nomSpectacle = nomSpectacle;
    }

    public void setNumSalle(int numSalle) {
        this.numSalle = numSalle;
    }

    public Date getDateRepresentation() {
        return dateRepresentation;
    }

    public void setDateRepresentation(Date dateRepresentation) {
        this.dateRepresentation = dateRepresentation;
    }

    public int getTarif() {
        return tarif;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }
    
    
}
