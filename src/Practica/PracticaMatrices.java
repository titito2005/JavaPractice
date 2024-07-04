package Practica;

public class PracticaMatrices {
    public int[][] calcularSumaMatrices(int[][] m1, int[][] m2){
        int[][] sumaMatriz = new int[m1.length][m1[0].length];

        for (int i = 0; i< m1.length; i++){
            for(int j = 0; j < m1[0].length; j++){
                sumaMatriz[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return sumaMatriz;
    }
}
