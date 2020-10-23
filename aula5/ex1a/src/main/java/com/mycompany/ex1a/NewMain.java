/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex1a;

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
        
        System.out.println(isCapicua(getNum()));
    }
    
    public static int getNum() {
        int num;
        
        do {
            System.out.println("Escreve um número para verificar se é capicua");
            num = ler.nextInt();            
        } while(num < 1);
        
        return num;
    }
    
    public static boolean isCapicua(int num) {
        int dig, temp, reverseNum = 0;
        
        temp = num;
        
        while(temp != 0) {
            dig = temp % 10;
            reverseNum = reverseNum * 10 + dig;
            temp /= 10;
        }
        
        return (num == reverseNum);
    }
    
}
