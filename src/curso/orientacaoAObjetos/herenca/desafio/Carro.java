package curso.orientacaoAObjetos.herenca.desafio;

public class Carro {
    private float velocidadeAtual;
    private final float velocidadeMaxima;

    public Carro(float velocidadeMaxima) {
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

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(float velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public float getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
}
