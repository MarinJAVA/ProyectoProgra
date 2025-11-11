
package com.mycompany.proyecto_progra;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


 
public class importarArchivo {

   
    public static void importarCSV(String rutaCSV, char separador) throws IOException, SQLException {

        // 1️⃣ Conectamos con la base de datos
     try (Connection conn = ConexionBD.conectar()) {

       if (conn == null) {
                throw new SQLException("No se pudo conectar a la base de datos.");
            }

     conn.setAutoCommit(false); 


    String sql = "INSERT IGNORE INTO vehiculo (Placa, carne, Tipo_vehiculo, nombre) VALUES (?, ?, ?, ?)";//orden de mis columnas en la tabla 

     try (PreparedStatement ps = conn.prepareStatement(sql);
                 BufferedReader br = Files.newBufferedReader(Paths.get(rutaCSV), StandardCharsets.UTF_8)) {

     String linea;
      int batchSize = 0;
        final int TOPE_BATCH = 500; 

               
        while ((linea = br.readLine()) != null) {

            
           String[] campos = linea.split("\\Q" + separador + "\\E", -1);

                    
      if (campos.length < 3) {
            System.err.println("Línea inválida: " + linea);
          continue;
              }
      
            
            String nombre = campos[0].trim();
           String apellido=campos [1].trim();
             String carne = campos[2].trim();
           String placa = campos[3].trim();
                    
                  //////////////////////////////////
           if (placa.isEmpty()) {
      System.err.println("Línea sin placa, se omite.");
               continue;
                    }

                    
         ps.setString(1, placa);          
          ps.setString(2, carne);         
          ps.setString(3, "Carro");        
          ps.setString(4, nombre);

              
       ps.addBatch(); 
      batchSize++;

                 
          if (batchSize >= TOPE_BATCH) {
               ps.executeBatch();
              batchSize = 0;
                   }
               }

      if (batchSize > 0) {
                   ps.executeBatch();
                }

            conn.commit();
            System.out.println("Importación completada con éxito.");
           
                
           } catch (Exception e) {
               conn.rollback(); // revierte si algo falla
             throw e;
           } finally {
               conn.setAutoCommit(true);
          }
       }    }
}
