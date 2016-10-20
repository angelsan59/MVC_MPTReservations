/*
 * classe test préliminaire pour la connection à la base oracle et affichage du contenu de la table adherent
 */
package interBD;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author sociepka
 */
public class test {
     //public static void main(String[] args) throws ClassNotFoundException, SQLException {
    public void test() throws ClassNotFoundException, SQLException{
       Class.forName ("oracle.jdbc.driver.OracleDriver");
       ArrayList listeAdherents = new ArrayList();
 
        Connection conn = DriverManager.getConnection
            ("jdbc:oracle:thin:@localhost:1521:XE", "system", "root");
                            // @//machineName:port/SID,   userid,  password
       try {
        Statement stmt = conn.createStatement();
         System.out.println("base connectée");
        
      
        try {
        ResultSet rset = stmt.executeQuery("select nomAdherent,prenomAdherent from san.ADHERENT ");
         System.out.println("resultset");
        try {
        while (rset.next())
        { //System.out.println (rset.getString(1));   // Print col 1
        //String chaine = "";
        //chaine = chaine + rset.getString(1);
        listeAdherents.add (rset.getString(1)+ " "+ rset.getString(2));}
         System.out.println("build liste");
        } 
        
        finally {
            try { rset.close(); } catch (Exception ignore) {}
        }
        } finally {
            try { stmt.close(); } catch (Exception ignore) {}
        }
        } finally {
            try { conn.close(); } catch (Exception ignore) {}
        }
       System.out.println(listeAdherents);
        System.out.println("affiche liste");
  }
}
