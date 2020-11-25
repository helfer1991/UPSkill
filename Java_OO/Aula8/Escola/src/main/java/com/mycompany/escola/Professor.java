/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.escola;

/**
 *
 * @author Asus
 */
public class Professor extends Pessoa implements Categorias, Encargos {
    private String categoria;
    
    private static int SAL_BASE = 1500;
    private static float MAJORACAO_ADJUNTO = 1.2f;
    private static float MAJORACAO_COORDENADOR = 1.5f;
    private static final String CATEGORIA_OMISSO = "Sem categoria";
    
    public Professor() {
        super();
        this.categoria = CATEGORIA_OMISSO;
    }
    
    public Professor(String nome, int nif, String categoria) {
        super(nome, nif);
        this.categoria = categoria;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the SAL_BASE
     */
    public static int getSAL_BASE() {
        return SAL_BASE;
    }

    /**
     * @param aSAL_BASE the SAL_BASE to set
     */
    public static void setSAL_BASE(int aSAL_BASE) {
        SAL_BASE = aSAL_BASE;
    }

    /**
     * @return the MAJORACAO_ADJUNTO
     */
    public static float getMAJORACAO_ADJUNTO() {
        return MAJORACAO_ADJUNTO;
    }

    /**
     * @param aMAJORACAO_ADJUNTO the MAJORACAO_ADJUNTO to set
     */
    public static void setMAJORACAO_ADJUNTO(float aMAJORACAO_ADJUNTO) {
        MAJORACAO_ADJUNTO = aMAJORACAO_ADJUNTO;
    }

    /**
     * @return the MAJORACAO_COORDENADOR
     */
    public static float getMAJORACAO_COORDENADOR() {
        return MAJORACAO_COORDENADOR;
    }

    /**
     * @param aMAJORACAO_COORDENADOR the MAJORACAO_COORDENADOR to set
     */
    public static void setMAJORACAO_COORDENADOR(float aMAJORACAO_COORDENADOR) {
        MAJORACAO_COORDENADOR = aMAJORACAO_COORDENADOR;
    }
    
    @Override
    public String toString() {
        return String.format("%sCategoria: %s\n", super.toString(), categoria);
    }
    
    @Override
    public float calcularEncargos() {
        float salario;
        if(categoria.equals(Categorias.ADJUNTO)) {
            salario = SAL_BASE * MAJORACAO_ADJUNTO;
        } else if(categoria.equals(Categorias.COORDENADOR)) {
            salario = SAL_BASE * MAJORACAO_COORDENADOR;
        } else {
            salario = SAL_BASE;
        }
        return salario;
    }
}
