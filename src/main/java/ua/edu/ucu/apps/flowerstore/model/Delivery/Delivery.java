package ua.edu.ucu.apps.flowerstore.model.delivery;

import java.util.List;

import ua.edu.ucu.apps.flowerstore.model.Item;

public interface Delivery {
    void deliver(List<Item> itemList);
}
