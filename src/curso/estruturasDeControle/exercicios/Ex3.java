package curso.estruturasDeControle.exercicios;

import java.util.Scanner;

public class Ex3 {
    //Criar um programa que receba duas notas parciais, calcular a média
    // final. Se a nota do aluno for maior ou igual a 7.0 imprime no console
    // "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 imprime no console
    // "Recuperação", caso contrário imprime no console "Reprovado".

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
