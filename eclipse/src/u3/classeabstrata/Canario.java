package u3.classeabstrata;

public class Canario extends Ave{

    public Canario(String imagem, String alimento, boolean comFome, String localização) {
        super(imagem, alimento, comFome, localização);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Canarinho cantando . . .");
    }

    @Override
    public void andar() {
        System.out.println("Canarinho vai voar");        
    }
}
