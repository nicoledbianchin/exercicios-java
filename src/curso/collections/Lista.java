package curso.collections;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));

        System.out.println(lista.get(3).toString());
        System.out.println(lista.contains(new Usuario("Lia")));

        lista.remove(1);

        for (Usuario u : lista) {
            System.out.println(u.nome);
        }
    }
}
