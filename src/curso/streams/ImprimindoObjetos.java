package curso.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Ana", "Lu", "Bia", "Maria");

        System.out.println("\nFor:");
        for (int i = 0; i < aprovados.size(); i++) {
            System.out.println(aprovados.get(i));
        }

        System.out.println("\nForeach:");
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nIterator:");
        Iterator<String> iterator = aprovados.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        // Stream: sequencia de dados
        System.out.println("\n////");
        System.out.println("Stream:");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);



    }
}
