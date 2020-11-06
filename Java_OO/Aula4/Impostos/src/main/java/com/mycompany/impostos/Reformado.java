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
public class Reformado extends TrabalhadorComRendimentos {
    private static final float TXRT = 0.01f;
    private static final float TXOR = 0.03f;
    
    public Reformado(String nome, String morada, int outrosRend, int rendTrabalho) {
        super(nome, morada, outrosRend, rendTrabalho);
    }
    
    @Override
    public String toString() {
        return String.format("%s", super.toString());
    }

    @Override
    public float calcularImpostoRT() {
        return super.getRendTrabalho() * TXRT;
    }

    @Override
    public float calcularImpostoOR() {
        return super.getOutrosRend() * TXOR;
    }
}
