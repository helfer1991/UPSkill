package org.upskill.figuras_comparable;

public abstract class Figura implements Comparable<Figura> {
    private String cor;
    private static final String COR_POR_OMISSAO = "cinzento";

    public Figura(String cor) {
        this.cor = cor;
    }

    public Figura() {
        cor=COR_POR_OMISSAO;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return String.format("Cor: %s", cor);
    }
    
    public abstract double calcularArea();

    @Override
    public int compareTo(Figura outraFigura) {
        double area1 = this.calcularArea();
        double area2 = outraFigura.calcularArea();
        
        if(area1<area2)
            return -1;
        else if(area1>area2)
            return 1;
        else
            return 0;
    }
}