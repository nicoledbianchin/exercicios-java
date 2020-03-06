package curso.estruturasDeControle.exercicios;

import java.util.Scanner;

public class Ex4 {
    //Criar um programa que receba um número e diga se ele é um número primo.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = entrada.nextInt();

        if (numero % 2 != 0 || numero == 2){
            if (numero % 3 != 0){
                if (numero % 5 != 0){
                    System.out.println("Número primo.");
                }
            }
        } else {
            System.out.println("Número não primo.");
        }

        entrada.close();
    }
}
