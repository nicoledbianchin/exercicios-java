package curso.classe;

public class AreaCircunferencia {

    double raio;
    static final double PI = 3.14;

    public AreaCircunferencia(double raioInicial) {
        raio = raioInicial;
    }

    double calcularArea() {
        return Math.pow(raio, 2) * PI;
    }

    static double area(double raio) {
        return PI * Math.pow(raio, 2);
    }

    public static void main(String[] args) {
        AreaCircunferencia circulo = new AreaCircunferencia(5.6);
        System.out.println(circulo.calcularArea());

        AreaCircunferencia circulo2 = new AreaCircunferencia(10);
        System.out.println(circulo2.calcularArea());

        System.out.println(AreaCircunferencia.area(5));

        System.out.println(AreaCircunferencia.PI);
        System.out.println(Math.PI);
    }
}
