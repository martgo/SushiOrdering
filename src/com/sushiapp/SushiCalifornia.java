package com.sushiapp;

public class SushiCalifornia extends Sushi{
    private String topIngredient;

    public SushiCalifornia(String name, String skladnikNaWierzchu) {
        super(name);
        this.topIngredient = skladnikNaWierzchu;
        addIngredients(skladnikNaWierzchu);
        price = 20;
    }
    @Override
    public String toString() {
        return "SushiCalifornia [skladnik Na Wierzchu = " + topIngredient + ", nazwa = " + name + ", skladniki = "
                + ingredients + "]";
    }
}

