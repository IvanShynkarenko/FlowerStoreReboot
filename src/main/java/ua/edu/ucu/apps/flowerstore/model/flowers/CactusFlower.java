package ua.edu.ucu.apps.flowerstore.model.flowers;

import ua.edu.ucu.apps.flowerstore.model.Flower;

public class CactusFlower extends Flower {
    public CactusFlower() {
        super();
        this.setName("CACTUS");
    }
    public CactusFlower(String name,
    String color, double price, boolean available) {
        super("CACTUS", color, price, available);
    }
}
