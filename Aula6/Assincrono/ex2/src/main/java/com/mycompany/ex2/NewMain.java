/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex2;

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
        int[] arr = {5, 4, 10, 20, 2, 0, 50, 10, 15, 21};
        getExtremes(arr, arr.length);
        getExtremes(getArr(), 50);
    }
    
    public static void getExtremes(int[] arr, int dim) {
        int min = arr[0]; //associado j
        int max = arr[1]; //associado k
        int j = 0, k = 1, temp = min;

        if(min > max) {
            temp = max;
            max = min;
            min = temp;
            temp = k;
            k = j;
            j = temp;
        }

        for(int i = 2; i < dim; i++) {
            if(arr[i] < min) {
                min = arr[i];
                j = i;
            }
            if(arr[i] > max) {
                max = arr[i];
                k = i;
            }
        }
        System.out.printf("Mínimo: %d\nMáximo: %d\nPosição do mínimo: %d\nPosição do máximo: %d\n", min, max, j, k);
    }
    
    public static int[] getArr() {
        int[] arr = new int[50];
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Introduz 1 nº");
            arr[i] = ler.nextInt();
        }
        return arr;
    }
}
