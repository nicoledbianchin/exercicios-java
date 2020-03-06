package curso.estruturasDeControle.exercicios;

import java.util.Scanner;

public class Ex5 {
    //Refatorar o exercício 04, utilizando a estrutura switch.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = entrada.nextInt();

        int contadorDivisores = 0;
        for (int i= 2; i < numero; i++){
            if (numero % i == 0) {
                contadorDivisores++;
                }
            }

        switch (contadorDivisores) {
            case 0: {
                System.out.println("Número primo");
                break;
            }
            default: {
                System.out.println("Número não primo");
            }
        }

        entrada.close();
    }
}
