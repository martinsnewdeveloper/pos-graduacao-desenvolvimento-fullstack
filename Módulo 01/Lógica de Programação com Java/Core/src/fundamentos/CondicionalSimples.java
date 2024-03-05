package fundamentos;
import java.util.Scanner;

public class CondicionalSimples {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a nota final: ");
        double notaFinal = entrada.nextDouble();

        if(notaFinal >= 7){
            System.out.println("Aprovado!");
        }else{
            System.out.println("Reprovado!");
        }

        entrada.close();
    }
}
