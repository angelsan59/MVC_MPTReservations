/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interBD;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Classe de connection, déconnection à la base de donnée et création de la requete
 * @author sociepka
 */
public class connectionBD {
  
  private String dbURL = "";
    private String user = "";
    private String password = "";
    private java.sql.Connection dbConnect = null;
    private java.sql.Statement dbStatement = null;
 
    /**
     * Constructeur
     * @param url adresse de la base
     * @param user nom du user
     * @param password le mot de passe
     */
    public connectionBD(String url, String user, String password) {
        this.dbURL = url;
        this.user = user;
        this.password = password;
    }
 
    /**
     * Connecter à la base de données
     * @return false en cas d'échec
     */
    public Boolean connect() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
            this.dbConnect = DriverManager.getConnection(this.dbURL, this.user, this.password);
            this.dbStatement = this.dbConnect.createStatement();
           // System.out.println("bd connectée");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(connectionBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(connectionBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(connectionBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(connectionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
 
    /**
     * Executer une requete SQL
     * @param sql la requete
     * @return resultat de la requete
     */
    public ResultSet exec(String sql) {
        try {
            ResultSet rs = this.dbStatement.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(connectionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
 
    /**
     * Fermer la connexion au serveur de DB
     */
    public void close() {
        try {
            this.dbStatement.close();
            this.dbConnect.close();
            this.dbConnect.close();
        } catch (SQLException ex) {
            Logger.getLogger(connectionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
}