package model;

import java.math.BigDecimal;

public class Order {

    private BreadType breadtype;
    private String sandwichName;
    private BigDecimal sandwichPrice;
    private String telefoonnummer;

    public Order(){

    }

    public Order(String breadType, String sandwichName, BigDecimal sandwichPrice, String telefoonnummer){
        this.setBreadtype(breadType);
        this.setSandwichName(sandwichName);
        this.setSandwichPrice(sandwichPrice);
        this.setTelefoonnummer(telefoonnummer);
    }

    public String getSandwichName() {
        return sandwichName;
    }

    public void setSandwichName(String sandwichName) {
        this.sandwichName = sandwichName;
    }

    public BigDecimal getSandwichPrice() {
        return sandwichPrice;
    }

    public void setSandwichPrice(BigDecimal sandwichPrice) {
        this.sandwichPrice = sandwichPrice;
    }

    public String getTelefoonnummer() {
        return telefoonnummer;
    }

    public void setTelefoonnummer(String telefoonnummer) {
        this.telefoonnummer = telefoonnummer;
    }

    public BreadType getBreadtype(){
        return this.breadtype;
    }

    public void setBreadtype(String breadtype) {
        String breadTypeUpper = breadtype.toUpperCase();
        if (checkBreadType(breadTypeUpper)) {
            this.breadtype = BreadType.valueOf(breadTypeUpper);
        }else{
            throw new ModelException("Invalid breadtype!");
        }
    }

    private boolean checkBreadType(String breadtype) {
        for(BreadType t : BreadType.class.getEnumConstants()){
            if(t.name().equals(breadtype)){
                return true;
            }
        }
        return false;
    }
}
