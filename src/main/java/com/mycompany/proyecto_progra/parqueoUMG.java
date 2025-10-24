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

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTipodeVehiculo)
                            .addComponent(cbxTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(btnSalir)
                        .addGap(27, 27, 27)
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTitulo)
                .addGap(32, 32, 32)
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
                .addContainerGap(300, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    String tipoVehiculo = (String) cbxTipoVehiculo.getSelectedItem();

    try {
        try ( // Se conecta a la base de datos por medio de la clase ConexionBD
                Connection conn = ConexionBD.conectar()) {
            if (conn == null) {
                JOptionPane.showMessageDialog(this, "No se pudo conectar a la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            // verifica que esxista la placa
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM vehiculo WHERE placa = ?");//que placa voy a selecionar?
            ps.setString(1, placa);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                JOptionPane.showMessageDialog(this,
                        "La placa " + placa + " ya está registrada como " + rs.getString("tipo") + ".",
                        "Vehículo encontrado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // pregunta si desea Registrar
                int opcion = JOptionPane.showConfirmDialog(this,
                        "La placa " + placa + " no está registrada.\n¿Desea registrarla?",
                        "Registrar vehículo", JOptionPane.YES_NO_OPTION);
             
                if (opcion == JOptionPane.YES_OPTION) {
                    // registra vehiculo
                   
                    Nuevo_ingresoPanel panelNuevo = new Nuevo_ingresoPanel();
                    this.setContentPane(panelNuevo);//me envía de mi Frame a mi Jpanel
                    this.revalidate();
                    this.repaint();

                    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                } else {

                    JOptionPane.showMessageDialog(this, "Operación cancelada.", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            
            // limpia
            txt_placa.setText("");
            cbxTipoVehiculo.setSelectedIndex(0);//reinicio cbx
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al conectar o consultar la base de datos:\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
       /////////////////////////////////////////////////////
        
        


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
            
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Vehículo con placa " + placa + " ha salido del parqueo.",
                    "Salida registrada", javax.swing.JOptionPane.INFORMATION_MESSAGE);

            // limpio campos
            txt_placa.setText("");
            cbxTipoVehiculo.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txt_placaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_placaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_placaActionPerformed

 
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(() -> new parqueoUMG().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxTipoVehiculo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTipodeVehiculo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lbl_placa;
    private javax.swing.JPanel panel1;
    private java.awt.Panel panel2;
    private javax.swing.JTextField txt_placa;
    // End of variables declaration//GEN-END:variables





}
