/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;


import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe gérant la connection à la base de données Oracle
 * @author San
 */
public class SingletonConnection {
    
    /**
     * Définition de la connection
     */
   private static Connection connection;
   static {
       try {
           Class.forName("oracle.jdbc.driver.OracleDriver");
           connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "root");
      System.out.println("connection marche");
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(SingletonConnection.class.getName()).log(Level.SEVERE, null, ex);
       ex.printStackTrace();
       } catch (SQLException ex) {
           Logger.getLogger(SingletonConnection.class.getName()).log(Level.SEVERE, null, ex);
       }
      
   }
   
   /**
    * Méthode de connection
    * @return 
    */
   public static Connection getConnection() {
       return connection;
   }
   
}
