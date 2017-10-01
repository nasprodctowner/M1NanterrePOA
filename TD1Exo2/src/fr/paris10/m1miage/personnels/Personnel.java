package fr.paris10.m1miage.personnels;

abstract class Personnel {
    private final String nom;
    private final String prenom;
    private final String id;

    public Personnel(String nom, String prenom, String id) { //on met un package car on a pas besoin que qqun extérieur utilisant ce constructeur
        this.nom = nom;
        this.prenom = prenom;
        this.id = id;
    }

    //pas de setter car on change pas de nom prenom et identifiant

    @Override
    public String toString(){
        return this.getClass().getSimpleName()+": "+"Prénom: "+prenom+" "+"Nom: "+nom;//on est pas obligé d'afficher l'id
    }
}
