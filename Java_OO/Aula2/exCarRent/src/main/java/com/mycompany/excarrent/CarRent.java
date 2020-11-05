/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.excarrent;

/**
 *
 * @author Asus
 */
public class CarRent {
    private String matricula;
    private int anoRegisto;
    private int consumo;
    private int autonomia;
    private int cilindrada;
    
    private static final String MATRICULA_OMISSO = "00-00-AA";
    private static final int ANOREGISTO_OMISSO = 1900;
    private static final int CONSUMO_OMISSO = 10;
    private static final int AUTONOMIA_OMISSO = 500;
    private static final int CILINDRADA_OMISSO = 2000;
    private static final int RECENTE = 1;
    private static final int CLASSICO = 20;
    private static final int ANOATUAL = 2020;
    
    public CarRent(String matricula, int anoRegisto, int consumo, int autonomia, int cilindrada) {
        this.matricula = matricula;
        this.anoRegisto = anoRegisto;
        this.consumo = consumo;
        this.autonomia = autonomia;
        this.cilindrada = cilindrada;
    }
    
    public CarRent() {
        this.matricula = MATRICULA_OMISSO;
        this.anoRegisto = ANOREGISTO_OMISSO;
        this.consumo = CONSUMO_OMISSO;
        this.autonomia = AUTONOMIA_OMISSO;
        this.cilindrada = CILINDRADA_OMISSO;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the anoRegisto
     */
    public int getAnoRegisto() {
        return anoRegisto;
    }

    /**
     * @param anoRegisto the anoRegisto to set
     */
    public void setAnoRegisto(int anoRegisto) {
        this.anoRegisto = anoRegisto;
    }

    /**
     * @return the consumo
     */
    public int getConsumo() {
        return consumo;
    }

    /**
     * @param consumo the consumo to set
     */
    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    /**
     * @return the autonomia
     */
    public int getAutonomia() {
        return autonomia;
    }

    /**
     * @param autonomia the autonomia to set
     */
    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    /**
     * @return the cilindrada
     */
    public int getCilindrada() {
        return cilindrada;
    }

    /**
     * @param cilindrada the cilindrada to set
     */
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    public double getImposto(int txAmbiental) {
        return txAmbiental*cilindrada;
    }
    
    public String classificacaoCarroIdade() {
        int dif = ANOATUAL - this.anoRegisto;
        if(dif < RECENTE) {
            return "Recente";
        } else if(dif > CLASSICO) {
            return "Clássico";
        } else {
            return "Contemporâneo";
        }
    }
    
    @Override
    public String toString() {
        return String.format("Matrícula: %s, Ano de Registo: %d, Consumo: %d, Autonomia: %d, Cilindrada: %d", this.matricula, this.anoRegisto, this.consumo, this.autonomia, this.cilindrada);
    }
}
