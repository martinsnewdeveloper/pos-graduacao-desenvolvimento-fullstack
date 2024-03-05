package fundamentos;
public class EstruturaDeRepeticaoDoWhile {
    public static void main(String[] args) {
        String[] cidades = {
            "Sapiranga","Campo Bom","Novo Hamburgo",
            "Canoas","Viamão","Porto Alegre"
        };

        int contador = 0;

        do {
            System.out.println(cidades[contador]);
            contador++;
        } while (contador < cidades.length);
    }
}
