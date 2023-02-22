/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.cfelectricidad.entidades;

import java.util.Date;

/**
 * Entidad Recibo que controla los distintos atributos que manejan un recibo.
 * @author Enrique Gonzales Leyva, Xylan Rodriguez Robles,
 */
public class Recibo {
    
    private Cliente nombreDomicilio;
    private MedicionConsumo consumoKWh;
    private String numeroServicio;
    private double precioBasico;
    private double precioIntermedio;
    private Date fechaCorte;

    /**
     * @return the nombreDomicilio
     */
    public Cliente getNombreDomicilio() {
        return nombreDomicilio;
    }

    /**
     * @param nombreDomicilio the nombreDomicilio to set
     */
    public void setNombreDomicilio(Cliente nombreDomicilio) {
        this.nombreDomicilio = nombreDomicilio;
    }

    /**
     * @return the consumoKWh
     */
    public MedicionConsumo getConsumoKWh() {
        return consumoKWh;
    }

    /**
     * @param consumoKWh the consumoKWh to set
     */
    public void setConsumoKWh(MedicionConsumo consumoKWh) {
        this.consumoKWh = consumoKWh;
    }

    /**
     * @return the numeroServicio
     */
    public String getNumeroServicio() {
        return numeroServicio;
    }

    /**
     * @param numeroServicio the numeroServicio to set
     */
    public void setNumeroServicio(String numeroServicio) {
        this.numeroServicio = numeroServicio;
    }

    /**
     * @return the precioBasico
     */
    public double getPrecioBasico() {
        return precioBasico;
    }

    /**
     * @param precioBasico the precioBasico to set
     */
    public void setPrecioBasico(double precioBasico) {
        this.precioBasico = precioBasico;
    }

    /**
     * @return the precioIntermedio
     */
    public double getPrecioIntermedio() {
        return precioIntermedio;
    }

    /**
     * @param precioIntermedio the precioIntermedio to set
     */
    public void setPrecioIntermedio(double precioIntermedio) {
        this.precioIntermedio = precioIntermedio;
    }

    /**
     * @return the fechaCorte
     */
    public Date getFechaCorte() {
        return fechaCorte;
    }

    /**
     * @param fechaCorte the fechaCorte to set
     */
    public void setFechaCorte(Date fechaCorte) {
        this.fechaCorte = fechaCorte;
    }
    
}
