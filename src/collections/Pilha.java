package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();

        livros.add("O Pequeno Principe");
        livros.push("O Manifesto Comunista");
        livros.push("O Hobbit");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println("\n" + livros.poll());
        System.out.println(livros.pop());
        System.out.println(livros.remove());
        System.out.println(livros.poll());
        System.out.println(livros.poll());

//        livros.size();
//        livros.clear();
//        livros.contains();
//        livros.isEmpty();

        livros.addFirst("primeiro");
        System.out.println(livros.toString());
    }
}
