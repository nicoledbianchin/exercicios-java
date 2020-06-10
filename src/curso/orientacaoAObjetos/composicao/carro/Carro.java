
package curso.orientacaoAObjetos.composicao.carro;

public class Carro {

    private Motor motor;

    Carro() {
        this.motor = new Motor();
    }

    void acelerar() {
        if (motor.getFatorInjecao() < 2.6) {
            motor.setFatorInjecao(motor.getFatorInjecao() + 0.4);
        }
    }

    void frear() {
        if (motor.getFatorInjecao() > 0.5) {
            motor.setFatorInjecao(motor.getFatorInjecao() - 0.4);
        }
    }

    void ligar() {
        motor.setLigado(true);
    }

    void desligar() {
        motor.setLigado(false);
    }

    boolean estaLigado() {
        return motor.isLigado();
    }

    public Motor getMotor() {
        return motor;
    }
}

