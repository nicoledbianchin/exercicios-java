package curso.estruturasDeControle.exercicios;

import java.util.Scanner;

public class Ex7 {
    //Criar um programa que enquanto estiver recebendo números positivos,
    //imprime no console a soma dos números inseridos, caso receba um número negativo,
    //encerre o programa. Tente utilizar a estrutura do while.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        int soma = 0;

        do{
            System.out.println("Insira um número: ");
            numero = entrada.nextInt();
            soma = soma + numero;
            System.out.println("Soma total: " + soma);
        } while (numero >= 0);

        entrada.close();
    }
}
