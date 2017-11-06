package fr.paris10.m1miage.burger.api;

import java.util.ArrayList;
import java.util.List;

public class Burger {
    private Meat meat;
    private Size size;

    private List<Sauce> sauces;
    private List<Extra> extras;

    public Burger (Meat meat, Size size){
        this.meat = meat;
        this.size = size;
        this.sauces = new ArrayList();
        this.extras = new ArrayList<>();
    }

    public void withCheese(){
        extras.add(Extra.CHEDAR);
    }

    public void withOnion(){
        extras.add(Extra.ONION);
    }


    public List<Sauce> getSauces() {
        return sauces;
    }

    public void setSauces(List<Sauce> sauces) {
        this.sauces = sauces;
    }

    public Meat getMeat() {
        return meat;
    }

    public Size getSize() {
        return size;
    }

    public List<Extra> getExtras() {
        return extras;
    }

    @Override
    public String toString() {
        return "Viande : "+meat+" Taille : "+size+" Sauces : "+ sauces+" Extras : "+extras;
    }
}
