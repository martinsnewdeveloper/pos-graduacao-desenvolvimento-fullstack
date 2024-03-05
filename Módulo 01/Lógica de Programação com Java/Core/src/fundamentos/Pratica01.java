package fundamentos;
import java.util.Scanner;
import java.util.Random;

public class Pratica01 {
    public static void main(String[] args) {
        Random gerador = new Random();
        int numero = gerador.nextInt(100);

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int chute = entrada.nextInt();


        if(chute == numero){
            System.out.printf("Parabéns - número gerador:%d", numero);
        }else{
            System.out.printf("Você errou - - número gerador:%d",numero);
        }

        entrada.close();
    }
}
