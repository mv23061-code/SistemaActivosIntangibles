/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.Date;
/**
 *
 * @author esqui
 */
public class Intangible {
    private int id;
    private String nombre;
    private String tipoLicencia;
    private Date fechaAdquisicion;
    private int vidaUtil;
    private double costo;
    private int cuotasTotal;
    private int cuotasAmortizadas;
    private double amortizacionAnual;
    private double amortizacionMensual;
    private double valorLibros;
    private double remanente;

    // Constructor vacío
    public Intangible() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoLicencia() {
        return tipoLicencia;
    }

    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }

    public Date getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(Date fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public int getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(int vidaUtil) {
        this.vidaUtil = vidaUtil;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getCuotasTotal() {
        return cuotasTotal;
    }

    public void setCuotasTotal(int cuotasTotal) {
        this.cuotasTotal = cuotasTotal;
    }

    public int getCuotasAmortizadas() {
        return cuotasAmortizadas;
    }

    public void setCuotasAmortizadas(int cuotasAmortizadas) {
        this.cuotasAmortizadas = cuotasAmortizadas;
    }

    public double getAmortizacionAnual() {
        return amortizacionAnual;
    }

    public void setAmortizacionAnual(double amortizacionAnual) {
        this.amortizacionAnual = amortizacionAnual;
    }

    public double getAmortizacionMensual() {
        return amortizacionMensual;
    }

    public void setAmortizacionMensual(double amortizacionMensual) {
        this.amortizacionMensual = amortizacionMensual;
    }

    public double getValorLibros() {
        return valorLibros;
    }

    public void setValorLibros(double valorLibros) {
        this.valorLibros = valorLibros;
    }

    public double getRemanente() {
        return remanente;
    }

    public void setRemanente(double remanente) {
        this.remanente = remanente;
    }
    
    
}