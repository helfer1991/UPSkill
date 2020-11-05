/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exlojacomercial;

/**
 *
 * @author Asus
 */
public class Loja { 
    //poderia fazer static int id e incrementar no construtor, mas n sei se é suposto fazê-lo neste exercício
    private String id;
    private String desc;
    private int area;
    private int receitas;
    
    private static final int RENDA_FIXA = 150;    
    private static final String ID_OMISSO = "01";
    private static final String DESC_OMISSO = "anonimo";
    private static final int AREA_OMISSO = 100;
    private static final int RECEITAS_OMISSO = 10000;
    private static final int PEQUENA = 20;
    private static final int MEDIA = 100;
    
    public Loja(String id, String desc, int area, int receitas) {
        this.id = id;
        this.desc = desc;
        this.area = area;
        this.receitas = receitas;
    }
    
    public Loja() {
        this.id = ID_OMISSO;
        this.desc = DESC_OMISSO;
        this.area = AREA_OMISSO;
        this.receitas = RECEITAS_OMISSO;
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
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return the area
     */
    public int getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(int area) {
        this.area = area;
    }

    /**
     * @return the receitas
     */
    public int getReceitas() {
        return receitas;
    }

    /**
     * @param receitas the receitas to set
     */
    public void setReceitas(int receitas) {
        this.receitas = receitas;
    }
    
    public int getRenda() {
        return RENDA_FIXA * (1 + this.area/100) + this.receitas/100;
    }
    
    public String getClassificacao() {
        if(this.area < PEQUENA) {
            return "Pequena";
        } else if(this.area >= PEQUENA && this.area <= MEDIA) {
            return "Média";
        } else {
            return "Grande";
        }
    }
    
    @Override
    public String toString() {
        return String.format("ID: %s, Descrição: %s, Área: %d, Receitas: %d", this.id, this.desc, this.area, this.receitas);
    }
}
