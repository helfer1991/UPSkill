/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.contadores;

/**
 *
 * @author Asus
 */
public class ContadorElectSimples extends ContadorElec {
    private double potenciaContratada;
    
    private static final double POTENCIA_ESCALAO = 6.9;
    private static final double TARIFA1 = 0.13;
    private static final double TARIFA2 = 0.16;
    
    public ContadorElectSimples(String cliente, int consumo, double potenciaContratada) {
        super(cliente, consumo);
        this.potenciaContratada = potenciaContratada;
    }

    /**
     * @return the potenciaContratada
     */
    public double getPotenciaContratada() {
        return potenciaContratada;
    }

    /**
     * @param potenciaContratada the potenciaContratada to set
     */
    public void setPotenciaContratada(double potenciaContratada) {
        this.potenciaContratada = potenciaContratada;
    }
    
    @Override
    public String toString() {
        return String.format("%sPotência contratada: %.1f\n", super.toString(), this.potenciaContratada);
    }
    
    @Override
    public double getConsumoMes() {
        double consumoMes;
        if(potenciaContratada < POTENCIA_ESCALAO) {
            consumoMes =  potenciaContratada * TARIFA1;
        } else {
            consumoMes = potenciaContratada * TARIFA2;
        }
        return consumoMes;
    }
}
