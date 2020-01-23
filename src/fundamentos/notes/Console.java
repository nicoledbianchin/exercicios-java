package fundamentos.notes;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Rupaul's Drag Race:");
        System.out.print(" All Stars.\n\n");

        System.out.println("Rupaul's Drag Race:");
        System.out.println("All Stars\n");

        System.out.printf("Megasena: %d %d %d\n", 1, 2, 3);
        System.out.printf("Salário: %.1f\n", 1234.5678);
        System.out.printf("Nome: %s", "Nicole\n");

        System.out.print("Digite seu nome: ");
        Scanner entrada = new Scanner(System.in);
        String nome = entrada.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.println("\nNome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Idade: " + idade + " anos.");

        System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);

        entrada.close();
    }
}
