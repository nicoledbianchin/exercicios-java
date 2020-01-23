package classe;

public class Jantar {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Nicole";
        pessoa.peso = 60;

        System.out.println(pessoa.peso + "kg");

        Comida lasanha = new Comida();
        lasanha.pesoaComida = 0.3;

        double novoPeso = pessoa.comer(lasanha);
        System.out.println(novoPeso + "kg");

        Comida chocolate = new Comida();
        chocolate.pesoaComida = 0.2;

        double novoPesoDeNovo = pessoa.comer(chocolate);
        System.out.println(novoPesoDeNovo + "kg");
    }
}
