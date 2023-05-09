/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio1;

/**
 *
 * @author marya
 */
public class Exercicio1 {

    public static void main(String[] args) {
//parte 1 ponto
        System.out.println("****PLANO CARTESIANO****");
       
        Ponto ponto1 = new Ponto(); // Cria um ponto com x = 0 e y = 0
        Ponto ponto2 = new Ponto(2, 3); // Cria um ponto com x = 2 e y = 3
    
        // Exibe os valores iniciais dos pontos
        System.out.println("Ponto 1: x = " + ponto1.getX() + ", y = " + ponto1.getY());
        System.out.println("Ponto 2: x = " + ponto2.getX() + ", y = " + ponto2.getY());
    
        // Modifica os valores dos pontos usando os métodos set
        ponto1.setX(1);
        ponto1.setY(2);
        ponto2.setX(4);
        ponto2.setY(5);
    
        // Exibe os novos valores dos pontos
        System.out.println("Ponto 1 modificado: x = " + ponto1.getX() + ", y = " + ponto1.getY());
        System.out.println("Ponto 2 modificado: x = " + ponto2.getX() + ", y = " + ponto2.getY());
        
//parte 2 robo
        System.out.println("****ROBO****");

        Ponto posicaoInicial = new Ponto(1, 1);
        Robo meuRobo = new Robo("Meu Robo", posicaoInicial);

        System.out.println("Posicao inicial do robo: (" + meuRobo.informarPosicao().getX() + ", " + meuRobo.informarPosicao().getY() + ")");

        meuRobo.andarCima();
        meuRobo.andarCima();
        meuRobo.andarDireita();

        System.out.println("Nova posicao do robo: (" + meuRobo.informarPosicao().getX() + ", " + meuRobo.informarPosicao().getY() + ")");

        Ponto novaPosicao = new Ponto(3, 5);
        meuRobo.teleportar(novaPosicao);

        System.out.println("Posicao atual do robo: (" + meuRobo.informarPosicao().getX() + ", " + meuRobo.informarPosicao().getY() + ")");

//parte 3 colidiu
        System.out.println("****COLIDIU?****");

        Ponto outraPosicao = new Ponto(2, 3);
        Robo outroRobo = new Robo("Outro Robo", outraPosicao);

        if (meuRobo.colidiu(outroRobo)) {
            System.out.println("Os robôs colidiram!");
        } else {
            System.out.println("Os robôs não colidiram.");
        }
        // Mostra a posição dos dois robôs
        System.out.println("Posição do Meu Robo: (" + meuRobo.informarPosicao().getX() + ", " + meuRobo.informarPosicao().getY() + ")");
        System.out.println("Posição do Outro Robo: (" + outroRobo.informarPosicao().getX() + ", " + outroRobo.informarPosicao().getY() + ")");

    }
}
