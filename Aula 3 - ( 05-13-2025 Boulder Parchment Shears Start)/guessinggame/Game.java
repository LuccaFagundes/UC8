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
public class Game {

    private int numberToGuess; // Número aleatório

    private Player player;
    private GuessValidator guessValidator;
    private Scanner scanner;

    public Game() {
        this.numberToGuess = (int) (Math.random() * 100) + 1; // Gera número aleatório entre 1 e 100
        this.player = new Player();
        this.guessValidator = new GuessValidator();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        // Lógica do jogo será adicionada aqui
        System.out.println("Bem-vindo ao jogo de adivinhação, " + player.getName() + "!");
        boolean hasWon = false;
        
        
        while (!hasWon) {
            System.out.println("Escreve aí teu número favorito: ");
            int guess = scanner.nextInt();
            player.addTries();
            hasWon = guessValidator.validateGuess(guess, numberToGuess);
        }
        
        System.out.println("ALELUIA HEIN, " + player.getName() + "! DEMOROU " + player.getTries() + " TENTATIVAS, DEVIA TER SIDO DE PRIMEIRA");
    }
}
