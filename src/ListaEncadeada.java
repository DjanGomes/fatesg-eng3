public class ListaEncadeada {

    private No head;

    public boolean buscar(int valor) {
        No atual = head;

        while (atual != null) {
            if (atual.getDado() == valor) {
                return true;
            }
            atual = atual.getProximo();
        }

        return false;
    }
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

    public void inserirInicio(int valor) {
        No novo = new No();
        novo.setDado(valor);

        if (head == null) {
            head = novo;
            head.setProximo(null);
        } else {
            novo.setProximo(head);
            head = novo;
        }

    }

    public void inserirFinal(int valor) {
        No novoNo = new No();
        novoNo.setDado(valor);
        novoNo.setProximo(null);

        if (head == null){
            head = novoNo;
        } else {
            No aux = head;

            while (aux.getProximo() != null){
                aux = aux.getProximo();
            }
            aux.setProximo(novoNo);
        }

    }

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

    public void inserirPosicao(int dado, int posicao) {
        No novo = new No();
        novo.setDado(dado);

        if (posicao == 0) {
            novo.setProximo(head);
            head = novo;
            return;
        }

        No atual = head;
        int contador = 0;

        while (atual != null && contador < posicao - 1) {
            atual = atual.getProximo();
            contador++;
        }

        if (atual == null) {
            System.out.println("Posição inválida");
            return;
        }

        novo.setProximo(atual.getProximo());
        atual.setProximo(novo);
    }

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

    public void removerPrimeiro() {
        if (head == null) {
            System.out.println("Lista vazia.");
            return;
        }

        head = head.getProximo();
    }

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
        if(head == null){
            System.out.println("Lista vazia");
            return;
        }
        if(head.getDado() == dado){
            head = head.getProximo();
            return;
        }

        No atual = head;
        while(atual.getProximo() != null && atual.getProximo().getDado() != dado){
            atual = atual.getProximo();
        }

        if(atual.getProximo() == null){
            System.out.println("Valor não encontrado");
            return;
        }

        atual.setProximo(atual.getProximo().getProximo());
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
