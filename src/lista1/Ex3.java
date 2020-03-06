package lista1;

import java.util.Scanner;

public class Ex3 {
//    3. Informar um saldo e imprimir o saldo com reajuste de 1%.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double saldo = 0;
        double saldoReajuste = 0;

        System.out.println("Informe o saldo: ");
        saldo = entrada.nextDouble();

        saldoReajuste = saldo * 0.01;

        System.out.println("Saldo com reajuste: " + saldoReajuste);

        entrada.close();
    }
}
