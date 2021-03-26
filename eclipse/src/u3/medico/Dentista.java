package qui.u3.medico;

public class Dentista {

    private String cro;// ortodontia
    
    public Dentista(String cro) {
        this.cro = cro;
    }
    
    public void atender() {
        System.out.println("atender de dentista");
    }
    
    public void vestir() {
        System.out.println("roupa branca - jaleco");
    }
}