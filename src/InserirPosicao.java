public class InserirPosicao {

    private No head;

    public void inserirPosicao(int dado, int posicao) {
        No novo = new No();
        novo.setDado(dado);

        if (posicao == 0) {
            novo.setProximo(head);
            head = novo;
            return;
        }

        No atual = head;
        int contador = 0;

        while (atual != null && contador < posicao - 1) {
            atual = atual.getProximo();
            contador++;
        }

        if (atual == null) {
            System.out.println("Posição inválida");
            return;
        }

        novo.setProximo(atual.getProximo());
        atual.setProximo(novo);
    }
}