
package com.mycompany.proyecto_progra;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


 
public class importarArchivo {

    public static void importarCSV(String rutaCSV ) throws IOException, SQLException {
char separador =',';


        // 1️⃣ Conectamos con la base de datos
     try (Connection conn = ConexionBD.conectar()) {

       if (conn == null) {
                throw new SQLException("No se pudo conectar a la base de datos.");
            }

     conn.setAutoCommit(false); 


    String sql = "INSERT IGNORE INTO vehiculo (Placa, carne, Tipo_vehiculo, nombre,"
            + " apellido, area, horaEntrada, horaSalida, tarifa) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";//orden de mis columnas en la tabla 

     try (PreparedStatement ps = conn.prepareStatement(sql);
                 BufferedReader br = Files.newBufferedReader(Paths.get(rutaCSV), StandardCharsets.UTF_8)) {

     String linea;
      int batchSize = 0;
        final int TOPE_BATCH = 500; 


               
        while ((linea = br.readLine()) != null) {

            
           String[] campos = linea.split("\\Q" + separador + "\\E", -1);


                    
      // Si la línea tiene menos de 9 campos, se rellenan con cadenas vacías ("")
         if (campos.length < 9) {
            String[] temp = new String[9];
               for (int i = 0; i < temp.length; i++) {
             temp[i] = (i < campos.length) ? campos[i].trim() : "";
       }
            campos = temp;
                    }
      
            
           
         String placa        = (campos[0] != null) ? campos[0].trim() : "";
          String carne        = (campos[1] != null) ? campos[1].trim() : "";
        String Tipo_vehiculo = (campos[2] != null) ? campos[2].trim() : "";
          String nombre       = (campos[3] != null) ? campos[3].trim() : "";
          String apellido     = (campos[4] != null) ? campos[4].trim() : "";
          String area         = (campos[5] != null) ? campos[5].trim() : "";
          String horaEntrada  = (campos[6] != null) ? campos[6].trim() : "";
           String horaSalida   = (campos[7] != null) ? campos[7].trim() : "";
          String tipoTarifa   = (campos[8] != null) ? campos[8].trim() : "";


                    
                  //////////////////////////////////
           if (placa.isEmpty()) {
      System.err.println("Línea sin placa, se omite.");//linea sin placa la ignoro
               continue;
                    }
           // Calcular diferencia de tiempo entre entrada y salida
double horas = 0;
try {
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
    LocalTime entrada = LocalTime.parse(horaEntrada, formato);
    LocalTime salida = LocalTime.parse(horaSalida, formato);
    horas = Duration.between(entrada, salida).toMinutes() / 60.0; // en horas
} catch (Exception e) {
    System.err.println("Error al calcular horas para placa " + placa + ": " + e.getMessage());
}

                    
                    
                    
                    
                    
            // Calcular Tarifa
                    double monto = 0.0;
                    if (tipoTarifa.equalsIgnoreCase("Plana")) {
                        monto = 10.00; // fijo por día
                    } else if (tipoTarifa.equalsIgnoreCase("Variable")) {
                        if (horas < 1) horas = 1; // cobra mínimo 1 hora
                        monto = horas * 10.00; // Q5 por hora
                    }
           
           

                    
         ps.setString(1, placa);          
          ps.setString(2, carne);         
         ps.setString(3, Tipo_vehiculo);        
         ps.setString(4, nombre);
          ps.setString(5, apellido); 
         ps.setString(6, area);
         ps.setString(7, horaEntrada);
         ps.setString(8, horaSalida);
         ps.setDouble(9, monto);

              
       ps.addBatch(); //Guarda temporalmente todos los registros (varias filas) para mandarlos juntos a la base de datos más rápido.
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
