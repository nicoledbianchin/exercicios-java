package curso.estruturasDeControle;

public class DesafioFor {
    public static void main(String[] args) {
        for (String valor = "#";!valor.equalsIgnoreCase("######"); valor += "#"){
            System.out.println(valor);
        }
    }
}
