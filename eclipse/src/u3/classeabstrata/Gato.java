package u3.classeabstrata;

public class Gato extends Felino{

    public Gato(String imagem, String alimento, boolean comFome, String localização) {
        super(imagem, alimento, comFome, localização);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Gato: miau");
    }

    @Override
    public void comer() {
        System.out.println("Gato comendo ...." );        
    }    
}