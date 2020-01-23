package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data aniversario = new Data();
        aniversario.dia = 24;
        aniversario.mes = 03;
        aniversario.ano = 2000;

        Data fimSemestre = new Data(17, 12, 2019);

        Data dataInicial = new Data();

        System.out.println("Aniversário: " + aniversario.obterDataFormatada());
        System.out.println("Fim do semestre: " + fimSemestre.obterDataFormatada());
        System.out.println("Data inicial: " + dataInicial.obterDataFormatada());
    }
}
