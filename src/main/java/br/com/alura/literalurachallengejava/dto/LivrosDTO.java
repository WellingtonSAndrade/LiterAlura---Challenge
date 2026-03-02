package br.com.alura.literalurachallengejava.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record LivrosDTO(Long id,
                        @JsonAlias("title") String titulo) {
}
