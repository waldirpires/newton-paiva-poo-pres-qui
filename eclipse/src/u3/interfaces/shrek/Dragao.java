package u3.interfaces.shrek;

public class Dragao implements Passaro, Lagarto{

    @Override
    public void andarNoChao() {
        System.out.println("andar no chao");        
    }

    @Override
    public void voar() {
        System.out.println("Voando pelo ar");        
    }
    
    @Override
    public String toString() {
        return "Dragão!!!! ";
    }
}
