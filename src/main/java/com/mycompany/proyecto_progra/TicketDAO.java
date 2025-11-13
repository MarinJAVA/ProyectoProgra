//clase para mejor patron de diseño, objeto de acceso a Datos
package com.mycompany.proyecto_progra;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author elder
 */
public class TicketDAO {
    
     // 🔹 Inserta un nuevo ticket (entrada)
    public static void insertarTicket(Ticket t) {
        String sql = "INSERT INTO ticket (placa, area_id, fecha_ingreso, modo_pago, monto, estado) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConexionBD.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, t.getPlaca());
            ps.setString(2, t.getArea_id());
            ps.setTimestamp(3, t.getFecha_ingreso());
            ps.setString(4, t.getModo_pago());
            ps.setDouble(5, t.getMonto());
            ps.setString(6, t.getEstado());

            int filas = ps.executeUpdate();

            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "✅ Ticket registrado correctamente.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar ticket: " + e.getMessage());
        }
    }

    //  Actualiza el ticket al salir (variable o FLAT)
    public static void actualizarSalida(String placa, double monto) {
       // Buscamos si el vehículo ya tiene fecha_salida
    String verificarSql = "SELECT fecha_salida FROM ticket WHERE placa = ? ORDER BY fecha_ingreso DESC LIMIT 1";
    String actualizarSql = "UPDATE ticket SET fecha_salida = NOW(), monto = ?, estado = 'CERRADO' WHERE placa = ? AND (fecha_salida IS NULL OR fecha_salida = '')";

    try (Connection conn = ConexionBD.conectar()) {

        // 1️⃣ Verificar si ya tiene salida
     try (PreparedStatement psVerificar = conn.prepareStatement(verificarSql)) {
          psVerificar.setString(1, placa);
            ResultSet rs = psVerificar.executeQuery();

      if (rs.next()) {
                java.sql.Timestamp salida = rs.getTimestamp("fecha_salida");
       if (salida != null) {
       // Ya tiene hora de salida no permitimos doble salida
              JOptionPane.showMessageDialog(null, 
           "🚗 Este vehículo ya ha salido del parqueo.\nHora de salida: " + salida.toString(),
           "Aviso", JOptionPane.WARNING_MESSAGE);
                    return;
          }
        }
        }

        // Sino tiene salida se actualiza a la actual
        try (PreparedStatement psActualizar = conn.prepareStatement(actualizarSql)) {
            psActualizar.setDouble(1, monto);
            psActualizar.setString(2, placa);

            int filas = psActualizar.executeUpdate();

            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "💰 Ticket actualizado: salida registrada correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "⚠️ No se encontró ningún registro pendiente de salida para esta placa.");
            }
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al actualizar ticket: " + e.getMessage());
    }
    }

    // Busca ticket activo o FLAT pendiente de salida
    public static Ticket buscarTicketActivo(String placa) {
       String sql = "SELECT * FROM ticket WHERE placa = ? "
                   + "AND ((modo_pago = 'VARIABLE' AND estado = 'ACTIVO') "
                   + "OR (modo_pago = 'FLAT' AND estado = 'PAGADO' AND fecha_salida IS NULL))";

        try (Connection conn = ConexionBD.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, placa);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Ticket t = new Ticket();
                t.setTicket_id(rs.getInt("ticket_id"));
                t.setPlaca(rs.getString("placa"));
                t.setFecha_ingreso(rs.getTimestamp("fecha_ingreso"));
                t.setModo_pago(rs.getString("modo_pago"));
                t.setMonto(rs.getDouble("monto"));
                t.setEstado(rs.getString("estado"));
                return t;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar ticket: " + e.getMessage());
        }
        return null;
    }
    
    
}
 