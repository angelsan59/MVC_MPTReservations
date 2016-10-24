/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 * Classe metier des Adhérents
 * @author sociepka
 */
public class Adherent {
    int numAdherent;
    String nomAdherent;
    String prenomAdherent;
    String adresseAdherent;

    /**
     * Constructeur de l'objet Adherent
     * @param nomAdherent nom de l'adhérent
     * @param prenomAdherent prénom de l'adhérent
     */
    public Adherent(String nomAdherent, String prenomAdherent) {
        this.nomAdherent = nomAdherent;
        this.prenomAdherent = prenomAdherent;
    }
    
     /**
     * Constructeur par défaut de Réservation
     */
    public Adherent(){}

/**
 * Getter du nom d'adhérent
 * @return 
 */    
    public String getNomAdherent() {
        return nomAdherent;
    }
/**
 * Setter du nom d'adhérent
 * @param nomAdherent nom de l'adhérent
 */
    public void setNomAdherent(String nomAdherent) {
        this.nomAdherent = nomAdherent;
    }
/**
 * Getter du prénom d'adhérent
 * @return 
 */
    public String getPrenomAdherent() {
        return prenomAdherent;
    }
/**
 * Getter du numéro de l'adhérent
 * @return 
 */    
     public int getNumAdherent() {
        return numAdherent;
    }
/**
 * Setter du numéro de l'adhérent
 * @param numAdherent numéro de l'adhérent
 */
     public void setNumAdherent(int numAdherent) {
        this.numAdherent = numAdherent;
    }
/**
 * Setter du prénom de l'adhérent
 * @param prenomAdherent prénom de l'adhérent
 */     
    public void setPrenomAdherent(String prenomAdherent) {
        this.prenomAdherent = prenomAdherent;
    }
    
    
}
