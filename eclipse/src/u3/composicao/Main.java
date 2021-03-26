package u3.composicao;

public class Main {

    public static void main(String[] args) {
        
        // criar as paredes
        var parede1 = new Parede("branca");
        var parede2 = new Parede("azul");
        var parede3 = new Parede("amarelo");
        var parede4 = new Parede("verde");
        
        // criar a casa - composição
        var casa = new Casa(parede1, parede2, parede3, parede4);
        System.out.println(casa);
        
        System.out.println("\n\n");
        
        var predio = new Predio(parede1, parede2, parede3, parede4, 4);
        System.out.println(predio);
        
        predio.getParede1().setCor("vermelho");
        System.out.println("\nApós a pintura:\n\n");
        System.out.println(predio);
    }
}
