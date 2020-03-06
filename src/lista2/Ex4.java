package lista2;

import java.util.Scanner;

public class Ex4 {
//    Para	 cada	 produto	 informado	 (nome,	 preço	 e	 quantidade),	 escreva	 o	 nome	 do	 produto
//    comprado	 e	 o	 valor	 total	 a	 ser	 pago,	 considerando	 que	 são	 oferecidos	 descontos	 pelo
//    número	de	unidades	compradas,	segundo	a	tabela	abaixo:
//    a. Até	10	unidades: valor	total
//    b. de	11 a	20	unidades: 10%	de	desconto
//    c. de	21	a	50	unidades: 20%	de	desconto
//    d. acima	de	50	unidades: 25%	de	desconto

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o produto (nome, preço e quantidade: ");
        String nome = entrada.nextLine();
        double preco = entrada.nextDouble();
        int quantidade = entrada.nextInt();

        double precoTotal = 0;

        if (quantidade < 11) {
            precoTotal = preco * quantidade;
        } else if (quantidade >= 11 && quantidade < 21) {
            precoTotal = preco * quantidade * 0.1;
        } else if (quantidade >= 21 && quantidade < 51) {
            precoTotal = preco * quantidade * 0.2;
        } else {
            precoTotal = preco * quantidade * 0.25;
        }

        System.out.println("Preço total: " + precoTotal);

        entrada.close();
    }
}
