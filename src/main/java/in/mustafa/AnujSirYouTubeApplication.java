package in.mustafa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AnujSirYouTubeApplication {

    public static void main(String[] args) {

        SpringApplication.run(AnujSirYouTubeApplication.class, args);
    }

    @GetMapping("/")
    public String welcomeMessage() {
        return "Welcome to the Anuj Sir YouTube Application ........mustafa .....";
    }

}
