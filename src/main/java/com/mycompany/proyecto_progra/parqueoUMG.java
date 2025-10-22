/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto_progra;

public class parqueoUMG extends javax.swing.JFrame {
   
    public parqueoUMG() {
        
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        lblLogoU = new javax.swing.JLabel();
        btnRegistrarIngreso = new javax.swing.JButton();
        btnRegistrarSalida = new javax.swing.JButton();
        btnNuevoEstudiante = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitulo.setText("Parqueo UMG");

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/parking.png"))); // NOI18N
        lblImage.setText("\n");

        lblLogoU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/0.png"))); // NOI18N

        btnRegistrarIngreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/agregar.png"))); // NOI18N
        btnRegistrarIngreso.setText("Registrar ingreso");
        btnRegistrarIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarIngresoActionPerformed(evt);
            }
        });

        btnRegistrarSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salidacar.png"))); // NOI18N
        btnRegistrarSalida.setText("Registrar Salida");

        btnNuevoEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/newStudent.png"))); // NOI18N
        btnNuevoEstudiante.setText("Registrar Nuevo Estudiante");

        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RepYcobro.png"))); // NOI18N
        btnReportes.setText("Reportes Y Cobros");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lblImage)
                        .addGap(27, 27, 27)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRegistrarIngreso)
                            .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblLogoU))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNuevoEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegistrarSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrarIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblLogoU, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNuevoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarIngresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarIngresoActionPerformed

 
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(() -> new parqueoUMG().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevoEstudiante;
    private javax.swing.JButton btnRegistrarIngreso;
    private javax.swing.JButton btnRegistrarSalida;
    private javax.swing.JButton btnReportes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLogoU;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panel1;
    // End of variables declaration//GEN-END:variables
}
