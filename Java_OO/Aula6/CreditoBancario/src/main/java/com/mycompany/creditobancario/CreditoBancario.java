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
public abstract class CreditoBancario {
    private String nomeCliente;
    private String profissao;
    private int montante;
    private int prazoFinanciamento;
    
    private static final String NOMECLIENTE_OMISSO = "John Doe";
    private static final String PROFISSAO_OMISSO = "Político";
    private static final int MONTANTE_OMISSO = 100000;
    private static final int PRAZOFINANCIAMENTO_OMISSO = 100;
    
    public CreditoBancario() {
        this.nomeCliente = NOMECLIENTE_OMISSO;
        this.profissao = PROFISSAO_OMISSO;
        this.montante = MONTANTE_OMISSO;
        this.prazoFinanciamento = PRAZOFINANCIAMENTO_OMISSO;
    }
    
    public CreditoBancario(String nomeCliente, String profissao, int montante, int prazoFinanciamento) {
        this.nomeCliente = nomeCliente;
        this.profissao = profissao;
        this.montante = montante;
        this.prazoFinanciamento = prazoFinanciamento;
    }

    /**
     * @return the nomeCliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * @param nomeCliente the nomeCliente to set
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     * @return the profissao
     */
    public String getProfissao() {
        return profissao;
    }

    /**
     * @param profissao the profissao to set
     */
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    /**
     * @return the montante
     */
    public int getMontante() {
        return montante;
    }

    /**
     * @param montante the montante to set
     */
    public void setMontante(int montante) {
        this.montante = montante;
    }

    /**
     * @return the prazoFinanciamento
     */
    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    /**
     * @param prazoFinanciamento the prazoFinanciamento to set
     */
    public void setPrazoFinanciamento(int prazoFinanciamento) {
        this.prazoFinanciamento = prazoFinanciamento;
    }
    
    @Override
    public String toString() {
        return String.format("Nome do cliente: %s\nProfissão: %s\nMontante: %d\nPrazo do financiamento: %d meses\n", nomeCliente, profissao, montante, prazoFinanciamento);
    }
    
    public abstract double calcularMontanteTotalJuros();
    
    public abstract double calcularMontanteAReceberPorCadaCredito();  
}
