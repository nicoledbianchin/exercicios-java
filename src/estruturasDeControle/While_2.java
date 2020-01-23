package estruturasDeControle;

import java.util.Scanner;

public class While_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String resposta = "";

        while (!resposta.equalsIgnoreCase("sair")) {
            System.out.print("Digite algo: ");
            resposta = entrada.nextLine();
        }

        System.out.println("Saindo...");
        entrada.close();
    }
}