package fundamentos;
import java.util.Scanner;

public class EstruturaCondicionalAninhada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a nota final: ");
        double nota = entrada.nextDouble();

        if(nota > 7){
            System.out.println("Aprovado");
        }else{
            if(nota > 3 && nota < 7){
                System.out.println("Recuperação");
            }
            else{
                System.out.println("Reprovado");
            }
        }

        entrada.close();
    }
}
