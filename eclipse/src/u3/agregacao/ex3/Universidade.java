package u3.agregacao.ex3;

import java.util.ArrayList;
import java.util.List;

public class Universidade {
    private String nome;
    
    // Java Collection Framework
    private List<Aluno> alunos; // listagem

    public Universidade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Universidade [nome=" + nome + ", alunos=" + alunos + "]";
    }
    
    public Aluno pesquisar(String matricula) {
        for (Aluno a: alunos) {
            if (a.getMatricula().equals(matricula)) {
                return a;
            }
        }
        
        return null;
    }

    public void listar() {
        System.out.println("\nLISTAGEM:\n");
        for (Aluno a: alunos) {
            System.out.println(a);
        }
    }

    public void adicionarAluno(Aluno a) {
        // verificar alunos com a mesma matricula do aluno novo
//        if (pesquisar(a.getMatricula()) != null) {
//            System.out.println("Aluno com matrícula já existe!");
//            
//            return;
//        }

        if (this.alunos.contains(a)) {
          System.out.println("Aluno com matrícula já existe!");
          
          return;            
        }
        
        this.alunos.add(a);
        System.out.println("Aluno adicionado com sucesso: \n" + a);
    }
    
    public void removerAluno(Aluno a) {
        if (pesquisar(a.getMatricula()) == null) {
            System.out.println("Aluno com matrícula não existe!");
            
            return;
        }

        this.alunos.remove(a);        
    }
}
