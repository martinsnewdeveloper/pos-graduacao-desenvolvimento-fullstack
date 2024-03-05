package orientacaoobjetos;

class ContaBancaria {
    // Atributos privados
    private String titular;
    private double saldo;

    // Construtor
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método para depositar dinheiro na conta
    public void depositar(double valor) {
        saldo += valor;
    }

    // Método para sacar dinheiro da conta
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque de R$" + valor);
        }
    }

    // Métodos getters e setters para o atributo "titular"
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Método getter para o atributo "saldo"
    public double getSaldo() {
        return saldo;
    }
}

public class Encapsulamento {
    public static void main(String[] args) {
        // Criando uma conta bancária
        ContaBancaria conta = new ContaBancaria("João", 1000.0);

        // Acessando e modificando atributos usando métodos getters e setters
        System.out.println("Titular da conta: " + conta.getTitular());
        conta.setTitular("Maria");
        System.out.println("Novo titular da conta: " + conta.getTitular());

        // Realizando operações na conta
        System.out.println("Saldo atual: R$" + conta.getSaldo());
        conta.depositar(500.0);
        System.out.println("Saldo após depósito: R$" + conta.getSaldo());
        conta.sacar(200.0);
        System.out.println("Saldo após saque: R$" + conta.getSaldo());
    }
}
