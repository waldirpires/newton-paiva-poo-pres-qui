package u3.classeabstrata;

public abstract class Ave extends Animal{

    public Ave(String imagem, String alimento, boolean comFome, String localização) {
        super(imagem, alimento, comFome, localização);
    }

    public abstract void fazerBarulho();

    @Override
    public void comer() {
        System.out.println("Ave comendo com o seu bico . . .");        
    }

    public abstract void andar();
    
    public void voar() {
        System.out.println("Ave voando pelo céu azul.");
    }
}
