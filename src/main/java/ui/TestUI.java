package ui;

import model.BreadType;
import model.Order;
import model.Sandwich;

import java.math.BigDecimal;

public class TestUI {
    public static void main(String[]args){
        Sandwich testSandwich = new Sandwich("cheese",new BigDecimal(3.2).setScale(2,BigDecimal.ROUND_HALF_UP));
        Order testOrder = new Order("Wrap",testSandwich.getName(), testSandwich.getPrice(),"0475135268");

        System.out.println("You ordered a " + testOrder.getSandwichName() + " " + testOrder.getBreadtype() + " for " + testSandwich.getPrice() + " euro.");
    }
}
