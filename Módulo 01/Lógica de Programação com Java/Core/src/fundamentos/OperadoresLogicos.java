package fundamentos;
public class OperadoresLogicos {
    public static void main(String[] args) {
        int senha = 3208;
        int informacao = 8963;

        System.out.println(senha == informacao && senha < 9632);
        System.out.println(senha == informacao || senha < 9632);
        System.out.println(!true);
    }
}
