/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula3;

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
        //ex1_assinc();
        //ex2_assinc();
        ex3_assinc();
        //ex4_assinc();
        //ex5_assinc();
    }
    
    public static void ex1_assinc() {
        int count = 0, num, temp, dig;
        boolean par = false;
        System.out.println("escreve um número com 4 dígitos e par");
        do {
            num = ler.nextInt();
            temp = num;
            int unidade = temp % 10;
            do {
                dig = temp % 10;
                count++;
                temp /= 10;
            } while(temp != 0);
            if(count == 4 && unidade % 2 == 0) {
                par = true;                
            }
            count = 0;
        } while(par == false);
        
        for(int i = 0; i <= num; i++) {
            if(i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
    
    public static void ex2_assinc() {
        int montIni = 0;
        double txJuro = 0;
        
        System.out.println("Indica o montante inicial do depósito");
        do {
            montIni = ler.nextInt();
        } while(montIni < 0);
        
        double montFin = montIni;        
        
        for(int i = 1; i <= 12; i++) {
            System.out.println("Indica as taxas de juro mensais até ao fim do ano");
            do {
                txJuro = ler.nextDouble();
            } while(txJuro < 0);
            montFin *= (1+txJuro);
        }
        System.out.println(montFin);
    }
    
    public static void ex3_assinc() { //incompleto
        int h1, h2, var1, var2, temp1, temp2, count = 0;
        boolean flag = false;
        
        do {
            System.out.println("Indica a altura e a variação da mesma, em cm, por ano, da 1ª criança");
            h1 = ler.nextInt();
            var1 = ler.nextInt();
            
            if(h1 > 0 && var1 >= 0) {
                flag = true;
            }
        } while(!flag);
        
        flag = false;
        
        do {
            System.out.println("Indica a altura e a variação da mesma, em cm, por ano, da 2ª criança");
            h2 = ler.nextInt();
            var2 = ler.nextInt();
            if(h2 > 0 && var2 >= 0) {
                if(h1 > h2 && var1 < var2 || h1 < h2 && var1 > var2) {
                    flag = true;
                }
            }
        } while(!flag);
        
        if(h1 < h2) {
            temp1 = h1;
            temp2 = var1;
            h1 = h2;
            var1 = var2;
            h2 = temp1;
            var2 = temp2;
        }
        
        while(h2 < h1) {
            h1 += var1;
            h2 += var2;
            count++;
            System.out.println("Altura da criança 1 no ano " + count + " é " + h1);
            System.out.println("Altura da criança 2 no ano " + count + " é " + h2);
        }
        
        System.out.println(count);
    }
    
    public static void ex4_assinc() { //testar mais
        int num, dig, digAnt = -1, count = 1, max = 0;
        
        do {
            System.out.println("Indica um número inteiro positivo");
            num = ler.nextInt();
        } while(num < 10);
        
        while(num != 0) {
            dig = num % 10;
            if(dig < digAnt) {
                count++;
            } else {
                count = 1;
            }
            if(max < count) {
                max = count;
            }
            digAnt = dig;
            num /= 10;
        }
        
        System.out.println(max);
    }
    
    public static void ex5_assinc() {
        int num;
        boolean flag = false;
        
        do {
            System.out.println("Escreve um número entre 2 e 20 inclusive");
            num = ler.nextInt();
            if(num > 1 && num < 21) {
                flag = true;
            }
        } while(!flag);
            
        for(int i = 1; i <= num; i++) { // linhas
            for(int j = 1; j < i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i = num - 1; i > 0; i--) {
            for(int j = 1; j < i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
