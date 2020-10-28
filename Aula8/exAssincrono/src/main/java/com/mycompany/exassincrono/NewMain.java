/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exassincrono;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class NewMain {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static final String FILE = "file.txt";
    public static final String SEPARATOR = ":";
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException {
        String[] func = new String[12];
        int[] venc = new int[12];
        //int nElem = loadFile(func, venc, FILE, SEPARATOR);
        int size = checkSize(func);
        Menu(func, venc, FILE, SEPARATOR, size);
    }
    
    public static void Menu(String[] func, int[] venc, String file, String separator, int size) throws FileNotFoundException {
        String newFunc, name;
        int newVenc, vencAlterado;
        
        System.out.println("|--------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|1 - Ler a informação do ficheiro e armazená-la em memória                                                                                         |");
        System.out.println("|2 - Inserir manualmente informação de um funcionário. Não pode ser repetida                                                                       |");
        System.out.println("|3 - Listar todos os funcionários                                                                                                                  |");
        System.out.println("|4 - Atualizar vencimento de um funcionário                                                                                                        |");
        System.out.println("|5 - Eliminar um funcionário                                                                                                                       |");
        System.out.println("|6 - Mostrar informação ordenada por nome de funcionário                                                                                           |");
        System.out.println("|7 - Gravar dados no ficheiro inicial                                                                                                              |");
        System.out.println("|--------------------------------------------------------------------------------------------------------------------------------------------------|");
        
        int option = ler.nextInt();
        ler.nextLine();
        
        switch(option) {
            case 0:
                break;
            case 1:                
                loadFile(func, venc, file, separator);
                suspendMenu();
                Menu(func, venc, file, separator, size);
//                Menu(func, venc, file, separator, nElem, size);
                break;
            case 2:
                System.out.println("Indica o nome do funcionário a adicionar");
                newFunc = ler.nextLine();
                System.out.println("Indica o seu vencimento");
                newVenc = ler.nextInt();
                addFunc(func, venc, newFunc, newVenc, checkSize(func));
                suspendMenu();
                Menu(func, venc, file, separator, size);
                break;
            case 3:                
                printList(func, venc, checkSize(func));
                suspendMenu();
                Menu(func, venc, file, separator, size);
                break;
            case 4:
                System.out.println("Indica o funcionário cujo salário queres atualizar");
                name = ler.nextLine();
                System.out.println("Indica o novo salário");
                vencAlterado = ler.nextInt();
                changeVenc(func, venc, name, vencAlterado, checkSize(func));
                suspendMenu();
                Menu(func, venc, file, separator, size);
                break;
            case 5:
                System.out.println("Indica o funcionário que queres retirar");
                name = ler.nextLine();
                removeFunc(func, venc, name, size);
                suspendMenu();
                Menu(func, venc, file, separator, size);
                break;
            case 6:
                System.out.println("Informação ordenada alfabeticamente");
                sortByName(func, venc, checkSize(func));
                suspendMenu();
                Menu(func, venc, file, separator, size);
                break;
            case 7:
                printFile(func, venc, checkSize(func));
                suspendMenu();
                Menu(func, venc, file, separator, size);
                break;
        }
    }
    
    public static void suspendMenu() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Carrega numa tecla para continuar");
        ler.nextLine();
    }
    
    public static int loadFile(String[] func, int[] venc, String FILE, String SEPARATOR) throws FileNotFoundException {
        Scanner ler = new Scanner(new File(FILE));
        int i = 0;
        while(ler.hasNextLine()) {
            String[] data = ler.nextLine().split(SEPARATOR);
            func[i] = data[0];
            venc[i] = Integer.parseInt(data[1]);
            i++;
        }
        ler.close();        
        System.out.println("Ficheiro carregado");
        
        return i;
    }
    
    public static void addFunc(String[] func, int[] venc, String newFunc, int newVenc, int nElem) {
        if(nElem != func.length) {
            if(!check(func, newFunc, nElem)) {
                func[nElem] = newFunc.substring(0,1).toUpperCase() + newFunc.substring(1);
                venc[nElem] = newVenc;
            } else {
                System.out.println("O funcionário já está registado");
            }
        } else {
            System.out.println("Não é possível adicionar mais funcionários");
        }
        nElem++;
        System.out.println("Funcionário introduzido");
    }
    
    public static boolean check(String[] func, String newFunc, int nElem) {
        boolean check = false;
        for(int i = 0; i < nElem; i++) {
            if(func[i].equalsIgnoreCase(newFunc)) {
                check = true;
            }
        }
        return check;
    }
    
    public static int checkSize(String[] func) {
       int i = 0;
       while(func[i] != null) {
           i++;
       }
       return i;
    }
    
    public static void changeVenc(String[] func, int[] venc, String name, int vencAlterado, int size) {
        int index= checkFunc(func, name, size);
        if(index != -1) {
            venc[index] = vencAlterado;
        } else {
            System.out.println("O funcionário não existe");
        }
    }
    
        
    public static void removeFunc(String[] func, int[] venc, String name, int size) { 
        // remove, mas o último repete
        int index = checkFunc(func, name, size);
        if(index != -1) {
            if(index == func.length - 1) {
                func[index] = null;
                venc[index] = 0;
            } else {
                for(int i = index; i < size; i++) {
                    func[i] = func[i+1];
                    venc[i] = venc[i+1];
                }
            }
        } else {
            System.out.println("O funcionário não existe");
        }
    }
    
    public static int checkFunc(String[] func, String name, int size) {
        int i = 0, index = -1;
        
        while(i != size) {
            if(func[i].equalsIgnoreCase(name)) {
                index = i;
            }
            i++;
        }
        return index;
    }
    
    public static void sortByName(String[] func, int[] venc, int size) { //se quiser alterar o array inicial
        String tempFunc;
        int tempVenc;

        for(int i = 0; i < size; i++) {
            for(int j = i + 1; j < size; j++) {
                if(func[i].compareTo(func[j]) > 0) {
                    tempFunc = func[i];
                    tempVenc = venc[i];
                    func[i] = func[j];
                    venc[i] = venc[j];
                    func[j] = tempFunc;
                    venc[j] = tempVenc;
                }
            }
        }
        printList(func, venc, size);
    }
    
//    public static void sortByName(String[] func, int[] venc, int size) { //se não quiser alterar o array inicial
//        String[] newFunc = func.clone();
//        int[] newVenc = venc.clone();
//        String tempFunc;
//        int tempVenc;
//
//        for(int i = 0; i < size; i++) {
//            for(int j = i + 1; j < size; j++) {
//                if(newFunc[i].compareTo(newFunc[j]) > 0) {
//                    tempFunc = newFunc[i];
//                    tempVenc = newVenc[i];
//                    newFunc[i] = newFunc[j];
//                    newVenc[i] = newVenc[j];
//                    newFunc[j] = tempFunc;
//                    newVenc[j] = tempVenc;
//                }
//            }
//        }
//        printList(newFunc, newVenc, size);
//    }
    
    public static void printFile(String[] func, int[] venc, int size) throws FileNotFoundException {
        Formatter out = new Formatter(new File(FILE));
        
        for(int i = 0; i < size; i++) {
            out.format("%s:%d", func[i], venc[i]);
        }
        out.close();
        System.out.println("Ficheiro \"file.txt\" atualiado");
    }
    
    public static void printList(String[] func, int[] venc, int nElem) {       
        for(int i = 0; i < nElem; i++) {
            System.out.println(func[i] + "  " + venc[i]);
        }
    }
}
