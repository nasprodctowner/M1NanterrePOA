package fr.paris10.m1miage.personnels;

import java.util.Date;

public class CDD extends Contrat {

    private Date dateFinContrat;

    public CDD(double salaire, Date dateDebut, Date dateFinContrat) {
        super(salaire, dateDebut);
        this.dateFinContrat = dateFinContrat;
    }

    public Date getDateFinContrat() {
        return dateFinContrat;
    }

    public void setDateFinContrat(Date dateFinContrat) {
        this.dateFinContrat = dateFinContrat;
    }
}
