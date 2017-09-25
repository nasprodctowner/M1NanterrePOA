package fr.paris10.m1miage.personnels;

public class MaitreConferences extends EnseignantPermanent {
    public MaitreConferences(String nom, String prenom, String id, CDI contrat, String domaineRecherche) {
        super(nom, prenom, id, contrat, domaineRecherche);
    }

    public String toString() {
        return super.toString();
    }
}
