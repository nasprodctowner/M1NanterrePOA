package fr.paris10.m1miage.personnels;

public class Vacataire extends EnseignantTemporaire {
    public Vacataire(String nom, String prenom, String id, CDD contrat) {
        super(nom, prenom, id, contrat);
    }
    public String toString(){
        return super.toString()+" "+"Salaire : "+this.getSalaire();
    }
}
