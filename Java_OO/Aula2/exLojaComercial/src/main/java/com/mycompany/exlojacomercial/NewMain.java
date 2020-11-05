/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exlojacomercial;

/**
 *
 * @author Asus
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //a
        Loja l1 = new Loja("01", "Nike", 18, 2000000);
        Loja l2 = new Loja("02", "Adidas", 50, 300000);
        Loja l3 = new Loja("03", "FNAC", 300, 18000000);
        
        //b
        System.out.println("Área " + l1.getArea() + "m2. Classificação: " + l1.getClassificacao());
        System.out.println("Área " + l2.getArea() + "m2. Classificação: " + l2.getClassificacao());
        System.out.println("Área " + l3.getArea() + "m2. Classificação: " + l3.getClassificacao());
        
        //D
        System.out.println("Área " + l1.getArea() + "m2. Classificação: " + l1.getClassificacao());
        System.out.println("Área " + l2.getArea() + "m2. Classificação: " + l2.getClassificacao());
        System.out.println("Área " + l3.getArea() + "m2. Classificação: " + l3.getClassificacao());
        
    }
    
}
