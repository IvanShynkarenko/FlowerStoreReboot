package ua.edu.ucu.apps.flowerstore.Payment;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.apps.flowerstore.Delivery.DHLDeliveryStrategy;

@RestController
public class PaymentController {
    private Payment paymentType;
    public PaymentController() {
        this.paymentType = new CreditCardPaymentStrategy();
    }
    @GetMapping("/payment")
    public List<Payment> getPayments() {
        return List.of(new CreditCardPaymentStrategy());
    }
    public void setPaymentType(Payment paymentType) {
        this.paymentType = paymentType;
    }
}
