package ua.edu.ucu.apps.flowerstore.model.decorators;
import lombok.*;
import ua.edu.ucu.apps.flowerstore.model.Item;
@Data
@EqualsAndHashCode(callSuper = false)
public class BasketDecorator extends ItemDecorator{
    private Item item;
    public BasketDecorator(Item item){
        this.item=item;
    }
    public String getDescription(){
        return item.getDescription()+" with basket decorator";
    }
    public double price(){
        return 4 + item.getPrice();
    }
    @Override
    public double getPrice() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPrice'");
    }
}
