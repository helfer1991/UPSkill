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
public class Desempregado extends Contribuinte {
    private int mesesParagem;
    
    private static final int MESESPARAGEM_OMISSO = 0;
    private static final float TXOR = 0.02f;
    
    public Desempregado(String nome, String morada, int outrosRend, int mesesParagem) {
        super(nome, morada, outrosRend);
        this.mesesParagem = mesesParagem;
    }

    public Desempregado() {
        super();
        this.mesesParagem = MESESPARAGEM_OMISSO;
    }

    /**
     * @return the mesesParagem
     */
    public int getMesesParagem() {
        return mesesParagem;
    }

    /**
     * @param mesesParagem the mesesParagem to set
     */
    public void setMesesParagem(int mesesParagem) {
        this.mesesParagem = mesesParagem;
    }
    
    @Override
    public String toString() {
        return String.format("%sMeses de paragem: %d\n", super.toString(), this.mesesParagem);
    }
    
    @Override
    public float calcularImpostoOR() {
        return super.getOutrosRend() * TXOR;
    }

    @Override
    public float totalImposto() {
        return calcularImpostoOR();
    }
}
