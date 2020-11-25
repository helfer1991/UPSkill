/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myarray;

/**
 *
 * @author Asus
 */
public class MyArray {
    private int[] myArray;
    
    public MyArray(int[] array) {
        this.myArray = array;
    }
    
    public int getSize() {
        return myArray.length;
    }
    
    public int getMax() {
        int max = myArray[0];
        for(int i = 1; i < getSize(); i++) {
            if(max < myArray[i]) {
                max = myArray[i];
            }
        }
        return max;
    }
    
    public int getNonNull() {
        int count = 0;
        for(int i = 0; i < getSize(); i++) {
            if(myArray[i] == 0) {
                count++;
            }
        }
        return count;
    }
    
    public double getAverage() {
        int average = 0;
        for(int i = 0; i < getSize(); i++) {
            average += myArray[i];
        }
        return (double) average / getSize();
    }
    
    public double getAvgMultiple(int multiple) {
        int average = 0, count = 0;
        for(int i = 0; i < getSize(); i++) {
            if(myArray[i] % multiple == 0) {                
                average += myArray[i];
                count++;
            }
        }
        return (double) average / count;
    }
    
    public boolean checkVazio() {
        return myArray.length == 0;
    }
    
    public boolean checkPares() {
        int count = 0;
        for(int i = 0; i < getSize(); i++) {
            if(myArray[i] % 2 == 0) {
                count++;
            }
        }
        return count == getSize();
    }
    
    public int[] getElementosComPares() {
        int[] arr = new int[getSize()];
        int j = 0;
        for(int i = 0; i < getSize(); i++) {
            int dig = 0, temp = myArray[i];
            int count = 0, count2 = 0;
            while(temp != 0) {
                dig = temp % 10;
                if(dig % 2 == 0) {
                    count++;
                }
                count2++;
                temp /= 10;
            }
            if(count == count2) {
                arr[j] = myArray[i];
                j++;
            }
        }
        return arrCopy(arr, j);
    }
    
    public int[] getElementosMesmoAlgarismo() {
        int[] arr = new int[getSize()];
        int j = 0;
        for(int i = 0; i < getSize(); i++) {
            int dig = 0, dig2 = 0, temp = myArray[i];
            int count = 0, count2 = 0;
            while(temp != 0) { //imaginar temp = 333
                dig = temp % 10; //primeira iteração dig = 3
                dig2 = (temp / 10) % 10; //2ª iteração dig2 = 3
                if(dig == dig2) {
                    count++;
                }
                count2++;
                temp /= 10;
            }
            if(count == count2 - 1) {
                arr[j] = myArray[i];
                j++;
            }
        }
        return arrCopy(arr, j);
    }
    
    public int[] getElementoCrescente() {
        int[] arr = new int[getSize()];
        int j = 0;
        for(int i = 0; i < getSize(); i++) {
            int dig = 0, dig2 = 0;
            int temp = myArray[i];
            int count = 0, count2 = 0;
            while(temp != 0) {
                dig = temp % 10;                
                dig2 = (temp / 10) % 10;
                if(dig > dig2) {
                    count++;
                }
                count2++;
                temp /= 10;
            }
            if(count == count2) {
                arr[j] = myArray[i];
                j++;
            }
        }
        return arrCopy(arr, j);
    }
    
    private int[] arrCopy(int[] arr, int j) {
        int[] arr2 = new int[j];
        for(int i = 0; i < j; i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }
    
    public boolean checkEqualOutroArray(int[] arr) {
        return myArray == arr;
    }
    
    public int[] getReverse(int[] arr) {
        int j = arr.length - 1;
        int[] arrReversed = new int[arr.length];
        for(int i = 0; i < arr.length; i++, j--) {
            arrReversed[i] = arr[j];
        }
        return arrReversed;
    }
}
