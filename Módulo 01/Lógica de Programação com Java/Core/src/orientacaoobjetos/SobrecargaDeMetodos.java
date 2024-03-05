package orientacaoobjetos;

public class SobrecargaDeMetodos {

    // Método para somar dois inteiros
    public int somar(int a, int b) {
        return a + b;
    }

    // Método sobrecarregado para somar dois números decimais (double)
    public double somar(double a, double b) {
        return a + b;
    }

    // Método sobrecarregado para somar três inteiros
    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    // Método sobrecarregado para somar um array de inteiros
    public int somar(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        return soma;
    }

    public static void main(String[] args) {
        SobrecargaDeMetodos calc = new SobrecargaDeMetodos();

        // Chamando o método somar para dois inteiros
        System.out.println("Soma de inteiros: " + calc.somar(5, 10));

        // Chamando o método somar para dois números decimais (double)
        System.out.println("Soma de decimais: " + calc.somar(3.5, 2.7));

        // Chamando o método somar para três inteiros
        System.out.println("Soma de três inteiros: " + calc.somar(2, 4, 6));

        // Chamando o método somar para um array de inteiros
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("Soma do array de inteiros: " + calc.somar(numeros));
    }
}
