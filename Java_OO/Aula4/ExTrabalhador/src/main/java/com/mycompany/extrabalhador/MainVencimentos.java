/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.extrabalhador;

/**
 *
 * @author Asus
 */
public class MainVencimentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //3
        TrabalhadorPeca tp1 = new TrabalhadorPeca("Jorge Silva", 53, 62);
        TrabalhadorComissao tc1 = new TrabalhadorComissao("Susana Ferreira", 650.00f, 4.25f, 2731.5f);
        TrabalhadorHora th1 = new TrabalhadorHora("Carlos Miguel", 168, 4.5f);
        
        //4
        Trabalhador[] arr = new Trabalhador[10];
        
        //5
        arr[0] = tp1;
        arr[1] = tc1;
        arr[2] = th1;
        
        //6.i
        for(Trabalhador obj : arr) {
            if(obj != null) {
                System.out.println(obj);
                System.out.println();
            }
        }
        
        //6.ii
        for(Trabalhador obj : arr) {
            if(obj instanceof TrabalhadorHora) {
                System.out.println(obj);
            }
        }
        
        //6.iii
        for(Trabalhador obj : arr) {
            if(obj != null) {
                System.out.printf("Nome: %s\nVencimento: %.2f\n\n", obj.getNome(), obj.calcularVencimento());
            }
        }
    }
    
}
