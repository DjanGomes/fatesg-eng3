public class MenorValor {
    private No head;

    public int menorValor(){

        if (head == null) {
            System.out.println("A lista está vazia!");
            return -1;
        }

        No aux = head;
        int menorValor = aux.getDado();

        while(aux != null){

            if( aux.getDado() < menorValor){
                menorValor = aux.getDado();
            }

            aux = aux.getProximo();

        }

        return menorValor ;
    }
}
