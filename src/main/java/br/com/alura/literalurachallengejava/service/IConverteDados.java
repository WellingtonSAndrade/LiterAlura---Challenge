package br.com.alura.literalurachallengejava.service;

public interface IConverteDados {

    <T> T obterDados(String json, Class<T> classe);
}
