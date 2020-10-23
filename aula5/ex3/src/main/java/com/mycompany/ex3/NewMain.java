/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex3;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        double raio, altura, resultado;
        String solido = ler.nextLine();

        while(solido.equals("fim") != true) {
            if(solido.equals("esfera")) {
                raio = ler.nextDouble();            
                resultado = volume_esfera(solido,raio);
            } else {
                raio = ler.nextDouble();
                altura = ler.nextDouble();
                resultado = volume(solido,raio,altura);
            }
            System.out.printf("%.2f\n", resultado);
            solido = ler.next();
            ler.nextLine();
        }
    }
    
    public static double volume(String solido, double raio, double altura) {
        double volume = 0;
        
        if(solido.equals("cilindro")) {
            volume = (Math.PI*altura*Math.pow(raio, 2));
        } else if(solido.equals("cone")) {
            volume = (Math.PI*altura*Math.pow(raio, 2))/3;
        }
        return volume;
    }
    
    public static double volume_esfera(String solido, double raio) {
        double volume = 0;
        
        if(solido.equals("esfera")) {
            volume = (4*Math.pow(raio, 3)*Math.PI)/3;
        }
        return volume;
    }
    
}
