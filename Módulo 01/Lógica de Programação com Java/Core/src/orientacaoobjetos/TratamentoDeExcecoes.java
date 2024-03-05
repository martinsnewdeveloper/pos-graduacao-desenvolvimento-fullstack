package orientacaoobjetos;

public class TratamentoDeExcecoes {

    public static void main(String[] args) {
        try {
            // Código que pode gerar uma exceção
            int resultado = dividir(10, 0);
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            // Tratamento da exceção específica (divisão por zero)
            System.out.println("Erro: Divisão por zero!");
        } finally {
            // Código que será executado sempre, independente de haver exceção ou não
            System.out.println("Fim do programa");
        }
    }

    public static int dividir(int numerador, int denominador) {
        return numerador / denominador;
    }
}
