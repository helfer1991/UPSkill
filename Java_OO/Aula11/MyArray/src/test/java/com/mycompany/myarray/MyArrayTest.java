/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myarray;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Asus
 */
public class MyArrayTest {
    
    public MyArrayTest() {
        
    }
    
    public void setUp() {    
    }
    
    public void testGetSize() {
        //Arrange
        MyArray array = new MyArray(new int[] {1,2,3,4,5});
        int expResult = 5;
        
        //Act
        int result = array.getSize();
        
        //Assert
        assertEquals(expResult, result);
    }
    
    public void testGetMax() {
        MyArray array = new MyArray(new int[] {1,2,3,7,4,5});
        int expResult = 7;
        int result = array.getMax();
        assertEquals(expResult, result);
    }
    
    public void testGetNonNull() {
        MyArray array = new MyArray(new int[] {1,2,3,7,4,5});
        int expResult = 0;
        int result = array.getNonNull();
        assertEquals(expResult, result);
    }
    
    public void testGetAverage() {
        MyArray array = new MyArray(new int[] {1,2,3,4,5});
        double expResult = 3.0;
        double result = array.getAverage();
        assertEquals(expResult, result);
    }
    
    public void testGetAvgMultiple() {
        MyArray array = new MyArray(new int[] {1,2,3,4,5});
        double expResult = 3.0;
        double result = array.getAvgMultiple(2);
        assertEquals(expResult, result);
    }
    
    public void testCheckVazio() {
        MyArray array = new MyArray(new int[] {1,2,3,4,5});
        boolean expResult = false;
        boolean result = array.checkVazio();
        assertEquals(expResult, result);
    }
    
    public void testCheckPares() {
        MyArray array = new MyArray(new int[] {1,2,3,4,5});
        boolean expResult = false;
        boolean result = array.checkPares();
        assertEquals(expResult, result);
    }
    
    public void testGetElementosComPares() {
        MyArray array = new MyArray(new int[] {12,24,32,99,45,52,46});
        int[] expResult = {24,46};
        int[] result = array.getElementosComPares();
        assertArrayEquals(expResult, result);
    }
    
    public void testGetElementosMesmoAlgarismo() {
        MyArray array = new MyArray(new int[] {1244,2244,33333,45,52,2222});
        int[] expResult = {33333, 2222};
        int[] result = array.getElementosMesmoAlgarismo();
        assertArrayEquals(expResult, result);
    }
    
    public void testGetElementoCrescente() {
        MyArray array = new MyArray(new int[] {10,24,33,65,52,34,78});
        int[] expResult = {24,34,78};
        int[] result = array.getElementoCrescente();
        assertArrayEquals(expResult, result);
    }
    
    public void testCheckEqualOutroArray() {
        MyArray array = new MyArray(new int[] {1,2,3,4,5});
        boolean expResult = false;
        boolean result = array.checkEqualOutroArray(new int[] {5,4,3,2,1});
        assertEquals(expResult, result);
    }
    
    public void testGetReverse() {
        MyArray array = new MyArray(new int[] {1,2,3,4,5});
        int[] expResult = {7,2,3,5,4};
        int[] result = array.getReverse(new int[] {4,5,3,2,7});
        assertArrayEquals(expResult, result);
    }
}
