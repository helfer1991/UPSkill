/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.contadores;

/**
 *
 * @author Asus
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //a
        ContadorGas cg1 = new ContadorGas("Helder", 120);
        ContadorGas cg2 = new ContadorGas("Isabel", 150);
        ContadorElectSimples ces1 = new ContadorElectSimples("Mafalda", 140, 7.4);
        ContadorElectSimples ces2 = new ContadorElectSimples("Maria", 300, 8);
        ContadorBiHorario ceb1 = new ContadorBiHorario("Manuel", 90, 135);
        ContadorBiHorario ceb2 = new ContadorBiHorario("Vitor", 100, 300);
        
        Contador[] array = new Contador[10];
        array[0] = cg1;
        array[1] = cg2;
        array[2] = ces1;
        array[3] = ces2;
        array[4] = ceb1;
        array[5] = ceb2;
        
        //b        
        for(Contador contador : array) {
            if(contador != null) {
                System.out.println("Cliente: " + contador.getCliente() + "\nID contador: " + contador.getId());
                System.out.println();
            }
        }
        
        //c
        System.out.println("Quantidade de contadores criados: " + ContadorBiHorario.getContadorElect());
        System.out.println();
        
        //d
        for(Contador contador : array) {
            if(contador != null && contador instanceof ContadorBiHorario) {
                System.out.println(contador);
                System.out.println();
            }
        }
        
        //e
        for(Contador contador : array) {
            if(contador != null) {
                System.out.println("ID do contador: " + contador.getId() + "\nConsumo do contador: " + contador.getConsumo());
                System.out.println();
            }
        }
        
        //f
        int max = 0;
        for(Contador contador : array) {
            if(contador != null && contador instanceof ContadorGas) {
                if(max < contador.getConsumo()) {
                    max = contador.getConsumo();
                }
            }
        }
        System.out.println(max);
        System.out.println();
        
        //g
        for(Contador contador : array) {
            if(contador != null && contador.getId().equalsIgnoreCase("0")) {
                System.out.println(contador);
            }
        }
    }
    
}
