package com.sushiapp;

public class SushiSpecial extends Sushi{

    private double grillTime;
    public SushiSpecial(String nazwa, double czasGrillowania) {
        super(nazwa);
        this.grillTime = czasGrillowania;
        price = 30;
    }
    @Override
    public String toString() {
        return "SushiSpecial [czas grilowania = " + grillTime + ", nazwa = " + name + ", skladniki = " + ingredients +  "]";
    }
}
