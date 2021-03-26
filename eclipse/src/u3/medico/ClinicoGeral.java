package qui.u3.medico;

public class ClinicoGeral extends Medico {

    public ClinicoGeral(String crm) {
        super(crm);
    }
    
    @Override
    public void atender() {
        System.out.println("Clinico geral atendendo . . .");
    }
}