package orientacaoAObjetos.composicao.desafio;

import java.util.ArrayList;

public class Compra {
    ArrayList<Item> itens = new ArrayList<>();
    double valorCompra;

    Compra (ArrayList<Item> itens) {
        this.itens = itens;
    }

    double calcularValorCompra(){
        for(Item item : itens){
            valorCompra = valorCompra + (item.quantidade * item.produto.preco);
        }
        return valorCompra;
    }
}
