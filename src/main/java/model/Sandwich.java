package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Sandwich {

    private String Name;
    private BigDecimal price;
    private String Ingredients;

    public Sandwich(){
    }

    public Sandwich(String name, BigDecimal price ){
        this.setName(name);
        this.setPrice(price);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }




}
