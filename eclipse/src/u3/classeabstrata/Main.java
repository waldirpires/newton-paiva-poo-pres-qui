package u3.classeabstrata;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // instanciar um obj de uma classe abstrata
//        var animal = new Animal("animal.jpg", "comida", false, "na floresta");
//        System.out.println(animal);
//        
//        var felino = new Felino("felino.jpg", "carne", false, "na selva");
//        System.out.println(felino);
        
        var lista = new ArrayList<Animal>();
        var leao = new Leao("leao.jpg", "zebra", true, "africa");
        lista.add(leao);
        
        var tigre = new Tigre("tigre.jpg", "boi", false, "selva");
        lista.add(tigre);
        
        lista.add(new Gato("gato.jpg", "ração", true, "casa"));

        lista.add(new Canario("canario.jpg", "ração", false, "gaiola"));

        for (var a: lista) {
            System.out.println(a);
            a.andar();
            a.fazerBarulho();
            a.comer();
            System.out.println();
            
            if (a instanceof Ave) {
                // se o animal for uma ave
                ((Ave)a).voar(); // cast - conversão entre tipos
            }
        }    
        
        System.out.println("total de animais: " + Animal.quantidade);
    }
}