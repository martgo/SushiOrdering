package com.sushiapp;

public class SushiCalifornia extends Sushi{
    private String skladnikNaWierzchu;

    public SushiCalifornia(String nazwa, String skladnikNaWierzchu) {
        super(nazwa);
        this.skladnikNaWierzchu = skladnikNaWierzchu;
        addIngredients(skladnikNaWierzchu);
        price = 20;
    }
    @Override
    public String toString() {
        return "SushiCalifornia [skladnik Na Wierzchu = " + skladnikNaWierzchu + ", nazwa = " + name + ", skladniki = "
                + ingredients + "]";
    }
}

