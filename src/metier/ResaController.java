/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author San
 */
public class ResaController implements IMetier {

    @Override
    public List<Adherent> getAdherents() {
        List<Adherent> adh=new ArrayList<Adherent>();
        Connection conn=SingletonConnection.getConnection();
        
         try{
        PreparedStatement ps=conn.prepareStatement("select * from san.ADHERENT");
        //ps.setString(1, "%+mc+%");
        ResultSet rs= ps.executeQuery();
        while(rs.next())
        {
           Adherent a= new Adherent();
          a.setNomAdherent(rs.getString(2));
          a.setPrenomAdherent(rs.getString(3));
          a.setNumAdherent(rs.getInt(1)); 
          adh.add(a); }
        
        rs.next();
        ps.close();
       }
       catch (SQLException e)
       {e.printStackTrace();}
   return adh;
  
    }

    @Override
    public List<Representation> getRepresentations() {
        List<Representation> rep=new ArrayList<Representation>();
        Connection conn=SingletonConnection.getConnection();
        
         try{
        PreparedStatement ps=conn.prepareStatement("SELECT repr.NUMREPRESENTATION, repr.NUMSPECTACLE,repr.DATEREPRESENTATION, repr.TARIF, spec.NOMSPECTACLE FROM san.REPRESENTATION repr, san.SPECTACLE spec WHERE repr.numSpectacle =spec.numSpectacle");
        //ps.setString(1, "%+mc+%");
        ResultSet rs= ps.executeQuery();
        while(rs.next())
        {
           Representation r= new Representation();
          r.setNumRepresentation(rs.getInt(1));
          r.setNumSpectacle(rs.getInt(2));
          r.setTarif(rs.getInt(4));
          r.setNomSpectacle(rs.getString(5));
          r.setDateRepresentation(rs.getDate(3));
          rep.add(r); }
        
        rs.next();
        ps.close();
       }
       catch (SQLException e)
       {e.printStackTrace();}
   return rep;
    }

    @Override
    public void addReservation(Reservation r) {
        Connection conn=SingletonConnection.getConnection();
        String format = "dd/MM/yyyy"; 
        java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat( format ); 
        java.util.Date datejour = new java.util.Date(); 
        String datejour1 = formater.format( datejour );
       try{
        PreparedStatement ps=conn.prepareStatement("INSERT INTO SAN.RESERVATION VALUES(SAN.RESAUTOID.NEXTVAL,?,?,?,TO_DATE('"+datejour1+"', 'dd/MM/yyyy'))");
       // ps.setString(1, "SAN.RESAUTOID.NEXTVAL");
        ps.setInt(1, r.getNumadherent());
        ps.setInt(2, r.getNumrepresentation());
        ps.setInt(3, r.getNbpersonnes());

        ps.executeUpdate();
        
        if (ps != null) {
                
             JOptionPane.showMessageDialog(null, "La réservation a bien été ajoutée", "Ajout de réservation", JOptionPane.INFORMATION_MESSAGE);
               
            }
        ps.close();
        //conn.close();
       }
       catch (SQLException e)
       {e.printStackTrace();}
    }

    }
    

