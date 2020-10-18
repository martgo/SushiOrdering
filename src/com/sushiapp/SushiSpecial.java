package com.sushiapp;

public class SushiSpecial extends Sushi{

    private double czasGrilowania;
    public SushiSpecial(String nazwa, double czasGrillowania) {
        super(nazwa);
        this.czasGrilowania = czasGrillowania;
        price = 30;
    }
    @Override
    public String toString() {
        return "SushiSpecial [czas grilowania = " + czasGrilowania + ", nazwa = " + name + ", skladniki = " + ingredients +  "]";
    }
}
