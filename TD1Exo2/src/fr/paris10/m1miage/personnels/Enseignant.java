package fr.paris10.m1miage.personnels;

import java.util.Date;

public abstract class Enseignant extends Personnel { //abstrait car

    protected Contrat contrat;

    Enseignant(String nom, String prenom, String id, Contrat contrat) {
        super(nom, prenom, id);
        this.contrat = contrat;
    }

    public double getSalaire(){
        return this.contrat.getSalaire();
    }

    public Date getDebut(){
        return this.contrat.getDateDebut();
    }

    @Override
    public String toString(){
        return super.toString()+" "+"Salaire : "+this.getSalaire()+" Debut : "+this.getDebut();
    }
}
