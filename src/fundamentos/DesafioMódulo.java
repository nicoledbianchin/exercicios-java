package fundamentos;

import java.util.Scanner;

public class DesafioMódulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        double primeiroNumero = entrada.nextDouble();

        System.out.println("Informe o segundo número:");
        double segundoNumero = entrada.nextDouble();

        System.out.println("Informe a operação desejada:");
        String operacao = entrada.next();

        double resto = operacao.equals("%")? primeiroNumero % segundoNumero : 0;
        double divisao = operacao.equals("/")? primeiroNumero / segundoNumero : resto;
        double multiplicacao = operacao.equals("*")? primeiroNumero * segundoNumero : divisao;
        double subtracao = operacao.equals("-")? primeiroNumero - segundoNumero : multiplicacao;
        double soma = operacao.equals("+")? primeiroNumero + segundoNumero : subtracao;

        System.out.println("Resultado: " + soma);

        entrada.close();
    }
}
