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
public class TrabalhadorContaOutrem extends TrabalhadorComRendimentos {
    private String nomeEmpresa;
    
    private static final float TXRT1 = 0.01f;
    private static final float TXRT2 = 0.02f;
    private static final float TXOR = 0.02f;
    private static final String NOMEEMPRESA_OMISSO = "sem empresa";
    
    public TrabalhadorContaOutrem(String nome, String morada, int outrosRend, int rendTrab, String nomeEmpresa) {
        super(nome, morada, outrosRend, rendTrab);
        this.nomeEmpresa = nomeEmpresa;
    }
    
    public TrabalhadorContaOutrem() {
        super();
        this.nomeEmpresa = NOMEEMPRESA_OMISSO;
    }    

    /**
     * @return the nomeEmpresa
     */
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    /**
     * @param nomeEmpresa the nomeEmpresa to set
     */
    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    @Override
    public String toString() {
        return String.format("%sNome da empresa: %s\n", super.toString(), this.nomeEmpresa);
    }

    @Override
    public float calcularImpostoRT() {
        float imposto;
        if(super.getRendTrabalho() > 30000) {
            imposto = super.getRendTrabalho() * TXRT2;
        } else {
            imposto = super.getRendTrabalho() * TXRT1;
        }
        return imposto;
    }

    @Override
    public float calcularImpostoOR() {
        return super.getOutrosRend() * TXOR;
    }
}
