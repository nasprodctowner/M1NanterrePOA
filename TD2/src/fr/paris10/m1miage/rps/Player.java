package fr.paris10.m1miage.rps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Player {
    private String nom;
    private int score;
    private List<RPSEnum> mouvements;
    private int nbMouvements;

    public Player(String nom, List<RPSEnum> mouvements) {
        this.nom = nom;
        this.mouvements = mouvements;
        this.score = 0;
    }

    public Player(String nom) {
        this.nom = nom;
        this.nbMouvements = 10;
        this.mouvements = new ArrayList<RPSEnum>();

        for(int i=0; i<nbMouvements; i++){
           this.mouvements.add(RPSEnum.getRandom());
        }
    }

    public RPSEnum getNextMove(){
        Iterator iterator = mouvements.iterator();

        while (iterator.hasNext()) {
            return (RPSEnum) iterator.next();
        }
        return null;
    }

    public String getNom() {
        return nom;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getNbMouvements() {
        return nbMouvements;
    }
}
