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
public class ContadorGas extends Contador {
    private static final String PREFIXO = "GAS-";
    private static double custo = 0.8;
    private static int contadoresQt = 1;
    
    public ContadorGas(String cliente, int consumo) {
        super(cliente, PREFIXO + contadoresQt, consumo);
        contadoresQt++;
    }

    @Override
    public double getConsumoMes() {
        return custo * getConsumo();
    }
    
    @Override
    public String toString() {
        return String.format("%s", super.toString());
    }
}
