package curso.orientacaoAObjetos.herenca.desafio;

public class Carro {
    private float velocidadeAtual;
    private final float velocidadeMaxima;
    private int delta = 5;

    public Carro(float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void acelerar() {
        if (velocidadeAtual + getDelta() > velocidadeMaxima) {
        velocidadeAtual = velocidadeAtual + getDelta();
        } else {
            velocidadeAtual = velocidadeAtual + getDelta();
        }
    }

    public void frear() {
        float validar = velocidadeAtual - getDelta();
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

    public void setDelta(int delta) {
        this.delta = delta;
    }

    public int getDelta() {
        return delta;
    }
}
