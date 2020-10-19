/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula1;

/**
 *
 * @author Asus
 */
public class rapazes_raparigas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rapazes = 10;
        int raparigas = 12;
        int total = rapazes + raparigas;
        
        System.out.println(((float) rapazes / total) * 100 + "%");
        
        segToHour(10720);
        
        ex2(22, 40, 3, 45);
        
        ex1_ass(5, 6, 7, 8, 9);
        
        ex2_ass(3,1, 4, 2);
        
        ex4_ass(2, 4);
        
        ex5_ass(19, 2);
    }
    
    public static void segToHour(int s) {
        int seg = s % 60;
        int m = (s / 60) % 60;
        int h = (s / 3600);
        System.out.println(h + " " + m + " " + seg);
    }
    
    public static void ex2(int hPart, int minPart, int duraH, int duraM) {
        int totalMin = duraM + minPart;
        int totalH = duraH + hPart + (minPart + duraM) / 60;
        int h = totalH % 24;
        if(h < hPart) {
            System.out.println("Chega no dia seguinte às: " + h + "h" + totalMin % 60 + "min");
        } else {
            System.out.println("Chega no próprio dia às: " + h + "h" + totalMin % 60 + "min");
        }
    }
    
    public static void ex3(int a, int b, int c) {
        if(a > b && b > c) {
            System.out.println(a + b + c);
        }
    }
    
    public static void ex1_ass(int a, int b, int c, int d, int e) {
        double media_km = (double) (a + b + c + d + e) / 5 * 1.609;
        System.out.println(media_km);
    }
    
    public static void ex2_ass(int x1, int y1, int x2, int y2) {
        System.out.println(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
    }
    
    public static void ex3_ass(int num) {
        if(num < 0) {
            System.out.println(num);
        } else if(num > 0) {
            System.out.println(Math.pow(num,2) - 2*num);
        } else {
            System.out.println(0);
        }
    }
    
    public static void ex4_ass(int a, int b) {
        int temp;
        if(a < b) {
            temp = b;
            b = a;
            a = temp;
        }
        if(a % b == 0) {
            System.out.println(a + " e " + b + " são múltiplos");
        } else {
            System.out.println(a + " e " + b + " não são múltiplos");
        }        
    }
    
    public static void ex5_ass(int dia, int mes) {
        int dif = 0, dPar = 0, dImpar = 0;
        
        switch(mes) {
            case 1:
                dif = 31 - dia + 28;
                dImpar = 6;
                dPar = 4;
                break;
            case 2:
                dif = 28 - dia;
                dImpar = 6;
                dPar = 4;
                break;
            case 3:
                dif = 31 - dia;
                dImpar = 5;
                dPar = 4;
                break;
            case 4:
                dif = 30 - dia;
                dImpar = 5;
                dPar = 3;
                break;
            case 5:
                dif = 31 - dia;
                dImpar = 4;
                dPar = 3;
                break;
            case 6:
                dif = 30 - dia;
                dImpar = 4;
                dPar = 2;
                break;
            case 7:
                dif = 31 - dia;
                dImpar = 3;
                dPar = 2;
                break;
            case 8:
                dif = 31 - dia;
                dImpar = 2;
                dPar = 2;
                break;
            case 9:
                dif = 30 - dia;
                dImpar = 2;
                dPar = 1;
                break;
            case 10:
                dif = 31 - dia;
                dImpar = 1;
                dPar = 1;
                break;
            case 11:
                dif = 30 - dia;
                dImpar = 1;
                break;
            case 12:
                dif = 31 - dia;
                break;
            default:
                dif = 0;
                break;
        }
        
        System.out.println(dif + dImpar*31 + dPar * 30);
    }
}
