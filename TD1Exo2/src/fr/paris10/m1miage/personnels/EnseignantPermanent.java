package fr.paris10.m1miage.personnels;

public abstract class EnseignantPermanent extends Enseignant {
    String domaineRecherche;

    public EnseignantPermanent(String nom, String prenom, String id, CDI contrat, String domaineRecherche) {
        super(nom, prenom, id, contrat);
        this.domaineRecherche = domaineRecherche;
    }

    public String getDomaineRecherche() {
        return domaineRecherche;
    }

    public void setDomaineRecherche(String domaineRecherche) {
        this.domaineRecherche = domaineRecherche;
    }

    public double augmentation(double augmentation){
        contrat.setSalaire(contrat.getSalaire()+augmentation);
        return contrat.getSalaire();
    }

    @Override
    public String toString(){
        return super.toString()+" "+"Salaire : "+this.getSalaire()+" Debut : "+this.getDebut()+ " Domaine de recherche "+this.getDomaineRecherche();
    }
}
