package exemplo1;

public class Questao8 {
    public static int contaPares (int[][] m) {
        int pares = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] % 2 == 0) {
                    pares++;
                }
            }
        }
        return pares;
    }

    public static void main (String[] args) {
        int[][] matriz = Questao7.geraMatriz();
        Questao6.imprimeMatriz(matriz);
        System.out.println ("Numero de elementos pares: " + contaPares(matriz));
    }

}