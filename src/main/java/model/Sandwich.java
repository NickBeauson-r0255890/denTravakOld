package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Sandwich {

    private UUID id;
    private String name;
    private BigDecimal price;
    private String ingredients;

    private Sandwich(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public static class SandwichBuilder{

        private UUID id;
        private String name;
        private BigDecimal price;
        private String ingredients;

        public SandwichBuilder(UUID id){
            this.id = id;
        }

        public SandwichBuilder withName(String name) {
            this.name = name;
           return this;
        }

        public SandwichBuilder withPrice(BigDecimal price) {
            this.price = price;
           return this;
        }

        public SandwichBuilder withIngredients(String ingredients) {
            this.ingredients = ingredients;
           return this;
        }

        public Sandwich build(){
            Sandwich sandwich = new Sandwich();
            sandwich.name = this.name;
            sandwich.price = this.price;
            sandwich.ingredients = this.ingredients;
            return sandwich;
        }
        
    }



}


