package curso.estruturasDeControle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String resposta = "";

        do {
            System.out.print("Digite algo:");
            resposta = entrada.nextLine();
        } while (!resposta.equalsIgnoreCase("sair"));

        System.out.println("Saindo...");

        entrada.close();
    }
}