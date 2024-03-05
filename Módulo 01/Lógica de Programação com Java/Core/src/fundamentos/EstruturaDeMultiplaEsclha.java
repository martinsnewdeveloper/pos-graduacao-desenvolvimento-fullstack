package fundamentos;
import java.util.Scanner;

public class EstruturaDeMultiplaEsclha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Selecione uma opção de [1-3]: ");
        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Cadastrar");
                break;
            case 2:
                System.out.println("Atualizar");
                break;
            case 3:
                System.out.println("Deletar");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        entrada.close();
    }
}
