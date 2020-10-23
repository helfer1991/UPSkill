/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex4a;

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
        String msg = checkOctal(getNum()) ? "O número introduzido é octal" : "O número introduzido não é octal";
        System.out.println(msg);
    }
    
    public static int getNum() {
        int num;        
        do {
            System.out.println("Indica um número para verificar se é octal");
            num = ler.nextInt();
        } while(num < 0);
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
    
}
