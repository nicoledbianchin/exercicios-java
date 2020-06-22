package curso.lambdas.interfacesFuncionais;

public class Produto {

    final String nome;
    final double preco;
    final double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public String toString() {
        return nome + " tem preço de " + (preco * (1 - desconto)) + "R$";
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public double getDesconto() {
        return desconto;
    }
}
