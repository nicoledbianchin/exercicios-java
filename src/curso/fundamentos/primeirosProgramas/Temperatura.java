package curso.fundamentos.primeirosProgramas;

public class Temperatura {
    public static void main(String[] args) {
        //(°F-32) * 5/9 = °C
        final int AJUSTE = 32;
        final double FATOR = 5.0 / 9.0;

        double fahrenheit = 86;
        double celsius = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("O resultado é " + celsius + "°C");

        fahrenheit = 150;
        celsius = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("O resultado é " + celsius + "°C");


        fahrenheit = 0;
        celsius = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("O resultado é " + celsius + "°C");
    }
}
