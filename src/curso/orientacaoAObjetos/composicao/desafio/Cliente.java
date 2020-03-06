package curso.orientacaoAObjetos.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
    String nome;
    ArrayList<Compra> compras = new ArrayList<>();
    double valorTotal;

    Cliente (String nome, ArrayList<Compra> compras){
        this.nome = nome;
        this.compras = compras;
    }

    double obterValorTotal (){
        for (Compra compra : compras){
            valorTotal = valorTotal + compra.calcularValorCompra();
        }
        return valorTotal;
    }
}