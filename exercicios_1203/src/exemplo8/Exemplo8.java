package exemplo8;

import java.util.Scanner;

public class Exemplo8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        
        System.out.println("Digite um n�mero inteiro:");
        int n = scanner.nextInt();
        System.out.println("Digite uma palavra:");
        String palavra = scanner.next();
        scanner.reset();
        System.out.println("Digite uma frase:");
        String frase = scanner2.nextLine();
        
        
        System.out.println(n);
        System.out.println(palavra);
        System.out.println(frase);
        
    }
}
