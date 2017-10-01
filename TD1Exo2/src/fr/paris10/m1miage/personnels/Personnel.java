package fr.paris10.m1miage.personnels;

abstract class Personnel {
    private final String nom;
    private final String prenom;
    private final String id;
    private final Departement departement;

    public Personnel(String nom, String prenom, String id, Departement departement) { //on met un package car on a pas besoin que qqun extérieur utilisant ce constructeur
        this.nom = nom;
        this.prenom = prenom;
        this.id = id;
        this.departement = departement;
    }

    //pas de setter car on change pas de nom prenom et identifiant

    @Override
    public String toString(){
        return this.getClass().getSimpleName()+": "+"Prénom: "+prenom+" "+"Nom: "+nom+" "+departement;//on est pas obligé d'afficher l'id
    }
}
