package qui.u3.agregacao;

public class Pessoa {

    private Cabelo cabelo;
    
    public Pessoa() {
        System.out.println("Pessoa criada sem cabelo");
    }

    public Pessoa(Cabelo cabelo) {
        this.cabelo = cabelo;
    }

    public Cabelo getCabelo() {
        return cabelo;
    }

    public void setCabelo(Cabelo cabelo) {
        this.cabelo = cabelo;
    }

    @Override
    public String toString() {
        return "Pessoa [cabelo=" + cabelo + "]";
    }
    
    
}
