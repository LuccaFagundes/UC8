/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bps;

/**
 *
 * @author LUCCAPUNTELFAGUNDES
 */
public class BotPlayer {

    private String name = "Deep Red";
    private String robotsChoice;
    private int rpsIndex;

    public BotPlayer() {
        this.rpsIndex = (int) (Math.random() * 3) + 1;

        switch (rpsIndex) {
            case 1:
                this.robotsChoice = "Boulder";
                break;
            case 2:
                this.robotsChoice = "Parchment";
                break;
            case 3:
                this.robotsChoice = "Shears";
        }
    }

}
