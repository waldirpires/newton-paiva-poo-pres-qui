package qui.u3.medico;

public class Oftalmologista extends Medico {
    private String cro;

    /**
     * @param crm
     * @param cro
     */
    public Oftalmologista(String crm, String cro) {
        super(crm);
        this.cro = cro;
    }

    public String getCro() {
        return cro;
    }

    @Override
    public void atender() {
        super.atender();
    }
}
