package curso.collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();
        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho: " + conjunto.size());

        conjunto.add("teste");
        System.out.println("Tamanho: " + conjunto.size());

        conjunto.remove(1.2);
        System.out.println("Tamanho: " + conjunto.size());

        System.out.println(conjunto.remove(3));
        System.out.println(conjunto.contains(true));
        System.out.println(conjunto.contains(5));

        Set numeros = new HashSet();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        System.out.println(conjunto);
        System.out.println(numeros);

//        conjunto.addAll(numeros);
//        System.out.println(conjunto);

        conjunto.retainAll(numeros);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);
    }
}
