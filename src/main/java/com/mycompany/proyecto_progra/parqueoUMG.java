/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto_progra;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class parqueoUMG extends javax.swing.JFrame {
   
    public parqueoUMG() {
        
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel2 = new java.awt.Panel();
        jPanel1 = new javax.swing.JPanel();
        panel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        txt_placa = new javax.swing.JTextField();
        lbl_placa = new javax.swing.JLabel();
        cbxTipoVehiculo = new javax.swing.JComboBox<>();
        lblTipodeVehiculo = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnCargarArchivo = new javax.swing.JButton();
        txtCargarArchivo = new javax.swing.JTextField();
        lbl_ingresarArchivo = new javax.swing.JLabel();
        btnLimpiarBase = new javax.swing.JButton();

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitulo.setText("Parqueo UMG");

        txt_placa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_placaActionPerformed(evt);
            }
        });

        lbl_placa.setText("ingrese su numero de Placa:");

        cbxTipoVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carro", "Moto", " " }));
        cbxTipoVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoVehiculoActionPerformed(evt);
            }
        });

        lblTipodeVehiculo.setText("Selecciona tu tipo de Vehiculo:");

        btnIngresar.setText("INGRESAR A PARQUEO");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnSalir.setText("SALIR DEL PARQUEO");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnCargarArchivo.setText("Cargar Archivo");
        btnCargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarArchivoActionPerformed(evt);
            }
        });

        txtCargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargarArchivoActionPerformed(evt);
            }
        });

        lbl_ingresarArchivo.setText("ingresa la dirección de tu archivo Csv:");

        btnLimpiarBase.setText("Eliminar todos los Registros");
        btnLimpiarBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarBaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCargarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_ingresarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(btnCargarArchivo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTipodeVehiculo)
                            .addComponent(cbxTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(btnSalir)
                        .addGap(27, 27, 27)
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiarBase)
                .addGap(16, 16, 16))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(lbl_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTipodeVehiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(lbl_ingresarArchivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCargarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnCargarArchivo)
                .addGap(56, 56, 56)
                .addComponent(btnLimpiarBase)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxTipoVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTipoVehiculoActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
           // verifica que el campo no esté vacío
    String placa = txt_placa.getText().trim();
    if (placa.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, escriba la placa del vehículo.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
        
    }


    try {
        try ( // Se conecta a la base de datos por medio de la clase ConexionBD
                Connection conn = ConexionBD.conectar()) {
            if (conn == null) {
                JOptionPane.showMessageDialog(this, "No se pudo conectar a la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            // verifica que esxista la placa
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM vehiculo WHERE placa = ?");
            ps.setString(1, placa);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                JOptionPane.showMessageDialog(this,
                        "La placa " + placa + " ya está registrada como " + rs.getString("Tipo_vehiculo") + ".",
                        "Vehículo encontrado", JOptionPane.INFORMATION_MESSAGE);
                
                String horaEntrada = java.time.LocalDateTime.now()
                        .format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
                
                String ticket = "------ PARQUEO UMG ------\n"
                        + "Placa: " + placa + "\n"
                        + "Tipo de vehículo: " + cbxTipoVehiculo.getSelectedItem() + "\n"
                        + "Hora de Entrada: " + horaEntrada + "\n"
                        + "--------------------------\n"
                        + "BIENVENIDO!\n";

// ticket en ventana
                JOptionPane.showMessageDialog(this, ticket, "Ticket de entrada", JOptionPane.INFORMATION_MESSAGE);
                
                
                
                
            } else {
                // pregunta si desea Registrar
                int opcion = JOptionPane.showConfirmDialog(this,
                        "La placa " + placa + " no está registrada.\n¿Desea registrarla?",
                        "Registrar vehículo", JOptionPane.YES_NO_OPTION);
             
                
                if (opcion == JOptionPane.YES_OPTION) {
               
                   
                    Nuevo_ingresoPanel panelNuevo = new Nuevo_ingresoPanel();
                    this.setContentPane(panelNuevo);//me envía de mi Frame a mi Jpanel
                    this.revalidate();
                    this.repaint();
// limpio
            txt_placa.setText("");
            cbxTipoVehiculo.setSelectedIndex(0);
                    
                    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                } else {

                    JOptionPane.showMessageDialog(this, "Operación cancelada.", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            
                      

            
            
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al conectar o consultar la base de datos:\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
       ////////////////////////////////////////////////////////////////////////////////////////////////
        
        


    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //obtengo la placa ingresada
        String placa = txt_placa.getText();

// valido que no esté vacío
        if (placa.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Por favor, ingrese una placa para registrar la salida.",
                    "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            

            // limpio campos
            txt_placa.setText("");
            cbxTipoVehiculo.setSelectedIndex(0);
        }
        try (Connection conn = ConexionBD.conectar()) {
            if (conn == null) {
                JOptionPane.showMessageDialog(this,
                        "Error: no se pudo conectar a la base de datos.",
                        "Error de conexión",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            
          
            
            
// Valido si la placa existe en la base de datos
         String sql = "SELECT * FROM vehiculo WHERE placa = ?";
         PreparedStatement ps = conn.prepareStatement(sql);
         ps.setString(1, placa);
         ResultSet rs = ps.executeQuery();
        
         if (!rs.next()) {
             JOptionPane.showMessageDialog(this,
                     "❌ La placa " + placa + " no existe en la base de datos.\nPlaca incorrecta.",
                     "Placa no encontrada",
                     JOptionPane.ERROR_MESSAGE);
             return; // Detiene el proceso si la placa no existe
         }
         
            
            
         //Aquí debería ir el codigo de validación de tarifa variable 

         
          
         
         //  INICIO DE CÁLCULO DE TARIFA SEGÚN EL TIPO 

// Buscamos si la placa tiene un ticket activo (puede ser FLAT o VARIABLE)
String sqlTicket = "SELECT * FROM ticket WHERE placa = ? AND estado = 'ACTIVO' ORDER BY ticket_id DESC LIMIT 1";
PreparedStatement psTicket = conn.prepareStatement(sqlTicket);
psTicket.setString(1, placa);
ResultSet rsTicket = psTicket.executeQuery();

if (rsTicket.next()) {
    String modoPago = rsTicket.getString("modo_pago");
    java.sql.Timestamp fechaIngreso = rsTicket.getTimestamp("fecha_ingreso");
    java.sql.Timestamp fechaSalida = new java.sql.Timestamp(System.currentTimeMillis());

    // Si el modo de pago es VARIABLE, calculamos cobro por hora
    if (modoPago.equals("VARIABLE")) {

        long minutos = java.time.Duration.between(fechaIngreso.toLocalDateTime(), fechaSalida.toLocalDateTime()).toMinutes();
        double horas = Math.ceil(minutos / 60.0); // redondea hacia arriba
        double tarifaHora = 5.0; // Q5 por hora (puedes ajustar)
        double monto = horas * tarifaHora;

        // Actualizamos el ticket en la BD
        String sqlUpdate = "UPDATE ticket SET fecha_salida = ?, monto = ?, estado = 'PAGADO' WHERE placa = ? AND estado = 'ACTIVO'";
        PreparedStatement psUpdate = conn.prepareStatement(sqlUpdate);
        psUpdate.setTimestamp(1, fechaSalida);
        psUpdate.setDouble(2, monto);
        psUpdate.setString(3, placa);
        psUpdate.executeUpdate();

        // Mostramos el ticket de salida con monto a pagar
        String ticketSalida = "------ PARQUEO UMG ------\n"
                + "Placa: " + placa + "\n"
                + "Tipo de vehículo: " + cbxTipoVehiculo.getSelectedItem() + "\n"
                + "Hora de Salida: " + java.time.LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) + "\n"
                + "Tiempo total: " + horas + " hora(s)\n"
                + "Monto a pagar: Q" + monto + "\n"
                + "--------------------------\n"
                + "Gracias por su visita!\n";

        JOptionPane.showMessageDialog(this, ticketSalida, "Ticket de salida", JOptionPane.INFORMATION_MESSAGE);

    } 
    
    // Si el modo de pago es FLAT, solo mostramos mensaje simple (ya está pagado)
    else if (modoPago.equals("FLAT")) {
        String ticketSalida = "------ PARQUEO UMG ------\n"
                + "Placa: " + placa + "\n"
                + "Tipo de vehículo: " + cbxTipoVehiculo.getSelectedItem() + "\n"
                + "Hora de Salida: " + java.time.LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) + "\n"
                + "--------------------------\n"
                + "TARIFA PLANA (Q10) - Ya pagada\n"
                + "Gracias por su visita!\n";

        // Actualizamos la salida y marcamos como pagado también
        String sqlUpdateFlat = "UPDATE ticket SET fecha_salida = ?, estado = 'PAGADO' WHERE placa = ? AND estado = 'ACTIVO'";
        PreparedStatement psFlat = conn.prepareStatement(sqlUpdateFlat);
        psFlat.setTimestamp(1, fechaSalida);
        psFlat.setString(2, placa);
        psFlat.executeUpdate();

        JOptionPane.showMessageDialog(this, ticketSalida, "Ticket de salida", JOptionPane.INFORMATION_MESSAGE);
    }
} else {
    JOptionPane.showMessageDialog(this, 
        "No se encontró un ticket activo para esta placa.", 
        "Sin ticket", 
        JOptionPane.WARNING_MESSAGE);
}

//  FIN DE CÁLCULO DE TARIFA SEGÚN EL TIPO 

       
            
///
            
       




/////////////////////



            
            
            
            JOptionPane.showMessageDialog(this,
                    "Operación realizada correctamente.",
                    "Éxito",
                    JOptionPane.INFORMATION_MESSAGE);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this,
                    "Error al ejecutar la operación:\n" + e.getMessage(),
                    "Error SQL",
                    JOptionPane.ERROR_MESSAGE);
        }
       
        
    }//GEN-LAST:event_btnSalirActionPerformed
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private void txt_placaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_placaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_placaActionPerformed

    private void btnCargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarArchivoActionPerformed
 String ruta = txtCargarArchivo.getText().trim();

    if (ruta.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Por favor ingresa la ruta del archivo CSV.");
        return;
    }

    try {
        // Archivo separado por '|', 
        importarArchivo.importarCSV(ruta, '|');
        javax.swing.JOptionPane.showMessageDialog(this, "Archivo importado correctamente a la base de datos.");
    } catch (Exception ex) {
        ex.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(this, "Error al importar: " + ex.getMessage(),
                "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }                                                      
    
//////////////////////////////////////////
    }//GEN-LAST:event_btnCargarArchivoActionPerformed

    private void txtCargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargarArchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargarArchivoActionPerformed

    private void btnLimpiarBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarBaseActionPerformed
int confirm = JOptionPane.showConfirmDialog(this,
        "¿Seguro que deseas eliminar TODOS los registros de la tabla vehiculo?",
        "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

    if (confirm != JOptionPane.YES_OPTION) return;

    try (Connection conn = ConexionBD.conectar()) {
        if (conn == null) {
            JOptionPane.showMessageDialog(this, "No se pudo conectar a la base de datos.");
            return;
        }

        String sql = "DELETE FROM vehiculo";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            int filas = ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Se eliminaron " + filas + " registros correctamente.");
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al limpiar la base: " + e.getMessage());
    }
    }//GEN-LAST:event_btnLimpiarBaseActionPerformed
/////////////////////////////////////////////////////////////////////////////////
 
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(() -> new parqueoUMG().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarArchivo;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnLimpiarBase;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxTipoVehiculo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTipodeVehiculo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lbl_ingresarArchivo;
    private javax.swing.JLabel lbl_placa;
    private javax.swing.JPanel panel1;
    private java.awt.Panel panel2;
    private javax.swing.JTextField txtCargarArchivo;
    private javax.swing.JTextField txt_placa;
    // End of variables declaration//GEN-END:variables





}
