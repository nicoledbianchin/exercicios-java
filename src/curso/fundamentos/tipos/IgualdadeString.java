package curso.fundamentos.tipos;

import java.util.Scanner;

public class IgualdadeString {
    public static void main(String[] args) {
        System.out.println("2" == "2");

        String s = "2";
        System.out.println("2" == s);
        System.out.println(s.equals("2"));

        Scanner entrada = new Scanner(System.in);

        String s2 = entrada.next();

        System.out.println("2" == s2);
        System.out.println("2".equals(s2));

        entrada.close();
    }
}