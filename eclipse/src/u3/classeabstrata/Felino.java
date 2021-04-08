package u3.classeabstrata;

public abstract class Felino extends Animal{

    public Felino(String imagem, String alimento, boolean comFome, String localização) {
        super(imagem, alimento, comFome, localização);
    }

    public abstract void fazerBarulho();

    public abstract void comer();

    // não pode ser sobrescrito
    public final void andar() {
       System.out.println("Felino andando . . .");
    }

}
