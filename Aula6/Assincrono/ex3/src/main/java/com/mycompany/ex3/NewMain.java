/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex3;

import java.util.Arrays;

/**
 *
 * @author Asus
 */
public class NewMain { //vou assumir que recebe um array vazio, caso contrário terei de criar outro método para dar return da quantidade 0s seguidos existentes

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = new int[10];
        int n = getSlotsOccupied(arr, 10, 12345);
        printArr(arr);
    }
    
    public static int getSlotsOccupied(int[] arr, int dim, int n) {
        int slotsOccupied = 0, i = 0;
        
        if(dim >= getAmountDigits(n)) {
            while(n != 0) {
                arr[i++] = n % 10;
                slotsOccupied++;
                n /= 10;
            }
            return dim - slotsOccupied;
        }
        return 0;
    }
    
    public static int getAmountDigits(int n) {
        int count = 0;
        while(n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }
    
    public static void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
