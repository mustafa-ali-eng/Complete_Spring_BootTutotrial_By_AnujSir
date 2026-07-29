package in.mustafa.Day_2;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty( name = "payment.provider" ,havingValue = "sps")
public class StripPaymentServ implements PaymentService {

    StripPaymentServ() {
        System.out.println("StripPaymentServ :: Constructor");
    }

    @Override
    public String pay() {
        String spsPay="StripPayment";
        System.out.println("Payment from "+spsPay);
        return spsPay;
    }
}
