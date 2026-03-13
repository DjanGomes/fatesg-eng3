public class Consultar {
    private No head;

    public void consultar() {
        if (head == null) {
            System.out.println("A lista está vazia!");
        }

        No aux = head;

        System.out.println("Lista Encadeada: ");
        while (aux != null) {

            System.out.print(aux.getDado()+" -> ");
            aux = aux.getProximo();
        }
        System.out.println("null");
    }
}
