/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula3_sincrono;

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
        //ex1a();
        //ex1b();
        //ex2a();
        //ex2b();
        ex4();
       //ex5();
    }
    
    public static void ex1a() {
        int num, count = 0, dig;
        
        do {
            System.out.println("Introduz um numero inteiro positivo para determinar a soma dos seus dígitos pares");
            num = ler.nextInt();
        } while(num < 1);
        
        while(num != 0) {
            dig = num % 10;
            if(dig % 2 == 0) {
                count += dig;
            }
            num /= 10;
        }        
        System.out.println("A soma dos dígitos pares é " + count);
    }
    
    public static void ex1b() {
        int num, count, dig, temp;
        
        do {
            System.out.println("Introduz um numero inteiro positivo para determinar a soma dos seus dígitos pares");
            num = ler.nextInt();        
            temp = num;
            count = 0;
            
            while(temp != 0) {
                dig = temp % 10;
                if(dig % 2 == 0) {
                    count += dig;
                }
                temp /= 10;
            }
            if(num > 0) {
                System.out.println("A soma dos dígitos pares é " + count);                
            }
        } while(num > 0);
    }
    
    public static void ex2a() {
        int num, count = 1, dig;
        
        do {
            System.out.println("Introduz um numero inteiro positivo para determinar o produto dos seus dígitos ímpares");
            num = ler.nextInt();
        } while(num < 1);
        
        while(num != 0) {
            dig = num % 10;
            if(dig % 2 != 0) {
                count *= dig;
            }
            num /= 10;
        }        
        System.out.println("O produto dos seus dígitos ímpares é " + count);
    }
    
    public static void ex2b() {
        int num, count, dig, temp;
        
        do {
            System.out.println("Introduz um numero inteiro positivo para determinar o produto dos seus dígitos ímpares");
            num = ler.nextInt();        
            temp = num;
            count = 1;
            
            while(temp != 0) {
                dig = temp % 10;
                if(dig % 2 != 0) {
                    count *= dig;
                }
                temp /= 10;
            }    
            if(num > 0) {
                System.out.println("O produto dos seus dígitos ímpares é " + count);                
            }
        } while(num > 0);
    }
    
    public static void ex4() {
        int num, dig, temp, reverseNum = 0;
        
        do {
            System.out.println("Escreve um número para verificar se é capicua");
            num = ler.nextInt();            
        } while(num < 1);
        
        temp = num;
        
        while(temp != 0) {
            dig = temp % 10;
            reverseNum = reverseNum * 10 + dig;
            temp /= 10;
        }
        
        String msg = (num == reverseNum) ? "É capicua" : "Não é capicua";
        System.out.println(msg);
    }
    
    public static void ex5() {
        int n, j = 1, count = 0;
        boolean flag = false;
        
        do {
            System.out.println("Indica um número positivo inteiro para verificar se é primo");
            n = ler.nextInt();
        } while(n < 2);
        
        while(j < n/2) {
            if(n % j == 0) {
                count++;
                System.out.println(j);
            }
            j++;
        }
        
        if(count != 1) {
            System.out.println("O número " + n + " não é primo");
        } else {
            System.out.println("O número " + n + " é primo");
        }
        
    }
}
