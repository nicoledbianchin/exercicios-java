package lista2;

import java.util.Scanner;

public class Ex1 {
//    Determine	 as	 raízes	 de	 uma	 equação	 de	 2º	 grau:	 ax2 +	 bx	 +	 c	 =
//    0	 (recordar que o discriminante	Δ =	b2 – 4ac,	e	que	a	raiz	r	=	(–b	± √Δ)/2a)).

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o a, b e c da equação: ");
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();

        double delta = Math.pow(b, 2) - (4 * a * c);
        double x1 = (- b + Math.sqrt(delta)) / 2;
        double x2 = (- b - Math.sqrt(delta)) / 2;

        System.out.println("Resultado 1:" + x1);
        System.out.println("Resultado 2:" + x2);

        entrada.close();
    }
}
