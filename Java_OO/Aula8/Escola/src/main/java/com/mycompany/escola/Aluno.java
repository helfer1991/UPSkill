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
public class Aluno extends Pessoa {
    private int numero;
    
    private static final int NUMERO_OMISSO = 0;
    
    public Aluno() {
        super();
        this.numero = NUMERO_OMISSO;
    }
    
    public Aluno(String nome, int nif, int numero) {
        super(nome, nif);
        this.numero = numero;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void set(int numero) {
        this.numero = numero;
    }
    
    @Override
    public String toString() {
        return String.format("%sNúmero mecanográfico: %d", super.toString(), numero);
    }
}
