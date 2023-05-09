/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio1;


public class Ponto {
    //campos devem ser privados
    private double x;
    private double y;
    //construtor vazio
    public Ponto() {
        this.x = 0;
        this.y = 0;
    }
    //construtor parametrizado
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //métodos get()e set() para cada um
    public double getX() {
        return x;
    }
    
    public void setX(double x) {
        this.x = x;
    }
    
    public double getY() {
        return y;
    }
    
    public void setY(double y) {
        this.y = y;
    }
    
}
