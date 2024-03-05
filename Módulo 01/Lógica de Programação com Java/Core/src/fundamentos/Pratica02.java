package fundamentos;
public class Pratica02 {
    public static void main(String[] args) {
        int[] passarosPorDia = {2,6,3,8,9,4,6,0,2,3,5,7,6,8};
        int totalPassaros = 0;
        int totalPassarosPrimeiraSemana = 0;
        int totalPassarosSegundaSemana = 0;

        for (int i = 0; i < passarosPorDia.length; i++) {
            totalPassaros = totalPassaros +  passarosPorDia[i];
        }
        for (int i = 0; i < 7; i++) {
            totalPassarosPrimeiraSemana = totalPassarosPrimeiraSemana +  passarosPorDia[i];
        }
        for (int i = 7; i < 14; i++) {
            totalPassarosSegundaSemana = totalPassarosSegundaSemana +  passarosPorDia[i];
        }

        System.out.println("Total passaros: "+totalPassaros);
        System.out.println("Total passaros primeira semana: "+totalPassarosPrimeiraSemana);
        System.out.println("Total passaros segunda semana: "+totalPassarosSegundaSemana);
    }
}
