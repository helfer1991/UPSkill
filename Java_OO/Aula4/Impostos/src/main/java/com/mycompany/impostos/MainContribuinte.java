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
public class MainContribuinte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //a
        TrabalhadorContaOutrem c1 = new TrabalhadorContaOutrem("Helder", "Porto", 25000, 35000, "SONAE");
        TrabalhadorContaOutrem c2 = new TrabalhadorContaOutrem("Mafalda", "Porto", 10000, 25000, "Kununu");
        TrabalhadorContaPropria c3 = new TrabalhadorContaPropria("Renato", "Braga", 40000, 18000, "Dentista");
        TrabalhadorContaPropria c4 = new TrabalhadorContaPropria("Jose", "Ermesinde", 25000, 30000, "Developer");
        Reformado c5 = new Reformado("Vitor", "Maia", 15000, 18000);
        Reformado c6 = new Reformado("Manuel", "Porto", 0, 11000);
        Desempregado c7 = new Desempregado("Daniel", "Porto", 6000, 36);
        Desempregado c8 = new Desempregado("Catia", "Lisboa", 0, 70);
        
        //b
        Contribuinte[] contribuintes = new Contribuinte[10];
        contribuintes[0] = c1;
        contribuintes[1] = c2;
        contribuintes[2] = c3;
        contribuintes[3] = c4;
        contribuintes[4] = c5;
        contribuintes[5] = c6;
        contribuintes[6] = c7;
        contribuintes[7] = c8;
        
        //c
        for(int i = 0; i < contribuintes.length; i++) {
            if(contribuintes[i] != null) {
                System.out.println(contribuintes[i] + "Imposto extraordinário: " + contribuintes[i].totalImposto());
                System.out.println();
            }
        }
        
        //d
        for(int i = 0; i < contribuintes.length; i++) {
            if(contribuintes[i] != null) {
                if(contribuintes[i] instanceof Desempregado) {
                    System.out.printf("Nome: %s\nTotal de imposto a pagar: %.2f\n", contribuintes[i].getNome(), contribuintes[i].totalImposto());
                }
            }
        }
        System.out.println();
        
        //f
        for(int i = 0; i < contribuintes.length; i++) {
            if(contribuintes[i] != null) {
                if(contribuintes[i] instanceof Desempregado) {
                    System.out.printf("Nome: %s\nTotal de imposto a pagar: %.2f\n", contribuintes[i].getNome(), contribuintes[i].totalImposto());
                }
            }
        }
    }
    
}
