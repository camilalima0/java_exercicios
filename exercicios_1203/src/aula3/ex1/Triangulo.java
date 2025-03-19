package aula3.ex1;

import java.util.Scanner;


public class Triangulo {
    public double lado1;
    public double lado2;
    public double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    boolean ehTriangulo() {
        return (lado1 > 0 && lado2 > 0 && lado3 > 0) &&
                (lado1 + lado2 > lado3) &&
                (lado1 + lado3 > lado2) &&
                (lado2 + lado3 > lado1);
    }

    boolean ehEquilatero() {
        return (lado1 == lado2 && lado2 == lado3);
    }

    boolean ehIsosceles() {
        return (lado1 == lado2 || lado2 == lado3 || lado1 == lado3);
    }

    boolean ehEscaleno() {
        return (!ehEquilatero() && !ehIsosceles());
    }

    boolean ehRetangulo() {
        return (ehEquilatero() == false) &&
                (Math.pow(lado1, 2) == Math.pow(lado2, 2) + Math.pow(lado3, 2) ||
                Math.pow(lado2, 2) == Math.pow(lado2, 2) + Math.pow(lado1, 2) ||
                Math.pow(lado3, 2) == Math.pow(lado2, 2) + Math.pow(lado1, 2));

    }

    double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    double calcularArea() {
        double p = calcularPerimetro()/2;
        double a = Math.sqrt(p*(p-lado1)*(p-lado2)*(p-lado3));
        return a;
    }

    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print ("Digite os lados do triângulo: ");
        double lado1 = scanner.nextDouble();
        double lado2 = scanner.nextDouble();
        double lado3 = scanner.nextDouble();

        Triangulo t = new Triangulo(lado1, lado2, lado3);

        if (t.ehTriangulo()) {
            System.out.println ("É um triângulo.");

            if (t.ehEquilatero() == true) {
                System.out.println ("É um triângulo equilátero.");
            }
            else {
                System.out.println ("Não é um triângulo equilátero.");
            }
    
            if (t.ehIsosceles() == true) {
                System.out.println ("É um triângulo isósceles.");
            }
            else {
                System.out.println ("Não é um triângulo isósceles.");
            }
    
            if (t.ehEscaleno() == true) {
                System.out.println ("É um triângulo escaleno.");
            }
            else {
                System.out.println ("Não é um triângulo escaleno.");
            }
    
            if (t.ehRetangulo() == true) {
                System.out.println ("É um triângulo retângulo.");
            }
            else {
                System.out.println ("Não é um triângulo retângulo.");
            }
    
            System.out.println ("Perímetro do triângulo: " + t.calcularPerimetro());

            System.out.println ("Área do triângulo: " + t.calcularArea());

        }
        else {
            System.out.println ("Não é um triângulo.");
        }

        scanner.close();
    }
}

    
