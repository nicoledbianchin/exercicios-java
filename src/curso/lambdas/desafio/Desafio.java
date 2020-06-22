package curso.lambdas.desafio;

import curso.lambdas.interfacesFuncionais.Produto;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {

        /*
        1. A partir do produto calcular o preco real (com desconto)
        2. Imposto municipal: >= 2500 (8.5%) / < 2500 (Isento)
        3. Frete: >= 3000 (100) / < 3000 (50)
        4. Arredondar: Deixar duas casas decimais
        5. Formatar: R$1234,56
         */

        Produto produto = new Produto("iPad", 3235.89, 0.13);

        Function<Produto, Double> precoReal =
                prod -> (prod.getPreco() * (1 - prod.getDesconto()));

        UnaryOperator<Double> imposto = preco -> {
            double valor = preco >= 2500 ? 0.085 : 0;
            return (preco + (preco * valor));
        };

        UnaryOperator<Double> frete = preco -> {
            double valor = preco >= 3000 ? 100.0 : 50.0;
            return  preco + valor;
        };

        UnaryOperator<Double> arredondar = preco -> {
            return Double.parseDouble(String.format("%.2f", preco));
        };

        Function<Double, String> formatar =
                preco -> "R$" + preco.toString().replace(".", ",");

        String precoFinal = precoReal
                .andThen(imposto)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(produto);

        System.out.println(precoFinal);

    }
}
