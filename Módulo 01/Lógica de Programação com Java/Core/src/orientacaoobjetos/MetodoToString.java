package orientacaoobjetos;

// Classe Pessoa
class Pessoa {
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método toString() sobrescrito para fornecer uma representação em string da Pessoa
    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade;
    }
}

// Classe principal para teste
public class MetodoToString {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 30);
        System.out.println(pessoa); // O método toString() é chamado automaticamente ao imprimir o objeto

        System.out.println("Java".length());
        System.out.println("Java".toLowerCase());
        System.out.println("Java".toUpperCase());
        System.out.println("Java".equals("Kotlin"));
    }
}
