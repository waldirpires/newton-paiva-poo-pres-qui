package u3.classeabstrata;

public class Tigre extends Felino{

    public Tigre(String imagem, String alimento, boolean comFome, String localização) {
        super(imagem, alimento, comFome, localização);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Tigre RHGRRHGR");
        
    }

    @Override
    public void comer() {
        System.out.println("Tigre comendo . . .");        
    }

}
