package br.com.alura.literalurachallengejava.model;

import br.com.alura.literalurachallengejava.dto.LivrosDTO;
import jakarta.persistence.*;

@Entity
@Table(name = "livros")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    @ManyToOne(cascade = CascadeType.ALL)
    private Autor autor;
    private Idioma idiomas;
    private Integer numeroDownloads;

    public Livro() {}

    public Livro(LivrosDTO livrosDTO) {
        titulo = livrosDTO.titulo();
        autor = new Autor(livrosDTO.autor());
        idiomas = Idioma.fromString(livrosDTO.idiomas().get(0));
        numeroDownloads = livrosDTO.numeroDownloads();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Idioma getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(Idioma idiomas) {
        this.idiomas = idiomas;
    }

    public Integer getNumeroDownloads() {
        return numeroDownloads;
    }

    public void setNumeroDownloads(Integer numeroDownloads) {
        this.numeroDownloads = numeroDownloads;
    }

    @Override
    public String toString() {
        return """
               ----------Livro----------
               Titulo= %s
               Autor= %s
               Idiomas= %s
               Downloads= %s
               -------------------------
               """.formatted(titulo, autor.getNome(), idiomas, numeroDownloads);
    }
}
