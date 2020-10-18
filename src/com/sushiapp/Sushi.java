package com.sushiapp;

import java.util.ArrayList;
import java.util.List;

public class Sushi {
    protected String name;
    private static int sushimade;
    protected List<String> ingredients;
    protected int price;
    public Sushi(String name) {
        this.name = name;
        this.ingredients = new ArrayList<String>();
        addIngredients("Ryż");
        sushimade++;
    }
    protected void addIngredients(String ingredient) {
        ingredients.add(ingredient);
    }
    public List<String> getSkladniki(){
        return ingredients;
    }
    public static int sushimade() {
        return sushimade;
    }
    public int getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
}

