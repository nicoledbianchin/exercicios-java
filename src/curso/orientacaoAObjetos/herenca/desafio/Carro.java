package curso.orientacaoAObjetos.herenca.desafio;

public class Carro {
    public float velocidadeAtual;
    public final float velocidadeMaxima;

    Carro(float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void acelerar() {
        if (velocidadeAtual + 5 > velocidadeMaxima) {
        velocidadeAtual = velocidadeAtual + 5;
        } else {
            velocidadeAtual = velocidadeAtual + 5;
        }
    }

    public void frear() {
        float validar = velocidadeAtual - 5;
        if (validar >= 0) {
            velocidadeAtual = validar;
        }
    }

}
