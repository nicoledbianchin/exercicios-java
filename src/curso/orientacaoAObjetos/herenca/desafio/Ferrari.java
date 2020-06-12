package curso.orientacaoAObjetos.herenca.desafio;

public class Ferrari extends Carro{

    Ferrari() {
        super(300);
    }

    @Override
    public void acelerar() {
        super.acelerar();
        super.acelerar();
        super.acelerar();
    }
}
