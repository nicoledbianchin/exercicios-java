package fundamentos.operadores;

public class DesafioAritmeticos {
    public static void main(String[] args) {
//        int a = 3 * 4 - 10;
//        int b = (int) Math.pow(a, 3);
//        double c = Math.pow(a, 3);
//
//        System.out.println(b);
//        System.out.println(c);
        double primeiroDividendo = Math.pow((6*(3+2)), 2);
        double primeiroDivisor = 3*2;
        double primeiraRazao = primeiroDividendo / primeiroDivisor;

        double segundoDividendo = (1-5) * (2-7);
        double segundoDivisor = 2;
        double segundaRazao = Math.pow((segundoDividendo / segundoDivisor), 2);

        double subtração = primeiraRazao - segundaRazao;

        double terceiroDividendo = Math.pow(subtração, 3);
        double terceiroDivisor = Math.pow(10, 3);

        int formulaFinal = (int) terceiroDividendo / (int) terceiroDivisor;

        System.out.println("Resultado final: " + formulaFinal);
    }
}
