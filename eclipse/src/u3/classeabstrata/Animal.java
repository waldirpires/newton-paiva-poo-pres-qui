package u3.classeabstrata;

public abstract class Animal {

    public static int quantidade = 0;
    
    private String imagem;
    private String alimento;
    private boolean comFome;
    private String localização;

    public Animal(String imagem, String alimento, boolean comFome, String localização) {
        this.imagem = imagem;
        this.alimento = alimento;
        this.comFome = comFome;
        this.localização = localização;
        
        quantidade++;
    }

    @Override
    public String toString() {
        return "Animal [imagem=" + imagem + ", alimento=" + alimento + ", comFome=" + comFome + ", localização="
                + localização + "]";
    }
    
    public abstract void fazerBarulho();
    
    public abstract void comer();
    
    public abstract void andar();
    
}
