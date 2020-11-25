/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.excumprimentar;

/**
 *
 * @author Asus
 */
public class Cumprimentar {
    private String nome;
    private int idade;
    
    private static final String NOME_OMISSO = "anónimo";
    private static final int IDADE_OMISSO = 99;
    
    public Cumprimentar(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public Cumprimentar(String nome) {
        this.nome = nome;
    }
    
    public Cumprimentar() {
        this.nome = NOME_OMISSO;
        this.idade = IDADE_OMISSO;
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
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    @Override
    public String toString() {
        //return String.format("O meu nome é %s", nome);
        return String.format("%d tem %d anos", nome, idade);
    }
}
