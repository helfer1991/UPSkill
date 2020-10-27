/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex1;

/**
 *
 * @author Asus
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {6,2,4}, {3,4,2}};
        getMostPairs(matrix,3,3);
    }
    
    public static void getMostPairs(int[][] matrix, int rows, int col) {
        for(int i = 0; i < rows; i++) {
            int maior = matrix[i][0];
            for(int j = 1; j < col; j++) {
                if(maior < matrix[i][j]) {
                    maior = matrix[i][j];
                }
            }
            printer(maior);
        }
    }
    
    public static void printer(int num) {
        System.out.println(num);
    }
}
