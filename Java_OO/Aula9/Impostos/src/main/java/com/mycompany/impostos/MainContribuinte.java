/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.impostos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Asus
 */
public class MainContribuinte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1
        List<Contribuinte> contribuintes = new ArrayList<>();
        
        // 2
        contribuintes.add(new Desempregado("Luís Vidal", "Lisboa", 230, 1));
        contribuintes.add(new Reformado("Valter Coelho", "Olival", 600, 400));
        contribuintes.add(new Desempregado("Paulo Santos", "Braga", 150, 4));
        contribuintes.add(new TrabalhadorContaOutrem("Ana", "Ovar", 1800, 300, "CMM"));
        contribuintes.add(new Reformado("Jaime Magalhães", "Porto", 1500, 100));
        contribuintes.add(new TrabalhadorContaOutrem("Sílvio", "Seixal", 8000, 1000, "SSB"));
        contribuintes.add(new TrabalhadorContaPropria("Mário", "Guarda", 1500, 300, "Eletricista"));
        contribuintes.add(new Reformado("Amílcar Silva", "Coimbra", 1000, 500));
        contribuintes.add(new TrabalhadorContaOutrem("João", "Lisboa", 800, 100, "CML"));
        contribuintes.add(new TrabalhadorContaPropria("Carla", "Porto", 15000, 1000, "Advogado"));
        contribuintes.add(new Desempregado("Maria Sá", "Afife", 230, 8));
        
        // 3
        //listar(contribuintes);
        
        // 4
        System.out.println("Removido?" + contribuintes.remove(new Desempregado("Luis Vidal", "Lisboa", 230, 1)));
        
        // 5
        //listar(contribuintes);
        
        // 6 e 7
        // após reescrita do método equals o desempregado Luis Vidal foi removido
        
        // 8 a)
        System.out.println("\n### Equals ###");
        System.out.println("Instâncias com características iguais: " + contribuintes.get(0).equals(new Reformado("Valter Cubilhas", "Olival", 600, 400)));
        
        System.out.println();
        
        // 8 b)
        System.out.println("Instâncias do mesmo tipo com características diferentes: " + contribuintes.get(1).equals(contribuintes.get(contribuintes.size() - 1)));
        
        System.out.println();
        
        // 8 c)
        System.out.println("Instâncias de tipos diferentes: " + contribuintes.get(0).equals(contribuintes.get(contribuintes.size() - 1)));
        
        System.out.println();
        
        // 9 a)
        Comparacao1 c1 = new Comparacao1();
        Collections.sort(contribuintes, c1);
        //listar(contribuintes);
        
        System.out.println();
        

        
        // 9 b)
        Comparacao2 c2 = new Comparacao2();
        Collections.sort(contribuintes, c2);
        listar(contribuintes);
        
    }
    
    private static void listar(List<Contribuinte> contribuintes) {
        for(Contribuinte cont: contribuintes) {
            if(cont != null) {
                System.out.println(cont);
            }
        }
    }
    
}
