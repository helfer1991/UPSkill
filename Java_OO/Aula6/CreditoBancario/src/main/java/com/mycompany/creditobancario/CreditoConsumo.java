/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.creditobancario;

/**
 *
 * @author Asus
 */
public abstract class CreditoConsumo extends CreditoBancario {
    private static int qtInstancias = 0;
    
    public CreditoConsumo(String nomeCliente, String profissao, int montante, int prazo) {
        super(nomeCliente, profissao, montante, prazo);
        qtInstancias++;
    }
    
    public CreditoConsumo() {
        super();
        qtInstancias++;
    }
    
    public static int getQtInstancias() {
        return qtInstancias;
    }
    
    @Override
    public String toString() {
        return String.format("%s", super.toString());
    }

    @Override
    public abstract double calcularMontanteTotalJuros();
    
    @Override
    public abstract double calcularMontanteAReceberPorCadaCredito();
}
