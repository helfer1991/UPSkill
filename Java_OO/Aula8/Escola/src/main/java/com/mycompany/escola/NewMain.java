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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // a
        Professor p1 = new Professor("Alexandre Gouveia", 23232323, Categorias.ADJUNTO);
        Professor p2 = new Professor("Fernando Duarte", 423553434, Categorias.ASSISTENTE);
        Professor p3 = new Professor("Luiz Faria", 246567535, Categorias.COORDENADOR);
        
        Aluno a1 = new Aluno("André Azevedo", 48234235, 1130740);
        Aluno a2 = new Aluno("Sara Silva", 56575686, 1130648);
        
        Bolseiro b1 = new Bolseiro("Helder Ferreira", 258594306, 1130674, 1565);
        Bolseiro b2 = new Bolseiro("Tiago Pinheiro", 999999999, 1130672, 2500);
        
        Pessoa[] arr = new Pessoa[10];
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        arr[3] = a1;
        arr[4] = a2;
        arr[5] = b1;
        arr[6] = b2;
        
        // b
        for(Pessoa p : arr) {
            if(p != null && p instanceof Professor) {
                System.out.println("Nome: " + p.getNome() + ", categoria: " + ((Professor) p).getCategoria());
            }
        }
        
        System.out.println();
        
        // c
        for(Pessoa p : arr) {
            if(p != null && p instanceof Aluno && !(p instanceof Bolseiro)) {
                System.out.println("Número mecanográfico: " + ((Aluno) p).getNumero());
            }
        }
        
        System.out.println();
        
        // d
        for(Pessoa p : arr) {
            if(p != null) {
                System.out.println("Nome: " + p.getNome() + ", classe: " + p.getClass().getSimpleName());
            }
        }
        
        System.out.println();
        
        // e
        for(Pessoa p : arr) {
            if(p != null && p instanceof Professor) {
                System.out.println("Nome: " + p.getNome() + ", salário: " + ((Professor) p).calcularEncargos());
            }
        }
        
        System.out.println();
        
        // f
        for(Pessoa p : arr) {
            if(p != null & p instanceof Bolseiro) {
                System.out.println("Nome: " + p.getNome() + ", valor da bolsa: " + ((Bolseiro) p).calcularEncargos());
            }
        }
        
        System.out.println();
        
        float totalEncargos = 0;
        for(Pessoa p : arr) {
            if(p != null && p instanceof Encargos) {
                totalEncargos += ((Encargos) p).calcularEncargos();
            }
        }
        System.out.println("Total de encargos: " + totalEncargos);
    }
    
}
