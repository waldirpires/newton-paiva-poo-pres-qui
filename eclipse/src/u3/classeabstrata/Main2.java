package u3.classeabstrata;

import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) {
        
        var leao = new Leao("leao.jpg", "zebra", true, "africa");
        
        var tigre = new Tigre("tigre.jpg", "boi", false, "selva");
        
        var gato = new Gato("gato.jpg", "ração", true, "casa");

        var canario = new Canario("canario.jpg", "ração", false, "gaiola");

        var casa = new Casa(canario);

    }

}
