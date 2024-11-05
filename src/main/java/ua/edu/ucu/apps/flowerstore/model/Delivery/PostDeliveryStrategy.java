package ua.edu.ucu.apps.flowerstore.model.Delivery;

import java.util.List;
import lombok.Getter;
import ua.edu.ucu.apps.flowerstore.model.Item;

@Getter
public class PostDeliveryStrategy implements Delivery {
    private String description;
    public PostDeliveryStrategy() {
        this.description = "Post delivery";
    }
    public void deliver(List<Item> items){
        System.out.println("Delivering "+items.size()+" items via post delivery");
    }
}