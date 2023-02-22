/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.cfelectricidad.entidades;

import java.util.Date;

/**
 * Entidad Proceso que maneja todas los atributos requeridos para el proceso de facturacion.
 * @author Enrique Gonzales Leyva, Xylan Rodriguez Robles,
 */
public class Proceso {
    
    
    private Date periodoCosumo;
    private int dias;
    private double promedioDkWh;
    private Facturacion energia;
    private double iva;

    /**
     * @return the periodoCosumo
     */
    public Date getPeriodoCosumo() {
        return periodoCosumo;
    }

    /**
     * @param periodoCosumo the periodoCosumo to set
     */
    public void setPeriodoCosumo(Date periodoCosumo) {
        this.periodoCosumo = periodoCosumo;
    }

    /**
     * @return the dias
     */
    public int getDias() {
        return dias;
    }

    /**
     * @param dias the dias to set
     */
    public void setDias(int dias) {
        this.dias = dias;
    }

    /**
     * @return the promedioDkWh
     */
    public double getPromedioDkWh() {
        return promedioDkWh;
    }

    /**
     * @param promedioDkWh the promedioDkWh to set
     */
    public void setPromedioDkWh(double promedioDkWh) {
        this.promedioDkWh = promedioDkWh;
    }

    /**
     * @return the energia
     */
    public Facturacion getEnergia() {
        return energia;
    }

    /**
     * @param energia the energia to set
     */
    public void setEnergia(Facturacion energia) {
        this.energia = energia;
    }

    /**
     * @return the iva
     */
    public double getIva() {
        return iva;
    }

    /**
     * @param iva the iva to set
     */
    public void setIva(double iva) {
        this.iva = iva;
    }
    
}
