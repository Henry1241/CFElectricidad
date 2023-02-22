/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.cfelectricidad.entidades;

/**
 * Entidad MedicionConsumo que es la responsable de tener los atributos para la medicion de consumo.
 * @author Enrique Gonzales Leyva, Xylan Rodriguez Robles, Hector Cardenas
 */
public class MedicionConsumo {
    
    private String numMedidor;
    private String lecturaActual;
    private String lecturaAnterior;
    private int mult;
    private int consumoKWh;

    /**
     * @return the numMedidor
     */
    public String getNumMedidor() {
        return numMedidor;
    }

    /**
     * @param numMedidor the numMedidor to set
     */
    public void setNumMedidor(String numMedidor) {
        this.numMedidor = numMedidor;
    }

    /**
     * @return the lecturaActual
     */
    public String getLecturaActual() {
        return lecturaActual;
    }

    /**
     * @param lecturaActual the lecturaActual to set
     */
    public void setLecturaActual(String lecturaActual) {
        this.lecturaActual = lecturaActual;
    }

    /**
     * @return the lecturaAnterior
     */
    public String getLecturaAnterior() {
        return lecturaAnterior;
    }

    /**
     * @param lecturaAnterior the lecturaAnterior to set
     */
    public void setLecturaAnterior(String lecturaAnterior) {
        this.lecturaAnterior = lecturaAnterior;
    }

    /**
     * @return the mult
     */
    public int getMult() {
        return mult;
    }

    /**
     * @param mult the mult to set
     */
    public void setMult(int mult) {
        this.mult = mult;
    }

    /**
     * @return the consumoKWh
     */
    public int getConsumoKWh() {
        return consumoKWh;
    }

    /**
     * @param consumoKWh the consumoKWh to set
     */
    public void setConsumoKWh(int consumoKWh) {
        this.consumoKWh = consumoKWh;
    }
    
}
