package curso.estruturasDeControle.exercicios;

import java.util.Scanner;

public class Ex9 {
    //Crie um programa que recebe 10 valores e ao final imprima o maior número.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 10;
        int maior = 0;
        int numero = 0;

        do {
            System.out.println("Informe um número: ");
            numero = entrada.nextInt();
            contador--;
            if (numero > maior){
                maior = numero;
            }
        } while (contador != 0);

        System.out.println("Maior número: " + maior + ".");

        entrada.close();
    }
}
