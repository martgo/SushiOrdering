package com.sushiapp;

import java.util.ArrayList;
import java.util.List;

public class FabrykaSushi {
    private String nazwa;
    private String[] skladniki;
    private static FabrykaSushi fabrykaSushi;
    private List<Sushi> sprzedaneRolki;

    private FabrykaSushi(String nazwa) {
        this.nazwa = nazwa;
        this.sprzedaneRolki = new ArrayList<Sushi>();
        this.skladniki = new String[7];

        przypiszSkladniki();
    }

    public static FabrykaSushi getInstance() {
        if (fabrykaSushi == null)
            fabrykaSushi = new FabrykaSushi("Izumi Sushi");
        return fabrykaSushi;
    }

    private void przypiszSkladniki() {
        skladniki[0] = "Losos";
        skladniki[1] = "Tunczyk";
        skladniki[2] = "Ogorek";
        skladniki[3] = "Makrela";
        skladniki[4] = "Pieczony Losos";
        skladniki[5] = "Krewetka";
        skladniki[6] = "Osmiornica";
    }

    public Sushi stworzLosowaRolkeSushi() {
        int idxSkladnik = (int) (Math.random() * skladniki.length);
        return new Sushi(skladniki[idxSkladnik]);
    }

    public SushiCalifornia stworzRolkaCalifornia(String nazwa, String skladnikNaWierzchu ) {
        SushiCalifornia sc = new SushiCalifornia(nazwa, skladnikNaWierzchu);
        sprzedaneRolki.add(sc);
        return sc;
    }

    public SushiNigiri stworzRolkaNigiri(String nazwa, String skladnikNaWierzchu, boolean Opiekany) {
        SushiNigiri sn = new SushiNigiri(nazwa, skladnikNaWierzchu, Opiekany);
        sprzedaneRolki.add(sn);
        return sn;
    }

    public SushiSpecial stworzRolkeSpecjalna(String nazwa, double czasGrillowania) {
        SushiSpecial ss = new SushiSpecial(nazwa, czasGrillowania);
        sprzedaneRolki.add(ss);
        return ss;
    }

    public String getNazwa() {
        return nazwa;
    }

    public List<Sushi> getSprzedaneRolki() {
        return sprzedaneRolki;
    }

    @Override
    public String toString() {
        return "FabrykaSushi [nazwa=" + nazwa + "]";
    }
}
