/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.geometria2d;

/**
 *
 * @author Asus
 */
public class Retangulo {
    private int comprimento;
    private int largura;
    
    private static final int COMPRIMENTO_OMISSO = 0;
    private static final int LARGURA_OMISSO = 0;
    
    public Retangulo(int comprimento, int largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }
    
    public Retangulo() {
        this.comprimento = COMPRIMENTO_OMISSO;
        this.largura = LARGURA_OMISSO;
    }

    /**
     * @return the comprimento
     */
    public int getComprimento() {
        return comprimento;
    }

    /**
     * @param comprimento the comprimento to set
     */
    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    /**
     * @return the largura
     */
    public int getLargura() {
        return largura;
    }

    /**
     * @param largura the largura to set
     */
    public void setLargura(int largura) {
        this.largura = largura;
    }
    
    public int getArea() {
        return comprimento*largura;
    }
    
    @Override
    public String toString() {
        return String.format("Comprimento: %d, largura: %d", comprimento, largura);
    }
}
