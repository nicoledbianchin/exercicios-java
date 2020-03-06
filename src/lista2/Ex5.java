package lista2;

public class Ex5 {
//    Construa a	tabela	de	multiplicação	de	números	de	1	a
//    10	(ex.:	1	x	1	=	1,	1	x	2	=	2,	etc.).

    public static void main(String[] args) {
        int numero = 1;
        int segundoNumero = 1;
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++){
                System.out.println(numero + " x " +  segundoNumero + " = " + numero * segundoNumero);
                segundoNumero++;
            }
            numero++;
        }
    }
}
