package qui.u3.medico;

public class Medico {
    private String crm;
    
    /**
     * @param crm
     */
    public Medico(String crm) {
        this.crm = crm;
    }

    public void atender() {
        System.out.println("Médico Atendendo");
    }

    public String getCrm() {
        return crm;
    }
    
    public final void vestir( ) {
        System.out.println("roupa branca - jaleco");
    }
    
    public void tirarFerias() {
        System.out.println("Eba, férias!!!!");
    }
}
