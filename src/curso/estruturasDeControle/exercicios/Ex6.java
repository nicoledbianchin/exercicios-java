package curso.estruturasDeControle.exercicios;

import java.util.Scanner;

public class Ex6 {
    //Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um
    // numero aleatório em uma variável. O Jogador tem 10 tentativas para adivinhar o
    // número gerado. Ao final de cada tentativa, imprima a quantidade de tentativas restantes,
    // e imprima se o número inserido é maior ou menor do que o número armazenado.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int random = (int) (Math.random() * 100);
        int tentativas = 10;

        do {
            System.out.print("Tente adivinhar o número entre 0 e 100. ");
            int tentativa = entrada.nextInt();

            if (tentativa == random){
                System.out.print("Parabéns, você acertou!");
                break;
            } else {
                tentativas--;
                System.out.print("Errado. Você tem " + tentativas + " tentativas restantes.");
                if(tentativas != 0 && tentativa < random){
                    System.out.println(" O número é maior que o seu palpite.");
                    System.out.println(" ");
                } else if (tentativas != 0 && tentativa > random){
                    System.out.println(" O número é menor que o seu palpite.");
                    System.out.println(" ");
                }
            }
        } while (tentativas > 0);

        entrada.close();
    }
}
