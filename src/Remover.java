public class Remover {
    No head;

    public boolean existe(int valor){
        No atual = head;

        while (atual != null){
            if(atual.getDado() == valor){
                return true;
            }
        }
        return false;
    }

    public void remover(int dado){
        boolean v = existe(dado);
        if(head == null){
            System.out.println("Lista vazia");
            return;
        }
        if(head.getDado() == dado){
            head = head.getProximo();
            return;
        }

        if(v){
            No atual = head;
            while(atual != null && atual.getProximo().getDado() != dado){
                atual = atual.getProximo();
            }
            if(atual.getProximo() != null){
                atual.setProximo(atual.getProximo().getProximo());
            }
            while (atual != null){
                if(atual.getDado() % 2 == 0 && atual.getDado() == dado){
                    atual.setProximo(atual.getProximo().getProximo());
                }
                atual = atual.getProximo();
            }
        }
    }
    public void removerPares(){

        while(head != null && head.getDado() % 2 == 0){
            head = head.getProximo();
        }

        No atual = head;

        while(atual != null && atual.getProximo() != null){

            if(atual.getProximo().getDado() % 2 == 0){
                atual.setProximo(atual.getProximo().getProximo());
            }else{
                atual = atual.getProximo();
            }

        }
    }
}
