package cliente; 

import lista.Lista;


/*
*  Professor Gerson Risso
 */
public class UsaLista {

    public static void main(String[] args) {
        Lista fila = new Lista();
        
        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);

        System.out.println("Fila de Itens:");
        fila.exibir(); // Exibe todos os itens na fila

        System.out.println("Primeiro elemento: " + fila.front()); // Mostra o primeiro elemento

        System.out.println("==== Desenfileirar ====");
        
        System.out.println("Tamanho da fila: " + fila.size2());
        
        int itemRemovido = fila.dequeue();
        System.out.println("Item removido: " + itemRemovido); // Exibe o item removido

        System.out.println("Fila após desenfileirar:");
        fila.exibir(); // Exibe a fila após a remoção
         
    }

}
