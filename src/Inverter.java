public class Inverter {

    public void inverter(){

        No anterior = null;
        No atual = head;
        No proximo = null;

        while(atual != null){
            proximo = atual.getProximo();
            atual.setProximo(anterior);
            anterior = atual;
            atual = proximo;
            }

        head = anterior;
        }
    }

