package exemplo1;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Questao10 {
    public static double mediaMenores(double[][] m, double x) {
        double soma = 0;
        int contador = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] < x) {
                    soma += m[i][j];
                    contador++;
                }
            }
        }
        return soma/contador;
    }

    public static double[][] geraMatriz() {
        double[][] matriz = new double[3][3];

        // Preenchendo a matriz de forma não simétrica
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Atribuindo valores aleatórios entre 0 e 9 (diferentes entre A[i][j] e A[j][i])
                matriz[i][j] = BigDecimal.valueOf(Math.random() * 10).setScale(2, RoundingMode.HALF_UP).doubleValue();  // Números aleatórios entre 0 e 9
            }
        }
        return matriz;
    }

    public static void imprimeMatriz(double m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println ("Digite um valor para x: ");
            int x = scanner.nextInt();
            double [][] matriz = geraMatriz();
            imprimeMatriz(matriz);
            System.out.println ("Media dos elementos menores do que " + x + ":" + mediaMenores(matriz, x));
        } finally {
            scanner.close();
        }
    }
}