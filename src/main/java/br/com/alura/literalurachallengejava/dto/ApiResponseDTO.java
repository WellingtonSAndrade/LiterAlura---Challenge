package br.com.alura.literalurachallengejava.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ApiResponseDTO(@JsonAlias("count") Integer count,
                             @JsonAlias("results")List<LivrosDTO> results) {
}
