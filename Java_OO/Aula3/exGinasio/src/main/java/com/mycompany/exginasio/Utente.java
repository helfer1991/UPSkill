/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exginasio;

/**
 *
 * @author Asus
 */
public class Utente {
    private String nome;
    private String genero;
    private int idade;
    private float altura;
    private int peso;
    private static int qtUtentes = 0;
    
    private static final String NOME_OMISSO = "anonimo";
    private static final String GENERO_OMISSO = "indefinido";
    private static final int IDADE_OMISSO = 16;
    private static final float ALTURA_OMISSO = 1.7f;
    private static final int PESO_OMISSO = 60;
    private static final int MAGRO = 18;
    private static final int OBESO = 25;
    
    public Utente() {
        this.nome = NOME_OMISSO;
        this.genero = GENERO_OMISSO;
        this.idade = IDADE_OMISSO;
        this.altura = ALTURA_OMISSO;
        this.peso = PESO_OMISSO;
        qtUtentes++;
    }
    
    public Utente(String nome, int idade) {
        this.nome = nome;
        this.genero = GENERO_OMISSO;
        this.idade = idade;
        this.altura = ALTURA_OMISSO;
        this.peso = PESO_OMISSO; 
        qtUtentes++;       
    }
    
    public Utente(String nome, String genero, int idade, float altura, int peso) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        qtUtentes++;
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
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
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

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public int getQtUtentes() {
        return qtUtentes;
    }
    
    @Override
    public String toString() {
        return String.format("Nome: %s\nGénero: %s\nIdade: %d\nAltura: %.2f\nPeso: %d\n", this.nome, this.genero, this.idade, this.altura, this.peso);
    }
    
    public int dif(Utente outroUtente) {
        return this.idade - outroUtente.getIdade();
    }
    
    public float getIMC() {
        return this.peso/(float)Math.pow(this.altura, 2);
    }
    
    public String getGrauIMC() {
        String grau;
        if(getIMC() < MAGRO) {
            grau = "Magro";
        } else if(getIMC() > OBESO) {
            grau = "Obeso";
        } else{
            grau = "Saudável";
        }
        return grau;
    }
    
    public boolean isSaudavel() {
        return getGrauIMC().equalsIgnoreCase("Saudável");
    }
    
    public Utente isMaisNovo(Utente outroUtente) {
        return this.idade < outroUtente.idade ? this : this.idade == outroUtente.idade ? new Utente() : outroUtente;
    }
}