package fundamentos;
import java.util.Scanner;

public class EstruturaSequencial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a base: ");
        double base = entrada.nextDouble();
        System.out.print("Informe a altura: ");
        double altura = entrada.nextDouble();

        double area = base * altura / 2;
        System.out.printf("Área: %.2f",area);
        entrada.close();
    }
}
