public class Inserir {

    private No head = null;

    public void inserirInicio(int valor) {
        No novo = new No();
        novo.setDado(valor);

        if (head == null) {
            head = novo;
            head.setProximo(null);
        } else {
            novo.setProximo(head);
            head = novo;
        }

    }

    public void inserirFinal(int valor) {
        No novoNo = new No();
        novoNo.setDado(valor);
        novoNo.setProximo(null);

        if (head == null){
            head = novoNo;
        } else {
            No aux = head;

            while (aux.getProximo() != null){
                aux = aux.getProximo();
            }
            aux.setProximo(novoNo);
        }

    }

    public void consultar() {
        No aux = head;

        while (aux != null) {
            System.out.println(aux.getDado());
          aux = aux.getProximo();
        }
    }
}









