package ua.ucu.edu.apps.flowerstore.model.flowers;
import ua.ucu.edu.apps.flowerstore.model.Flower;
public class RomashkaFlower extends Flower{
    public RomashkaFlower() {
        super();
        this.setName("ROMASHKA");
    }
    public RomashkaFlower(String name,
    String color, double price, boolean available) {
        super("ROMASHKA", color, price, available);
    }
}
