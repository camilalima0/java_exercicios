/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo1;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class Questao2 {
    
    public static int[] inverteVetor(int[] v) {
        int a[] = new int[v.length];
        for (int i = 0; i < v.length; i++) {
            a[a.length - i - 1] = v[i];
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int t = scanner.nextInt();
        int x[] = Questao1.criaVetorFibonacci(t);
        int y[] = inverteVetor(x);
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "\t");
        }
        System.out.println("");
        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i] + "\t");
        }
        System.out.println("");
    }
}
