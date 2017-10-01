package fr.paris10.m1miage.personnels;

public enum Departement {
    Langues("Département de langues"),
    Philosophie("Départemet de philosophie"),
    Droit("Département de droit"),
    Mathematiques("Département de mathématiques"),
    Informatique("Département de l'informatique"),
    Gestion("Département de gestion"),
    ServiceDesTraitements("Département de service des traitements"),
    SecretariatGeneral("Secrétariat général"),
    Comptabilité("Département de comptabilité");

    private String nom;

    Departement(String nom){
        this.nom = nom;
    }

    public String toString(){
        return nom;
    }
}
