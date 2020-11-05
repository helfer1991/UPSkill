/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex2;

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
        int lim = introduzLim();
        printer(lim);
    }
    
    public static int introduzLim() {
        int lim;
        System.out.println("Introduz um número para verificar quantos números da sequência de fibonacci existem até esse limite");
        
        do {
            lim = ler.nextInt();
        } while(lim < 1);
        
        return lim;
    }
    
    public static int fib(int lim) {
        if(lim == 0) {
            return 0;
        } else if(lim == 1) {
            return 1;
        } else {
            return fib(lim - 1) + fib(lim - 2);
        }
    }
    
    public static void printer(int lim) {
        for(int i = 0; i < lim; i++) {
            System.out.println(fib(i));
        }
    }
    
}
