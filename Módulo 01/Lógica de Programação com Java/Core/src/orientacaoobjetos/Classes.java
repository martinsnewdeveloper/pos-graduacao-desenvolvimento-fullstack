package orientacaoobjetos;

class Carro {
    // Atributos
    private String marca;
    private String modelo;
    private int ano;
    private double preco;

    // Construtor
    public Carro(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    // Métodos de acesso (getters) e modificação (setters)
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método para exibir informações do carro
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Preço: R$" + preco);
    }
}

public class Classes {
    public static void main(String[] args) {
        // Criando um objeto Carro
        Carro meuCarro = new Carro("Toyota", "Corolla", 2022, 150000.00);
        // Exibindo as informações do carro
        meuCarro.exibirInformacoes();
        // Modificando o preço do carro
        meuCarro.setPreco(155000.00);
        // Exibindo as informações atualizadas do carro
        meuCarro.exibirInformacoes();
    }
}
