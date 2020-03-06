package curso.fundamentos.operadores;

public class Ternario {
    public static void main(String[] args) {
        double media = 7.6;
        String resultadoParcial = media >=5? "Recuperação" : "Reprovado";
        String resultadoFinal = media >= 7? "Aprovado" : resultadoParcial;

        System.out.println("Resultado: " + resultadoFinal);

        boolean bomComportamento = true;
        boolean passouPorMedia = media >=7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        String resultado = temDesconto? "Sim." : "Não.";

        System.out.println("Tem desconto? " + resultado);
    }
}
