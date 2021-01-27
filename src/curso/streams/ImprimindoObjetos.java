package curso.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Aluno1", "Aluno2", "Aluno3");

        System.out.println("Usando foreach");
        for(String nome : aprovados){
            System.out.println(nome);
        }

        System.out.println("\nUsando iterador");
        Iterator<String> iterator = aprovados.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nUsando stream");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);

    }
}
