package u3.agregacao.ex3;

public class Main {

    public static void main(String[] args) {
        // criar universidade
        var universidade = new Universidade("Newton Paiva");
        
        // listar alunos
        universidade.listar();
        
        // criar aluno
        var a = new Aluno("José Pereira", "00231", "EC");
        
        // pesquisar por aluno
        System.out.println("pesquisa: " + 
                universidade.pesquisar(a.getMatricula()));
        
        // adicionar aluno
        universidade.adicionarAluno(a);
        
        // buscar aluno por matricula
        System.out.println("pesquisa: " + 
                universidade.pesquisar(a.getMatricula()));

        // adicionar outro aluno
        var a2 = new Aluno("Walkenia Souza", "00232", "SI");
        
        universidade.adicionarAluno(a2);

        // pesquisa
        System.out.println("pesquisa: " + 
                universidade.pesquisar(a2.getMatricula()));
        
        // listagem:
        universidade.listar();
        
        // remover aluno
        universidade.removerAluno(a);
        
        // listagem:
        universidade.listar();

        // remover aluno
        universidade.removerAluno(a);
    }
}
