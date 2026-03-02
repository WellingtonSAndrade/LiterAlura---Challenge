package br.com.alura.literalurachallengejava.repository;

import br.com.alura.literalurachallengejava.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepositorio extends JpaRepository<Livro, Integer> {

}
