
package com.mycompany.proyecto_progra;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PanelAdministracion extends javax.swing.JPanel {

    //Constructor: se ejecuta al abrir el panel
    public PanelAdministracion() {
        initComponents();
        cargarDatosTabla(); // Se llama automáticamente al iniciar el panel
     calcularGanancias();
    }
 private void cargarDatosTabla() {//Método para cargar los datos de la base de datos hacia la JTable
     DefaultTableModel modelo = new DefaultTableModel();
         modelo.addColumn("Placa");
    modelo.addColumn("Carné");
    modelo.addColumn("Tipo de Vehículo");
    modelo.addColumn("Nombre");
    modelo.addColumn("Apellido");
    modelo.addColumn("Área");
    modelo.addColumn("Hora Entrada");
    modelo.addColumn("Hora Salida");
    modelo.addColumn("Tarifa");

    try (Connection conn = ConexionBD.conectar()) {
        if (conn == null) {
            JOptionPane.showMessageDialog(this, "No se pudo conectar a la base de datos.");
            return;
        }

        String sql = "SELECT Placa, carne, Tipo_vehiculo, nombre, apellido, area, horaEntrada, horaSalida, tarifa FROM vehiculo";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            modelo.addRow(new Object[]{
                rs.getString("Placa"),
                rs.getString("carne"),
                rs.getString("Tipo_vehiculo"),
                rs.getString("nombre"),
                rs.getString("apellido"),
                rs.getString("area"),
                rs.getString("horaEntrada"),
                rs.getString("horaSalida"),
                rs.getDouble("tarifa")
            });
        }

        tblVehiculos.setModel(modelo); // tu JTable se llama así

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al cargar los datos: " + e.getMessage());
    } 
     
    }
 
 private void calcularGanancias() {
        try (Connection conn = ConexionBD.conectar()) {
            PreparedStatement ps = conn.prepareStatement("SELECT SUM(tarifa) AS total FROM vehiculo");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                double total = rs.getDouble("total");
                lblGanancias.setText("Ganancias totales: Q" + total);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al calcular ganancias: " + e.getMessage());
        }
      

    }
 
 
 
 
 /////////////////////////////////////////////////////////////////////////////////////////
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVehiculos = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        lblGanancias = new javax.swing.JLabel();

        tblVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblVehiculos);

        btnActualizar.setText("Actualizar Tabla");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        lblGanancias.setText("Ganancias Totales");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnActualizar)
                                .addGap(175, 175, 175))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblGanancias)
                                .addGap(190, 190, 190))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblGanancias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActualizar)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        cargarDatosTabla();     // refresca los datos de la tabla
        calcularGanancias();    // actualiza el total de ganancias
    
    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGanancias;
    private javax.swing.JTable tblVehiculos;
    // End of variables declaration//GEN-END:variables
}
