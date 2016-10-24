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

    /**
     * Constructeur de l'objet Representation
     * @param numRepresentation numéro de la représentation
     * @param tarif prix unitaire de la représentation
     */
    public Representation(int numRepresentation, int tarif) {
        this.numRepresentation = numRepresentation;
        this.tarif = tarif;
    }
    
     /**
     * Constructeur par défaut de Réservation
     */
    public Representation() {
}
/**
 * Getter du numéro de la représentation
 * @return 
 */
    public int getNumRepresentation() {
        return numRepresentation;
    }
/**
 * Setter du numéro de la représentation
 * @param numRepresentation numéro de la représentation
 */
    public void setNumRepresentation(int numRepresentation) {
        this.numRepresentation = numRepresentation;
    }
/**
 * Getter du numéro du spectacle
 * @return 
 */
    public int getNumSpectacle() {
        return numSpectacle;
    }
/**
 * Setter du numéro du spectacle
 * @param numSpectacle numéro du spectacle
 */
    public void setNumSpectacle(int numSpectacle) {
        this.numSpectacle = numSpectacle;
    }
/**
 * Getter du numéro de la salle
 * @return 
 */
    public int getNumSalle() {
        return numSalle;
    }
/**
 * Getter du numéro du spectacle
 * @return 
 */    
     public String getNomSpectacle() {
        return nomSpectacle;
    }
/**
 * Setter du nom du spectacle
 * @param nomSpectacle nom du spectacle
 */
    public void setNomSpectacle(String nomSpectacle) {
        this.nomSpectacle = nomSpectacle;
    }
/**
 * Setter du numéro de la salle
 * @param numSalle numéro de la salle
 */
    public void setNumSalle(int numSalle) {
        this.numSalle = numSalle;
    }
/**
 * Getter de la date de la représentation
 * @return 
 */
    public Date getDateRepresentation() {
        return dateRepresentation;
    }
/**
 * Setter de la date de représentation
 * @param dateRepresentation date de la représentation
 */
    public void setDateRepresentation(Date dateRepresentation) {
        this.dateRepresentation = dateRepresentation;
    }
/**
 * Getter du tarif
 * @return 
 */
    public int getTarif() {
        return tarif;
    }
/**
 * Setter du tarif
 * @param tarif prix unitaire de la représentation
 */
    public void setTarif(int tarif) {
        this.tarif = tarif;
    }
    
    
}
