package fr.paris10.m1miage.personnels;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Personnel e1 = new Etudiant("Khatir", "Nassim", "1", "Oui", Departement.Informatique);
        Personnel d1 = new Doctorant("Khatir", "Nassim", "1", "Oui", Departement.Informatique);
        Personnel pr1 = new Professeur("Khatir", "Nassim", "1", new CDI(40, new Date()), "Informatique", Departement.Informatique);
        Personnel mdc1 = new MaitreConferences("Khatir", "Nassim", "1", new CDI(40, new Date()), "Informatique", Departement.Informatique);
        Personnel ater1 = new Ater("KHATIR", "Nassim", "1", new CDD(40, new Date(), new Date()), Departement.Informatique);
        Personnel v1 = new Vacataire("KHATIR", "Nassim", "1", new CDD(40, new Date(), new Date()), Departement.Informatique);
        Personnel bt1 = new Biatoss("KHATIR", "Nassim", "1", new CDD(40, new Date(), new Date()), Departement.Informatique);
        Personnel bbt1 = new Bibliothequaire("KHATIR", "Nassim", "1", new CDD(40, new Date(), new Date()), Departement.Informatique);
        Personnel sc1 = new Secretaire("KHATIR", "Nassim", "1", new CDD(40, new Date(), new Date()), Departement.Informatique);


        List<Personnel> personnels = Arrays.asList(e1, d1, pr1, mdc1, ater1, v1, bt1, bbt1, sc1);
        for (Personnel p : personnels) {
            System.out.println(p + "\n");
        }

        Professeur pr2 = (Professeur) pr1;
        pr2.augmentation(10);

        System.out.println(pr2);

    }
}
