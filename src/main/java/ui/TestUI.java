package ui;

import model.BreadType;
import model.Order;
import model.Sandwich;

import java.math.BigDecimal;
import java.util.UUID;

public class TestUI {
    public static void main(String[]args){

        Sandwich buildedSandwich = new Sandwich.SandwichBuilder(UUID.randomUUID())
                .withName("cheese")
                .withPrice(new BigDecimal(3.2).setScale(1,BigDecimal.ROUND_HALF_UP))
                .withIngredients("Cheese, eggs, letuce, tomato, mayo")
                .build();

        System.out.println("You ordered a " + buildedSandwich.getName() + " sandwich for " + buildedSandwich.getPrice() + " euro.");
    }
}
