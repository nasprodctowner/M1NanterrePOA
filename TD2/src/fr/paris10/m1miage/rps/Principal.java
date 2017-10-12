package fr.paris10.m1miage.rps;

public class Principal {
    public static void main(String[] args){
        Player p1 = new Player("nas");
        Player p2 = new Player("sim");
        RockPaperScissors res = new RockPaperScissors();
        System.out.println(p1.getNom()+" plays : "+p1.getNextMove().toString());
        System.out.println(p2.getNom()+" plays : "+p2.getNextMove().toString());

        System.out.println("player : "+p1.getNom()+" "+res.play(p1.getNextMove(),p2.getNextMove()));


    }
}
