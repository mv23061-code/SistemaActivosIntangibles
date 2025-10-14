/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author esqui
 */
public class IntangibleDAO {
     public boolean registrarIntangible(Intangible i) {
        String sql = "INSERT INTO intangible(nombre, tipo_licencia, "
                + "fecha_adquisicion, vida_util, "
                + "costo, cuotas_total, cuotas_amortizadas, amortizacion_anual,"
                + "amortizacion_mensual, valor_libros, remanente) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = Conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, i.getNombre());           // nombre
            ps.setString(2, i.getTipoLicencia());     // tipo_licencia  
            ps.setDate(3, new java.sql.Date(i.getFechaAdquisicion().getTime())); // fecha_adquisicion
            ps.setInt(4, i.getVidaUtil());            // vida_util
            ps.setDouble(5, i.getCosto());            // costo
            ps.setInt(6, i.getCuotasTotal());         // cuotas_total
            ps.setInt(7, i.getCuotasAmortizadas());   // cuotas_amortizadas
            ps.setDouble(8, i.getAmortizacionAnual()); // amortizacion_anual
            ps.setDouble(9, i.getAmortizacionMensual()); // amortizacion_mensual
            ps.setDouble(10, i.getValorLibros());     // valor_libros
            ps.setDouble(11, i.getRemanente());       // remanente
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al registrar: " + e.getMessage());
            return false;
        }
    }

    public ArrayList<Intangible> listarIntangibles() {
        ArrayList<Intangible> lista = new ArrayList<>();
        String sql = "SELECT * FROM intangible";
        try (Connection conn = Conexion.getConexion();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                Intangible i = new Intangible();
                i.setId(rs.getInt("id"));
                i.setNombre(rs.getString("nombre"));
                i.setTipoLicencia(rs.getString("tipo_licencia"));
                i.setFechaAdquisicion(rs.getDate("fecha_adquisicion"));
                i.setVidaUtil(rs.getInt("vida_util"));
                i.setCosto(rs.getDouble("costo"));
                i.setValorLibros(rs.getDouble("valor_libros"));
                i.setRemanente(rs.getDouble("remanente"));
                i.setAmortizacionAnual(rs.getDouble("amortizacion_anual"));
                i.setAmortizacionMensual(rs.getDouble("amortizacion_mensual"));
                i.setCuotasTotal(rs.getInt("cuotas_total"));
                i.setCuotasAmortizadas(rs.getInt("cuotas_amortizadas"));
                lista.add(i);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar: " + e.getMessage());
        }
        return lista;
    }
}