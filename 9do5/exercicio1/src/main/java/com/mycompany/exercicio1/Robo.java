/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio1;


public class Robo {
    
    private String nome;
    private Ponto posicao;
    
    public Robo(String nome, Ponto posicao) {
        this.nome = nome;
        this.posicao = posicao;
    }
    
    public Robo() {
        this.nome = "Robo";
        this.posicao = new Ponto();
    }
    
    public void andarDireita() {
        double x = this.posicao.getX();
        x++;
        this.posicao.setX(x);
    }
    
    public void andarEsquerda() {
        double x = this.posicao.getX();
        x--;
        this.posicao.setX(x);
    }
    
    public void andarBaixo() {
        double y = this.posicao.getY();
        y--;
        this.posicao.setY(y);
    }
    
    public void andarCima() {
        double y = this.posicao.getY();
        y++;
        this.posicao.setY(y);
    }
    
    public void teleportar(Ponto destino) {
        this.posicao = destino;
    }
    
    public Ponto informarPosicao() {
        return this.posicao;
    }
    
    //metodo colidiu
    public boolean colidiu(Robo outroRobo) {
    Ponto posicaoOutroRobo = outroRobo.informarPosicao();
    return posicaoOutroRobo.getX() == posicao.getX() && posicaoOutroRobo.getY() == posicao.getY();
    }
}
