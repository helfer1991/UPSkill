/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.escola;

/**
 *
 * @author Asus
 */
public abstract class Pessoa {
    private String nome;
    private int nif;
    
    private static final String NOME_OMISSO = "anonimo";
    private static final int NIF_OMISSO = 11111111;
    
    public Pessoa() {
        this.nome = NOME_OMISSO;
        this.nif = NIF_OMISSO;
    }
    
    public Pessoa(String nome, int nif) {
        this.nome = nome;
        this.nif = nif;
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
     * @return the nif
     */
    public int getNif() {
        return nif;
    }

    /**
     * @param nif the nif to set
     */
    public void setNif(int nif) {
        this.nif = nif;
    }
    
    @Override
    public String toString() {
        return String.format("Nome: %s\nNif: %d", nome, nif);
    }
}
