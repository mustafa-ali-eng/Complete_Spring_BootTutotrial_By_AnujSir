package in.mustafa;

import in.mustafa.Day_2.PaymentService;
import in.mustafa.Day_2.RazoPayServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AnujSirYouTubeApplication implements CommandLineRunner {

    public static void main(String[] args) {

        SpringApplication.run(AnujSirYouTubeApplication.class, args);

    }

    @GetMapping("/")
    public String welcomeMessage() {
        return "Welcome to the Anuj Sir YouTube Application ........mustafa .....";
    }


//    @Autowired
//   private final RazoPayServ rps ;



    private final PaymentService paymentService ;

    AnujSirYouTubeApplication(PaymentService paymentService)
    {
        this.paymentService = paymentService;
    }

    @Override
    public void run(String... args) throws Exception {
        String pay = paymentService.pay();
        System.out.println("Payment done from "+pay);
    }
}
