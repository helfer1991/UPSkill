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
public class TrabalhadorPeca extends Trabalhador {

    /**
     * O número de peças do tipo 1 do trabalhador à peça.
     */
    private int numeroPecasTipo1;

    /**
     * O número de peças do tipo 2 do trabalhador à peça.
     */
    private int numeroPecasTipo2;

    /**
     * O número de peças por omissão do tipo 1 do trabalhador à peça.
     */
    private static final int NUMERO_PECAS_TIPO1_POR_OMISSAO = 0;

    /**
     * O número de peças por omissão do tipo 2 do trabalhador à peça.
     */
    private static final int NUMERO_PECAS_TIPO2_POR_OMISSAO = 0;

    /**
     * O pagamento por uma peça do tipo 1 aplicado a todos os trabalhadores à
     * peça.
     */
    private static float pagamentoPecaTipo1 = 6.5f;

    /**
     * O pagamento por uma peça do tipo 2 aplicado a todos os trabalhadores à
     * peça.
     */
    private static float pagamentoPecaTipo2 = 9.5f;

    /**
     * Constrói uma instância de TrabalhadorPeca recebendo o nome, o número de
     * peças do tipo 1 e o número de peças do tipo 2.
     *
     * @param nome o nome do trabalhador à peça
     * @param numeroPecasTipo1 o número de peças 1 do trabalhador à peça
     * @param numeroPecasTipo2 o número de peças 2 do trabalhador à peça
     */
    public TrabalhadorPeca(String nome, int numeroPecasTipo1, int numeroPecasTipo2) {
        super(nome);
        this.numeroPecasTipo1 = numeroPecasTipo1;
        this.numeroPecasTipo2 = numeroPecasTipo2;
    }

    /**
     * Constrói uma instância de TrabalhadorPeca recebendo o nome e atribuindo
     * zero aos números de peças do tipo 1 e do tipo 2.
     *
     * @param nome o nome do trabalhador à peça
     */
    public TrabalhadorPeca(String nome) {
        super(nome);
        numeroPecasTipo1 = NUMERO_PECAS_TIPO1_POR_OMISSAO;
        numeroPecasTipo2 = NUMERO_PECAS_TIPO2_POR_OMISSAO;
    }

    /**
     * Constrói uma instância de TrabalhadorPeca atribuindo o nome por omissão e
     * os números de peças por omissão do tipo 1 e do tipo 2.
     */
    public TrabalhadorPeca() {
        super();
        numeroPecasTipo1 = NUMERO_PECAS_TIPO1_POR_OMISSAO;
        numeroPecasTipo2 = NUMERO_PECAS_TIPO2_POR_OMISSAO;
    }

    /**
     * Devolve o número de peças do tipo 1 do trabalhador à peça.
     *
     * @return número de peças do tipo 1 do trabalhador à peça
     */
    public int getNumeroPecasTipo1() {
        return numeroPecasTipo1;
    }

    /**
     * Devolve o número de peças do tipo 2 do trabalhador à peça.
     *
     * @return número de peças do tipo 2 do trabalhador à peça
     */
    public int getNumeroPecasTipo2() {
        return numeroPecasTipo2;
    }

    /**
     * Modifica o número de peças do tipo 1 do trabalhador à peça.
     *
     * @param numeroPecasTipo1 o novo número de peças do tipo 1 do trabalhador à
     * peça
     */
    public void setNumeroPecasTipo1(int numeroPecasTipo1) {
        this.numeroPecasTipo1 = numeroPecasTipo1;
    }

    /**
     * Modifica o número de peças do tipo 2 do trabalhador à peça.
     *
     * @param numeroPecasTipo2 o novo número de peças do tipo 2 do trabalhador à
     * peça
     */
    public void setNumeroPecasTipo2(int numeroPecasTipo2) {
        this.numeroPecasTipo2 = numeroPecasTipo2;
    }

    /**
     * Devolve a descrição textual do trabalhador à peça.
     *
     * @return caraterísticas do trabalhador à peça
     */
    @Override
    public String toString() {
        return String.format("Trabalhador à Peça: %s %nNº de Peças do Tipo 1: "
                + "%d %nNº de Peças do Tipo 2: %d",
                super.toString(), numeroPecasTipo1, numeroPecasTipo2);
    }

    /**
     * Devolve o vencimento do trabalhador à peça.
     *
     * @return vencimento do trabalhador à peça
     */
    @Override
    public float calcularVencimento() {
        return numeroPecasTipo1 * pagamentoPecaTipo1
                + numeroPecasTipo2 * pagamentoPecaTipo2;
    }

    /**
     * Devolve o pagamento de uma peça do tipo 1.
     *
     * @return pagamento de uma peça do tipo 1
     */
    public static float getPagamentoPecaTipo1() {
        return pagamentoPecaTipo1;
    }

    /**
     * Devolve o pagamento de uma peça do tipo 2.
     *
     * @return pagamento de uma peça do tipo 2
     */
    public static float getPagamentoPeca2() {
        return pagamentoPecaTipo2;
    }

    /**
     * Modifica o pagamento de uma peça do tipo 1.
     *
     * @param pagamentoPecaTipo1 o novo pagamento de uma peça do tipo 1
     */
    public static void setPagamentoPecaTipo1(float pagamentoPecaTipo1) {
        TrabalhadorPeca.pagamentoPecaTipo1 = pagamentoPecaTipo1;
    }

    /**
     * Modifica o pagamento de uma peça do tipo 2.
     *
     * @param pagamentoPecaTipo2 o novo pagamento de uma peça do tipo 2
     */
    public static void setPagamentoPeca2(float pagamentoPecaTipo2) {
        TrabalhadorPeca.pagamentoPecaTipo2 = pagamentoPecaTipo2;
    }
}

