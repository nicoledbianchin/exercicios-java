package curso.fundamentos.notes;

public class NotacaoPonto {
    public static void main(String[] args) {

        String s = "Bom dia, X";
        s = s.replace("X", "Y");
        s = s.toUpperCase();
        s = s.concat("!!!");

        System.out.println("Nicole".toUpperCase());

        System.out.println(s);

        String y = "Bom dia x".replace("x", "Nicole").toUpperCase().concat("!!!");
        int tamanho = y.length();

        System.out.println(y);
        System.out.println(tamanho);

        // Tipos primitivos não tem a notação ponto
    }
}
