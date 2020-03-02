package orientacaoAObjetos.composicao.desafio;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Produto produto1 = new Produto("caneta", 2.00);
        Produto produto2 = new Produto("caderno", 22.00);
        Produto produto3 = new Produto("xicara", 6.00);
        Produto produto4 = new Produto("estojo", 12.00);

        Item item1 = new Item(produto1, 4);
        Item item2 = new Item(produto2, 6);
        Item item3 = new Item(produto3, 2);
        Item item4 = new Item(produto4, 1);

        ArrayList<Item> itens1 = new ArrayList<>();
        itens1.add(item1);
        itens1.add(item2);
        itens1.add(item3);

        ArrayList<Item> itens2 = new ArrayList<>();
        itens1.add(item3);
        itens1.add(item4);
        itens1.add(item1);

        Compra compra1 = new Compra(itens1);
        Compra compra2 = new Compra(itens2);
        ArrayList<Compra> compras = new ArrayList<>();
        compras.add(compra1);
        compras.add(compra2);

        Cliente cliente = new Cliente("Trixie", compras);

        double valorTotal = cliente.obterValorTotal();

        System.out.println("Valor total da compra: " + valorTotal + ".");
    }
}
