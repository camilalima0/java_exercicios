/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo1;

/**
 *
 * @author marti
 */
public class Questao5 {
    public static int[][] criaMatriz(int min, int max, int l, int c) {
        int m[][] = new int[l][c];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = (int)(Math.random()*(max - min + 1)) + min;
            }
        }
        return m;
    }
    
    public static void imprimeMatriz(int m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
    
    public static void main(String[] args) {
        int min = 29;
        int max = 378;
        int l = 5;
        int c = 6;
        int melancia[][] = criaMatriz(min, max, l, c);
        imprimeMatriz(melancia);
    }
    
}
