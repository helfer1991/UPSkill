/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex4;

import java.util.Arrays;

/**
 *
 * @author Asus
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = new int[7];
        fillNumbers(arr);
        printer(arr);
    }
    
    public static void fillNumbers(int[] arr) {
        int i = 0, min = 1, max = 51;
        while(i != 7) {            
            if(i > 4) {
                max = 13;
            }
            arr[i] = (int) (Math.random() * (max - min)) + min;
            i++;
        }
    }
    
    public static void printer(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
