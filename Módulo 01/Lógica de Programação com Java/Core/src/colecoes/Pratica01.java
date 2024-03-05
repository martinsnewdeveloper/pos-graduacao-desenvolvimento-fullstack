package colecoes;

import java.util.ArrayList;

public class Pratica01 {
    public static void main(String[] args) {
        ArrayList<String> linguagens = new ArrayList<>();

        linguagens.add("Javascript");
        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("Golang");
        linguagens.add("Ruby");

        System.out.println("Linguagens: "+linguagens);

        String[] lista = new String[linguagens.size()];
        linguagens.toArray(lista);
        for (String item : lista) {
            System.out.println("Linguagem: "+item);
        }
    }
}
