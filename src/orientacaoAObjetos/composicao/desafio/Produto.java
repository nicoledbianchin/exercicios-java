package orientacaoAObjetos.composicao.desafio;

import java.util.ArrayList;

public class Produto {
    String nome;
    double preco;
    ArrayList<Item> itens = new ArrayList<>();

    Produto (String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}