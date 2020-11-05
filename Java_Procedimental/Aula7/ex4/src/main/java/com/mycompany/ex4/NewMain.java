/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex4;

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
        //int[][] matrix = new int[4][4];
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        //fillMatrix(matrix);
        matrixCenter(matrix);
    }
    
    public static void fillMatrix(int[][] matrix) {
        System.out.println("Preenche a matriz");
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ler.nextInt();
            }
        }
    }
    
    public static void matrixCenter(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(i != 0 && i != matrix[i].length - 1) {
                    if(j != 0 && j != matrix.length - 1) {
                        printer(matrix[i][j]);
                    }
                }
            }
        }
    }
    
    public static void printer(int num) {
        System.out.println(num);
    }
    
}
