/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba;
import modelo.Conexion;
import java.sql.Connection;
/**
 *
 * @author esqui
 */
public class TestConexion {
        public static void main(String[] args) {
        Connection c = Conexion.getConexion();
        if (c != null) {
            System.out.println("Conexion establecida");
            try { c.close(); } catch (Exception e) {}
        } else {
            System.out.println("Fallo en la conexion");
        }
    }
}
