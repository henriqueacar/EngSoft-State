import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmeTest {

    Filme filme;

    @BeforeEach
    void setUp(){
        filme = new Filme();
        filme.setNome("Avatar");
    }

    /*
    Testes para filmes disponíveis
     */
    @Test
    void naoDeveDisponibilizarFilmeDisponivel(){
        assertFalse(filme.disponibilizar());
    }

    @Test
    void deveAlugarFilmeDisponivel(){
        assertTrue(filme.alugar());
        assertEquals(FilmeEstadoAlugado.getInstance(), filme.getEstado());
    }

    @Test
    void deveIndisponibilizarFilmeDisponivel(){
        assertTrue(filme.indisponibilizar());
        assertEquals(FilmeEstadoIndisponivel.getInstance(), filme.getEstado());
    }

    /*
    Testes para filmes alugados
     */

    @Test
    void naoDeveAlugarFilmeAlugado(){
        filme.setEstado(FilmeEstadoAlugado.getInstance());
        assertFalse(filme.alugar());
    }
    @Test
    void deveDisponibilizarFilmeAlugado(){
        filme.setEstado(FilmeEstadoAlugado.getInstance());
        assertTrue(filme.disponibilizar());
        assertEquals(FilmeEstadoDisponivel.getInstance(), filme.getEstado());
    }

    @Test
    void deveIndisponibilizarFilmeAlugado(){
        filme.setEstado(FilmeEstadoAlugado.getInstance());
        assertTrue(filme.indisponibilizar());
        assertEquals(FilmeEstadoIndisponivel.getInstance(), filme.getEstado());
    }

    /*
    Testes para filmes indisponíveis
     */

    @Test
    void naoDeveIndisponibilizarFilmeIndisponivel(){
        filme.setEstado(FilmeEstadoIndisponivel.getInstance());
        assertFalse(filme.indisponibilizar());
    }

    @Test
    void devedisponibilizarFilmeIndisponivel(){
        filme.setEstado(FilmeEstadoIndisponivel.getInstance());
        assertTrue(filme.disponibilizar());
        assertEquals(FilmeEstadoDisponivel.getInstance(), filme.getEstado());
    }
}