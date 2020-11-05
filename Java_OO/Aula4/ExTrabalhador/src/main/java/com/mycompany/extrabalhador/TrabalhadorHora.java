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
public class TrabalhadorHora extends Trabalhador {

    /**
     * O número de horas de trabalho do trabalhador à hora.
     */
    private int numeroHoras;

    /**
     * O pagamento por hora de trabalho do trabalhador à hora.
     */
    private float pagamentoHora;

    /**
     * O valor por omissão do número de horas de trabalho do trabalhador à hora.
     */
    private static final int NUMERO_HORAS_POR_OMISSAO = 0;

    /**
     * O valor por omissão do pagamento por hora de trabalho do trabalhador
     * à hora.
     */
    private static final float PAGAMENTO_HORA_POR_OMISSAO = 10.0f;

    /**
     * Constrói uma instância de TrabalhadorHora recebendo o nome, o número de
     * horas de trabalho e o valor do pagamento por hora.
     *
     * @param nome o nome do trabalhador à hora
     * @param numeroHoras o número de horas de trabalho do trabalhador à hora
     * @param pagamentoHora o pagamento por hora do trabalhador à hora
     */
    public TrabalhadorHora(String nome, int numeroHoras, float pagamentoHora) {
        super(nome);
        this.numeroHoras = numeroHoras;
        this.pagamentoHora = pagamentoHora;
    }

    /**
     * Constrói uma instância de TrabalhadorHora recebendo o nome e atribuindo o
     * número de horas por omissão e o pagamento hora por omissão.
     *
     * @param nome o nome do trabalhador à hora
     */
    public TrabalhadorHora(String nome) {
        super(nome);
        numeroHoras = NUMERO_HORAS_POR_OMISSAO;
        pagamentoHora = PAGAMENTO_HORA_POR_OMISSAO;
    }

    /**
     * Constrói uma instância de TrabalhadorHora atribuindo o nome por omissão,
     * o número de horas por omissão e o pagamento hora por omissão.
     */
    public TrabalhadorHora() {
        super();
        numeroHoras = NUMERO_HORAS_POR_OMISSAO;
        pagamentoHora = PAGAMENTO_HORA_POR_OMISSAO;
    }

    /**
     * Devolve o número de horas de trabalho do trabalhador à hora.
     *
     * @return número de horas de trabalho do trabalhador à hora
     */
    public int getNumeroHoras() {
        return numeroHoras;
    }

    /**
     * Devolve o pagamento por hora de trabalho do trabalhador à hora.
     *
     * @return pagamento por hora de trabalho do trabalhador à hora
     */
    public float getPagamentoHora() {
        return pagamentoHora;
    }

    /**
     * Modifica o número de horas de trabalho do trabalhador à hora.
     *
     * @param numeroHoras o novo número de horas de trabalho do trabalhador à hora
     */
    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    /**
     * Modifica o pagamento por hora de trabalho do trabalhador à hora.
     *
     * @param pagamentoHora o novo pagamento por hora de trabalho do trabalhador
     *                      à hora
     */
    public void setPagamentoHora(float pagamentoHora) {
        this.pagamentoHora = pagamentoHora;
    }

    /**
     * Devolve a descrição textual do trabalhador à hora.
     *
     * @return caraterísticas do trabalhador à hora
     */
    @Override
    public String toString() {
        return String.format("Trabalhador à Hora: %s %nNº de Horas de Trabalho: "
                + "%d %nPagamento por Hora: %.2f €",
                super.toString(), numeroHoras, pagamentoHora);
    }

    /**
     * Devolve o vencimento do trabalhador à hora.
     *
     * @return vencimento do trabalhador à hora
     */
    @Override
    public float calcularVencimento() {
        return numeroHoras * pagamentoHora;
    }
}
