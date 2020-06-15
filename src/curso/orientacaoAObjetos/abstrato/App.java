package curso.orientacaoAObjetos.abstrato;

public class App {
    public static void main(String[] args) {
        Animal animal = new Cachorro();
        animal.respirar();

        Mamifero mamifero = new Cachorro();
        mamifero.respirar();

        Cachorro cachorro = new Cachorro();
        cachorro.respirar();
        cachorro.mover();
        cachorro.correr();
    }
}
