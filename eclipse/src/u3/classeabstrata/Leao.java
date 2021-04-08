package u3.classeabstrata;

public class Leao extends Felino{

    public Leao(String imagem, String alimento, boolean comFome, String localização) {
        super(imagem, alimento, comFome, localização);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Leao: RHGHRGHRGGH");
    }

    @Override
    public void comer() {
        System.out.println("Comendo como um leão");        
    }

}
