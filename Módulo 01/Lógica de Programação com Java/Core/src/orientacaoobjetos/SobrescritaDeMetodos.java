package orientacaoobjetos;

// Classe Usuario
class UsuarioNovo {
    private String nome;
    private String email;

    public UsuarioNovo(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void mostrarDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
    }
}

// Subclasse UsuarioRegular
class UsuarioRegular extends UsuarioNovo {
    private String plano;

    public UsuarioRegular(String nome, String email, String plano) {
        super(nome, email);
        this.plano = plano;
    }

    // Sobrescrita do método mostrarDetalhes() para adicionar informações
    // específicas de UsuarioRegular
    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes(); // Chamada ao método da superclasse para exibir os detalhes comuns
        System.out.println("Plano: " + plano);
    }
}

// Subclasse UsuarioPremium
class UsuarioPremium extends UsuarioNovo {
    private String nivel;

    public UsuarioPremium(String nome, String email, String nivel) {
        super(nome, email);
        this.nivel = nivel;
    }

    // Sobrescrita do método mostrarDetalhes() para adicionar informações
    // específicas de UsuarioPremium
    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes(); // Chamada ao método da superclasse para exibir os detalhes comuns
        System.out.println("Nível: " + nivel);
    }
}

// Classe principal para teste
public class SobrescritaDeMetodos {
    public static void main(String[] args) {
        UsuarioRegular usuarioRegular = new UsuarioRegular("João", "joao@example.com", "Plano Regular");
        UsuarioPremium usuarioPremium = new UsuarioPremium("Maria", "maria@example.com", "Nível Premium");

        System.out.println("Detalhes do Usuário Regular:");
        usuarioRegular.mostrarDetalhes(); // Mostra os detalhes do usuário regular

        System.out.println("\nDetalhes do Usuário Premium:");
        usuarioPremium.mostrarDetalhes(); // Mostra os detalhes do usuário premium
    }
}
