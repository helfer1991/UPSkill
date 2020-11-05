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
public abstract class TrabalhadorComRendimentos extends Contribuinte {
    private int rendTrabalho;
    private static final int RENDTRABALHO_OMISSO = 0;
    
    public TrabalhadorComRendimentos(String nome, String morada, int outrosRend, int rendTrabalho) {
        super(nome, morada, outrosRend);
        this.rendTrabalho = rendTrabalho;
    }
    
    public TrabalhadorComRendimentos() {
        super();
        this.rendTrabalho = RENDTRABALHO_OMISSO;
    }

    /**
     * @return the rendTrabalho
     */
    public int getRendTrabalho() {
        return rendTrabalho;
    }

    /**
     * @param rendTrabalho the rendTrabalho to set
     */
    public void setRendTrabalho(int rendTrabalho) {
        this.rendTrabalho = rendTrabalho;
    }
    
    @Override
    public String toString() {
        return String.format("%sRendimentos do trabalho: %s\n", super.toString(), this.rendTrabalho);
    }

    public abstract float calcularImpostoRT();
    
    @Override
    public abstract float calcularImpostoOR();
    
    @Override
    public abstract float totalImposto();
}
