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
public class ContadorBiHorario extends ContadorElec {
    private int consumoForaVazio;
    
    private static final double TARIFA1 = 0.066;
    private static final double TARIFA2 = 0.14;
    private static final int CONSUMO_FORA_VAZIO_OMISSO = 100;
    
    public ContadorBiHorario(String cliente, int consumoVazio, int consumoForaVazio) {
        super(cliente, consumoVazio);
        this.consumoForaVazio = consumoForaVazio;
    }
    
    public ContadorBiHorario(String cliente, int consumoVazio) {
        super(cliente, consumoVazio);
        this.consumoForaVazio = CONSUMO_FORA_VAZIO_OMISSO;
    }

    /**
     * @return the consumoForaVazio
     */
    public int getConsumoForaVazio() {
        return consumoForaVazio;
    }

    /**
     * @param consumoForaVazio the consumoForaVazio to set
     */
    public void setConsumoForaVazio(int consumoForaVazio) {
        this.consumoForaVazio = consumoForaVazio;
    }
    
    @Override
    public String toString() {
        return String.format("%sConsumo fora vazio: %d", super.toString(), consumoForaVazio);
    }
    
    @Override
    public double getConsumoMes() {
        return getConsumo() * TARIFA1 + getConsumoForaVazio() * TARIFA2;
    }
}
