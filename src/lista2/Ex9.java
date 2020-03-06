package lista2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex9 {
//    Ordene	um	vetor	de	100	números	inteiros	gerados	aleatoriamente.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Integer> lista = new ArrayList();
        int menor = 100;
        int adicionar = 0;
        List ordenada = new ArrayList();

        for (int i = 0; i < 100; i++) {
            lista.add((int) (Math.random() * 100));
        }

        for (int i = 0; i < 100; i++) {
            for(int j = 0; j < lista.size(); j++) {
                if (lista.get(j) < menor) {
                    ordenada.add(lista.get(j));
                    lista.remove(lista.get(j));
                }
            }
        }

        for(int i = 0; i < 100; i++) {
            System.out.println(ordenada.get(i));
        }

        entrada.close();
    }
}
