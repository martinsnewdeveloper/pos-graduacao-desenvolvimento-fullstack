package fundamentos;
public class ArrayMultidimencional {
    public static void main(String[] args) {
        int[][] valores = new int[5][5];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                valores[i][j] = j;
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print(valores[i][j]);
            }
        }

    }
}
