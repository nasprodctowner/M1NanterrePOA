package fr.paris10.m1miage.personnels;

public abstract class EnseignantPermanent extends Enseignant {

    private String domaineRecherche;

    public EnseignantPermanent(String nom, String prenom, String id, CDI contrat, String domaineRecherche, Departement departement) {
        super(nom, prenom, id, contrat, departement);
        this.domaineRecherche = domaineRecherche;
    }

    private String getDomaineRecherche() {
        return domaineRecherche;
    }

    public void augmentation(double augmentation){
        contrat.setSalaire(contrat.getSalaire()+augmentation);
    }

    @Override
    public String toString(){
        return super.toString()+" Domaine de recherche: "+this.getDomaineRecherche();
    }
}
