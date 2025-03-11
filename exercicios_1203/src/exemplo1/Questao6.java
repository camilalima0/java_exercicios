package exemplo1;

public class Questao6 {
    public static boolean ehSimetrica(int m[][]) {
        if (m.length == m[0].length) {
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[0].length; j++) {
                    if (m[i][j] != m[j][i]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void imprimeMatriz(int m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public static void trueOrFalse(boolean value){
        if (value == true){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }

    public static void main(String[] args) {
        int[][] m = new int[3][3];

        // Preenchendo a m de forma simétrica
        for (int i = 0; i < 3; i++) {
            for (int j = i; j < 3; j++) {
                // Atribuindo valores simétricos para a m
                int valor = (int) (Math.random() * 10);  // Números aleatórios entre 0 e 9
                m[i][j] = valor;
                m[j][i] = valor;  // Garantindo a simetria
            }
        }
        imprimeMatriz(m);
        trueOrFalse(ehSimetrica(m));

        int[][] n = new int[3][3];

        // Preenchendo a matriz de forma não simétrica
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Atribuindo valores aleatórios entre 0 e 9 (diferentes entre A[i][j] e A[j][i])
                n[i][j] = (int) (Math.random() * 10);  // Números aleatórios entre 0 e 9
            }
        }

        imprimeMatriz(n);
        trueOrFalse(ehSimetrica(n));

    }
}