/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clankonoha;

/**
 *
 * @author LUCCAPUNTELFAGUNDES
 */
public abstract class Cla {
    String nomeCla;
    String lider;
    
    public abstract void habilidadeEspecial();
    
    public void exibirDetalhes(){
        System.out.println("O clã de" + nomeCla + "tem como seu lider" + lider);
    }
}
