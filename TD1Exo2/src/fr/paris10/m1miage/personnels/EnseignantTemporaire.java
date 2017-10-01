package fr.paris10.m1miage.personnels;

import java.util.Date;

public abstract class EnseignantTemporaire extends Enseignant {

    public EnseignantTemporaire(String nom, String prenom, String id, CDD contrat, Departement departement) {
        super(nom, prenom, id, contrat, departement);
    }

    private Date finContrat(){
        return ((CDD)contrat).getDateFinContrat();
    }

    public String toString() {
        return super.toString()+" Fin : "+this.finContrat();
    }
}
