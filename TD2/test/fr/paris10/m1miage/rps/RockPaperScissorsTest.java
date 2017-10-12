package fr.paris10.m1miage.rps;

import org.testng.annotations.*;

import java.awt.print.Paper;

import static org.testng.Assert.*;

public class RockPaperScissorsTest {


    RockPaperScissors rps;

    @BeforeMethod
    public void setUp() throws Exception {
        rps = new RockPaperScissors();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        rps = null;
    }

    @Parameters({"paper","rock"})
    @Test
    public void testWinPlay(String p1, String p2) throws Exception {
        assertEquals(rps.play(RPSEnum.valueOf(p1),RPSEnum.valueOf(p2)),Result.WIN);
    }

    @Parameters({"paper","paper"})
    @Test
    public void testTiePLay(String p1, String p2){
        assertEquals(rps.play(RPSEnum.valueOf(p1),RPSEnum.valueOf(p2)),Result.TIE);
    }

    @Parameters({"paper","scissors"})
    @Test
    public void testLostPlay(String p1, String p2){
        assertEquals(rps.play(RPSEnum.valueOf(p1),RPSEnum.valueOf(p2)),Result.LOST);
    }

    @DataProvider(name="winData")
    public Object [][] createWinData() {
        return new Object[][] {
                {RPSEnum.ROCK, RPSEnum.SCISSORS},
                {RPSEnum.PAPER, RPSEnum.ROCK},
                {RPSEnum.SCISSORS, RPSEnum.PAPER}
        } ;
    }

    @Test ( dataProvider = "winData")
    public void testWinPlay ( RPSEnum p1 , RPSEnum p2 ){
        assertEquals(rps.play(p1,p2),Result.WIN);
    }

    @DataProvider(name="tieData")
    public Object [][] createTieData() {
        return new Object[][] {
                {RPSEnum.ROCK, RPSEnum.ROCK},
                {RPSEnum.PAPER, RPSEnum.PAPER},
                {RPSEnum.SCISSORS, RPSEnum.SCISSORS}
        } ;
    }

    @Test ( dataProvider = "tieData")
    public void testTiePlay ( RPSEnum p1 , RPSEnum p2 ){
        assertEquals(rps.play(p1,p2),Result.TIE);
    }

    @DataProvider(name="lostData")
    public Object [][] createLostData() {
        return new Object[][] {
                {RPSEnum.ROCK, RPSEnum.PAPER},
                {RPSEnum.PAPER, RPSEnum.SCISSORS},
                {RPSEnum.SCISSORS, RPSEnum.ROCK}
        } ;
    }

    @Test ( dataProvider = "lostData")
    public void testLostData ( RPSEnum p1 , RPSEnum p2 ){
        assertEquals(rps.play(p1,p2),Result.LOST);
    }

    @DataProvider(name="allData")
    public Object [][] createAllData() {
        return new Object[][] {
                {RPSEnum.ROCK, RPSEnum.PAPER, Result.LOST},
                {RPSEnum.PAPER, RPSEnum.SCISSORS, Result.LOST},
                {RPSEnum.SCISSORS, RPSEnum.ROCK,Result.LOST},

                {RPSEnum.ROCK, RPSEnum.ROCK, Result.TIE},
                {RPSEnum.PAPER, RPSEnum.PAPER, Result.TIE},
                {RPSEnum.SCISSORS, RPSEnum.SCISSORS, Result.TIE},

                {RPSEnum.ROCK, RPSEnum.SCISSORS, Result.WIN},
                {RPSEnum.PAPER, RPSEnum.ROCK, Result.WIN},
                {RPSEnum.SCISSORS, RPSEnum.PAPER, Result.WIN}
        } ;
    }

    @Test ( dataProvider = "allData")
    public void testAllData ( RPSEnum p1 , RPSEnum p2, Result result ){
        assertEquals(rps.play(p1,p2),result);
    }
}