/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exdata;

/**
 *
 * @author Asus
 */
public class MainData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //a
        Data d1 = new Data(2020, 10, 30);
        
        //b
        System.out.println(d1);
        
        //c
        Data d2 = new Data(1974, 04, 25);
        
        //d
        System.out.println(d2.toAnoMesDiaString());
        
        //e
        System.out.println(d1.isMaior(d2) ? "A primeira data é mais recente" : "A primeira data é mais antiga");
        
        //f
        int dif = d1.calcularDiferenca(d2);
        System.out.printf("A diferença entre as duas datas é de %d dias\n", d1.calcularDiferenca(d2));
        
        //g
        System.out.println("Faltam " + d1.calcularDiferenca(2020, 12, 25) + " dias para o Natal");
        
        //h
        System.out.println("Dia da semana do 25/04/1974: " + d2.determinarDiaDaSemana());
        
        //i.a
        System.out.println("1974 foi ano bissexto? " + d2.isAnoBissexto(d2.getAno()));
        
        //i.b
        System.out.println("1974 foi ano bissexto? " + Data.isAnoBissexto(1974));
    }
    
}
