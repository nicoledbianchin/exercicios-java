package estruturasDeControle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe sua nota:");
        double nota = entrada.nextDouble();

        if (nota >= 7 && nota <= 10) {
            System.out.println("Você está aprovado!");
            System.out.println("Parabéns!");
        }
        if (nota < 7 && nota >= 4.5) {
            System.out.println("Você está de recuperação.");
        }
        boolean criterioReprovacao = nota < 4.5 && nota >= 0;
        if (criterioReprovacao) {
            System.out.println("Você está de recuperação.");
        }

        entrada.close();
    }
}