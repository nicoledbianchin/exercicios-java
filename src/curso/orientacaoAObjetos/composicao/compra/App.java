package curso.orientacaoAObjetos.composicao.compra;

public class App {
    public static void main(String[] args) {

        Compra compra = new Compra();
        compra.cliente = "Trixie";
        compra.itens.add(new Item("Caneta", 20, 7.45));
        compra.itens.add(new Item("Borracha", 12, 3.89));
        compra.itens.add(new Item("Caderno", 3, 18.79));

        System.out.println(compra.itens.size());
        System.out.println(compra.obterValorTotal());
    }
}
