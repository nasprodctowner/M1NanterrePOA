package fr.paris10.m1miage.personnels;

public class Secretaire extends Biatoss {
    public Secretaire(String nom, String prenom, String id, CDD contrat) {
        super(nom, prenom, id, contrat);
    }
    public String toString(){
        return super.toString()+" "+"Salaire : "+this.getSalary();
    }
}
