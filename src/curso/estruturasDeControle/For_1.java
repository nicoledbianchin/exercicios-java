package curso.estruturasDeControle;

public class For_1 {
    public static void main(String[] args) {
        int count = 0;

        while (count <= 20) {
            System.out.println("i = " + count);
            count += 2;
        }

        System.out.println("\n");

        for (int i = 0; i <= 20; i += 2) {
            System.out.println("i = " + i);
        }

        System.out.println("\n");
        int x = 2;

        for (; x < 10; ) {
            System.out.println(x);
            x++;
        }

        // laço infinito
        //for (;;){
        //System.out.println("Fim");
        //}
    }
}
