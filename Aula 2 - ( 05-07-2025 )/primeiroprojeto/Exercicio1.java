/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiroprojeto;

import java.util.Scanner;
import javax.xml.transform.Source;

/**
 *
 * @author LUCCAPUNTELFAGUNDES
 */

  // Criem um método que verifica se um número digitado pelo usuário é par ou não é
public class Exercicio1 {
    
   public static void parOuNao(){
          
    Scanner sc = new Scanner(System.in);
    
    int numeroPar;
    
       System.out.println("Digite o número que você queira saber se é par: ");
       numeroPar = sc.nextInt();
       
       if(numeroPar % 2 == 0){
           System.out.println("Este número é par.");
       } else{
           System.out.println("Este número não é par.");
       }
       
       sc.close();
   }
    
    
}
