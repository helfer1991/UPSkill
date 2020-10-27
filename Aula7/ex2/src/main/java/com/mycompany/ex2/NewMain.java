/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex2;

import java.util.Arrays;
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
        int[][] matrix = new int[3][3];
        fillMatrix(matrix);
        System.out.println(media(matrix));
        System.out.println(getPercent(matrix) + "%");
    }
    
    public static void fillMatrix(int[][] matrix) {
        System.out.println("Preenche a matrix. Deves escrever 9 elementos");
        
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ler.nextInt();
            }
        }
    }
    
    public static float media(int[][] matrix) {
        int count = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(i == j) {
                    count += matrix[i][j];
                }
            }
        }
        return (float) count / matrix.length;
    }
    
    public static float getPercent(int[][] matrix) {
        int count = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if((i + j) == (matrix.length - 1)) {
                    if(matrix[i][j] % 2 == 0) {
                        count++;
                    }
                }
            }
        }
        return (float) count / matrix.length * 100;
    }
}
