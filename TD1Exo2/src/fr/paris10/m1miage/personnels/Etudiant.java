package fr.paris10.m1miage.personnels;

public class Etudiant extends Personnel {

    private String boursier;

    public Etudiant(String nom, String prenom, String id, String boursier, Departement departement) {
        super(nom, prenom, id, departement);
        this.boursier = boursier;
    }

    private String getBoursier() {
        return boursier;
    }

    @Override
    public String toString(){
        return super.toString()+" Boursier: "+this.getBoursier();
    }

}
