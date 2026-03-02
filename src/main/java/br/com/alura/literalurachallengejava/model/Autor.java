package br.com.alura.literalurachallengejava.model;

import br.com.alura.literalurachallengejava.dto.AutorDTO;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "autores")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Integer anoNascimento;
    private Integer anoFalecimento;
    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Livro> livros =  new ArrayList<>();

    public Autor(){}

    public Autor(List<AutorDTO> autor) {
        nome = autor.get(0).nome();
        anoNascimento = autor.get(0).anoNascimento();
        anoFalecimento = autor.get(0).anoFalecimento();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(Integer anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public Integer getAnoFalecimento() {
        return anoFalecimento;
    }

    public void setAnoFalecimento(Integer anoFalecimento) {
        this.anoFalecimento = anoFalecimento;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    @Override
    public String toString() {
        return """
               ----------Autor----------
               Nome= %s
               Ano de nascimento= %s
               Ano de falecimento= %s
               Livros= %s
               -------------------------
               """.formatted(nome, anoNascimento, anoFalecimento, livros.stream().map(Livro::getTitulo).toList());
    }
}
