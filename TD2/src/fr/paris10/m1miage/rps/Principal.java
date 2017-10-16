package fr.paris10.m1miage.rps;

public class Principal {
    public static void main(String[] args) {

        Player p1 = new Player("nas");
        Player p2 = new Player("sim");

        RockPaperScissors res = new RockPaperScissors();


        for (int i = 0; i < p1.getNbMouvements(); i++) {
            System.out.println(p1.getNom() + " plays : " + p1.getNextMove(i));
            System.out.println(p2.getNom() + " plays : " + p2.getNextMove(i));
            System.out.println(p1.getNom() + " " + res.play(p1.getNextMove(i), p2.getNextMove(i)));
            System.out.println(" ");

        }
        Result resultat = res.play(p1, p2);
        System.out.println("Apres " + p1.getNbMouvements() + " rounds on a :");
        System.out.println(p1.getNom() + " a obtenu un score de : " + p1.getScore());
        System.out.println(p2.getNom() + " a obtenu un score de : " + p2.getScore());
        System.out.println(p1.getNom() + " a obtenu le resultat : " + resultat);


    }
}
