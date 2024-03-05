package fundamentos;
import java.util.ArrayList;

public class Pratica04 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();

        nomes.add("Maria");
        nomes.add("Ana");
        nomes.add("Cecília");
        nomes.add("Luisa");
        nomes.add("Eduarda");

        System.out.println(nomes);

        nomes.add(nomes.indexOf("Maria"),"Sandra");

        System.out.println(nomes);
    }
}
