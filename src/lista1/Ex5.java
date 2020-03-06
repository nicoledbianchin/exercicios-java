package lista1;

import java.util.Scanner;

public class Ex5 {
//    5. Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
//    calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
//            (1SM=R$788,00)

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Salário mínimo: ");
        double salarioMinimo = entrada.nextDouble();

        System.out.println("Salário usuário: ");
        double salario = entrada.nextDouble();

        double resultado = salario / salarioMinimo;

        System.out.println(resultado);

        entrada.close();
    }
}
