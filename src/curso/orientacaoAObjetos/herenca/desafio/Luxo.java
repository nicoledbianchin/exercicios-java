package curso.orientacaoAObjetos.herenca.desafio;

public interface Luxo {
    void ligarAr();
    void desligarAr();

     default int nivelDoAr() {
         return 1;
     };

}
