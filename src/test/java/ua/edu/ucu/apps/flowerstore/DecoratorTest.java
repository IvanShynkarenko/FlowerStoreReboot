package ua.edu.ucu.apps.flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ua.edu.ucu.apps.flowerstore.model.Item;
import ua.edu.ucu.apps.flowerstore.model.decorators.BasketDecorator;
import ua.edu.ucu.apps.flowerstore.model.decorators.PaperDecorator;
import ua.edu.ucu.apps.flowerstore.model.decorators.RibbonDecorator;

class DecoratorTest {

    private Item flowerItem;

    @BeforeEach
    void initItem() {
        flowerItem = new Item() {
            @Override
            public double price() {
                return 50.0;
            }
            
            @Override
            public String getDescription() {
                return "Simple Flower";
            }
        };
    }

    @Test
    void testBasketDecoratorAddsCorrectPriceAndDescription() {
        Item itemWithBasket = new BasketDecorator(flowerItem);
        assertEquals("Simple Flower with basket decorator", itemWithBasket.getDescription());
        assertEquals(54.0, itemWithBasket.price(), 0.01);
    }

    @Test
    void testPaperDecoratorPriceAndDescription() {
        Item itemWithPaper = new PaperDecorator(flowerItem);
        assertEquals("Simple Flower with paper decorator", itemWithPaper.getDescription());
        assertEquals(63.0, itemWithPaper.price(), 0.01);
    }

    @Test
    void testRibbonDecoratorPriceAndDescription() {
        Item itemWithRibbon = new RibbonDecorator(flowerItem);
        assertEquals("Simple Flower with ribbon decorator", itemWithRibbon.getDescription());
        assertEquals(90.0, itemWithRibbon.price(), 0.01);
    }

    @Test
    void testCombinationOfMultipleDecorators() {
        Item fullyDecoratedItem = new BasketDecorator(new PaperDecorator(new RibbonDecorator(flowerItem)));
        assertEquals("Simple Flower with ribbon decorator with paper decorator with basket decorator", fullyDecoratedItem.getDescription());
        assertEquals(107.0, fullyDecoratedItem.price(), 0.01);
    }
}
