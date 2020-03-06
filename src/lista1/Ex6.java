package lista1;

import java.util.Scanner;

public class Ex6 {
//    6. Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
//    antecessor e seu sucessor.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Número: ");
        int numero = entrada.nextInt();

        System.out.println(numero - 1);
        System.out.println(numero + 1);

        entrada.close();
    }
}
