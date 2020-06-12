package curso.orientacaoAObjetos.herenca.desafio;

public class Carro {
    public float velocidadeAtual;

    public void acelerar() {
        velocidadeAtual = velocidadeAtual + 5;
    }

    public void frear() {
        float validar = velocidadeAtual - 5;
        if (validar >= 0) {
            velocidadeAtual = validar;
        }
    }

}
