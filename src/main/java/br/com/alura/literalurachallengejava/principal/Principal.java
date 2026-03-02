package br.com.alura.literalurachallengejava.principal;

import br.com.alura.literalurachallengejava.dto.ApiResponseDTO;
import br.com.alura.literalurachallengejava.model.Livro;
import br.com.alura.literalurachallengejava.service.ConsumoApi;
import br.com.alura.literalurachallengejava.service.ConverteDados;
import br.com.alura.literalurachallengejava.service.LivroServico;

import java.util.Objects;
import java.util.Scanner;

public class Principal {
    private ConsumoApi consumo =  new ConsumoApi();
    private ConverteDados converte = new ConverteDados();
    private LivroServico servico;

    public Principal(LivroServico servico) {
        this.servico = servico;
    }

    public Principal() {

    }


    public void exibeMenu() {
        Scanner sc = new Scanner(System.in);

        var menu = """
                ------------------------------
                Escolha o número de sua opção:
                1- Buscar livro pelo titulo
                2- Listar livros registrados
                3- Listar autores registrados
                4- Listar autores vivos em um determinado ano
                5- Listar livros em um determinado idioma
                
                0- Sair
                ------------------------------
                """;

        var opc = "";
        while (!Objects.equals(opc, "0")) {
            System.out.println(menu);
            opc = sc.nextLine();
            switch (opc) {
                case "1":
                    System.out.println("Nome do livro: ");
                    var nomeLivro = sc.nextLine();
                    buscaLivro(nomeLivro);
                    sc.nextLine();
                    break;
                case "2":
                    listaLivros();
                    sc.nextLine();
                    break;
                case "3":
                    System.out.println("Lista todos os autores");
                    listaAutores();
                    break;
                case "4":
                    System.out.println("Insira o ano que deseja buscar: ");
                    var ano = sc.nextInt();
                    listaAutoresVivos(ano);
                    break;
                case "5":
                    System.out.println("""
                            Insira o idioma para realizar a busca:
                            es- espanhol
                            en- inglês
                            fr- francês
                            pt- português
                            """);
                    var idioma = sc.nextLine();
                    buscaLivroPorIdioma(idioma);
                    break;
                default:
                    System.out.println("Opção invalida: " + opc);
                    System.out.println("Pressione ENTER para continuar");
                    sc.nextLine();
                    break;
            }
        }
    }

    private void buscaLivroPorIdioma(String idioma) {
    }

    private void listaAutoresVivos(int ano) {
    }

    private void listaAutores() {
    }

    private void listaLivros() {
        servico.buscaLivros();
    }

    private void buscaLivro(String nomeLivro) {
        var endereco = "https://gutendex.com/books/?search=" + nomeLivro.replace(" ", "%20");
        var response = converte.obterDados(consumo.obterDados(endereco), ApiResponseDTO.class);
        var livro = response.results().stream()
                .map(Livro::new)
                .toList().get(0);
        servico.salvaLivro(livro);
    }
}
