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
public class Bolseiro extends Aluno implements Encargos {
    private int bolsa;
    
    private static final int BOLSA_OMISSO = 1000;
    
    public Bolseiro() {
        this.bolsa = BOLSA_OMISSO;
    }
    
    public Bolseiro(String nome, int nif, int numero, int bolsa) {
        super(nome, nif, numero);
        this.bolsa = bolsa;
    }

    /**
     * @return the bolsa
     */
    public int getBolsa() {
        return bolsa;
    }

    /**
     * @param bolsa the bolsa to set
     */
    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
    @Override
    public String toString() {
        return String.format("%sBolsa: %d\n", super.toString(), bolsa);
    }
    
    @Override
    public float calcularEncargos() {
        return bolsa;
    }
}
