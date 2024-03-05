package fundamentos;
public class Pratica03 {
    public static void main(String[] args) {
        int[][] matriz = {{9,8,7},{5,3,2},{6,6,7}};
        int[] maiorLinha = new int[3];
        int[] menorColuna = new int[3];

         for (int i = 0; i < maiorLinha.length; i++) {
            maiorLinha[0] = 0;
         }
         for (int i = 0; i < menorColuna.length; i++) {
            menorColuna[0] = 10;
         }

         for (int i = 0; i < matriz.length; i++) {
            if(matriz[0][i] > maiorLinha[0]){
                maiorLinha[0] = matriz[0][i];
            }
         }
         for (int i = 0; i < matriz.length; i++) {
            if(matriz[1][i] > maiorLinha[1]){
                maiorLinha[1] = matriz[1][i];
            }
         }
         for (int i = 0; i < matriz.length; i++) {
            if(matriz[2][i] > maiorLinha[2]){
                maiorLinha[2] = matriz[2][i];
            }
         }

         for (int i = 0; i < matriz.length; i++) {
            if(matriz[i][0] > menorColuna[0]){
                menorColuna[0] = matriz[i][0];
            }
         }
         for (int i = 0; i < matriz.length; i++) {
            if(matriz[i][1] > menorColuna[1]){
                menorColuna[1] = matriz[i][1];
            }
         }
         for (int i = 0; i < matriz.length; i++) {
            if(matriz[i][2] > menorColuna[2]){
                menorColuna[2] = matriz[i][2];
            }
         }

         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(maiorLinha[i] == menorColuna[j]){
                    System.out.println("Ponto de sela: "+maiorLinha[i]);
                }
            }
         }
    }
}
