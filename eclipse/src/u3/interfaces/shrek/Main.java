package u3.interfaces.shrek;

import u3.classeabstrata.Canario;

public class Main {

    public static void main(String[] args) {
        
        var dragao = new Dragao();
        
        dragao.andarNoChao();
        
        dragao.voar();
        
        var castelo = new Castelo();
        
        castelo.entrarPelaJanela(dragao);
        
        castelo.entrarPelaPorta(dragao);
        
        var canario = new Canario("canario.jpg", "racao", false, "gaiola");
        
        castelo.entrarPelaJanela(canario);
        
        Passaro p = new Canario("canario2.jpg", "racao", false, "gaiola");
        System.out.println(p);
    }
}
