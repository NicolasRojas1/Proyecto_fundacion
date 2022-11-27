package com.mycompany.proyecto_fundacion;

import Proyecto_fundacion.dao.Conexion;
import Proyecto_fundacion.vistas.Loggin;
import Proyecto_fundacion.vistas.Principal;
import Proyecto_fundacion.vistas.RegistroPersonas;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    
    public static void main(String[] args){
        
        Loggin form = new Loggin();
        form.setVisible(true); // llamar a la ventana Principal para desencadenar el programa.
        
    }
}
