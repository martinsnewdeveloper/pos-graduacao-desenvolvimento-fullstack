package colecoes;

import java.util.TreeSet;
import java.util.Iterator;

public class ColecaoTreeSet {
    public static void main(String[] args) {
        // Criando um TreeSet de Integer
        TreeSet<Integer> conjunto = new TreeSet<>();

        // Adicionando elementos ao conjunto
        conjunto.add(10);
        conjunto.add(5);
        conjunto.add(8);
        conjunto.add(12);

        // Tentando adicionar um elemento que já existe no conjunto
        boolean adicionou = conjunto.add(8);
        System.out.println("Adicionou 8 novamente? " + adicionou); // Deve imprimir false, pois 8 já existe no conjunto

        // Removendo um elemento do conjunto
        conjunto.remove(5);

        // Iterando sobre os elementos do conjunto e imprimindo-os
        Iterator<Integer> iterator = conjunto.iterator();
        while (iterator.hasNext()) {
            int elemento = iterator.next();
            System.out.println(elemento);
        }

        // Obtendo e imprimindo o tamanho do conjunto
        System.out.println("Tamanho do conjunto: " + conjunto.size());

        // Verificando se o conjunto contém um elemento específico
        if (conjunto.contains(12)) {
            System.out.println("O conjunto contém 12.");
        } else {
            System.out.println("O conjunto não contém 12.");
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

