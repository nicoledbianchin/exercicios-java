package curso.collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Aquaria");
        usuarios.put(2, "Jinkx");
        usuarios.put(3, "Trixie");
        usuarios.put(4, "Katya");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());
        System.out.println(usuarios.keySet());

        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(2));
        System.out.println(usuarios.containsValue("Katya"));

        System.out.println(usuarios.get(1));

        for (int chave : usuarios.keySet()){
            System.out.println(chave);
        }

        for (String nome : usuarios.values()){
            System.out.println(nome);
        }

        for (Map.Entry<Integer, String> usuario : usuarios.entrySet()){
            System.out.println(usuario);
        }
    }
}
