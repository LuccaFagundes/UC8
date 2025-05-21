/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.emailarray;

import java.util.ArrayList;

/**
 *
 * @author LUCCAPUNTELFAGUNDES
 */
// Criar um método que recebe um email e uma senha 
// Dentro deste método, adicione estas duas Strings dentro de um array
// No fim, o método deve retornar o array
public class EmailArray {

//    public static String[] info(Usuario usuario) {
//
//        return new String[]{usuario.getEmail(), usuario.getSenha()};
//    }
    public static void main(String[] args) {
        
        
//        String[] info = info(new Usuario("hhhhhh@hhhhhh", "senha123"));
//        System.out.println(info[0] + " " + info[1]);


        ArrayList<String> nomes = new ArrayList<>();
        // Adicionar elementos ao ArrayList
        nomes.add("Lucca");
        nomes.add("Cleiton");
        nomes.add("Leasdno");
        nomes.add(1, "Leandro");

        // Remover elementos do ArrayList
        // nomes.remove(0);
        System.out.println(nomes.get(3));
        System.out.println(nomes.indexOf("susano"));

        nomes.set(3, "Gabriel");

        System.out.println(nomes.size());
        System.out.println(nomes);

        nomes.clear();

        System.out.println(nomes);
        System.out.println(nomes.isEmpty());

    }

}
