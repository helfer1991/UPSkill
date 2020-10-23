/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex1b;

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
        
        getNum();
    }
    
    public static int getNum() {
        int num, count = 0;
        boolean flag = false;
        
        do {
            System.out.println("Escreve números. O programa pára quando encontrar uma capicua, ou já tiverem sido introduzidos 100 números");
            num = ler.nextInt();
            count++;
            if(count == 100 || isCapicua(num) == true) {
                flag = true;
            }
        } while(!flag);
        
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
