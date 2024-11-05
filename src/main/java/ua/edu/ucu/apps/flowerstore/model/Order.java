package ua.edu.ucu.apps.flowerstore.model;

import java.util.LinkedList;

import lombok.*;
import ua.edu.ucu.apps.flowerstore.model.delivery.Delivery;
import ua.edu.ucu.apps.flowerstore.model.payment.Payment;
@Data
public class Order {
    LinkedList<Item> items = new LinkedList<>();
    Payment payment;
    Delivery delivery;
    public void setPaymentStrategy(Payment payment){
        this.payment = payment;
    }
    public void setbeliveryStrategy(Delivery delivery){
        this.delivery=delivery;
    }
    public double calculateTotalPrice(){
        double sum = 0;
        for (Item i : items){
            sum+=i.price();
        }
        return sum;
    }
    public void addItem(Item item){
        items.add(item);
    }
    public void removeItem(Item item){
        items.remove(item);
    }
    public String processorder(){
        return payment.pay(calculateTotalPrice());
    }
}