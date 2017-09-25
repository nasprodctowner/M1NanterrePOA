package fr.paris10.m1miage.personnels;

public class Etudiant extends Personnel {

    private String boursier;

    Etudiant(String nom, String prenom, String id, String boursier) {
        super(nom, prenom, id);
        this.boursier = boursier;
    }

    public String getBoursier() {
        return boursier;
    }

    public void setBoursier(String boursier) {
        this.boursier = boursier;
    }

    @Override
    public String toString(){
        return (super.toString()+" Boursier : "+this.getBoursier());
    }


}
