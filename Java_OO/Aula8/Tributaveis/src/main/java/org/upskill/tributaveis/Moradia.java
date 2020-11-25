package org.upskill.tributaveis;

public class Moradia implements Cores, Tributavel {
    private String morada;
    private float area;
    private String cor;
    
//    Variáveis para a alínea 13
    private static int fatorImposto = 2;

    public Moradia(String morada, float area, String cor) {
        this.morada = morada;
        this.area = area;
        this.cor = cor;
    }

    public String getMorada() {
        return morada;
    }

    public float getArea() {
        return area;
    }

    public String getCor() {
        return cor;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return String.format("Moradia situada na %s com área de %.1f tem cor %s", 
                morada, area, cor);
    }

    @Override
    public float calcularImposto() {
        return area * fatorImposto;
    }
}