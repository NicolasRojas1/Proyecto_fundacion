
package Proyecto_fundacion.dao;

import Proyecto_fundacion.models.Personas;
import static java.lang.System.console;
import java.sql.*;
import java.util.logging.Level;
import javax.swing.JOptionPane;

public class PersonaDAO {
    
    Connection con = new Conexion().getConnection();
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public boolean Store(Personas personas){
        
        String sql = "INSERT INTO personas ("
                + "PerTipodeDocumento,"
                + "PerNumerodeDocumento,"
                + "PerLugardeExpedicion,"
                + "PerNombres,"
                + "PerApellidos,"
                + "PerFotografia,"
                + "PerFechadeNacimiento,"
                + "PerEstrato,"
                + "PerEps,"
                + "PerSisben,"
                + "PerCategoriaSisben,"
                + "PerDomicilio,"
                + "PerBarrio,"
                + "PerLocalidad,"
                + "PerEdad) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            
            ps = con.prepareStatement(sql);
            ps.setString(1, personas.getPerTipodeDocumento());
            ps.setString(2, personas.getPerNumerodeDocumento());
            ps.setString(3, personas.getPerLugardeExpedicion());
            ps.setString(4, personas.getPerNombres());
            ps.setString(5, personas.getPerApellidos());
            ps.setString(6, personas.getPerFotografia());
            ps.setString(7, personas.getPerFechadeNacimiento());
            ps.setString(8, personas.getPerEstrato()); //Preguntar por que es de tipo char
            ps.setBoolean(9, personas.isPerEps()); 
            ps.setBoolean(10, personas.isPerSisben());
            ps.setString(11, personas.getPerCategoriaSisben());
            ps.setString(12, personas.getPerDomicilio());
            ps.setString(13, personas.getPerBarrio());
            ps.setString(14, personas.getPerLocalidad());
            ps.setString(15, personas.getPerEdad());
            return true;
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            
            try {
                ps.close();
            } catch (SQLException ex) {
                //console.log(Level.SEVERE, "{0}\n", ex.getMessage());
                System.out.println("No se logró cerrar la conexión");
            }
        }   
    }
}
