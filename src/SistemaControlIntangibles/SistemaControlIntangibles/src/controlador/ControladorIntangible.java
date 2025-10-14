/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import modelo.*;
/**
 *
 * @author esqui
 */
public class ControladorIntangible {
     public boolean registrar(Intangible i) {
         try {
            // Validaciones básicas
            if (i.getVidaUtil() <= 0) {
                System.out.println("❌ La vida útil debe ser mayor a 0");
                return false;
            }
            if (i.getCosto() <= 0) {
                System.out.println("❌ El costo debe ser mayor a 0");
                return false;
            }
            // Cálculos automáticos CORREGIDOS
            double amortAnual = i.getCosto() / i.getVidaUtil();
            double amortMensual = amortAnual / 12;
            i.setCuotasAmortizadas(0);
            i.setAmortizacionAnual(amortAnual);
            i.setAmortizacionMensual(amortMensual);
            i.setValorLibros(i.getCosto());
            i.setRemanente(i.getCosto());
            i.setCuotasTotal(i.getVidaUtil() * 12);
            
             // Debug: mostrar valores calculados
            System.out.println(" Valores calculados:");
            System.out.println("Amortización Anual: " + amortAnual);
            System.out.println("Amortización Mensual: " + amortMensual);
            System.out.println("Cuotas Totales: " + (i.getVidaUtil() * 12));
            System.out.println("Valor Libros: " + i.getCosto());
            System.out.println("Remanente: " + i.getCosto());
            
            IntangibleDAO dao = new IntangibleDAO();
            return dao.registrarIntangible(i);
            
        } catch (Exception e) {
            System.out.println("Error en controlador: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
}
