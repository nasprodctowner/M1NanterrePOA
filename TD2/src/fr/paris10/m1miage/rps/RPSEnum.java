package fr.paris10.m1miage.rps;

public enum RPSEnum {
    ROCK("Rocher"),
    PAPER("Papier"),
    SCISSORS("Ciseaux");

    public String name;

    RPSEnum(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public static RPSEnum getRandom() {
        return RPSEnum.values()[(int) (Math.random() * RPSEnum.values().length)];
    }
}
