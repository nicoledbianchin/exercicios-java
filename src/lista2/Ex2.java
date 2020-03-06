package lista2;

import java.util.Scanner;

public class Ex2 {
//    Calcule	a	distância	entre	dois	pontos	num espaço	de	3	dimensões.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o x, y e z do primeiro ponto: ");
        double x1 = entrada.nextDouble();
        double y1 = entrada.nextDouble();
        double z1 = entrada.nextDouble();

        System.out.println("Informe o x, y e z do segundo ponto: ");
        double x2 = entrada.nextDouble();
        double y2 = entrada.nextDouble();
        double z2 = entrada.nextDouble();

        double x = x1 - x2;
        double y = y1 - y2;
        double z = z1 - z2;

        double resultado = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));

    System.out.println("Resultado: " + resultado);

        entrada.close();
    }
}
