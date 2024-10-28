package ua.edu.ucu.apps.flowerstore.Delivery;
import lombok.Getter;
import java.util.List;

import ua.edu.ucu.apps.flowerstore.flower.Item;

@Getter
public class DHLDeliveryStrategy implements Delivery {
    private String description;
    public DHLDeliveryStrategy() {
        this.description = "DHL delivery";
    }
    public void deliver(List<Item> items){
        System.out.println("Delivering "+items.size()+" items via DHL");
    }
}