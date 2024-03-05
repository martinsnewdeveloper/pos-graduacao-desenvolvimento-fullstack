package fundamentos;
public class EstruturaDeRepeticaoFor {
    public static void main(String[] args) {
        String[] cidades = {
            "Sapiranga","Campo Bom","Novo Hamburgo",
            "Canoas","Viamão","Porto Alegre"
        };

        for(int contador = 0;contador < cidades.length;contador++){
            System.out.println(cidades[contador]);
        }
    }
}
