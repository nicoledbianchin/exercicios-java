package curso.orientacaoAObjetos.herenca.desafio.app;

import curso.orientacaoAObjetos.herenca.desafio.Carro;
import curso.orientacaoAObjetos.herenca.desafio.Civic;
import curso.orientacaoAObjetos.herenca.desafio.Ferrari;

public class App {
    public static void main(String[] args) {
        Civic civic = new Civic();
        Ferrari ferrari = new Ferrari();
        Carro carro = new Carro(100);

        ferrari.nivelDoAr();

        ferrari.ligarTurbo();

        civic.setVelocidadeAtual(10);
        ferrari.setVelocidadeAtual(10);

        System.out.println("Civic: " + civic.getVelocidadeAtual());
        System.out.println("Ferrari: " + ferrari.getVelocidadeAtual());
        System.out.println(" ");

        civic.acelerar();
        ferrari.acelerar();

        System.out.println("Civic: " + civic.getVelocidadeAtual());
        System.out.println("Ferrari: " + ferrari.getVelocidadeAtual());
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

        System.out.println("Civic: " + civic.getVelocidadeAtual());
        System.out.println("Ferrari: " + ferrari.getVelocidadeAtual());
        System.out.println(" ");

    }
}
