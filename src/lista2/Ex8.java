package lista2;

import java.util.Scanner;

public class Ex8 {
//    8. Calcule a	série	de	Fibonacci	para	um	número	inteiro	não	negativo	informado	pelo	usuário.
//    A	 série	 de	 Fibonacci	 inicia	 com	 os	 números	 F0 =	 0 e	 F1 =	 1,	 e	 cada	 número	 posterior
//    equivale	à	soma	dos	dois	números	anteriores (Fn =	Fn-1 +	Fn-2).

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Número: ");
        int numero = entrada.nextInt();
        int resultado = 0;

        System.out.println(0);
        System.out.println(1);
        for (int i = 2; i < numero; i++) {
            resultado = (i - 1) + (i - 2);
            System.out.println(resultado);
        }

        entrada.close();
    }
}
