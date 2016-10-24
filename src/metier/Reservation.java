/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.sql.Date;

/**
 * Classe métier des réservations
 * @author sociepka
 */
public class Reservation {
    int numresa;
    int numadherent;
    int numrepresentation;
    int nbpersonnes;
    Date dateresa;
    Date daterepresentation;
    String nomspectacle;

    /**
     * Constructeur par défaut de Réservation
     */
    public Reservation() {
    }
    
    /**
     * Constructeur des objets Reservation
     * @param numresa numéro de réservation
     * @param numadherent numéro d'adhérent
     * @param numrepresentation numéro de la représentation
     * @param nbpersonnes nombre de personnes dans la réservation
     * @param dateresa date où la réservation a eu lieu
     * @param daterepresentation date de la représentation
     * @param nomspectacle nom du spectacle
     */
    public Reservation(int numresa, int numadherent, int numrepresentation, int nbpersonnes, Date dateresa, Date daterepresentation, String nomspectacle) {
        this.numresa = numresa;
        this.numadherent = numadherent;
        this.numrepresentation = numrepresentation;
        this.nbpersonnes = nbpersonnes;
        this.dateresa = dateresa;
        this.daterepresentation = daterepresentation;
        this.nomspectacle = nomspectacle;
    }
/**
 * Getteur du numéro de réservation
 * @return 
 */
    public int getNumresa() {
        return numresa;
    }
/**
 * Setter du numéro de réservation
 * @param numresa numéro de réservation
 */
    public void setNumresa(int numresa) {
        this.numresa = numresa;
    }
/**
 * Getter du numéro d'adhérent
 * @return 
 */
    public int getNumadherent() {
        return numadherent;
    }
/**
 * Setter du numéro d'adhérent
 * @param numadherent numéro d'adhérent
 */
    public void setNumadherent(int numadherent) {
        this.numadherent = numadherent;
    }
/**
 * Getter du numéro de représentation
 * @return 
 */
    public int getNumrepresentation() {
        return numrepresentation;
    }
/**
 * Setter du numéro de représentation
 * @param numrepresentation numéro de représentation
 */
    public void setNumrepresentation(int numrepresentation) {
        this.numrepresentation = numrepresentation;
    }
/**
 * Getter du nombre de personnes
 * @return 
 */
    public int getNbpersonnes() {
        return nbpersonnes;
    }
/**
 * Setter du nombre de personnes
 * @param nbpersonnes nombre de personnes
 */
    public void setNbpersonnes(int nbpersonnes) {
        this.nbpersonnes = nbpersonnes;
    }
/**
 * Getter de la date de réservation
 * @return 
 */
    public Date getDateresa() {
        return dateresa;
    }
/**
 * Setter de la date de réservation
 * @param dateresa date de réservation
 */
    public void setDateresa(Date dateresa) {
        this.dateresa = dateresa;
    }
/**
 * Getter de la date de la représentation
 * @return 
 */
     public Date getDaterepresentation() {
        return daterepresentation;
    }
/**
 * Setter de la date de représentation
 * @param daterepresentation date de représentation
 */
    public void setDaterepresentation(Date daterepresentation) {
        this.daterepresentation = daterepresentation;
    }
/**
 * Getter du nom du spectacle
 * @return 
 */    
     public String getNomspectacle() {
        return nomspectacle;
    }
/**
 * Setter du nom du spectacle
 * @param Nomspectacle nom du spectacle
 */
    public void setNomspectacle(String Nomspectacle) {
        this.nomspectacle = nomspectacle;
    }
}
