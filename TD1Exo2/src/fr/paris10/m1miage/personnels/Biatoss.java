package fr.paris10.m1miage.personnels;

import java.util.Date;

public class Biatoss extends Personnel {
    private Contrat contrat;

    public Biatoss(String nom, String prenom, String id, CDD contrat) {
        super(nom, prenom, id);
        this.contrat = contrat;
    }

    public double getSalary(){
        return ((CDD)contrat).getSalaire();
    }


    public Date debutContrat(){
        return ((CDD)contrat).getDateDebut();
    }

    public Date finContrat(){
        return ((CDD)contrat).getDateFinContrat();
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
