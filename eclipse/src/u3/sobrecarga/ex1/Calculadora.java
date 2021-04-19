package u3.sobrecarga.ex1;

public class Calculadora {

    public int somar(int a, int b) {
        return a + b;
    }
    
    public int somar(int [] v) {
        int r = 0;
        
        for (int i = 0; i < v.length; i++) {
            r = r + v[i];
        }
        
        return r;
    }
}
