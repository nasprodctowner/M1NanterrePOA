package fr.paris10.m1miage.personnels;

import java.util.Date;

public abstract class Enseignant extends Personnel {

    final Contrat contrat;

    public Enseignant(String nom, String prenom, String id, Contrat contrat, Departement departement) {
        super(nom, prenom, id, departement);
        this.contrat = contrat;
    }

    private double getSalaire(){
        return this.contrat.getSalaire();
    }

    private Date getDebut(){
        return this.contrat.getDateDebut();
    }

    @Override
    public String toString(){
        return super.toString()+" "+"Salaire: "+this.getSalaire()+" Debut: "+this.getDebut();
    }
}
