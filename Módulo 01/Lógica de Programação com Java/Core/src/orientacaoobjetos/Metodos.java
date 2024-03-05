package orientacaoobjetos;

class Calculadora {
    // Método para somar dois números inteiros
    public int somar(int a, int b) {
        return a + b;
    }

    // Método para subtrair dois números inteiros
    public int subtrair(int a, int b) {
        return a - b;
    }

    // Método para multiplicar dois números inteiros
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Método para dividir dois números inteiros
    // Retorna 0 se houver uma tentativa de divisão por zero
    public double dividir(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Erro: Divisão por zero.");
            return 0;
        }
    }
}

public class Metodos {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // Realizando algumas operações matemáticas
        System.out.println("Soma: " + calculadora.somar(5, 3));
        System.out.println("Subtração: " + calculadora.subtrair(5, 3));
        System.out.println("Multiplicação: " + calculadora.multiplicar(5, 3));
        System.out.println("Divisão: " + calculadora.dividir(5, 3));
        System.out.println("Divisão por zero: " + calculadora.dividir(5, 0));
    }
}
