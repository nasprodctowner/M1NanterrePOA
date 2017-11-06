package fr.paris10.m1miage.burger.api;

public enum Extra {
    TOMATO(10,0.05),
    ONION(20,0.3),
    CHEDAR(30,1.2);

    private double poid;
    private double prix;

    Extra(double poid, double prix){
        this.poid = poid;
        this.prix = prix;
    }

    public double getPoid() {
        return poid;
    }

    public double getPrix() {
        return prix;
    }
}
