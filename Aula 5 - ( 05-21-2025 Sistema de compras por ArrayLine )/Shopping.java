/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacompras;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LUCCAPUNTELFAGUNDES
 */
public class Shopping {

    ArrayList<Produto> carrinho;
    Scanner sc;

    public Shopping() {
        carrinho = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public void menu() {
        System.out.println("Nos mande dinheiro no pix \n");
        System.out.println("1 - Adicionar produto \n"
                + "2 - Adicionar produto"
                + "3 - Remover produto \n"
                + "4 - Ver carrinho \n"
                + "5 - Finalizar compra \n"
                + "6 - Apostar no tigrinho \n"
                + "7 - Sair \n"
                + "Digite a opção desejada: ");

        int opcao = sc.nextInt();

        switch (opcao) {
            case 2:
                System.out.println("Escolha um produto para adicionar: \n"
                        + "1 - TEVESILÃO \n"
                        + "2 - T_SHURT \n"
                        + "3 - AS BATATA FRANCESA \n"
                        + "4 - ALMA");
                int opcaoAdd = sc.nextInt();
                Produto produto;

                switch (opcaoAdd) {
                    case 1:
                        produto = new Eletronico("Tevelisão", 7);
                        break;
                    case 2:
                        produto = new Vestuario("T_SHURT", 4);
                        break;
                    case 3:
                        produto = new Alimento("AS BATATA FRANCESA", 2000);
                        break;
                    case 4:
                        for (int i = 0; i < 50; i++) {
                            System.out.println("THERE IS NO REDEMPTION FOR YOU.");
                        }
                        break;

                }
                break;
            case 3:
                if (!carrinho.isEmpty()) {
                    System.out.println("Escolha o produto para remover: ");
                    exibir();

                    int opcaoDel = sc.nextInt() - 1;

                    if (opcaoDel <= 0 || opcaoDel > carrinho.size()) {
                        System.out.println("<=||---------------------------------||=> \n");
                        System.out.println("Opcão inválida");
                        System.out.println("<=||---------------------------------||=> \n");
                    } else {
                        carrinho.remove(opcaoDel);
                        System.out.println("Opção removida");
                    }

                }
                System.out.println("Produto removido");
                break;
            case 4:
                if (!carrinho.isEmpty()) {
                    System.out.println("<=||---------------------------------||=> \n");
                    System.out.println("NOTHING HERE.");
                    System.out.println("<=||---------------------------------||=> \n");
                }
                System.out.println("<=||---------------------------------||=> \n");
                System.out.println("Seu carrinho tem estes itens: \n");
                exibir();
                System.out.println("<=||---------------------------------||=> \n");

                break;
            case 5:
                if (!carrinho.isEmpty()) {
                    double valorTotal = 0;

                    for (Produto item : carrinho) {
                        valorTotal += item.getPreco();
                    }
                    System.out.println("Valor total: R$" + valorTotal);
                    System.out.println("Compra finalizada.");
                }

                break;
            case 6:
                System.out.println("Quanto você gostaria de apostar?");

                break;
            case 7:
                System.out.println("NO.");

                return;
            default:
                System.out.println("WRONG ANSWER.");

        }

    }

    public void exibir() {
        for (int exibirIndex = 0; exibirIndex < carrinho.size(); exibirIndex++) {
            System.out.println(exibirIndex + 1 + " - " + carrinho.get(exibirIndex).getNome() + " - " + carrinho.get(exibirIndex).getPreco() + "\n");
        }
    }
}
