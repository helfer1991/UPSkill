package org.upskill.figuras_equals;

import java.util.ArrayList;
import java.util.List;

public class MainFiguras {

    public static void main(String[] args) {
        System.out.println("\n### Figuras Construídas ###");
        Circulo c1 = new Circulo();
        System.out.println(c1);

        Circulo c2 = new Circulo(5, "amarelo");
        System.out.println(c2);

        Retangulo r1 = new Retangulo();
        System.out.println(r1);

        Retangulo r2 = new Retangulo(5, 2, "azul");
        System.out.println(r2);

        List<Figura> figuras = new ArrayList<>();
        figuras.add(c1);
        figuras.add(c2);
        figuras.add(r1);
        figuras.add(r2); 
        
        System.out.println("\n### Figuras Armazenadas no ArrayList (foreach) ###");
        listarForEach(figuras);        
        
        System.out.println("\n### Remover Objeto do Contentor ###");
        Circulo c = new Circulo();
        System.out.println("Objeto: " + c);
        System.out.println("Removido? " + figuras.remove(c));
        System.out.println("Contentor:");
        listarForEach(figuras);
//        System.out.println(figuras.remove(null));
        
        System.out.println("\n### Equals ###");
        System.out.println("Instâncias com características iguais: " + c1.equals(new Circulo()));
        System.out.println("Instâncias do mesmo tipo com características diferentes: " + c1.equals(c2));
        System.out.println("Instâncias de tipos diferentes: " + c1.equals(r1));
        System.out.println("Mesma Instância: " + c1.equals(c1));        
    }

    private static void listarForEach(List<Figura> lista) {
        for (Figura figura : lista) {
            System.out.printf("%s Área: %.1f %n", figura.toString(), figura.calcularArea());
        }
    }
}