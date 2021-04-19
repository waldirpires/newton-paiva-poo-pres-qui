package u3.generics;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<ContaBancaria> contas;
    
    public Banco() {
        this.contas = new ArrayList<>();
    }
    
    public ContaBancaria pesquisar(String numero) {
        for (var conta: contas) {
            if (conta.getNumero().equals(numero)) {
                return conta;
            }
        }
        
        return null; // conta não existe
    }
    
    public void adicionar(ContaBancaria c) {
        this.contas.add(c);
    }
}
