/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exnumimag;

/**
 *
 * @author Asus
 */
public class Imaginario {
    private int x;
    private int y;
    
    private static final int X_OMISSO = 1;
    private static final int Y_OMISSO = 1;
    
    public Imaginario(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
    
    public boolean checkReal() {
        return this.y == 0;
    }
    
    public boolean checkImaginario() {
        return this.x == 0;
    }
    
    public boolean checkNumerosIguais(int x, int y) {
        return this.x == x && this.y == y;
    }
    
    public boolean checkNumerosIguais(Imaginario obj) {
        return this.x == obj.getX() && this.y == obj.getY();
    }
    
    public String argComplexo() { // verificar para 2º e 3º quadrantes
        double tan = (double) this.y/this.x;
        double degrees = Math.toDegrees(Math.atan(tan));
        double radians = Math.toRadians(degrees);
        if(this.x < 0) {
            degrees += 180;
        }
        return radians + " radians" + " or " + degrees + " degrees";
    }
    
    public double moduloComplexo() {
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }
    
    public String conjugado() { //não posso fazer this.x + conjugado() + "i", porque vai somar o x com o y
        return conjugadoReal() + " + " + conjugadoImaginario() + "i";
    }
    
    private int conjugadoReal() {
        return this.x;
    }
    
    public int conjugadoImaginarioOutro(int b) {
        return b*(-1);
    }
    
    private int conjugadoImaginario() {
        return this.y*(-1);
    }
    
    public String addComplexo(Imaginario i) {
        int newX = this.x + i.getX();
        int newY = this.y + i.getY();
        
        return newX + " + " + newY + "i";
    }
    
    public String addComplexo(int a, int b) {
        int newX = this.x + a;
        int newY = this.y + b;
        
        return newX + " + " + newY + "i";
    }
    
    public String subtractComplexo(Imaginario i) {
        int newX = this.x - i.getX();
        int newY = this.y - i.getY();
        
        return newX + " + " + newY + "i";
    }
    
    public String subtractComplexo(int a, int b) {
        int newX = this.x - a;
        int newY = this.y - b;
        
        return newX + " + " + newY + "i";
    }
    
    public String multiplyComplexo(int a, int b) {        
        return multiplyReal(a,b) + " + " + multiplyImaginary(a,b) + "i";
    }
    
    private int multiplyReal(int a, int b) {
        return (this.x * a - this.y * b);
    }
    
    private int multiplyImaginary(int a, int b) {
        return (this.x * b + this.y * a);
    }
    
    public String divideComplexo(int a, int b) {        
        return "(" + divideReal(a,b) + " + " + divideImaginary(a,b) + "i)" + "/" + denominator(a,b);
    }
    
    private int divideReal(int a, int b) {
        return multiplyReal(a, conjugadoImaginarioOutro(b));
    }
    
    private int divideImaginary(int a, int b) {
        return multiplyImaginary(a,conjugadoImaginarioOutro(b));
    }
    
    private int denominator(int a, int b) {
        return (int) (Math.pow(a,2) - Math.pow(b,2) * -1);
    }
    
    @Override
    public String toString() {
        return String.format("%d + %di", this.x, this.y);
    }
}