/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guessinggame;

import java.util.Scanner;

/**
 *
 * @author LUCCAPUNTELFAGUNDES
 */
public class Player {
    private String name;
    private int tries = 0;
    
    /*
    Criar um atributo jogadas para o player
    Criar um método que incrementa as jogadas e outro que mostra o número de jogadas 
    mudar a lógica do jogo para, no final, mostrar quantas jogadas o player precisou fazer até acertar
    */
    
    
    
    public Player() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        this.name = scanner.nextLine();
    }
    
    public String getName(){
        return name;
    }
    
    public void addTries(){
        tries ++;
    }
    
    public int getTries(){
        return tries;
    }
    
    
}
