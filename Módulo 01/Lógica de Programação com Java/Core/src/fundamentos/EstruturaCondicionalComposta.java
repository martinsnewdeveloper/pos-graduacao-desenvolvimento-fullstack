package fundamentos;
import java.util.Scanner;

public class EstruturaCondicionalComposta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe seu salário:R$");
        double salario = entrada.nextDouble();

        if(salario < 1000){
            System.out.println("Desconto: 5%");
        }else if(salario > 1000 && salario < 3000){
            System.out.println("Desconto: 10%");
        }else{
            System.out.println("Desconto: 15%");
        }
        entrada.close();
    }
}
