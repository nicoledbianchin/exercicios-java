package curso.orientacaoAObjetos.herenca.desafio;

import curso.orientacaoAObjetos.herenca.desafio.app.Luxo;

public class Ferrari extends Carro implements Esportivo, Luxo {

    private boolean ligarTurbo = false;
    private boolean ligarAr = false;

    public Ferrari() {
        super(300);
        setDelta(15);
    }

    @Override
    public void ligarTurbo(){
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    @Override
    public int getDelta() {
        if (ligarTurbo && !ligarAr) {
            return 35;
        } else if (ligarTurbo && !ligarAr) {
            return 30;
        } else if (!ligarTurbo && !ligarAr) {
            return 20;
        }
        return 15;
    }
}
