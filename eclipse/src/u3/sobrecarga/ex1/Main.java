package u3.sobrecarga.ex1;

public class Main {

    public static void main(String[] args) {
        var calc = new Calculadora();
        
        int r = calc.somar(2, 3);
        System.out.println(" 2 + 3 = " + r);
        
        int []v = {5, 6, 7, 3, 2, 1};
        
        r = calc.somar(v);
        System.out.println("soma vetor = " + r);
        
        System.out.println("\n\n");
        var cao = new Cao();
        cao.latir();
        System.out.println("\n\n");
        
        cao.latir(5);
    }

}
