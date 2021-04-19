package u3.generics;

public class ContaBancaria {

    private String numero;

    /**
     * @param numero
     */
    public ContaBancaria(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "ContaBancaria [numero=" + numero + "]";
    }
    
    public String getNumero() {
        return numero;
    }
}
