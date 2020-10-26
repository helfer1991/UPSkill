/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex1;

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
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        float media = getMedia(arr, arr.length);
        System.out.println(media);
        System.out.println(getMedia(getArr(), 50));
    }
    
    public static float getMedia(int[] arr, int dim) {
        int soma = 0;
        for(int i = 0; i < dim; i++) {
            soma += arr[i];
        }
        return (float) soma/dim;
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
