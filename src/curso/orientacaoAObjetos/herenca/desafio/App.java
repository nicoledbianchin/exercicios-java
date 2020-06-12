package curso.orientacaoAObjetos.herenca.desafio;

public class App {
    public static void main(String[] args) {
        Civic civic = new Civic();
        Ferrari ferrari = new Ferrari();

        civic.velocidadeAtual = 10;
        ferrari.velocidadeAtual = 10;

        System.out.println("Civic: " + civic.velocidadeAtual);
        System.out.println("Ferrari: " + ferrari.velocidadeAtual);
        System.out.println(" ");

        civic.acelerar();
        ferrari.acelerar();

        System.out.println("Civic: " + civic.velocidadeAtual);
        System.out.println("Ferrari: " + ferrari.velocidadeAtual);
        System.out.println(" ");

        civic.frear();
        civic.frear();
        civic.frear();
        civic.frear();

        ferrari.frear();
        ferrari.frear();
        ferrari.frear();
        ferrari.frear();
        ferrari.frear();
        ferrari.frear();
        ferrari.frear();
        ferrari.frear();

        System.out.println("Civic: " + civic.velocidadeAtual);
        System.out.println("Ferrari: " + ferrari.velocidadeAtual);
        System.out.println(" ");

    }
}
