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
        btnAdmin = new javax.swing.JButton();
        lblSoloParaAdministradores = new javax.swing.JLabel();
        lblQueAcciónQuieresHacer = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnMostrarImagenes = new javax.swing.JButton();

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

        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/coche-estacionado.png"))); // NOI18N
        btnIngresar.setText("INGRESAR A PARQUEO");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar-sesion.png"))); // NOI18N
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

        btnAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.png"))); // NOI18N
        btnAdmin.setText("Administración");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        lblSoloParaAdministradores.setBackground(new java.awt.Color(255, 255, 0));
        lblSoloParaAdministradores.setForeground(new java.awt.Color(255, 0, 0));
        lblSoloParaAdministradores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alerta.png"))); // NOI18N
        lblSoloParaAdministradores.setText("Área solo para Administradores️");

        lblQueAcciónQuieresHacer.setText("Que acción Quieres Realizar:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoUMGpng 180x180.png"))); // NOI18N

        btnMostrarImagenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ubicacion.png"))); // NOI18N
        btnMostrarImagenes.setText("Ver mapa de parqueo");
        btnMostrarImagenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarImagenesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(btnIngresar))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblSoloParaAdministradores))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCargarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(lbl_ingresarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(btnMostrarImagenes, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(lblQueAcciónQuieresHacer, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiarBase)
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(btnCargarArchivo))
                            .addComponent(txt_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTipodeVehiculo)
                            .addComponent(cbxTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(btnAdmin)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblTitulo)
                        .addGap(17, 17, 17)
                        .addComponent(lbl_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(lblTipodeVehiculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(lblQueAcciónQuieresHacer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(lblSoloParaAdministradores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_ingresarArchivo)
                    .addComponent(btnMostrarImagenes))
                .addGap(29, 29, 29)
                .addComponent(txtCargarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(btnAdmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(btnCargarArchivo)
                        .addGap(36, 36, 36)))
                .addComponent(btnLimpiarBase)
                .addGap(17, 17, 17))
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
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
           //extrae
    String placa = txt_placa.getText().trim();
    if (placa.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, escriba la placa del vehículo.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
        
    }


    try {
        try ( 
                Connection conn = ConexionBD.conectar()) {
            if (conn == null) {
                JOptionPane.showMessageDialog(this, "No se pudo conectar a la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            
            
           // --------------------------------------------------------------------
// bsc en ticket sql
// --------------------------------------------------------------------
String sqlTicket = "SELECT * FROM ticket WHERE placa = ?";
PreparedStatement psTicket = conn.prepareStatement(sqlTicket);
psTicket.setString(1, placa);
ResultSet rsTicket = psTicket.executeQuery();

if (rsTicket.next()) {

    JOptionPane.showMessageDialog(this,
            "La placa " + placa + " ya está registrada.",
            "Vehículo encontrado (ticket)", JOptionPane.INFORMATION_MESSAGE);

    String horaEntrada = java.time.LocalDateTime.now()
            .format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

    String ticket = "------ PARQUEO UMG ------\n"
            + "Placa: " + placa + "\n"
            + "Tipo de vehículo: " + cbxTipoVehiculo.getSelectedItem() + "\n"
            + "Hora de Entrada: " + horaEntrada + "\n"
            + "--------------------------\n"
            + "BIENVENIDO!\n";

    JOptionPane.showMessageDialog(this, ticket, "Ticket de entrada", JOptionPane.INFORMATION_MESSAGE);

   


// borrar hora de salida

String sqlBorrarSalida = "UPDATE vehiculo SET horaSalida = NULL WHERE placa = ?";
PreparedStatement psBorrar = conn.prepareStatement(sqlBorrarSalida);
psBorrar.setString(1, placa);
psBorrar.executeUpdate();

        // borra salida en ticket
String sqlBorrarSalidaTicket = "UPDATE ticket SET fecha_salida = NULL WHERE placa = ?";
PreparedStatement psBorrarTicket = conn.prepareStatement(sqlBorrarSalidaTicket);
psBorrarTicket.setString(1, placa);
psBorrarTicket.executeUpdate();

 
                    return; 
} 

            
            // verifica que exista la placa
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM vehiculo WHERE placa = ?");
            ps.setString(1, placa);
            ResultSet rs = ps.executeQuery();
            
   
            
           
    
    
    //////////////////////////////////////////////////////////////////////////////////
    
    
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
            
            
         //validdo si ya sali en tiket
String sqlValTicket = "SELECT fecha_salida FROM ticket WHERE placa = ?";
PreparedStatement psValTicket = conn.prepareStatement(sqlValTicket);
psValTicket.setString(1, placa);
ResultSet rsValTicket = psValTicket.executeQuery();

if (rsValTicket.next()) {
    String horaSalidaTicket = rsValTicket.getString("fecha_salida");

    if (horaSalidaTicket != null && !horaSalidaTicket.isEmpty()) {
        JOptionPane.showMessageDialog(this,
                "❗ La placa " + placa + " ya ha salido del parqueo.",
                "Salida ya registrada",
                JOptionPane.WARNING_MESSAGE);
        return; // Detiene el proceso
    }
}
  
            
            
          
            
// Busco en ticketsql

String sqlTicket = "SELECT * FROM ticket WHERE placa = ?";
PreparedStatement psTicket = conn.prepareStatement(sqlTicket);
psTicket.setString(1, placa);
ResultSet rsTicket = psTicket.executeQuery();

if (rsTicket.next()) {


    int opcion = JOptionPane.showConfirmDialog(this,
            "¿Desea registrar la salida del vehículo con placa " + placa + "?",
            "Confirmar salida",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);

    if (opcion == JOptionPane.YES_OPTION) {

       
        String sqlSalidaT = "UPDATE ticket SET fecha_salida = NOW() WHERE placa = ?";
        PreparedStatement psSalidaT = conn.prepareStatement(sqlSalidaT);
        psSalidaT.setString(1, placa);
        psSalidaT.executeUpdate();

        
        String fecha_salida = java.time.LocalDateTime.now()
                .format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

        String ticketSalida = "------ PARQUEO UMG ------\n"
                + "Placa: " + placa + "\n"
                + "Tipo de vehículo: " + cbxTipoVehiculo.getSelectedItem() + "\n"
                + "Hora de Salida: " + fecha_salida+ "\n"
                + "--------------------------\n"
                + "¡GRACIAS POR SU VISITA!\n";

        JOptionPane.showMessageDialog(this, ticketSalida, "Ticket de salida", JOptionPane.INFORMATION_MESSAGE);
    }

    return; //no continua
}

            
            
            
             
            
            
            
// busca si la placa existe en la tabla vehiculo
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
         
            String horaSalidaBD = rs.getString("horaSalida");

if (horaSalidaBD != null && !horaSalidaBD.isEmpty()) {
    JOptionPane.showMessageDialog(this,
            "❗ La placa " + placa + " ya ha salido del parqueo.",
            "Salida ya registrada",
            JOptionPane.WARNING_MESSAGE);
    return; 
}












            
// Confirmar la salida del vehículo

int opcion = JOptionPane.showConfirmDialog(this,
        "¿Desea registrar la salida del vehículo con placa " + placa + "?",
        "Confirmar salida",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE);


if (opcion == JOptionPane.YES_OPTION) {
    
    
    
    
    
    // Registrar hora de salida (actual)
    String sqlSalida = "UPDATE vehiculo SET horaSalida = NOW() WHERE placa = ?";
    PreparedStatement psSalida = conn.prepareStatement(sqlSalida);
    psSalida.setString(1, placa);
    int filasActualizadas = psSalida.executeUpdate();

    if (filasActualizadas > 0) {
        JOptionPane.showMessageDialog(this,
                "✅ Salida registrada correctamente para la placa: " + placa,
                "Salida registrada",
                JOptionPane.INFORMATION_MESSAGE);
        
        
        
        
        
        String horaSalida = java.time.LocalDateTime.now()
        .format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

String ticketSalida = "------ PARQUEO UMG ------\n"
        + "Placa: " + placa + "\n"
        + "Tipo de vehículo: " + cbxTipoVehiculo.getSelectedItem() + "\n"
        + "Hora de Salida: " + horaSalida + "\n"
        + "--------------------------\n"
        + "¡GRACIAS POR SU VISITA!\n";

JOptionPane.showMessageDialog(this, ticketSalida, "Ticket de salida", JOptionPane.INFORMATION_MESSAGE);

        
        
        
        
        
        
        
        
    } else {
        JOptionPane.showMessageDialog(this,
                "⚠️ No se pudo registrar la salida. Verifique la placa.",
                "Error en actualización",
                JOptionPane.ERROR_MESSAGE);
    }
} else {
    JOptionPane.showMessageDialog(this,
            "Operación cancelada.",
            "Cancelado",
            JOptionPane.INFORMATION_MESSAGE);
}

         
         
           
            
            
           
            
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
        // recibo ruta del archivo 
       importarArchivo.importarCSV(ruta);

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

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
       javax.swing.JFrame frame = new javax.swing.JFrame("Panel Administración");
    frame.add(new PanelAdministracion());
    frame.pack();
    frame.setLocationRelativeTo(this);
    frame.setVisible(true);
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnMostrarImagenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarImagenesActionPerformed
   javax.swing.JFrame ventana = new javax.swing.JFrame("Galería de imagenes del Parqueo de la UMG");
    ventana.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    PanelImagenes panel = new PanelImagenes();
    ventana.add(panel);

    ventana.pack();
    ventana.setLocationRelativeTo(this);
    ventana.setVisible(true);
    }//GEN-LAST:event_btnMostrarImagenesActionPerformed
/////////////////////////////////////////////////////////////////////////////////
 
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(() -> new parqueoUMG().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnCargarArchivo;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnLimpiarBase;
    private javax.swing.JButton btnMostrarImagenes;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxTipoVehiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblQueAcciónQuieresHacer;
    private javax.swing.JLabel lblSoloParaAdministradores;
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
