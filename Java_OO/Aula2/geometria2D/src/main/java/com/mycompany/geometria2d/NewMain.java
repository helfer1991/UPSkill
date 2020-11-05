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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Retangulo r = new Retangulo(10,30);
        
        System.out.println(r);
        
        System.out.println(r.getArea());
        
        r.setComprimento(50);
        
        System.out.println(r);
        
        System.out.println(r.getArea());
        
        Circulo c = new Circulo(5);
        
        System.out.println(c);
        
        System.out.println(c.getArea());
        
        c.setRaio(9);
        
        System.out.println(c.getArea());
    }
    
}
