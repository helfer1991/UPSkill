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
public class CreditoAutomovel extends CreditoConsumo {
    private static final double TXJUROANUAL = 6;
    private static final double TXDESCONTO = 1;
    private static final int MESESDESCONTO = 24;
    
    public CreditoAutomovel(String nomeCliente, String profissao, int montante, int prazoFinanciamento) {
        super(nomeCliente, profissao, montante, prazoFinanciamento);
    }
    
    public CreditoAutomovel() {
        super();
    }
    
    @Override
    public String toString() {
        return String.format("%s", super.toString());
    }

    @Override
    public double calcularMontanteTotalJuros() {
        double totalJuros = 0;
        double mensalidade = super.getMontante() / super.getPrazoFinanciamento();
        double txJuroMensal = TXJUROANUAL/100/12;
        double montanteEmprestimo = super.getMontante();
        
        if(super.getPrazoFinanciamento() <= MESESDESCONTO) {
            while(montanteEmprestimo > 0) {
                totalJuros += (montanteEmprestimo * txJuroMensal) * (1 - TXDESCONTO/100);
                montanteEmprestimo -= mensalidade;
            }
        } else {
            while(montanteEmprestimo > 0) {
                totalJuros += montanteEmprestimo * txJuroMensal;
                montanteEmprestimo -= mensalidade;
            }
        }    
        return totalJuros;
    }

    @Override
    public double calcularMontanteAReceberPorCadaCredito() {
        if(super.getPrazoFinanciamento() > MESESDESCONTO) {
            return calcularMontanteTotalJuros() + super.getMontante();
        } else {
            return calcularMontanteTotalJuros() + super.getMontante()*(1 - TXDESCONTO);
        }     
    }
}
