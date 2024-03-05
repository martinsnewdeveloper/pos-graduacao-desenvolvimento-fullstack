package orientacaoobjetos;

// Classe base (superclasse)
class Veiculo {
    // Atributos
    private String marca;
    private String modelo;

    // Construtor
    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método para obter a descrição do veículo
    public String descricao() {
        return "Marca: " + marca + ", Modelo: " + modelo;
    }
}

// Classe derivada (subclasse)
class Carro extends Veiculo {
    // Atributos adicionais
    private int ano;

    // Construtor
    public Carro(String marca, String modelo, int ano) {
        // Chamada ao construtor da superclasse
        super(marca, modelo);
        this.ano = ano;
    }

    // Método para obter a descrição do carro
    public String descricaoCarro() {
        return descricao() + ", Ano: " + ano;
    }
}

// Classe principal para testar a herança
public class Heranca {
    public static void main(String[] args) {
        // Criando um objeto Carro
        Carro meuCarro = new Carro("Toyota", "Corolla", 2022);

        // Chamando o método de descrição do carro
        System.out.println("Descrição do carro:");
        System.out.println(meuCarro.descricaoCarro());
    }
}
