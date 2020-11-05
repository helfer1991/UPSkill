/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exnumimag;

/**
 *
 * @author Asus
 */
public class MainNumImag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Imaginario i1 = new Imaginario(-3,-4);
        System.out.println(i1);
//        System.out.println(i1.moduloComplexo());
//        System.out.println(i1.addComplexo(2,6));
//        System.out.println(i1.conjugado());
//        System.out.println(i1.multiplyComplexo(2, 3));
//        System.out.println(i1.divideComplexo(2,3));
        System.out.println(i1.argComplexo());
        

    }
    
}
