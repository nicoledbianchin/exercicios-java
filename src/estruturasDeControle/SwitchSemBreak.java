package estruturasDeControle;

public class SwitchSemBreak {
    public static void main(String[] args) {
        String faixa = "preta";

        switch (faixa.toLowerCase()) {
            case "preta": {
                System.out.println("Sabe bassai-dai...");
            }
            case "marrom": {
                System.out.println("Sabe tekki shodan");
            }
            case "roxa": {
                System.out.println("Sabe heian godan");
            }
            case "verde": {
                System.out.println("Sabe o heian yodan");
            }
            case "laranja": {
                System.out.println("Sabe o heian sandan");
            }
            case "vermelha": {
                System.out.println("Sabe o heian nidan");
            }
            case "amarela": {
                System.out.println("Sabe heian shodan");
            }
        }

        int idade = 3;
        switch (idade) {
            case 3: {
                System.out.println("Sabe falar");
            }
            case 2: {
                System.out.println("Sabe andar");
            }
            case 1: {
                System.out.println("Sabe chorar");
            }
        }
    }
}
