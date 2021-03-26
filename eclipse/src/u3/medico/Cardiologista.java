package qui.u3.medico;

public class Cardiologista extends Medico {
    private String crc;

    public Cardiologista(String crm, String crc) {
        super(crm);
        this.crc = crc;
    }
    
    public String getCrc() {
        return crc;
    }
    
    @Override
    public void atender() {
        System.out.println("Cardiologista atendendo . . .");
    }

}
