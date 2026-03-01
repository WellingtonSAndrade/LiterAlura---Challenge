package br.com.alura.literalurachallengejava;

import br.com.alura.literalurachallengejava.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiterAluraChallengeJavaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(LiterAluraChallengeJavaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Principal p = new Principal();
        p.exibeMenu();
    }
}
