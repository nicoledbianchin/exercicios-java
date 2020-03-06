package lista1;

public class Ex2 {
//    2. Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
//    números 4, 5 e 6. A soma das duas médias. A média das médias.

public static void main(String[] args) {
    double media1 = (8 + 9 + 7) / 3;
    double media2 = (4 + 5 + 6) / 3;
    double soma = media1 + media2;
    double mediaFinal = soma / 2;

    System.out.println("Primeira média: " + media1);
    System.out.println("Segunda média: " + media2);
    System.out.println("Soma: " + soma);
    System.out.println("Terceita média: " + mediaFinal);
}
}
