package curso.orientacaoAObjetos.herenca;

public class Jogador {

    int x;
    int y;

    public boolean andar(Direcao direcao) {
        switch(direcao) {
            case NORTE:
                y--;
                break;
            case LESTE:
                x++;
                break;
            case SUL:
                y++;
            case OESTE:
                x--;
                break;
        }
        return true;
    }
}
