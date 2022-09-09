package com.mycompany.proyecto_fundacion;

import Proyecto_fundacion.dao.Conexion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    
    public static void main(String[] args) throws SQLException {
        
        //guardo la conexion en respuesta
        Connection respuesta = new Conexion().getConnection();
        
        //Esto es para ejecutar las sentencias sql
        if (respuesta != null) {
            
            System.out.println("----------- Conexion Exitosa -----------");
            PreparedStatement ps; //para preparar una consulta
            ResultSet rs; //Es el que obtiene el resultado
            
            String sql = "SHOW DATABASES";
            int i = 1;
            
            try {
                ps = respuesta.prepareStatement(sql); //Aqui toma la consulta
                rs = ps.executeQuery(); //Aqui la ejecuta
                
                if(rs.next()){ //Para ver si hay un dato siguiente y que lo  traiga
                    
                    System.out.println(rs.getString(i)); //***revisar la respuesta
                    i++;
                }
                
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            } finally{
                respuesta.close();
                System.out.println("-------- Conexion cerrada ---------");
            }
        }
        //Principal form = new Principal();
        //form.setVisible(true); // llamar a la ventana Principal para desencadenar el programa.
    }
}
