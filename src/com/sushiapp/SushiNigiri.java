package com.sushiapp;

public class SushiNigiri extends Sushi {

    private String skladnikNaWierzchu;
    private boolean czyOpiekany;

    public SushiNigiri(String nazwa, String skladnikNaWierzchu, boolean czyOpiekany) {
        super(nazwa);
        this.skladnikNaWierzchu = skladnikNaWierzchu;
        this.czyOpiekany = czyOpiekany;
        addIngredients(skladnikNaWierzchu);
        price = 10;
    }

    @Override
    public String toString() {
        return "Sushi Nigiri [skladnik Na Wierzchu = " + skladnikNaWierzchu + ", czy Opiekany = " + czyOpiekany + ", nazwa = "
                + name + ", skladniki = " + ingredients + "]";
    }
}
