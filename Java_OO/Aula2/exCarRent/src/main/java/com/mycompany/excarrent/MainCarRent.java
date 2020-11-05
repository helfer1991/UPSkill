/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.excarrent;

/**
 *
 * @author Asus
 */
public class MainCarRent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //a
        CarRent c1 = new CarRent("11-23-AA", 1999, 12, 700, 1800);
        CarRent c2 = new CarRent("24-25-BB", 2016, 6, 900, 1400);
        CarRent c3 = new CarRent("09-05-CB", 2020, 4, 1100, 1000);

        //b
        System.out.println(c1);
        System.out.println(c1.classificacaoCarroIdade());
        System.out.println("A taxa ambiental a pagar pelo veículo é de " + c1.getImposto(25) + "€");
        System.out.println(c2);
        System.out.println(c2.classificacaoCarroIdade());
        System.out.println("A taxa ambiental a pagar pelo veículo é de " + c2.getImposto(75) + "€");
        System.out.println(c3);
        System.out.println(c3.classificacaoCarroIdade());
        System.out.println("A taxa ambiental a pagar pelo veículo é de " + c3.getImposto(45) + "€");
    }    
}
