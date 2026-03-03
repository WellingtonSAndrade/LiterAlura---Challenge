package br.com.alura.literalurachallengejava.repository;

import br.com.alura.literalurachallengejava.model.Idioma;
import br.com.alura.literalurachallengejava.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivroRepositorio extends JpaRepository<Livro, Integer> {

    List<Livro> findByIdiomas(Idioma idioma);
}
