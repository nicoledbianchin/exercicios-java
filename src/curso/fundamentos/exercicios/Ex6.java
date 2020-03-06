package curso.fundamentos.exercicios;

import java.util.Scanner;

public class Ex6 {
    //Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) utilizando
    // a fórmula de Bhaskara.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o 'a': ");
        double a = entrada.nextDouble();

        System.out.println("Informe o 'b': ");
        double b = entrada.nextDouble();

        System.out.println("Informe o 'c': ");
        double c = entrada.nextDouble();

        double delta = Math.pow(b, 2) - (4 * a * c);
        double x1 = (- b + delta) / (2 * a);
        double x2 = (- b - delta) / (2 * a);

        System.out.println("X1: " + x1 + ", X2: " + x2 + ".");

        entrada.close();
    }
}
