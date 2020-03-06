package curso.collections;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> queens = new HashSet<>();
        queens.add(new Usuario("Aquaria"));
        queens.add(new Usuario("Trixie"));
        queens.add(new Usuario("Katya"));

        boolean resultado = queens.contains(new Usuario("Katya"));
        System.out.println(resultado);
    }
}
