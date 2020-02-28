package estruturasDeControle.exercicios;

import java.util.Scanner;

public class Ex8 {
    //Criar um programa que receba uma palavra e imprime no console letra por letra.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva uma palavra: ");
        String palavra = entrada.nextLine();

        char letras[] = palavra.toCharArray();

        for(char letra : letras){
            System.out.println(letra);
        }

        entrada.close();
    }
}
