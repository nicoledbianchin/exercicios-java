package curso.orientacaoAObjetos.composicao.carro;

public class CarroTeste {

    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(carro.estaLigado());

        carro.ligar();
        System.out.println(carro.estaLigado());

        System.out.println(carro.getMotor().giros());

        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        System.out.println(carro.getMotor().giros());

        carro.frear();
        carro.frear();
        carro.frear();
        carro.frear();
        System.out.println(carro.getMotor().giros());
    }
}
