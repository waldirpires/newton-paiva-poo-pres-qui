package u3.sobrecarga.ex1;

public class Cao {
    
    public void latir() {
        System.out.println("AUAUAUAU");
    }
    
    public void latir(int n) {
        for (int i = 0; i < n; i++) {
            latir();
        }
    }

}
