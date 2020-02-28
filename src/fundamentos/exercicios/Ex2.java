package fundamentos.exercicios;

import java.util.Scanner;

public class Ex2 {
    //Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a temperatura em Fahrenheit:");
        double fahrenheit = entrada.nextDouble();

        double resultado = (fahrenheit - 32) * 0.56;

        System.out.println("Resultado em Celsius: " + resultado);

        entrada.close();
    }
}
