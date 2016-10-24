/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import ihmMPT.IHMReservations;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Appelle la classe de la fenêtre de l'application
 * @author sociepka
 */
public class LancerApplicationMPT {
     public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException  {
          
          /**
         * Chargement de la fenetre de réservation
         */
        IHMReservations fp = new IHMReservations (new javax.swing.JFrame(), true);
        fp.setVisible(true);
        
}
}