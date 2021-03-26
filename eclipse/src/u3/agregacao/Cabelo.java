package qui.u3.agregacao;

public class Cabelo {

    private String cor;

    public Cabelo(String cor) {
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
        return "Cabelo [cor=" + cor + "]";
    }

    
}
