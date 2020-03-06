package lista1;

import java.util.Scanner;

public class Ex1 {
//    1- Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
//    mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade = 0;
        System.out.println("Informe sua idade, começando pelo ano: ");
        idade = idade + (entrada.nextInt() * 365);

        System.out.println("Agora o mês: ");
        idade = idade + (entrada.nextInt() * 30);

        System.out.println("E por fim os dias: ");
        idade = idade + entrada.nextInt();

        System.out.println("Sua idade em dias é: " + idade);

        entrada.close();
    }
}
