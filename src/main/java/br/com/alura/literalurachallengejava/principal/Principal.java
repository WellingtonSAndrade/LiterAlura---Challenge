package br.com.alura.literalurachallengejava.principal;

import java.util.Objects;
import java.util.Scanner;

public class Principal {
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
                    var livro = sc.nextLine();
                    buscaLivro(livro);
                    break;
                case "2":
                    System.out.println("Lista todos os livros");
                    listaLivros();
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
    }

    private void buscaLivro(String livro) {
    }
}
