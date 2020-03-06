package curso.collections;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
//      Set<String> lista = new HashSet<>(); // sem ordem
        Set<String> lista = new TreeSet<>();   // com ordem
        lista.add("Ana");
        lista.add("Carlos");
        lista.add("Lucca");
        lista.add("Pedro");

        for (String nome : lista) {
            System.out.println(nome);
        }

            Set<Integer> numeros = new TreeSet<>();   // com orgem
            numeros.add(1);
            numeros.add(2);
            numeros.add(120);
            numeros.add(6);

            for(int numero : numeros){
                System.out.println(numero);
            }
        }
    }
