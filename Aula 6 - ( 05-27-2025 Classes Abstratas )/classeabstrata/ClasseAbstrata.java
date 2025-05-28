/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classeabstrata;

/**
 *
 * @author LUCCAPUNTELFAGUNDES
 */
public class ClasseAbstrata {

    public static void main(String[] args) {
        Sofa sofa = new Sofa("Verde","Madeira");
        Cama cama = new Cama("AMARELA","OURO");
        
        sofa.montar();
        cama.montar();
        sofa.desmontar();
        cama.desmontar();
        
    }
}
