package br.com.alura.literalurachallengejava;

import br.com.alura.literalurachallengejava.principal.Principal;
import br.com.alura.literalurachallengejava.service.AutorServico;
import br.com.alura.literalurachallengejava.service.LivroServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiterAluraChallengeJavaApplication implements CommandLineRunner {

    @Autowired
    private LivroServico livroServico;
    @Autowired
    private AutorServico autorServico;

    public static void main(String[] args) {
        SpringApplication.run(LiterAluraChallengeJavaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Principal p = new Principal(livroServico, autorServico);
        p.exibeMenu();
    }
}
