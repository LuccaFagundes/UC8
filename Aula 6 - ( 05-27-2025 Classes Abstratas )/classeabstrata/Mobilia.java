/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classeabstrata;

/**
 *
 * @author LUCCAPUNTELFAGUNDES
 */
public abstract class Mobilia {

    protected String cor;
    protected String material;

    public Mobilia(String cor, String material) {
        this.cor = cor;
        this.material = material;
    }

    public abstract void montar();

    public void desmontar() {
        System.out.println("A mobília foi desmontada.");
    }
}
