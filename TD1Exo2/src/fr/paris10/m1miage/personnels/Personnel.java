package fr.paris10.m1miage.personnels;

public abstract class Personnel {
    private String nom;
    private String prenom;
    private String id;

    Personnel(String nom, String prenom, String id) { //on met un package car on a pas besoin que qqun extérieur utilisant ce constructeur
        this.nom = nom;
        this.prenom = prenom;
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getId() {
        return id;
    }

    //pas de setter car on change pas de nom prenom et identifiant

    @Override
    public String toString(){
        return this.getClass()+" "+prenom+" "+nom; //on est pas obligé d'afficher l'id
    }
}
