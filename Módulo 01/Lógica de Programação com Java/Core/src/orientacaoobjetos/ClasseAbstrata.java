package orientacaoobjetos;

abstract class Usuario {
    protected String nome;
    protected String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // Método abstrato para cadastro
    public abstract void cadastrar();

    // Método concreto para exibir informações do usuário
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
    }
}

class Cliente extends Usuario {
    private String endereco;

    public Cliente(String nome, String email, String endereco) {
        super(nome, email);
        this.endereco = endereco;
    }

    @Override
    public void cadastrar() {
        System.out.println("Cadastro de cliente realizado com sucesso!");
        System.out.println("Endereço: " + endereco);
    }
}

class Administrador extends Usuario {
    private String cargo;

    public Administrador(String nome, String email, String cargo) {
        super(nome, email);
        this.cargo = cargo;
    }

    @Override
    public void cadastrar() {
        System.out.println("Cadastro de administrador realizado com sucesso!");
        System.out.println("Cargo: " + cargo);
    }
}

public class ClasseAbstrata {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", "joao@example.com", "Rua A, 123");
        Administrador admin = new Administrador("Maria", "maria@example.com", "Gerente de TI");
        cliente.exibirInfo();
        cliente.cadastrar();
        System.out.println();
        admin.exibirInfo();
        admin.cadastrar();
    }
}
