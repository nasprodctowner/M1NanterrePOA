package fr.paris10.m1miage.personnels;

public class Etudiant extends Personnel {

    private String boursier;

    Etudiant(String nom, String prenom, String id, String boursier) {
        super(nom, prenom, id);
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
