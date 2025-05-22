/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemacompras;

/**
 *
 * @author LUCCAPUNTELFAGUNDES
 */


/*
Usando Java e Scanner, elabore um sistema simples de compras (com pelo menos 5 classes de tipos de produtos diferentes). Para fazer as compras,
deve haver um menu com switch, onde você deve poder adicionar e remover itens do carrinho, ver os itens do carrinho e fazer o pagamento.
*/
public class SistemaCompras {

    public static void main(String[] args) {
      Shopping shopping = new Shopping();
      shopping.menu();
    }
}
