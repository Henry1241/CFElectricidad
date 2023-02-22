/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.cfelectricidad.entidades;

import java.util.Date;
import mx.itson.cfelectricidad.enumeradores.MetodoPago;

/**
 * Entidad Pago que controla todos los aributos necesarios para un pago de servicio.
 * @author Enrique Gonzales Leyva, Xylan Rodriguez Robles,
 */
public class Pago {
    
    private Date fechaInicio;
    private Date fechaLimite;
    private double subTotal;
    private double totalPagar;
    private MetodoPago lugarPago;

    /**
     * @return the fechaInicio
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * @return the fechaLimite
     */
    public Date getFechaLimite() {
        return fechaLimite;
    }

    /**
     * @param fechaLimite the fechaLimite to set
     */
    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    /**
     * @return the subTotal
     */
    public double getSubTotal() {
        return subTotal;
    }

    /**
     * @param subTotal the subTotal to set
     */
    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    /**
     * @return the totalPagar
     */
    public double getTotalPagar() {
        return totalPagar;
    }

    /**
     * @param totalPagar the totalPagar to set
     */
    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    /**
     * @return the lugarPago
     */
    public MetodoPago getLugarPago() {
        return lugarPago;
    }

    /**
     * @param lugarPago the lugarPago to set
     */
    public void setLugarPago(MetodoPago lugarPago) {
        this.lugarPago = lugarPago;
    }
    
}
