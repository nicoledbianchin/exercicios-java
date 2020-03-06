package lista1;

import java.util.Scanner;

public class Ex4 {
//    4. Escrever um algoritmo que lê:
//      - a porcentagem do IPI a ser acrescido no valor das peças
//      - o código da peça 1, valor unitário da peça 1, quantidade de peças 1
//      - o código da peça 2, valor unitário da peça 2, quantidade de peças 2
//    O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
//    Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o IPI: ");
        double ipi = entrada.nextDouble();

        System.out.println("Informe o código, valor e quantidade da peça 1: ");
        int codigo = entrada.nextInt();
        double valor = entrada.nextDouble();
        int quantidade = entrada.nextInt();

        System.out.println("Informe o código, valor e quantidade da peça 2: ");
        int codigo2 = entrada.nextInt();
        double valor2 = entrada.nextDouble();
        int quantidade2 = entrada.nextInt();

        double resultado = ((valor * quantidade) + (valor2 * quantidade2)) * ((ipi / 100) + 1);

        System.out.println(resultado);

        entrada.close();
    }
}
