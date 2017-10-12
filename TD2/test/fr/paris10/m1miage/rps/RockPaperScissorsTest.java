package fr.paris10.m1miage.rps;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

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


}