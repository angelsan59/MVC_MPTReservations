/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.List;

/**
 * Interface Métier définissant les méthodes utilisées dans l'appli
 * @author sociepka
 */
public interface IMetier {
    
    public List<Adherent> getAdherents();
    public List<Representation> getRepresentations();
    public void addReservation(Reservation r);
  
}
