package classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto primeiroProduto = new Produto("Notebook", 4356.89);

        var segundoProduto = new Produto();
        segundoProduto.nome = "Caneta preta";
        segundoProduto.preco = 12.56;

        System.out.println(primeiroProduto.nome);
        System.out.println(segundoProduto.nome);

        primeiroProduto.nome = "Notebook Lenovo";
        segundoProduto.nome = "Caneta preta Bic";

        System.out.println("\nNovos Nomes");
        System.out.println(primeiroProduto.nome + " " + primeiroProduto.precoComDesconto());
        System.out.println(segundoProduto.nome + " " + segundoProduto.precoComDesconto());

        Produto.desconto = 0.50;

        System.out.println(primeiroProduto.nome + " " + primeiroProduto.precoComDesconto());
        System.out.println(segundoProduto.nome + " " + segundoProduto.precoComDesconto());

        double precoFinal1 = primeiroProduto.precoComDesconto();
        double precoFinal2 = segundoProduto.precoComDesconto(0.1);
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.println("\nMédia do carrinho: " + mediaCarrinho);
    }
}
