package curso.orientacaoAObjetos.polimorfismo;

public class Jantar {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa(99.65);

        Arroz arroz = new Arroz(0.2);
        Feijao feijao = new Feijao(0.1);

        System.out.println(pessoa.getPeso());

        pessoa.comer(arroz);
        pessoa.comer(feijao);

        System.out.println(pessoa.getPeso());

        Sorvete sorvete = new Sorvete(0.4);
        pessoa.comer(sorvete);

        System.out.println(pessoa.getPeso());
    }
}
