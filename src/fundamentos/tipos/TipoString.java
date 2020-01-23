package fundamentos.tipos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(3));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + ("!!!"));
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toLowerCase().endsWith("tarde"));
        System.out.println(s.length());
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Nicole";
        var sobrenome = "Bianchin";
        var idade = 19;
        var salario = 1000.250;

        System.out.println("Nome: " + nome +
                "\nSobrenome: " + sobrenome +
                "\nIdade: " + idade +
                "\nSalário: " + salario +
                "\n\n");

        // Concatenação como no C
        System.out.printf("%s %s tem %d anos e ganha %f reais.\n", nome, sobrenome, idade, salario);

        String frase = String.format("%s %s tem %d anos e ganha %f reais.", nome, sobrenome, idade, salario);

        System.out.println(frase);

        // String de concatenação de outras strings
        String coisaEstranha = "\nNome: " + nome +
                "\nSobrenome: " + sobrenome +
                "\nIdade: " + idade +
                "\nSalário: " + salario + "\n";

        System.out.println(coisaEstranha);

        // Testando
        System.out.println("Nicole".isEmpty());
        System.out.println("Nicole".indexOf("o"));
        System.out.println("Nicole".substring(3));
        System.out.println("Nicole".substring(3, 6));
        System.out.println("Nicole".contains("ol"));
    }
}
