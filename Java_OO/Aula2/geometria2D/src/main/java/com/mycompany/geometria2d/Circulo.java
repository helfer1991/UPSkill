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
public class Circulo {
    private int raio;
    
    private static final int RAIO_OMISSO = 0;
    
    public Circulo(int raio) {
        this.raio = raio;
    }
    
    public Circulo() {
        this.raio = RAIO_OMISSO;        
    }

    /**
     * @return the raio
     */
    public int getRaio() {
        return raio;
    }

    /**
     * @param raio the raio to set
     */
    public void setRaio(int raio) {
        this.raio = raio;
    }
    
    public double getArea() {
        return Math.pow(this.raio, 2)*Math.PI;
    }
    
    @Override
    public String toString() {
        return String.format("Raio: %d", raio);
    }
}
