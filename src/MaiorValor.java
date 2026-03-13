public class MaiorValor {
    private No head;

    public int maiorValor() {
        if(head == null){
            System.out.println("A lista esta vazia!");
        }

        No auxiliar = head;
        int maiorValor = auxiliar.getDado();

        while ((auxiliar != null)){
            if(auxiliar.getDado() > maiorValor ){
                maiorValor = auxiliar.getDado();
            }

            auxiliar = auxiliar.getProximo();
        }
        return  maiorValor;
    }
}
