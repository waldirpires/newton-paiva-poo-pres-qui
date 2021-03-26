package u3.agregacao.ex3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UniversidadeTest {

    private Universidade unit;
    
    @BeforeEach
    void setUp() throws Exception {
        unit = new Universidade("Newton Paiva");
    }

    @Test
    void test_AlunoNaoExiste_retornaNull() {
        // entrada
        var a = new Aluno("José", "1", "SI");
        
        // processamento
        var resultado = unit.pesquisar(a.getMatricula());
                
        // resultado
        assertNull(resultado);        
    }

    @Test
    void test_AlunoExiste_retornaAlunoEncontrado() {
        // entrada
        var a = new Aluno("José", "1", "SI");
        unit.adicionarAluno(a);
        
        // processamento
        var resultado = unit.pesquisar(a.getMatricula());
                
        // resultado
        assertEquals(a, resultado);        
    }
    
    @Test
    void test_alunoExiste_alunoNaoAdicionado() {
        // entrada
        var a = new Aluno("José", "1", "SI");
        unit.adicionarAluno(a);
        
        var b = new Aluno("João", "1", "SI");
        // processamento
        unit.adicionarAluno(b);
                
        // resultado
        assertEquals(a, unit.pesquisar(a.getMatricula()));    
    }

    @Test
    void test_alunoNaoExiste_alunoAdicionado() {
        // entrada
        var a = new Aluno("José", "1", "SI");
        unit.adicionarAluno(a);
        
        var b = new Aluno("João", "2", "SI");
        // processamento
        unit.adicionarAluno(b);
                
        // resultado
        assertEquals(b, unit.pesquisar(b.getMatricula()));    
    }

}
