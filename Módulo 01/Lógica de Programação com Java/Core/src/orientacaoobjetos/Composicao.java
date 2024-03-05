package orientacaoobjetos;

// Classe Cômodo
class Comodo {
    private String tipo;

    // Construtor
    public Comodo(String tipo) {
        this.tipo = tipo;
    }

    // Método para obter o tipo de cômodo
    public String getTipo() {
        return tipo;
    }
}

// Classe Casa
class Casa {
    private Comodo sala;
    private Comodo cozinha;
    private Comodo quarto;

    // Construtor
    public Casa() {
        this.sala = new Comodo("Sala");
        this.cozinha = new Comodo("Cozinha");
        this.quarto = new Comodo("Quarto");
    }

    // Método para obter informações sobre os cômodos da casa
    public void mostrarComodos() {
        System.out.println("Cômodos da Casa:");
        System.out.println("Sala: " + sala.getTipo());
        System.out.println("Cozinha: " + cozinha.getTipo());
        System.out.println("Quarto: " + quarto.getTipo());
    }
}

// Classe principal para teste de composição
public class Composicao {
    public static void main(String[] args) {
        // Criando uma instância da Casa
        Casa minhaCasa = new Casa();

        // Mostrando os cômodos da casa
        minhaCasa.mostrarComodos();
    }
}
