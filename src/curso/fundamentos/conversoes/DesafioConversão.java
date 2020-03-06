package curso.fundamentos.conversoes;

import java.util.Scanner;

public class DesafioConversão {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o seu salário de agosto:");
        String salarioAgosto = entrada.nextLine().replace(",", ".");

        System.out.println("Informe o seu salário de setembro:");
        String salarioSetembro = entrada.nextLine().replace("," , ".");

        System.out.println("Informe o seu salário de outubro:");
        String salarioOutubro = entrada.nextLine().replace(",", ".");

        double soma = Double.parseDouble(salarioAgosto) + Double.parseDouble(salarioSetembro) + Double.parseDouble(salarioOutubro);
        double media = soma/3;

        System.out.println("A média dos últimos três salários é: " + media);

        entrada.close();
    }
}
