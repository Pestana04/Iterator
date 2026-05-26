package Iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BibliotecaTest {

    @Test
    void deveContarLivrosDisponiveis() {
        Biblioteca biblioteca = new Biblioteca(
                new Livro("Dom Casmurro", true),
                new Livro("O Hobbit", false),
                new Livro("1984", true),
                new Livro("Senhor dos Anéis", false)
        );

        assertEquals(2, ControleBiblioteca.contarLivrosDisponiveis(biblioteca));
    }

    @Test
    void deveContarLivrosEmprestados() {
        Biblioteca biblioteca = new Biblioteca(
                new Livro("Dom Casmurro", true),
                new Livro("O Hobbit", false),
                new Livro("1984", true),
                new Livro("Senhor dos Anéis", false)
        );

        assertEquals(2, ControleBiblioteca.contarLivrosEmprestados(biblioteca));
    }

    @Test
    void deveContarTotalLivros() {
        Biblioteca biblioteca = new Biblioteca(
                new Livro("Dom Casmurro", true),
                new Livro("O Hobbit", false),
                new Livro("1984", true),
                new Livro("Senhor dos Anéis", false)
        );

        assertEquals(4, ControleBiblioteca.contarTotalLivros(biblioteca));
    }
}