package colecoes;

import java.util.*;

// Classe Produto
class Produto {
    private String nome;
    private double preco;

    // Construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Método para obter o nome do produto
    public String getNome() {
        return nome;
    }

    // Método para obter o preço do produto
    public double getPreco() {
        return preco;
    }
}

// Comparador personalizado para comparar produtos com base no preço
class ComparadorPreco implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}

// Classe principal para teste
public class IteratorComparator {
    public static void main(String[] args) {
        // Criando uma lista de produtos
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Laptop", 1200.00));
        produtos.add(new Produto("Smartphone", 800.00));
        produtos.add(new Produto("Tablet", 500.00));

        // Ordenando a lista de produtos usando o comparador personalizado
        Collections.sort(produtos, new ComparadorPreco());

        // Iterando sobre os produtos ordenados e imprimindo seus nomes e preços
        Iterator<Produto> iterator = produtos.iterator();
        while (iterator.hasNext()) {
            Produto produto = iterator.next();
            System.out.println("Nome: " + produto.getNome() + ", Preço: " + produto.getPreco());
        }
    }
}
