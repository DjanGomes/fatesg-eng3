public class Contador {
    public int contador(){
        No aux = Head;
        int elementos = 0;
        if(aux == null){
            System.out.println("A lista está vazia");
        }else {
             while (aux.getProximo() != null) {
                elementos++;
                aux = aux.getproximo();
            }
        }
    }
}
