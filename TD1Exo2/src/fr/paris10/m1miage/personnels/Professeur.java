package fr.paris10.m1miage.personnels;

class Professeur extends EnseignantPermanent {

    public Professeur(String nom, String prenom, String id, CDI contrat, String domaineRecherche, Departement departement) {
        super(nom, prenom, id, contrat, domaineRecherche, departement);
    }


}
