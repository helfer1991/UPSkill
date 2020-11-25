/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.impostos;

import java.util.Comparator;

/**
 *
 * @author Asus
 */
public class Comparacao1 implements Comparator<Contribuinte> {
    @Override
    public int compare(Contribuinte c1, Contribuinte c2) {
        if(c1.getClass().getSimpleName().compareTo(c2.getClass().getSimpleName()) > 0) {
            return -1;
        }
        else if(c1.getClass().getSimpleName().compareTo(c2.getClass().getSimpleName()) < 0) {
            return 1;
        }
        return 0;
    }
}
