package br.com.alura.literalurachallengejava.service;

import br.com.alura.literalurachallengejava.repository.AutorRepositorio;
import org.springframework.stereotype.Service;

@Service
public class AutorServico {

    private final AutorRepositorio autorRepository;

    public AutorServico(AutorRepositorio autorRepositorio) {
        this.autorRepository = autorRepositorio;
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
