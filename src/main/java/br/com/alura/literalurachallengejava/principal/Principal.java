package br.com.alura.literalurachallengejava.principal;

import br.com.alura.literalurachallengejava.service.ConsumoApi;

public class Principal {
    public void exibeMenu() {
        ConsumoApi consumo = new ConsumoApi();
        System.out.println(consumo.obterDados("https://gutendex.com/books/1/"));
    }
}
