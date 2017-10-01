package fr.paris10.m1miage.personnels;

import java.util.Date;

public class Biatoss extends Personnel {
    private final Contrat contrat;

    public Biatoss(String nom, String prenom, String id, CDD contrat) {
        super(nom, prenom, id);
        this.contrat = contrat;
    }

    private double getSalary(){
        return contrat.getSalaire();
    }


    private Date debutContrat(){
        return contrat.getDateDebut();
    }

    private Date finContrat(){
        return ((CDD)contrat).getDateFinContrat();
    }

    @Override
    public String toString(){
        return super.toString()+" "+"Salaire: "+this.getSalary()+" Debut: "+this.debutContrat()+" Fin: "+this.finContrat();
    }
}
