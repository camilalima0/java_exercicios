package aula3.exercicios;

public class Triangulo {
    
    private double lado1, lado2, lado3;
    
    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    public boolean ehTriangulo() {
        return lado1 != 0 && lado2 != 0 && lado3 != 0
                && lado1 < lado2 + lado3
                && lado2 < lado1 + lado3
                && lado3 < lado1 + lado2;
    }
    
    public boolean ehEquilatero() {
        return ehTriangulo() && lado1 == lado2 && lado2 == lado3;
    }
    
    public boolean ehIsosceles() {
        return ehTriangulo() && (lado1 == lado2 || lado2 == lado3 || lado1 == lado3);
    }
    
    public boolean ehEscaleno() {
        return ehTriangulo() && !ehEquilatero() && !ehIsosceles();
    }
    
    public boolean ehRetangulo() {
        return ehTriangulo() && !ehEquilatero()
                && (lado1 == Math.hypot(lado2, lado3)
                || lado2 == Math.hypot(lado1, lado3)
                || lado3 == Math.hypot(lado1, lado2));
    }
    
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
    
    public double calcularArea() {
        double p = calcularPerimetro() / 2;
        return Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));
    }
    
}
