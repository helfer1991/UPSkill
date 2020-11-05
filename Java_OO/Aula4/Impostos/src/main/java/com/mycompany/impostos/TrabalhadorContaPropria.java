/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.impostos;

/**
 *
 * @author Asus
 */
public class TrabalhadorContaPropria extends TrabalhadorComRendimentos {
    private String profissao;
    
    private static final String PROFISSAO_OMISSA = "Vendedor";
    private static final float TXRT = 0.03f;
    private static final float TXOR1 = 0.02f;
    private static final float TXOR2 = 0.05f;
    
    public TrabalhadorContaPropria(String nome, String morada, int outrosRend, int rendTrabalho, String profissao) {
        super(nome, morada, outrosRend, rendTrabalho);
        this.profissao = profissao;
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
    
    @Override
    public String toString() {
        return String.format("%sProfissão: %s\n", super.toString(), this.profissao);
    }

    @Override
    public float calcularImpostoRT() {
        return super.getRendTrabalho() * TXRT;
    }

    @Override
    public float calcularImpostoOR() {
        float imposto;
        if(super.getOutrosRend() > 50000) {
            imposto = super.getOutrosRend() * TXOR2;
        } else {
            imposto = super.getOutrosRend() * TXOR1;
        }
        return imposto;
    }

    @Override
    public float totalImposto() {
        return calcularImpostoRT() + calcularImpostoOR();
    }
    
    
}
