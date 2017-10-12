package fr.paris10.m1miage.rps;

public class RockPaperScissors {

    Result play(RPSEnum p1, RPSEnum p2) {

       if(p1 == p1.SCISSORS){
           if (p2 == p2.ROCK){
               return Result.LOST;
           }
           if (p2 == p2.PAPER){
               return Result.WIN;
           }
       }
       else if(p1 == p1.ROCK){
           if (p2 == p2.SCISSORS){
               return Result.WIN;
           }
           if (p2 == p2.PAPER){
               return Result.LOST;
           }
       }
       else if(p1 == p1.PAPER){
           if (p2 == p2.SCISSORS){
               return Result.LOST;
           }
           if (p2 == p2.ROCK){
               return Result.WIN;
           }
       }
       return Result.TIE;
    }
}
