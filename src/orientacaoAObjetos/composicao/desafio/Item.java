package orientacaoAObjetos.composicao.desafio;

public class Item {
    Compra compra;
    Produto produto;
    int quantidade;

    Item (Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }
}
