package estruturasDeControle.exercicios;

import java.util.Scanner;

public class Ex1 {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int valor = entrada.nextInt();

        if (valor % 2 == 0){
            System.out.print("Número é par");
        } else {
            System.out.print("Número é impar");
        }

        for(int i = 0; i < 11; i++){
            if (valor == i){
                System.out.print(" e está entre 0 e 10.");
            } else if (i == 10) {
                System.out.print(" e não está entre 0 e 10.");
            }
        }

        entrada.close();
    }
}
