package u3.classeabstrata;

import u3.interfaces.shrek.Passaro;

public class Canario extends Ave implements AnimalDeEstimacao, Passaro{

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

    @Override
    public void brincar() {
        System.out.println("Ele pula na gaiola");        
    }

    @Override
    public void serAmigo() {
        System.out.println("Canário pousa na mão do dono");        
    }
}
