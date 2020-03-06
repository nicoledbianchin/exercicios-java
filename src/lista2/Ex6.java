package lista2;

import java.util.Scanner;

public class Ex6 {
//    Determine o	número	de	dígitos	de	um	número	informado.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String numero = "";
        char[] lista;

        System.out.println("Informe um numero: ");
        numero = entrada.nextLine();

        lista = numero.toCharArray();

        System.out.println(lista.length);

        entrada.close();
    }
}
