package arrays;

import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantas notas você deseja informar? ");
        int tamanho = entrada.nextInt();
        double notas[] = new double[tamanho];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1) + ":");
            notas[i] = entrada.nextDouble();
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }

        System.out.println("Resultado: " + soma / notas.length);

        entrada.close();
    }
}
