package org.upskill.tributaveis;

public class Veiculo implements Cores, Tributavel {
    private String matricula;
    private int cilindrada;
    private String cor;

//    Variáveis para a alínea 13    
    private static int limiteEscalao1 = 1500;
    private static float impostoEscalao1 = 15;
    private static float impostoEscalao2 = 40;    

    public Veiculo(String matricula, int cilindrada, String cor) {
        this.matricula = matricula;
        this.cilindrada = cilindrada;
        this.cor = cor;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public String getCor() {
        return cor;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return String.format("Veículo com matrícula %s e cilindrada %d tem cor %s", 
                matricula, cilindrada, cor);
    }

    @Override
    public float calcularImposto() {
        float imposto;
        if(cilindrada < limiteEscalao1) {
            imposto = impostoEscalao1;
        } else {
            imposto = impostoEscalao2;
        }
        return imposto;
    }
}