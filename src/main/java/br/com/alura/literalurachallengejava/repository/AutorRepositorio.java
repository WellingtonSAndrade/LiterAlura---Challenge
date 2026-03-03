package br.com.alura.literalurachallengejava.repository;

import br.com.alura.literalurachallengejava.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AutorRepositorio extends JpaRepository<Autor, Integer> {

    @Query("""
            SELECT a FROM Autor a
            WHERE a.anoNascimento <= :ano
            AND (a.anoFalecimento IS NULL OR a.anoFalecimento > :ano)
            """)
    List<Autor> findAutoresVivosNoAno(int ano);
}