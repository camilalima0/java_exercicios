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
public class Questao1 {

    public static int[] criaVetorFibonacci(int n) { 
        int v[] = new int[n]; 
        v[0] = 0;
        v[1] = 1;
        for (int i = 2; i < n; i++) { 
            v[i] = v[i - 1] + v[i - 2];
        }
        return v;
    }
    
    public static void imprimeVetor(int x[]) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "\t");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o tamanho do vetor: ");
            int t = scanner.nextInt();
            int x[] = criaVetorFibonacci(t);
            imprimeVetor(x);
        } finally {
            scanner.close();
        }
        
    }
}
