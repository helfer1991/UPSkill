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
public abstract class Contador {
    private String cliente;
    private String id;
    private int consumo;
    
    private static final String CLIENTE_OMISSO = "anonimo";
    private static final String ID_OMISSO = "cenas";
    private static final int CONSUMO_OMISSO = 100;
    
    public Contador() {
        this.cliente = CLIENTE_OMISSO;
        this.id = ID_OMISSO;
        this.consumo = CONSUMO_OMISSO;
    }
    
    public Contador(String cliente, String id, int consumo) {
        this.cliente = cliente;
        this.id = id;
        this.consumo = consumo;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
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
    
    @Override
    public String toString() {
        return String.format("Nome do cliente: %s\nID do contador: %s\nConsumo: %d\n", this.cliente, this.id, this.consumo);
    }
    
    public abstract double getConsumoMes();
}
