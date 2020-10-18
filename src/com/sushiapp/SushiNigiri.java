package com.sushiapp;

public class SushiNigiri extends Sushi {

    private String topIngredient;
    private boolean roasted;

    public SushiNigiri(String name, String topIngredient, boolean roasted) {
        super(name);
        this.topIngredient = topIngredient;
        this.roasted = roasted;
        addIngredients(topIngredient);
        price = 10;
    }

    @Override
    public String toString() {
        return "Sushi Nigiri [skladnik Na Wierzchu = " + topIngredient + ", czy Opiekany = " + roasted + ", nazwa = "
                + name + ", skladniki = " + ingredients + "]";
    }
}
