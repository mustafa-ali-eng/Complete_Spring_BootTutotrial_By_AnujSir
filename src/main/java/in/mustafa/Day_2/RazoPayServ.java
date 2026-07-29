package in.mustafa.Day_2;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty( name = "payment.provider" ,havingValue = "razo")
public class RazoPayServ  implements PaymentService{

    public RazoPayServ() {
        System.out.println("Razo Pay Serv :: Constructor");
    }


    public String pay()
    {
        String payment="Razopay Payment ";
        System.out.println("Payment from ::"+payment);
        return payment;
    }

}
