package fundamentos.exercicios;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe seu peso em kg: ");
        double peso = entrada.nextDouble();

        System.out.println("Informe sua altura em m: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC: " + imc);
        entrada.close();
    }
}
