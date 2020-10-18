package com.sushiapp;

public class SushiCalifornia extends Sushi{
    private String topIngredient;

    public SushiCalifornia(String name, String topIngredient) {
        super(name);
        this.topIngredient = topIngredient;
        addIngredients(topIngredient);
        price = 20;
    }
    @Override
    public String toString() {
        return "SushiCalifornia [skladnik Na Wierzchu = " + topIngredient + ", nazwa = " + name + ", skladniki = "
                + ingredients + "]";
    }
}

