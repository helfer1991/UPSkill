/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.excirculo;

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
        int x1, y1, raio, x2, y2, count = 0;
        
        
        System.out.println("Indica o centro do círculo e o seu raio");
        x1 = ler.nextInt();
        y1 = ler.nextInt();
        raio = ler.nextInt();
        
        do {
            System.out.println("Indica um ponto para verificar se está dentro do círculo");
            x2 = ler.nextInt();
            y2 = ler.nextInt();
            
            if(checkCirc(x1, y1, raio, x2, y2)) {
                count++;
            }
        } while(x1 != x2 && y1 != y2);
        System.out.println(count);
    }
    
    public static boolean checkCirc(int x1, int y1, int raio, int x2, int y2) {
        return dist(x1, y1, raio, x2, y2) <= raio;
    }
    
    public static double dist(int x1, int y1, int raio, int x2, int y2) {
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        
    }
    
}
