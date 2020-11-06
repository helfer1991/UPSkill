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
public abstract class ContadorElec extends Contador {
    private static String PREFIXO = "Elect-";
    private static int contadorElect = 1;
    
    public ContadorElec(String cliente, int consumo) {
        super(cliente, PREFIXO + contadorElect, consumo);
        contadorElect++;
    }
    
    public static int getContadorElect() {
        return contadorElect - 1;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
    @Override
    public abstract double getConsumoMes();
}
