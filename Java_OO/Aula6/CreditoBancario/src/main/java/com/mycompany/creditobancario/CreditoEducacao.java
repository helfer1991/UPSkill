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
public class CreditoEducacao extends CreditoConsumo {
    private int periodoCarencia;
    
    private static final int PERIODOCARENCIA_OMISSO = 12;
    private static final double TXJUROANUAL = 2;
    
    public CreditoEducacao() {
        super();
        this.periodoCarencia = PERIODOCARENCIA_OMISSO;
    }
    
    public CreditoEducacao(String nomeCliente, String profissao, int montante, int prazoFinanciamento, int periodoCarencia) {
        super(nomeCliente, profissao, montante, prazoFinanciamento);
        this.periodoCarencia = periodoCarencia;
    }

    /**
     * @return the periodoCarencia
     */
    public int getPeriodoCarencia() {
        return periodoCarencia;
    }

    /**
     * @param periodoCarencia the periodoCarencia to set
     */
    public void setPeriodoCarencia(int periodoCarencia) {
        this.periodoCarencia = periodoCarencia;
    }
    
    @Override
    public String toString() {
        return String.format("%sPeríodo de carência: %d meses\n", super.toString(), periodoCarencia);
    }

    @Override
    public double calcularMontanteTotalJuros() {
        double capitalAmortizarMensal = super.getMontante() / (super.getPrazoFinanciamento() - this.periodoCarencia);
        double txJuroMensal = (TXJUROANUAL/100/12);
        double totalJuros = this.periodoCarencia * txJuroMensal * super.getMontante();
        double montanteEmprestimo = super.getMontante();
        
        while(montanteEmprestimo > 0) {
            totalJuros += montanteEmprestimo * txJuroMensal;
            montanteEmprestimo -= capitalAmortizarMensal;
        }        
        return totalJuros;
    }

    @Override
    public double calcularMontanteAReceberPorCadaCredito() {
        return calcularMontanteTotalJuros() + super.getMontante();
    }
}
