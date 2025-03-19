package exemplo1;

public class MeuExemplo {
    
    static int x = 20;
    
    
    public static void alterarValor(int batata) {
        batata++;
        x++;
    }
    
    public static void main(String[] args) {
        int n = 100;
        int a;
        double d = 10/3.0;
        int x = (int) d;
        System.out.println(x);
        System.out.println(d);
        alterarValor(n);
        a = n + 10;
        System.out.println(n);
        System.out.println(x);
        System.out.println(a);
//        for (int i = 0; i < n; i++) {
//            System.out.println("i = " + i);
//        }
        System.out.println("Meu exemplo");
    }
}
