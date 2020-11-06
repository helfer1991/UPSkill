package org.upskill.figuras;

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
        
        System.out.println("\n### Variável do Tipo Object ###");
        Object obj;
        obj = c1;
        System.out.println(obj.toString());
        
        obj = r1;
        System.out.println(obj.toString()); 
        
        // Armazenamento de Objetos num Contentor do Tipo Array
        Object[] figuras = new Object[10];

        figuras[0] = c1;
        figuras[1] = c2;
        figuras[2] = r1;
        figuras[3] = r2;

        System.out.println("\n### Listagem de Figuras Armazenadas no Contentor ###");
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i] != null) {
                System.out.println(figuras[i]);
            }
        }
        
        //a
        for(int i = 0; i < figuras.length; i++) {
            if(figuras[i] != null) {
                System.out.println(((Figura)figuras[i]).getArea());
            }
        }
        
        //b
        String nome = "Helder";
        figuras[4] = nome;
        
        //e.i
        for(int i = 0; i < figuras.length; i++) {
            if(figuras[i] != null && figuras[i] instanceof Retangulo) {
                System.out.println(figuras[i]);
            }
        }
        
        //e.ii
        for(int i = 0; i < figuras.length; i++) {
            if(figuras[i] != null && figuras[i] instanceof Circulo) {
                System.out.println(figuras[i]);
            }
        }
    }
}