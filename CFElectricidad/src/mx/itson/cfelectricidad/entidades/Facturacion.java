/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.cfelectricidad.entidades;

/**
 * Entidad Facturacion que contiene los distintos atributos en una factura.
 * @author Enrique Gonzales Leyva, Xylan Rodriguez Robles
 */
public class Facturacion {
    
    private String conepto;
    private int kWh;
    private double precio;
    private Pago subTotal;

    /**
     * @return the conepto
     */
    public String getConepto() {
        return conepto;
    }

    /**
     * @param conepto the conepto to set
     */
    public void setConepto(String conepto) {
        this.conepto = conepto;
    }

    /**
     * @return the kWh
     */
    public int getkWh() {
        return kWh;
    }

    /**
     * @param kWh the kWh to set
     */
    public void setkWh(int kWh) {
        this.kWh = kWh;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the subTotal
     */
    public Pago getSubTotal() {
        return subTotal;
    }

    /**
     * @param subTotal the subTotal to set
     */
    public void setSubTotal(Pago subTotal) {
        this.subTotal = subTotal;
    }
    
}
