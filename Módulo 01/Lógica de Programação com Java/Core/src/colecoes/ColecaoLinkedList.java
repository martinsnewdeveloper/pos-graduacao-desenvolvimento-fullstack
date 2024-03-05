package colecoes;

import java.util.LinkedList;

public class ColecaoLinkedList {
    public static void main(String[] args) {
        // Criando uma LinkedList de String
        LinkedList<String> lista = new LinkedList<>();

        // Adicionando elementos à lista
        lista.add("Maçã");
        lista.add("Banana");
        lista.add("Pera");

        // Adicionando um elemento na primeira posição da lista
        lista.addFirst("Uva");

        // Adicionando um elemento na última posição da lista
        lista.addLast("Abacaxi");

        // Removendo o primeiro elemento da lista
        lista.removeFirst();

        // Removendo o último elemento da lista
        lista.removeLast();

        // Iterando sobre os elementos da lista e imprimindo-os
        for (String fruta : lista) {
            System.out.println(fruta);
        }

        // Obtendo e imprimindo o tamanho da lista
        System.out.println("Tamanho da lista: " + lista.size());

        // Verificando se a lista contém um elemento específico
        if (lista.contains("Banana")) {
            System.out.println("A lista contém a Banana.");
        } else {
            System.out.println("A lista não contém a Banana.");
        }

        // Obtendo e imprimindo o primeiro e último elemento da lista
        System.out.println("Primeiro elemento: " + lista.getFirst());
        System.out.println("Último elemento: " + lista.getLast());

        // Removendo todos os elementos da lista
        lista.clear();

        // Verificando se a lista está vazia
        if (lista.isEmpty()) {
            System.out.println("A lista está vazia.");
        } else {
            System.out.println("A lista não está vazia.");
        }
    }
}
