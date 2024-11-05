package ua.edu.ucu.apps.flowerstore.model.decorators;
import lombok.*;
import ua.edu.ucu.apps.flowerstore.model.Item;
@Data
@EqualsAndHashCode(callSuper = false)
public class PaperDecorator extends ItemDecorator{
    private Item item;
    public PaperDecorator(Item item){
        this.item=item;
    }
    public String getDescription(){
        return item.getDescription()+" with paper decorator";
    }
    public double price(){
        return 13 + item.price();
    }
}
