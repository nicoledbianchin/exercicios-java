package curso.fundamentos.exercicios;

import java.util.Scanner;

public class Ex1 {
    //Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a temperatura em °C:");
        double celsius = entrada.nextDouble();

        double resultado = (celsius * 1.8) + 32;

        System.out.println("Resultado em Fahrenheit: " + resultado);

        entrada.close();
    }
}
