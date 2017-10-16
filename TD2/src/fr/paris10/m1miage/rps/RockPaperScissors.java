package fr.paris10.m1miage.rps;

public class RockPaperScissors {

    Result play(RPSEnum p1, RPSEnum p2) {

        if (p1 == p1.SCISSORS) {
            if (p2 == p2.ROCK) {
                return Result.LOST;
            }
            if (p2 == p2.PAPER) {
                return Result.WIN;
            }
        } else if (p1 == p1.ROCK) {
            if (p2 == p2.SCISSORS) {
                return Result.WIN;
            }
            if (p2 == p2.PAPER) {
                return Result.LOST;
            }
        } else if (p1 == p1.PAPER) {
            if (p2 == p2.SCISSORS) {
                return Result.LOST;
            }
            if (p2 == p2.ROCK) {
                return Result.WIN;
            }
        }
        return Result.TIE;
    }

    Result play(Player p1, Player p2) {
        for (int i = 0; i < p1.getNbMouvements(); i++) {
            if (this.play(p1.getNextMove(i), p2.getNextMove(i)).equals(Result.TIE)) {
                p1.setScore(p1.getScore() + 1);
                p2.setScore(p2.getScore() + 1);

            } else if (this.play(p1.getNextMove(i), p2.getNextMove(i)).equals(Result.WIN)) {
                p1.setScore(p1.getScore() + 1);

            } else if (this.play(p1.getNextMove(i), p2.getNextMove(i)).equals(Result.LOST)) {
                p2.setScore(p2.getScore() + 1);
            }
        }
        if (p1.getScore() > p2.getScore()) return Result.WIN;
        else if (p1.getScore() < p2.getScore()) return Result.LOST;
        else if (p1.getScore() == p2.getScore()) return Result.TIE;

        return null;
    }
}
