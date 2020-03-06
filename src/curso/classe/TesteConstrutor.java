package curso.classe;

public class TesteConstrutor {
    static int dia = 1;
    int mes = 2;

    public static void main(String[] args) {
        TesteConstrutor teste = new TesteConstrutor();
        teste.mes = 2;

        System.out.println(teste.mes);
        System.out.println(TesteConstrutor.dia);
    }
}
