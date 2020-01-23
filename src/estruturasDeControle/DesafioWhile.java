package estruturasDeControle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int total = 0;
        int quantidadeDeNotas = 0;
        int nota = 0;

        while (nota != -1) {
            System.out.println("Digite a nota:");
            nota = entrada.nextInt();

            if (nota >= 0 && nota <= 10) {
                total += nota;
                quantidadeDeNotas++;
            } else if (nota != -1) {
                System.out.println("Nota inválida. Tente novamente: ");
            }
        }

        double media = total / quantidadeDeNotas;
        System.out.println("Média: " + media);

        entrada.close();
    }
}
