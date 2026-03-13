public class Busca {

    private No head;

    public static boolean buscar(No head,int valor) {
        No atual = head;

        while (atual != null) {
            if (atual.getDado() == valor) {
                return true;
            }
            atual = atual.getProximo();
        }

        return false;
    }
}