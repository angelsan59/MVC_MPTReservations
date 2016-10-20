/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interBD;

import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import metier.Adherent;
import metier.Representation;

/**
 * Classe des créations de liste adherents et representations à partir des requêtes 
 * @author sociepka
 */
public class interrogationBD {
    // Déclaration des arraylists pour les adherents et les representations
  public static List<Adherent> r = new ArrayList<>();
  public static List<Representation> r1 = new ArrayList<>();  
  
  
  /**
   * Constructeur d'interrogation des tables adherent et representation
   * @param typetable type de table qui amène à un traitement des données différent selon la table interrogée
   * @param nomtable nom de la table à interroger
   */
   public static void lireBdd(char typetable, String nomtable) 
    { 
    connectionBD conn = new connectionBD("jdbc:oracle:thin:@localhost:1521:XE", "system", "root");
    
        if (conn.connect()) {
             switch (typetable)
             {
             // Création de la liste des adhérents, Nom Prénom
              case 'A':
                try {
                    ResultSet rs = conn.exec("select * from "+nomtable);
                        if (rs != null) {
                            
                            while (rs.next()) {
                                Adherent adh = new Adherent();
                                //System.out.println(" nom = "+rs.getString(2)+" prenom = "+rs.getString(3));
                                adh.setNomAdherent(rs.getString(2));
                                adh.setPrenomAdherent(rs.getString(3));
                                adh.setNumAdherent(rs.getInt(1)); 
                                r.add(adh);
                            }
                            rs.next();
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(connectionBD.class.getName()).log(Level.SEVERE, null, ex);
                    }
                // test console
               //  for (int i=0; i<r.size();i++)
                // {System.out.println(r.get(i).getNomAdherent());}
           break;
                    // Création de la liste Réprésentations, date et nom du spectacle pris dans la table Spectacle
                    case 'R':
                        
                    try {
                        ResultSet rs = conn.exec("SELECT repr.NUMREPRESENTATION, repr.NUMSPECTACLE,repr.DATEREPRESENTATION, repr.TARIF, spec.NOMSPECTACLE FROM san.REPRESENTATION repr, san.SPECTACLE spec WHERE repr.numSpectacle =spec.numSpectacle");
                        if (rs != null) {
                            
                            while (rs.next()) {
                                Representation rep = new Representation();
                                //System.out.println(" no representation= "+rs.getInt(1)+" no Spectacle "+rs.getInt(2)+" date = "+rs.getDate(3)+"nom du spectacle= "+rs.getString(4));
                                rep.setNumRepresentation(rs.getInt(1));
                                rep.setNumSpectacle(rs.getInt(2));
                                rep.setTarif(rs.getInt(4));
                                rep.setNomSpectacle(rs.getString(5));
                                rep.setDateRepresentation(rs.getDate(3));
                                 
                                r1.add(rep);
                            }
                            rs.next();
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(connectionBD.class.getName()).log(Level.SEVERE, null, ex);
                    }
               // test console
               //  for (int i=0; i<r1.size();i++)
               //  {System.out.println(r1.get(i).getNumRepresentation());}
           break;

       
             }  }
             else {
            System.out.println("oracle connection failed !!!");
        }
        conn.close();
    }     
    
    
    }
    
    

