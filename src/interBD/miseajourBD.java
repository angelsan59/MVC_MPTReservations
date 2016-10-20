/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interBD;

import static interBD.interrogationBD.r;
import static interBD.interrogationBD.r1;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import metier.Adherent;
import metier.Representation;

/**
 * Classe qui ajoute les réservations avec les paramètres choisis par l'utilisateur dans la fenêter de l'application
 * @author sociepka
 */
public class miseajourBD {
    
    /**
     * Constructeur de l'ajout d'une réservation
     * @param numadherent numéro de l'adhérent
     * @param numrepresentation numéro de la représentation
     * @param nbpersonnes nombre de personnes
     * @param dateresa date de la réservation, c'est à dire la date de l'ajout (date du jour)
     */
    public static void majBdd(int numadherent,int numrepresentation,int nbpersonnes,String dateresa) 
    { 
    connectionBD conn = new connectionBD("jdbc:oracle:thin:@localhost:1521:XE", "system", "root");
    
        if (conn.connect()) {
           
          // ResultSet rs = conn.exec("INSERT INTO SAN.RESERVATION VALUES('1','"+numadherent+"','"+numrepresentation+"','"+nbpersonnes+"','"+dateresa+"')");
          ResultSet rs = conn.exec("INSERT INTO SAN.RESERVATION VALUES(SAN.RESAUTOID.NEXTVAL,'"+numadherent+"','"+numrepresentation+"','"+nbpersonnes+"',TO_DATE('"+dateresa+"', 'dd/MM/yyyy'))");
            if (rs != null) {
                
             JOptionPane.showMessageDialog(null, "La réservation a bien été ajoutée", "Ajout de réservation", JOptionPane.INFORMATION_MESSAGE);
               
            }
 
        conn.close();
    }     
    else {
            System.out.println("oracle connection failed !!!");
        }
    }}
