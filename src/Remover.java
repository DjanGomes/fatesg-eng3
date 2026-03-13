public class Remover {
    No inicio;

    public boolean existe(int valor){
        No atual = inicio;

        while (atual != null){
            if(atual.getDado() == valor){
                return true;
            }
        }
        return false;
    }

    public Remover(){
        this.inicio = null;
    }
    public void remover(int dado){
        boolean v = existe(dado);
        if(inicio == null){
            System.out.println("Lista vazia");
            return;
        }
        if(inicio.getDado() == dado){
            inicio = inicio.getProximo();
            return;
        }

        if(v){
            No atual = inicio;
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

        while(inicio != null && inicio.getDado() % 2 == 0){
            inicio = inicio.getProximo();
        }

        No atual = inicio;

        while(atual != null && atual.getProximo() != null){

            if(atual.getProximo().getDado() % 2 == 0){
                atual.setProximo(atual.getProximo().getProximo());
            }else{
                atual = atual.getProximo();
            }

        }
    }
}
