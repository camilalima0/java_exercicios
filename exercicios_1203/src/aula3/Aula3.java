package aula3;

import java.util.Date;
import java.util.Scanner;

public class Aula3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa p = new Pessoa("Jao");
        Pessoa p2 = new Pessoa("Maria");
        String nome = "Ze";
        p.setNome(nome);
        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();
        p.setAltura(altura);
        p.setDataDeNascimento(new Date());
        String n = p.getNome();
        System.out.println(n);
        System.out.println(p);
        System.out.println(p2);
        System.out.println(p.apresentar());
        
    }

}
