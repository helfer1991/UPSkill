/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex3;

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
        matrixPeriphery(matrix);
    }
    
    public static void fillMatrix(int[][] matrix) {
        System.out.println("Preenche a matriz");
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ler.nextInt();
            }
        }
    }
    
    public static void matrixPeriphery(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(i != 0 && i != matrix[i].length - 1) {
                    if(j == 0 || j == matrix.length - 1) {
                        printer(matrix[i][j]);
                    }
                } else {
                    printer(matrix[i][j]);
                }
            }
        }
    }
    
    public static void printer(int num) {
        System.out.println(num);
    }
}
