/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula2;

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
        //ex2_aula();
        //ex3_aula();
        
        //ex1_assinc();
        //ex2_assinc();
        //ex3_assinc();
        ex4_assinc();
        //ex5_assinc();
    }
    
    public static void ex2_aula() {
        System.out.println("Escreve a quantidade de alunos");
        int n, somaNotas = 0, somaNeg = 0, nota, notaNeg = 0, notaPos = 0;
        double percentPos, mediaNeg;
        
        do {
            n = ler.nextInt();
        } while(n < 1);
            
        while(n-- != 0) { //posso usar um for
            System.out.println("Escreve uma nota. Deve estar entre 0 e 20");
            do {
                nota = ler.nextInt();
            } while(nota < 0 || nota > 20);
            
            if(nota < 10) {
                notaNeg += nota;
                somaNeg++;
            } else {
                notaPos++;
            }
            somaNotas++;
        }
        
        percentPos = (double) notaPos * 100 / somaNotas;
        mediaNeg = (double) notaNeg / somaNeg;
        
        System.out.println("Média das negativas é " + mediaNeg + " valores");
        System.out.printf("Percentagem de positivas: %.2f\n", percentPos);
    }
    
    public static void ex3_aula() {
        int lim = 100;
        int somaPares = 0, numPar = 0, numImpar = 0, total = 0;
        double percentImpar, mediaPares;
        int n = ler.nextInt();
        int menor = n;
        
        while(n > 0 && lim-- != 0) {            
            n = ler.nextInt();
            if(n >= 0) {
                if(n < menor) {
                    menor = n;
                }
            }
            if(n % 2 == 0) {
                numPar += n;
                somaPares++;
            } else {
                numImpar++;
            }
            total++;
        }
        percentImpar = (double) numImpar * 100 / total;
        mediaPares = (double) numPar / somaPares;
        
        System.out.println("a percentagem de ímpares é " + percentImpar + "%");
        System.out.println("a média de pares é " + mediaPares);
    }
    
    public static void ex1_assinc() {
        int total = 0, par = 0, impar = 0, countImp = 0, a;
        double media, percentPar;
        
        do {
            System.out.println("Escreve um número >= a 0. Negativos terminam o programa");
            a = ler.nextInt();
            if(a >= 0) {
                if(a % 2 == 0) {
                    par++;
                } else {
                    impar += a;
                    countImp++;
                }
                total++; 
            }
        } while(a > -1);
        
        media = (double) impar / countImp;
        System.out.println(par + " " + total);
        percentPar = (double) par * 100 / total;
        System.out.printf("Percentagem de pares: %.2f%%\n", percentPar);
        System.out.printf("Média de impares: %.1f\n", media);
    }
    
    public static void ex2_assinc() {
        int limInf, limSup;
        
        System.out.println("Indica o limite inferior");
        
        limInf = ler.nextInt();
        
        do {
            System.out.println("Indica o limite superior (> limite inferior");
            limSup = ler.nextInt();
        } while(limSup <= limInf);
        
        for(int i = limInf; i < limSup; i++) {
            if(i % 3 == 0 && i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    
    public static void ex3_assinc() {        
        int lim;
        
        do {
            System.out.println("Escreve um número para servir como limite. Deve ser maior do que 0");
            lim = ler.nextInt();
        } while(lim < 0);
        
        int num = 0, soma = 0, menor = lim;
        
        while(soma < lim) {
            num = ler.nextInt();
            if(num < menor) {
                menor = num;
            }
            soma += num;
        }
        System.out.println("O menor número introduzido foi " + menor);
    }
    
    public static void ex4_assinc() {
        int salBase, horasExtra, somaFunc = 0;
        double salTotal = 0, mediaSalarial;
        
        System.out.println("Indica o salário base e a quantidade de horas extra, respetivamente, de um funcionário. -1 termina");
        
        do {
            salBase = ler.nextInt();
            
            while(salBase < 1) {
                salBase = ler.nextInt();
            }
            
            horasExtra = ler.nextInt();
            
            while(horasExtra < 1 && horasExtra != -1) {
                horasExtra = ler.nextInt();
            }
                        
            if(horasExtra != -1) {
                salTotal += (double) salBase + horasExtra * 0.02 * salBase;
                somaFunc++;
                System.out.println("O funcionário ganha o seguinte salário mensal: " + salBase + horasExtra * 0.02 * salBase + "€");
            }            
        } while(horasExtra != -1);
        
        mediaSalarial = (double) salTotal / somaFunc;
        System.out.println(mediaSalarial + "€");
    }
    
    public static void ex5_assinc() {
        int produto = 1, n, lim, maior = 1;        
        
        do {
            System.out.println("Escreve um número para servir como limite");
            lim = ler.nextInt();
        } while(lim < 1);
        
        do {
            n = ler.nextInt();
            produto *= n;
            if(n > maior) {
                maior = n;
            }
        } while(produto <= lim);
        
        System.out.println("o maior dos números introduzidos é " + maior);
    }
    
    public static void ex6_assinc() { //incompleto
        int a, b, c, n;
        System.out.println("Introduz o valor dos coeficientes a, b e c");
        a = ler.nextInt();
        b = ler.nextInt();
        c = ler.nextInt();
        
        if(a == 0) {
            System.out.println("A equação não é do 2º grau");
        } else {
            if((-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) == (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c))) {
                System.out.println("A equação tem raíz dupla");
            } else if((Math.pow(b, 2) - 4*a*c) < 0) {
                System.out.println("A equação tem raízes imaginárias");
            } else {
                System.out.println("A equação tem duas raízes");
            }
        }        
    }
}
