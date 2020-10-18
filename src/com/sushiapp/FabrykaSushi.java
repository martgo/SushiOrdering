package com.sushiapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class FabrykaSushi {
    private String name;
    private String[] ingredients;
    private static FabrykaSushi fabrykaSushi;
    private List<Sushi> sold;

    private FabrykaSushi(String name) {
        this.name = name;
        this.sold = new ArrayList<Sushi>();
        this.ingredients = new String[7];

        przypiszSkladniki();
    }

    public static FabrykaSushi getInstance() {
        if (fabrykaSushi == null)
            fabrykaSushi = new FabrykaSushi("Izumi Sushi");
        return fabrykaSushi;
    }

    private void przypiszSkladniki() {
        ingredients[0] = "Losos";
        ingredients[1] = "Tunczyk";
        ingredients[2] = "Ogorek";
        ingredients[3] = "Makrela";
        ingredients[4] = "Pieczony Losos";
        ingredients[5] = "Krewetka";
        ingredients[6] = "Osmiornica";
    }

    public Sushi stworzLosowaRolkeSushi() {
        int idxSkladnik = (int) (Math.random() * ingredients.length);
        return new Sushi(ingredients[idxSkladnik]);
    }

    public SushiCalifornia stworzRolkaCalifornia(String nazwa, String skladnikNaWierzchu ) {
        SushiCalifornia sc = new SushiCalifornia(nazwa, skladnikNaWierzchu);
        sold.add(sc);
        return sc;
    }

    public SushiNigiri stworzRolkaNigiri(String nazwa, String skladnikNaWierzchu, boolean Opiekany) {
        SushiNigiri sn = new SushiNigiri(nazwa, skladnikNaWierzchu, Opiekany);
        sold.add(sn);
        return sn;
    }

    public SushiSpecial stworzRolkeSpecjalna(String nazwa, double czasGrillowania) {
        SushiSpecial ss = new SushiSpecial(nazwa, czasGrillowania);
        sold.add(ss);
        return ss;
    }

    public String getNazwa() {
        return name;
    }

    public List<Sushi> getSprzedaneRolki() {
        return sold;
    }

    @Override
    public String toString() {
        return "FabrykaSushi [nazwa=" + name + "]";
    }
}
