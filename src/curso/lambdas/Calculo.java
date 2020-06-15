package curso.lambdas;

@FunctionalInterface
public interface Calculo {

    double executar (double a, double b);
    // interface funcional: apenas um método

    default String legal() {
        return "legal";
    }
    //é possível usar default na interface funcional

    static String muitoLegal() {
        return "muito legal";
    }
}
