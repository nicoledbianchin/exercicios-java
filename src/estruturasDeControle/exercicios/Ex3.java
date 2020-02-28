package estruturasDeControle.exercicios;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a primeira nota parcial: ");
        double primeiraNota = entrada.nextDouble();

        System.out.println("Informe a segunda nota parcial: ");
        double segundaNota = entrada.nextDouble();

        double media = (primeiraNota + segundaNota) / 2;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media > 4 && media < 7){
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        entrada.close();
    }
}
