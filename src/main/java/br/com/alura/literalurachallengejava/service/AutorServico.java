package br.com.alura.literalurachallengejava.service;

import br.com.alura.literalurachallengejava.repository.AutorRepository;
import org.springframework.stereotype.Service;

@Service
public class AutorServico {

    private final AutorRepository autorRepository;

    public AutorServico(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public void buscaAutores() {
        var autores = autorRepository.findAll();
        autores.forEach(System.out::println);
    }

    public void buscarAutoresVivos(int ano) {
        var autores = autorRepository.findAutoresVivosNoAno(ano);
        autores.forEach(System.out::println);
    }
}
