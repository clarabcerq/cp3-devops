package com.fiap.livraria;

import com.fiap.livraria.model.Autor;
import com.fiap.livraria.model.Livro;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class LivrariaTest {

    @Test
    public void testAdicionarLivro() {
        Autor autor = new Autor("J.K. Rowling");
        Livro livro = new Livro("Harry Potter e a Pedra Filosofal");

        autor.adicionarLivro(livro);

        assertEquals(1, autor.getLivros().size());
        assertEquals("Harry Potter e a Pedra Filosofal", autor.getLivros().get(0).getTitulo());
        assertEquals(autor, livro.getAutor());
    }

    @Test
    public void testLivroTitulo() {
        Livro livro = new Livro("O Senhor dos Anéis");
        assertEquals("O Senhor dos Anéis", livro.getTitulo());
    }
}
