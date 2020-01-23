package arrays;

public class TesteEquals {
    String nome;

    public static void main(String[] args) {
        TesteEquals p1 = new TesteEquals();
        p1.nome = "caneta";

        TesteEquals p2 = new TesteEquals();
        p2.nome = "caneta";

        System.out.println(p1.equals(p2));
        System.out.println(p1 == p2);
        System.out.println(p1.nome.equalsIgnoreCase(p2.nome));
    }
}
