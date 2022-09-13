package Proyecto_fundacion.dao;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    
    Connection conn = null;
    
    public Connection getConnection(){
        
        String url = "jdbc:mysql://localhost:3306/fundacion_nh";
        String user = "root";
        String password = "nemesis159";
         
            System.out.println("----------- Iniciando Conexion -----------");
            
        try {
            
            conn = DriverManager.getConnection(url, user, password); 
            
        } catch(SQLException e){
           
            System.out.println(e.getMessage());//Para ver el mensaje
        }
        
        return conn; //Si se conecta, pues retornará la conexion y ya no sera nula
    }
    
}
