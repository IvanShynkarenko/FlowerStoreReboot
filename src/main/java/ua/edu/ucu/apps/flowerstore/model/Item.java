package ua.edu.ucu.apps.flowerstore.model;

import lombok.Data;
@Data
public abstract class Item {
    String description;
    public abstract double price();
}