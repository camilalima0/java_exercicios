/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo1;

/**
 *
 * @author marti
 */
public class Questao4 {
    public static int[] criaVetor(int min, int max, int n) {
        int v[] = new int[n];
        for (int i = 0; i < v.length; i++) {
            v[i] = (int)(Math.random()*(max - min + 1)) + min;            
        }
        return v;
    }
    
    public static void main(String[] args) {
        int min = 29;
        int max = 378;
        int n = 15;
        int banana[] = criaVetor(min, max, n);
        Questao1.imprimeVetor(banana);
    }
    
}
