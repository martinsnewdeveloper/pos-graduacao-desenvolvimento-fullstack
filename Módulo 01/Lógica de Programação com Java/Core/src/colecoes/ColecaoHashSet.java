package colecoes;

import java.util.HashSet;
import java.util.Iterator;

public class ColecaoHashSet {
    public static void main(String[] args) {
        // Criando um HashSet de String
        HashSet<String> conjunto = new HashSet<>();

        // Adicionando elementos ao conjunto
        conjunto.add("Maçã");
        conjunto.add("Banana");
        conjunto.add("Pera");

        // Tentando adicionar um elemento que já existe no conjunto
        boolean adicionou = conjunto.add("Banana");
        System.out.println("Adicionou Banana novamente? " + adicionou); // Deve imprimir false, pois "Banana" já existe no conjunto

        // Removendo um elemento do conjunto
        conjunto.remove("Maçã");

        // Iterando sobre os elementos do conjunto e imprimindo-os
        Iterator<String> iterator = conjunto.iterator();
        while (iterator.hasNext()) {
            String elemento = iterator.next();
            System.out.println(elemento);
        }

        // Obtendo e imprimindo o tamanho do conjunto
        System.out.println("Tamanho do conjunto: " + conjunto.size());

        // Verificando se o conjunto contém um elemento específico
        if (conjunto.contains("Banana")) {
            System.out.println("O conjunto contém Banana.");
        } else {
            System.out.println("O conjunto não contém Banana.");
        }

        // Removendo todos os elementos do conjunto
        conjunto.clear();

        // Verificando se o conjunto está vazio
        if (conjunto.isEmpty()) {
            System.out.println("O conjunto está vazio.");
        } else {
            System.out.println("O conjunto não está vazio.");
        }
    }
}
