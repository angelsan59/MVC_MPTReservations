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

    public Adherent(String nomAdherent, String prenomAdherent) {
        this.nomAdherent = nomAdherent;
        this.prenomAdherent = prenomAdherent;
    }
    
    public Adherent(){}

    public String getNomAdherent() {
        return nomAdherent;
    }

    public void setNomAdherent(String nomAdherent) {
        this.nomAdherent = nomAdherent;
    }

    public String getPrenomAdherent() {
        return prenomAdherent;
    }
    
     public int getNumAdherent() {
        return numAdherent;
    }

     public void setNumAdherent(int numAdherent) {
        this.numAdherent = numAdherent;
    }
    public void setPrenomAdherent(String prenomAdherent) {
        this.prenomAdherent = prenomAdherent;
    }
    
    
}
