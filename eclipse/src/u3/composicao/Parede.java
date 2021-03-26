package u3.composicao;

public class Parede {

    private String cor;

    public Parede(String cor) {
        this.cor = cor;
    }  

    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Parede [cor=" + cor + "]";
    }        
}