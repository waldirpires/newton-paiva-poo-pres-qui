package u3.sobrecarga.ex1;

public class Main2 {

    public static void main(String[] args) {
        var calc = new Calculadora2();
        
        System.out.println("2 + 3 = " + calc.somar(2, 3));

        System.out.println("2 + 3 + 4 = " + calc.somar(2, 3, 4));

        System.out.println("2 + 3 + 4 + 5 = " + 
                calc.somar(2, 3, 4, 5));
    }
}
