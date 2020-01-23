package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número de alunos: ");
        int numeroAlunos = entrada.nextInt();

        System.out.print("Digite o notas por aluno: ");
        int numeroNotas = entrada.nextInt();

        double notasDaTruma[][] = new double[numeroAlunos][numeroNotas];

        double total = 0;
        for (int i = 0; i < notasDaTruma.length; i++) {
            for (int j = 0; j < notasDaTruma[i].length; j++) {
                System.out.printf("Informe a nota %d do aluno %d: ", (j + 1), (i + 1));
                notasDaTruma[i][j] = entrada.nextDouble();
                total += notasDaTruma[i][j];
            }
        }

        double media = total / (numeroAlunos * numeroNotas);
        System.out.println("Média da turma: " + media);

        for (double notasAlunos[]: notasDaTruma){
            System.out.println(Arrays.toString(notasAlunos));
        }

        entrada.close();
    }
}
