package exemplo1;

public class Questao7 {
    public static int contaMaiores(int[][] m, int x) {
        int contador = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] > x)
                contador++;
            }
        }
        return contador;
    }

    public static void imprimeMatriz(int m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public static int[][] geraMatriz() {
        int[][] matriz = new int[3][3];

        // Preenchendo a matriz de forma não simétrica
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Atribuindo valores aleatórios entre 0 e 9 (diferentes entre A[i][j] e A[j][i])
                matriz[i][j] = (int) (Math.random() * 10);  // Números aleatórios entre 0 e 9
            }
        }
        return matriz;
    }

    public static void main(String[] args){
        
        int x = 5;
        int[][] matriz = geraMatriz();
        imprimeMatriz(matriz);
 
        System.out.println("Numero de elementos maiores que " + x + ":" + contaMaiores(matriz, x));

    }
}