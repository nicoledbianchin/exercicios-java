package curso.estruturasDeControle.exercicios;

import java.util.Scanner;

public class Ex2 {
    //Criar um programa informa se o ano atual é um ano bissexto.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o ano atual:");
        int ano = entrada.nextInt();

        if(ano % 4 == 0){
                    System.out.println("Ano bissexto.");
        } else {
            System.out.println("Ano não bissexto.");
        }

        entrada.close();
    }
}
