/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeiroprojeto;

/**
 *
 * @author LUCCAPUNTELFAGUNDES
 */
public class PrimeiroProjeto {

    public static void main(String[] args) {
        
        //Frase minhaFrase = new Frase();;;
        //minhaFrase.mensagem();
        
        Tipos tipo = new Tipos();
        tipo.verificaIdade(2103);
        
        Tipos nacionalidade = new Tipos();
        tipo.nacionalidade("virdsdasdasdas");
        
        int numero = 4;
        String resultado = (numero % 2 == 0) ? "Par" : "ímpar";
        System.out.println(resultado);;
    }
}
