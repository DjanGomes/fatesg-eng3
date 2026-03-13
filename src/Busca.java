public class Busca {

    private No inicio;

    public static boolean buscar(No inicio, int valor) {
        No atual = inicio;

        while (atual != null) {
            if (atual.getDado() == valor) {
                return true;
            }
            atual = atual.getProximo();
        }

        return false;
    }
}