/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.cfelectricidad.entidades;

import java.util.List;
/**
 * Entidad Cliente que contiene todos los atributos para el llenado de datos de un cliente.
 * @author Enrique Gonzales Leyva, Xylan Rodriguez Robles, Hector Cardenas
 */
public class Cliente {
    
    private String nombre;
    private String direccion;
    private String ciudadEstado;
    private double adeudo;
    private List<Recibo> recibos;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the ciudadEstado
     */
    public String getCiudadEstado() {
        return ciudadEstado;
    }

    /**
     * @param ciudadEstado the ciudadEstado to set
     */
    public void setCiudadEstado(String ciudadEstado) {
        this.ciudadEstado = ciudadEstado;
    }

    /**
     * @return the adeudo
     */
    public double getAdeudo() {
        return adeudo;
    }

    /**
     * @param adeudo the adeudo to set
     */
    public void setAdeudo(double adeudo) {
        this.adeudo = adeudo;
    }

    /**
     * @return the recibos
     */
    public List<Recibo> getRecibos() {
        return recibos;
    }

    /**
     * @param recibos the recibos to set
     */
    public void setRecibos(List<Recibo> recibos) {
        this.recibos = recibos;
    }
    
}
