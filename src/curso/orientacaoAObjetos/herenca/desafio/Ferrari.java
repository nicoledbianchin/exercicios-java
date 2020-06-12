package curso.orientacaoAObjetos.herenca.desafio;

public class Ferrari extends Carro{

    public Ferrari() {
        super(300);
    }

    @Override
    public void acelerar() {
        super.acelerar();
        super.acelerar();
        super.acelerar();
    }
}
