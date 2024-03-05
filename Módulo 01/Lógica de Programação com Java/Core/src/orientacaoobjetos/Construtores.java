package orientacaoobjetos;

class Produto {
    // Atributos
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    // Construtor padrão
    public Produto() {
        nome = "Produto";
        preco = 0.0;
        quantidadeEstoque = 0;
    }

    // Construtor sobrecarregado
    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Métodos de acesso (getters) e modificação (setters)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Método para exibir informações do produto
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
    }
}

public class Construtores {
    public static void main(String[] args) {
        // Criando um produto usando o construtor padrão
        Produto produtoPadrao = new Produto();
        System.out.println("Produto Padrão:");
        produtoPadrao.exibirInformacoes();
        System.out.println();

        // Criando um produto usando o construtor sobrecarregado
        Produto produtoSobrecarregado = new Produto("Camiseta", 29.99, 100);
        System.out.println("Produto Sobrecarregado:");
        produtoSobrecarregado.exibirInformacoes();
    }
}
