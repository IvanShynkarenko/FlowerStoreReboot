package ua.edu.ucu.apps.flowerstore.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Item {
    private double price;
    private String description;
    public abstract double getPrice();
    public abstract double price();
}