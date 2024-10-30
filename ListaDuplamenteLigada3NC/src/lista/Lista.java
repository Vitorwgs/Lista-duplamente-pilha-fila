package lista;

/*
 *  Professor Gerson Risso
 */

public class Lista {

    private No inicio, aux, atual;
    private int contador;

    private boolean empty() {
        return inicio == null;
    }

    public void enqueue (int n) {
        if (empty()) {
            inicio = new No(null, null, n);
            aux = inicio;
        } else {
            atual = new No(null, aux, n);
            aux.setProx(atual);
            aux = atual;
        }
        contador++;
    }
    
    public int front(){
        return inicio.getN();
    }
    
    public int size2(){
        return contador;
    }
    
    public int dequeue() {
        if (empty()) {
            throw new IllegalStateException("Fila vazia");
        }
        int valor = (int) inicio.getN(); // Recupera o valor do in�cio
        inicio = inicio.getProx(); // Move o in�cio para o pr�ximo n�
        if (inicio != null) {
            inicio.setAnt(null); // Remove a refer�ncia ao anterior
        } else {
            atual = null; // Fila ficou vazia
        }
        return valor; // Retorna o valor removido
    }
    
    // public int size(){
    //  No ref=inicio; //percorre do inicio
    //  int cont=0;
    //  while(ref!=null){// ao final
      //    cont++;
      //    ref=ref.getProx();// vai retorna 3
     // }
     // return cont;
    //}
     
    public void enfileirar(int n) {
        No novoNo = new No(null, null, n);
        if (empty()) {
            inicio = novoNo;
            atual = novoNo;
        } else {
            atual.setProx(novoNo); // O pr�ximo do atual agora � o novo n�
            novoNo.setAnt(atual);  // O anterior do novo n� � o atual
            atual = novoNo;        // Atualiza o atual para o novo n�
        }
    }
      public Object desenfileirar() {
        if (empty()) {
            throw new IllegalStateException("Fila vazia");
        }
        Object objeto = inicio.getN();
        inicio = inicio.getProx();
        if (inicio != null) {
            inicio.setAnt(null); // Remove a refer�ncia anterior
        } else {
            atual = null; // Fila ficou vazia
        }
        return objeto;
    }
    
    //Exibe do fim para o inicio
    public void exibir(){
      No ref=inicio;
      while(ref!=null){
          System.out.println(ref.getN());
          ref=ref.getProx();
      }
    }
}

 