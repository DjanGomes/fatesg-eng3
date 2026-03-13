public class Contador {
    private No head;

    public int contador(){
        No aux = head;
        int elementos = 0;
        if(aux == null){
            System.out.println("A lista está vazia");
        }else {
             while (aux != null) {
                elementos++;
                aux = aux.getProximo();
            }
        }

        return elementos;
    }
}
