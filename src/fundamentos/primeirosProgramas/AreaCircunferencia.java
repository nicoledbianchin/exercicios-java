package fundamentos.primeirosProgramas;

public class AreaCircunferencia {
    public static void main(String[] args) {
        double raio = 3.4;
        final double PI = 3.14159; //convenção: nome de constante com letra maiuscula

        double area = PI * raio * raio;

        System.out.println("Area = " + area);

        raio = 10;
        area = PI * raio * raio;
        System.out.println("Area = " + area);
    }
}
