        
package com.mycompany.proyecto_progra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionBD {
   
    private static final String URL = "jdbc:mysql://localhost:3306/parqueo_umg";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "2025";

    // obtengo la conexión
    public static Connection conectar() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            System.out.println("Conexión exitosa a la base de datos");
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
        return conn;//conn devuelva esa conexión al lugar desde donde fue llamada
    }
}

