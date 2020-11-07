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
public class CreditoHabitacao extends CreditoBancario {
    private static final double TXJUROANUAL = 0.1;
    private double spread;
    
    private static int qtInstancias = 0;
    private static final float SPREAD_OMISSO = 1;
    
    public CreditoHabitacao(String nomeCliente, String profissao, int montante, int prazoFinanciamento, double spread) {
        super(nomeCliente, profissao, montante, prazoFinanciamento);
        this.spread = spread;
        qtInstancias++;
    }
    
    public CreditoHabitacao() {
        super();
        this.spread = SPREAD_OMISSO;
        qtInstancias++;
    }

    /**
     * @return the spread
     */
    public double getSpread() {
        return spread;
    }

    /**
     * @param spread the spread to set
     */
    public void setSpread(double spread) {
        this.spread = spread;
    }
    
    public static int getQtInstancias() {
        return qtInstancias;
    }
    
    @Override
    public String toString() {
        return String.format("%sSpread: %.1f\n", super.toString(), spread);
    }

    @Override
    public double calcularMontanteTotalJuros() {
        double txJuroSpreadMensal = (this.spread/100/12) + (TXJUROANUAL/100/12); 
        double capitalAmortizarMensal = super.getMontante() / super.getPrazoFinanciamento(); 
        double totalJuros = 0;
        double montanteEmprestimo = super.getMontante();
        
        while(montanteEmprestimo > 0) {
            totalJuros += montanteEmprestimo * txJuroSpreadMensal;
            montanteEmprestimo -= capitalAmortizarMensal;
        }
        return totalJuros;
    }

    @Override
    public double calcularMontanteAReceberPorCadaCredito() {
        return super.getMontante() + calcularMontanteTotalJuros();
    }
}
