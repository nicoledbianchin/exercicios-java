package fundamentos.tipos;

import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Wrappers {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Byte b = 100;
        Short s = 1000;
        Integer i = 10000;
        Integer i2 = Integer.parseInt(entrada.nextLine()); // converte uma String em Int
        Long l = 100000L;

        Float f = 1234.10F;
        System.out.println(f);

        Double d = 1234.54;
        System.out.println(d);

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i2);
        System.out.println((i2 / 5));

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = '*';
        System.out.println(c.toString());

        entrada.close();
    }
}
