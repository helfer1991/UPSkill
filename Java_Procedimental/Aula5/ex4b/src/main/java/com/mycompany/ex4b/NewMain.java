/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex4b;

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
        System.out.println(octalToDec(getNum()));
    }
    
    public static int getNum() {
        int num;        
        do {
            System.out.println("Indica um número octal para transformar em decimal. Nenhum dígito pode ser > 7");
            num = ler.nextInt();
        } while(!checkOctal(num));
        return num;
    }
    
    public static boolean checkOctal(int num) {
        int dig = 0, count1 = 0, count2 = 0;
        while(num != 0) {
            dig = num % 10;
            if(dig < 8) {
                count1++;
            }
            count2++;
            num /= 10;
        }
        return count1 == count2;
    }
    
    public static int octalToDec(int octal) {
        if(checkOctal(octal)) {
            int n2, decimal = 0, i = 0;

            while(octal > 0) {
                n2 = octal % 10;
                decimal += n2*Math.pow(8, i);            
                i++;
                octal /= 10;
            }
            return decimal;
        }
        return -1;
    }
}
