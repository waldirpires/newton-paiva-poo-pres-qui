package qui.u3.agregacao;

public class Main {

    public static void main(String[] args) {
        
        // pessoa sem cabelo
        var pessoa1 = new Pessoa();
        System.out.println(pessoa1);
        
        // pessoa com cabelo
        var cabelo = new Cabelo("loiro");
        var pessoa2 = new Pessoa(cabelo);
        System.out.println(pessoa2);
        
        // pessoa ficou careca
        System.out.println("\nPessoa ficou careca\n");
        pessoa2.setCabelo(null);
        System.out.println(pessoa2);
    }

}
