/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author esqui
 */
public class Conexion {
    private static final String URL = "jdbc:postgresql://localhost:5432/db_SistemasIntangibles";
    private static final String USER = "postgres";
    private static final String PASSWORD = "uPk7DZ5T6uv@mHx";
    
    private static Connection conn = null;
    
 public static Connection getConexion() {
        try {
            if (conn == null || conn.isClosed()) {
                // carga explícita del driver (por compatibilidad)
                try {
                    Class.forName("org.postgresql.Driver");
                } catch (ClassNotFoundException ex) {
                    System.out.println("Driver JDBC no encontrado: " + ex.getMessage());
                }
                conn = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Conexion exitosa a PostgreSQL");
            }
        } catch (SQLException e) {
            System.out.println("Error en conexion: " + e.getMessage());
        }
        return conn;
    }
}