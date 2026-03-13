public class RemocaoValorInicial {
    public No head;
    public void removerPrimeiro() {
        if (head == null) {
            System.out.println("Lista vazia.");
            return;
        }

        head = head.getProximo();
    }
}

