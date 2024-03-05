package fundamentos;
import java.util.Scanner;

public class EntradaSaidaDeDados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe uma linguagem? ");
        String linguagem = entrada.next();
        System.out.printf("Linguagem: %s",linguagem);
        entrada.close();
    }
}
