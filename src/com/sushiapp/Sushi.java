package com.sushiapp;

import java.util.ArrayList;
import java.util.List;

public class Sushi {
    protected String nazwa;
    private static int ileZrobilemRolek;
    protected List<String> skladniki;
    protected int cena;
    public Sushi(String nazwa) {
        this.nazwa = nazwa;
        this.skladniki = new ArrayList<String>();
        dodajSkladnik("Ryż");
        ileZrobilemRolek++;
    }
    protected void dodajSkladnik(String skladnik) {
        skladniki.add(skladnik);
    }
    public List<String> getSkladniki(){
        return skladniki;
    }
    public static int ileZrobilemRolek() {
        return ileZrobilemRolek;
    }
    public int getCena() {
        return cena;
    }
    public String getNazwa() {
        return nazwa;
    }
}

