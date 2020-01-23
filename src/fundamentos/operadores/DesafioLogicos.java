package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogicos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("O trabalho de terça deu certo?");
        boolean trabalhoTerca = entrada.nextBoolean();

        System.out.println("O trabalho de quinta deu certo?");
        boolean trabalhoQuinta = entrada.nextBoolean();

//        if (trabalhoTerca && trabalhoQuinta){
//            System.out.println("TV 42 polegadas e sorvete.");
//        }
//        if (trabalhoTerca ^ trabalhoQuinta){
//            System.out.println("TV 32 polegadas e sorvete.");
//        }
//        if(!trabalhoTerca && !trabalhoQuinta){
//            System.out.println("Sem TV nem sorvete.");
//        }

        boolean comprouTv50 = trabalhoTerca && trabalhoQuinta;
        System.out.println("Comprou TV 50\"? " + comprouTv50);

        boolean comprouTv32 = trabalhoTerca ^ trabalhoQuinta;
        System.out.println("Comprou TV 32\"? " + comprouTv32);

        boolean tomouSorvete = trabalhoTerca || trabalhoQuinta;
        System.out.println("Tomou sorvete? " + tomouSorvete);

        boolean maisSaudavel = !trabalhoTerca && !trabalhoQuinta;
        System.out.println("Está mais saudável? " + maisSaudavel);

        entrada.close();
    }
}
