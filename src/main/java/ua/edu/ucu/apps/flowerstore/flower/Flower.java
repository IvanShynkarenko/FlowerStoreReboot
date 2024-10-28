package ua.edu.ucu.apps.flowerstore.flower;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @ToString @AllArgsConstructor @Entity @Table
public class Flower extends Item{
    @Id
    private Long id;
    private String color;
    private int sepalLenght;
    private double price;
    private FlowerType type;
    private String description;

    public String getColor(){
        return color.toString();
    }

    public Flower(){
        color = null;
        sepalLenght = 0;
        price = 0;
        type = null;
    }
    public double getPrice(){
        return price;
    }

    public Flower(String color, int sepal, FlowerType type, double price){
        this.color = color;
        this.sepalLenght = sepal;
        this.price = price;
        this.type = type;
    }

    public Flower(Flower flower){
        color = flower.color;
        sepalLenght = flower.sepalLenght;
        price = flower.price;
        type = flower.type;
    }
}
