package aula3;

import java.io.File;

public class Exemplo1 {
    
    private int numero;
    
    public void adicionarNumero(int n) {
        numero += n;
    }
    
    public static void main(String[] args) {
        Exemplo1 e = new Exemplo1();
        //Exemplo1.numero = 10;
        e.adicionarNumero(1);
        
        System.out.println(File.separator);
        System.out.println(Math.PI);
        
        System.out.println(Math.sqrt(25));
    }
}
