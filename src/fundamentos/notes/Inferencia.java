package fundamentos.notes;

public class Inferencia {

    public static void main(String[] args) {
        double a = 4.5;//variavel foi declarada e inicializada
        System.out.println(a);

        var b = 4.5;
        System.out.println(b);

        var c = "Texto";
        System.out.println(c);
        c = "Outro texto";
        System.out.println(c);

        double d;//variavel foi declarada
        d = 123.65;//variavel foi inicializada
        System.out.println(d);//variavel foi usada
        //quando se usa var, nao da pra declarar e incializar separadamente

        var f = 12; //inteiro
        //um valor inteiro pode ser double, mas um double nao pode ser inteiro
        System.out.println(f);
    }
}