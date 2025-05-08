/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiroprojeto;

/**
 *
 * @author LUCCAPUNTELFAGUNDES 😊👉👈
 */
public class Tipos {

    String meuNome = "LUCCA";
    char minhaInicial = 'L';
    int minhaIdade = 21;
    double minhaAltura = 1.67;
    boolean lendarioCapturado = true;

    public void verificaIdade(int idade) {
        if (idade >= 18) {
            System.out.println("Você é maior de idade, pois tem " + idade + " anos.");
        } else {
            System.out.println("Você é menor de idade, pois tem apenas " + idade + " anos.");
        }
    }

/* Primeiro, dizemos se o método é public, private ou protected
 * Depois, 
 * 
 */
    public int calculaSoma(int num1, int num2) {
        return num1 + num2;
    }
    
    public void nacionalidade(String pais){
       switch(pais){
           case "Brasil":
               System.out.println("Vocé fala espanhol");
               break;
           case "Argentina":
               System.out.println("Você perdeu cinco mil pesos.");
               break;
           default:
               System.out.println("Nem existe");
           
       }
       
    }

}


