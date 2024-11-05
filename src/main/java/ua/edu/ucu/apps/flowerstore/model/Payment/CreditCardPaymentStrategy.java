package ua.edu.ucu.apps.flowerstore.Payment;

import lombok.Getter;

@Getter
public class CreditCardPaymentStrategy implements Payment{
    private String description;

    public CreditCardPaymentStrategy(){
        description = "Paid with credit card";
    }

    public void pay(double price) {
        System.out.println("Payed with credit " + price);
    }
}
