package br.com.alura.literalurachallengejava.service;

import br.com.alura.literalurachallengejava.model.Idioma;
import br.com.alura.literalurachallengejava.model.Livro;
import br.com.alura.literalurachallengejava.repository.LivroRepositorio;
import org.springframework.stereotype.Service;

@Service
public class LivroServico {

    private final LivroRepositorio livroRepositorio;

    public LivroServico(LivroRepositorio livroRepositorio) {
        this.livroRepositorio = livroRepositorio;
    }

    public void salvaLivro(Livro livro) {
        livroRepositorio.save(livro);
    }

    public void buscaLivros() {
        var livros = livroRepositorio.findAll();
        livros.forEach(System.out::println);
    }

    public void buscaLivrosPorIdioma(String idioma) {
        var livros = livroRepositorio.findByIdiomas(Idioma.fromString(idioma));
        livros.forEach(System.out::println);
    }
}
