package br.com.alura.literalurachallengejava.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record LivrosDTO(@JsonAlias("title") String titulo,
                        @JsonAlias("authors") List<AutorDTO> autor,
                        @JsonAlias("languages") List<String> idiomas,
                        @JsonAlias("download_count") Integer numeroDownloads) {
}
