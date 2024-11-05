package ua.edu.ucu.apps.flowerstore.model.Delivery;
import lombok.Getter;
import ua.edu.ucu.apps.flowerstore.model.Item;

import java.util.List;

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