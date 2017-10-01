package fr.paris10.m1miage.personnels;

import java.util.Date;

public abstract class Contrat {

    private double salaire;
    private Date dateDebut;

    Contrat(double salaire, Date dateDebut) {
        this.salaire = salaire;
        this.dateDebut = dateDebut;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

}
