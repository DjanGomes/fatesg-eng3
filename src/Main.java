


public class Main {
    public static void main(String[] args) {
        ListaEncadeada listaEncadeada = new ListaEncadeada();

        listaEncadeada.inserirInicio(50);
        listaEncadeada.inserirInicio(101);
        listaEncadeada.inserirInicio(150);

        listaEncadeada.consultar();
        listaEncadeada.inserirPosicao(120,2);
        listaEncadeada.consultar();
        listaEncadeada.inverter();
        listaEncadeada.consultar();
        System.out.println(listaEncadeada.maiorValor());
        System.out.println(listaEncadeada.menorValor());
        listaEncadeada.removerPrimeiro();
        listaEncadeada.consultar();
        listaEncadeada.remover(101);
        listaEncadeada.consultar();

    }
}
