package orientacaoobjetos;

interface Cadastro {
    void cadastrar();
}

class Cliente implements Cadastro {
    private String nome;
    private String email;
    private String endereco;

    public Cliente(String nome, String email, String endereco) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }

    @Override
    public void cadastrar() {
        System.out.println("Cadastro de cliente realizado com sucesso!");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Endereço: " + endereco);
    }
}

class Administrador implements Cadastro {
    private String nome;
    private String email;
    private String cargo;

    public Administrador(String nome, String email, String cargo) {
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
    }

    @Override
    public void cadastrar() {
        System.out.println("Cadastro de administrador realizado com sucesso!");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Cargo: " + cargo);
    }
}

public class Interface {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", "joao@example.com", "Rua A, 123");
        Administrador admin = new Administrador("Maria", "maria@example.com", "Gerente de TI");

        cliente.cadastrar();
        System.out.println();
        admin.cadastrar();
    }
}
