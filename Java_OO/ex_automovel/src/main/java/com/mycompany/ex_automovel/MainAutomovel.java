/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex_automovel;

/**
 *
 * @author Asus
 */
public class MainAutomovel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //a
        Automovel a1 = new Automovel("11-11-AA", "Toyota", 1400);
        
        //b
        System.out.println(a1);
        
        //c
        System.out.println(a1.getMatricula());
        
        //d
        System.out.println(Automovel.getTotalAutomoveis());
        
        //e
        Automovel a2 = new Automovel("22-22-BB", "Audi");
        
        //f
        System.out.println(a2);
        
        //g
        a2.setCilindrada(1800);
        
        //h
        System.out.println(a2);
        
        //i
        System.out.println(Automovel.getTotalAutomoveis());
        
        //j
        int dif = a2.calcularDiferencaCilindrada(a1);
        System.out.println(dif);
        
        //k
        System.out.println(a1.isCilindradaMaior(a2) ? a1.getMatricula() : a2.getMatricula());
        
        //l
        System.out.println(a1.isCilindradaMaior(2000));
    }
    
}
