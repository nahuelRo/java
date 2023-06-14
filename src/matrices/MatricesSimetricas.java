package N_matrices;

public class MatricesSimetricas {
    public static void main(String[] args) {

        boolean simetrica = true;
        // Una matriz simetrica tiene la misma cantidad de fila que de columnas
        // Ademas la fila como la columna tienen que tener los mismos valores
        // Tambien se lo llama matriz espejo
        int[][] matriz = {
                {1,2,3,4},
                {2,1,0,5},
                {3,0,1,6},
                {4,5,6,7}
        };

        int i, j;
        i = 0;
        while(i < matriz.length && simetrica){
            j = 0;
            while(j < i && simetrica){
                if (matriz[i][j] != matriz[j][i]){
                    simetrica = false;
                }
                j++;
            }
            i++;
        }

        if (simetrica){
            System.out.println("La matriz es simetrica");
        } else {
            System.out.println("La matriz no es simetrica");
        }
    }
}
