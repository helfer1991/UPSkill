/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.extrabalhador;

/**
 *
 * @author Asus
 */
public class TrabalhadorComissao extends Trabalhador {

    /**
     * O salário base do trabalhador à comissão.
     */
    private float salarioBase;

    /**
     * O montante de vendas realizadas pelo trabalhador à comissão.
     */
    private float vendas;

    /**
     * A percentagem da comissão de vendas do trabalhador à comissão.
     */
    private float comissao;

    /**
     * O valor por omissão do salário base do trabalhador à comissão.
     */
    private static final float SALARIO_BASE_POR_OMISSAO = 635.0f;

    /**
     * O montante por omissão das vendas do trabalhador à comissão.
     */
    private static final int VENDAS_POR_OMISSAO = 0;

    /**
     * A percentagem por omissão da comissão de vendas do trabalhador à comissão.
     */
    private static final int COMISSAO_POR_OMISSAO = 0;

    /**
     * Constrói uma instância de TrabalhadorComissao recebendo o nome, o salário
     * base, o montante de vendas e a percentagem da comissão de vendas do
     * trabalhador à comissão.
     *
     * @param nome o nome do trabalhador à comissão
     * @param salarioBase o salário base do trabalhador à comissão
     * @param vendas o montante de vendas do trabalhador à comissão
     * @param comissao a percentagem da comissão de vendas do trabalhador à
     * comissão
     */
    public TrabalhadorComissao(String nome, float salarioBase, float vendas, float comissao) {
        super(nome);
        this.salarioBase = salarioBase;
        this.vendas = vendas;
        this.comissao = comissao;
    }

    /**
     * Constrói uma instância de TrabalhadorComissao recebendo o nome e
     * atribuindo o salário base por omissão, o montante das vendas por omissão
     * e a percentagem por omissão da comissão de vendas do trabalhador à
     * comissão.
     *
     * @param nome o nome do trabalhador à comissão
     */
    public TrabalhadorComissao(String nome) {
        super(nome);
        salarioBase = SALARIO_BASE_POR_OMISSAO;
        vendas = VENDAS_POR_OMISSAO;
        comissao = COMISSAO_POR_OMISSAO;
    }

    /**
     * Constrói uma instância de TrabalhadorComissao atribuindo o nome por
     * omissão, o salário base por omissão, o montante por omissão das vendas e
     * a percentagem por omissão da comissão de vendas do trabalhador à comissão.
     */
    public TrabalhadorComissao() {
        super();
        salarioBase = SALARIO_BASE_POR_OMISSAO;
        vendas = VENDAS_POR_OMISSAO;
        comissao = COMISSAO_POR_OMISSAO;
    }

    /**
     * Devolve o salário base do trabalhador à comissão.
     *
     * @return salário base do trabalhador à comissão.
     */
    public float getSalarioBase() {
        return salarioBase;
    }

    /**
     * Devolve o montante de vendas do trabalhador à comissão.
     *
     * @return montante das vendas do trabalhador à comissão
     */
    public float getVendas() {
        return vendas;
    }

    /**
     * Devolve a percentagem da comissão de vendas do trabalhador à comissão.
     *
     * @return percentagem da comissão de vendas do trabalhador à comissão
     */
    public float getComissao() {
        return comissao;
    }

    /**
     * Modifica o salário base do trabalhador à comissão.
     *
     * @param salarioBase o novo salário base do trabalhador à comissão
     */
    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    /**
     * Modifica o montante de vendas do trabalhador à comissão.
     *
     * @param vendas o novo montante de vendas do trabalhador à comissão
     */
    public void setVendas(float vendas) {
        this.vendas = vendas;
    }

    /**
     * Modifica a percentagem da comissão de vendas do trabalhador à comissão.
     *
     * @param comissao a nova percentagem da comissão de vendas do trabalhador
     * à comissão
     */
    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    /**
     * Devolve a descrição textual do trabalhador à comissão.
     *
     * @return caraterísticas do trabalhador à comissão
     */
    @Override
    public String toString() {
        return String.format("Trabalhador à Comissão: %s "
                + "%nSalário Base: %.2f Euros "
                + "%nVendas: %.2f Euros "
                + "%nComissão: %.2f%%",
                super.toString(), salarioBase, vendas, comissao);
    }

    /**
     * Devolve o vencimento do trabalhador à comissão.
     *
     * @return vencimento do trabalhador à comissão
     */
    @Override
    public float calcularVencimento() {
        return salarioBase + vendas * (comissao / 100);
    }

}

