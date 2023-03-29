package spring.cours.atelier3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
        "spring.cours.atelier3.repositories",
        "spring.cours.atelier3.controllers",
        "spring.cours.atelier3.models",
        "spring.cours.atelier3.services"
})
public class Atelier3Application {

    public static void main(String[] args) {
        SpringApplication.run(Atelier3Application.class, args);
    }

}
