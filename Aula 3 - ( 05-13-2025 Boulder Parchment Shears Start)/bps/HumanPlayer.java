/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bps;

import java.util.Scanner;

/**
 *
 * @author LUCCAPUNTELFAGUNDES
 */
public class HumanPlayer {

    private String playerName;

    public HumanPlayer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        this.playerName = scanner.nextLine();
    }

    public String getName() {
        return playerName;
    }

}
