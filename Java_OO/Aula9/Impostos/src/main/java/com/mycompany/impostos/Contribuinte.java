/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.impostos;

import java.util.Comparator;

/**
 *
 * @author Asus
 */
public abstract class Contribuinte {
    private String nome;
    private String morada;
    private int outrosRend;
    
    private static final String NOME_OMISSO = "anonimo";
    private static final String MORADA_OMISSO = "debaixo da ponte";
    private static final int OUTROSREND_OMISSO = 0;
    
    public Contribuinte() {
        this.nome = NOME_OMISSO;
        this.morada = MORADA_OMISSO;
        this.outrosRend = OUTROSREND_OMISSO;
    }
    
    public Contribuinte(String nome, String morada, int outrosRend) {
        this.nome = nome;
        this.morada = morada;
        this.outrosRend = outrosRend;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the morada
     */
    public String getMorada() {
        return morada;
    }

    /**
     * @param morada the morada to set
     */
    public void setMorada(String morada) {
        this.morada = morada;
    }
    
    /**
     * @return the OR
     */
    public int getOutrosRend() {
        return outrosRend;
    }

    /**
     * @param outrosRend the outrosRend to set
     */
    public void setOR(int outrosRend) {
        this.outrosRend = outrosRend;
    }
    
    @Override
    public String toString() {
        return String.format("Nome: %s\nMorada:%s\nOutros rendimentos: %d\n", this.nome, this.morada, this.outrosRend);
    }
    
    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || this.getClass() != outroObjeto.getClass()) {
            return false;
        }
        if(this.getClass() == outroObjeto.getClass()) {
            return true;
        }
        Contribuinte outroContribuinte = (Contribuinte) outroObjeto;
        return this.nome.equalsIgnoreCase(outroContribuinte.nome) && this.morada.equalsIgnoreCase(outroContribuinte.morada) && this.outrosRend == outroContribuinte.outrosRend;
    }
    
    public abstract float calcularImpostoOR();
    
    public abstract float totalImposto();
}
