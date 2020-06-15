package curso.lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {

        // binary operator recebe dois parametros do mesmo tipo e devolve um parametro do mesmo tipo.
        BinaryOperator<Double> calculo = (x, y) -> {
          return x + y;
        };
        System.out.println(calculo.apply(2.0,3.0));

        calculo = (x, y) -> {
            return x * y;
        };
        System.out.println(calculo.apply(2.0,3.0));

    }
}
