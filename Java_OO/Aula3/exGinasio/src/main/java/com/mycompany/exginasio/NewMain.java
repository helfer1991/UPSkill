/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exginasio;

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
        Utente u1 = new Utente("Helder", "Masculino", 29, 1.83f, 79);
        Utente u2 = new Utente("Mafalda", "Feminino", 24, 1.60f, 54);
        Utente u3 = new Utente("Renato", "Masculino", 30, 1.75f, 54);
        Utente u4 = new Utente("Isabel", "Feminino", 21, 1.76f, 90);
        
        //b
        Utente[] utentes = new Utente[10];
        utentes[0] = u1;
        utentes[1] = u2;
        utentes[2] = u3;
        utentes[3] = u4;
        
        //c.i
        for (Utente utente : utentes) {
            System.out.println(utente);
        }
        
        //c.ii
        for(Utente utente : utentes) {
            if(utente != null) {
                System.out.println(utente.getNome());
                System.out.println(utente.getIMC());
                System.out.println(utente.getGrauIMC());
                System.out.println();                
            }
        }
        
        //c.iii
        for(Utente utente : utentes) {
            if(utente != null) {
                if(!utente.isSaudavel()) {
                    System.out.println(utente.getNome());
                    System.out.println(utente.getGrauIMC());
                    System.out.println();
                }                
            }
        }
        
        //e
        u3.setIdade(u1.getIdade());
        
        //f
        System.out.println(u4.isMaisNovo(u1));
    }
    
}
