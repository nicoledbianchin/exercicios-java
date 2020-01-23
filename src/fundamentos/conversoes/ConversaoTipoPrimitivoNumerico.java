package fundamentos.conversoes;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {
        double a = 1;
        System.out.println(a);

        float b = 1.0F;
        float b2 = (float) 1.0;
        System.out.printf("%f, %f\n", b, b2);

        int c = 4;
        byte d = (byte) c;
        System.out.println(d);

        double e = 1.99999;
        int f = (int) e;
        System.out.println(f);
    }
}
