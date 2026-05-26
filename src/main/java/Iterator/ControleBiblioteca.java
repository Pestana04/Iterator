package Iterator;

import java.util.Iterator;

public class ControleBiblioteca {

    public static Integer contarLivrosDisponiveis(Biblioteca biblioteca) {
        int quantidade = 0;

        for (Livro livro : biblioteca) {
            if (livro.isDisponivel()) {
                quantidade++;
            }
        }

        return quantidade;
    }

    public static Integer contarLivrosEmprestados(Biblioteca biblioteca) {
        int quantidade = 0;

        for (Livro livro : biblioteca) {
            if (!livro.isDisponivel()) {
                quantidade++;
            }
        }

        return quantidade;
    }

    public static Integer contarTotalLivros(Biblioteca biblioteca) {
        int quantidade = 0;

        for (Iterator livro = biblioteca.iterator(); livro.hasNext(); ) {
            quantidade++;
            livro.next();
        }

        return quantidade;
    }
}