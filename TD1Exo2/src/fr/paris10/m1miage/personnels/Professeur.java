package fr.paris10.m1miage.personnels;

public class Professeur extends EnseignantPermanent {

    public Professeur(String nom, String prenom, String id, CDI contrat, String domaineRecherche) {
        super(nom, prenom, id, contrat, domaineRecherche);
    }

    @Override
    public String toString(){
        return "Professeur : "+super.toString();
    }
}
