package curso.lambdas.interfacesFuncionais;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {

        Consumer<Produto> imprimirNome =
                produto -> System.out.println(produto.nome);

        Produto produto = new Produto("Caneta", 12.34, 0.09);
        Produto produto2 = new Produto("Notebook", 2987.99, 0.25);
        Produto produto3 = new Produto("Caderno", 19.9, 0.03);
        Produto produto4 = new Produto("Borracha", 7.8, 0.18);
        Produto produto5 = new Produto("Lapis", 4.39, 0.19);
        imprimirNome.accept(produto);

        List<Produto> produtos = Arrays.asList(produto, produto2, produto3, produto4, produto5);

        produtos.forEach(imprimirNome);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);
    }
}
