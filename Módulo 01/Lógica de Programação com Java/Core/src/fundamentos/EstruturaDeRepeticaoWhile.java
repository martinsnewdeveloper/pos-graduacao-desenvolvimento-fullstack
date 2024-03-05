package fundamentos;
public class EstruturaDeRepeticaoWhile {
    public static void main(String[] args) {
        String[] cidades = {
            "Sapiranga","Campo Bom","Novo Hamburgo",
            "Canoas","Viamão","Porto Alegre"
        };

        int contador = 0;

        while (contador < cidades.length) {
            System.out.println(cidades[contador]);
            contador++;
        }
    }
}
