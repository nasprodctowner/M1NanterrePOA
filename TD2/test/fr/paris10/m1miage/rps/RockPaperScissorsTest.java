package fr.paris10.m1miage.rps;

import com.sun.org.apache.regexp.internal.RE;
import org.testng.annotations.*;


import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class RockPaperScissorsTest {


    RockPaperScissors rps;
    List<RPSEnum> lp1, lp2;
    Player p1, p2;
    Result res;

    @BeforeMethod
    public void setUpClass() throws Exception {
        rps = new RockPaperScissors();
        lp1 = new ArrayList<>();
        lp2 = new ArrayList<>();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        rps = null;
        lp1 = null;
        lp2 = null;
        p1 = null;
        p2 = null;
        res = null;
    }

    @Parameters({"wer9a", "hadjra"})
    @Test
    public void testWinPlay(String p1, String p2) throws Exception {
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.WIN);
    }

    @Parameters({"wer9a", "wer9a"})
    @Test
    public void testTiePLay(String p1, String p2) throws Exception {
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.TIE);
    }

    @Parameters({"wer9a", "m9as"})
    @Test
    public void testLostPlay(String p1, String p2) throws Exception {
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.LOST);
    }

    @DataProvider(name = "winData")
    public Object[][] createWinData() {
        return new Object[][]{
                {RPSEnum.ROCK, RPSEnum.SCISSORS},
                {RPSEnum.PAPER, RPSEnum.ROCK},
                {RPSEnum.SCISSORS, RPSEnum.PAPER}
        };
    }

    @Test(dataProvider = "winData")
    public void testWinPlay(RPSEnum p1, RPSEnum p2) {
        assertEquals(rps.play(p1, p2), Result.WIN);
    }

    @DataProvider(name = "tieData")
    public Object[][] createTieData() {
        return new Object[][]{
                {RPSEnum.ROCK, RPSEnum.ROCK},
                {RPSEnum.PAPER, RPSEnum.PAPER},
                {RPSEnum.SCISSORS, RPSEnum.SCISSORS}
        };
    }

    @Test(dataProvider = "tieData")
    public void testTiePlay(RPSEnum p1, RPSEnum p2) {
        assertEquals(rps.play(p1, p2), Result.TIE);
    }

    @DataProvider(name = "lostData")
    public Object[][] createLostData() {
        return new Object[][]{
                {RPSEnum.ROCK, RPSEnum.PAPER},
                {RPSEnum.PAPER, RPSEnum.SCISSORS},
                {RPSEnum.SCISSORS, RPSEnum.ROCK}
        };
    }

    @Test(dataProvider = "lostData")
    public void testLostData(RPSEnum p1, RPSEnum p2) {
        assertEquals(rps.play(p1, p2), Result.LOST);
    }

    @DataProvider(name = "allData")
    public Object[][] createAllData() {
        return new Object[][]{
                {RPSEnum.ROCK, RPSEnum.PAPER, Result.LOST},
                {RPSEnum.PAPER, RPSEnum.SCISSORS, Result.LOST},
                {RPSEnum.SCISSORS, RPSEnum.ROCK, Result.LOST},

                {RPSEnum.ROCK, RPSEnum.ROCK, Result.TIE},
                {RPSEnum.PAPER, RPSEnum.PAPER, Result.TIE},
                {RPSEnum.SCISSORS, RPSEnum.SCISSORS, Result.TIE},

                {RPSEnum.ROCK, RPSEnum.SCISSORS, Result.WIN},
                {RPSEnum.PAPER, RPSEnum.ROCK, Result.WIN},
                {RPSEnum.SCISSORS, RPSEnum.PAPER, Result.WIN}
        };
    }

    @Test(dataProvider = "allData")
    public void testAllData(RPSEnum p1, RPSEnum p2, Result result) {
        assertEquals(rps.play(p1, p2), result);
    }


    @Test
    public void testLostPlayer1() throws Exception {


        lp1.add(RPSEnum.SCISSORS);
        lp2.add(RPSEnum.ROCK);

        p1 = new Player("nas", lp1);
        p2 = new Player("sim", lp2);

        res = rps.play(p1, p2);

        assertEquals(res, Result.LOST);
    }

    @Test
    public void testWinPlayer1() throws Exception {

        lp1.add(RPSEnum.SCISSORS);
        lp2.add(RPSEnum.PAPER);

        p1 = new Player("nas", lp1);
        p2 = new Player("sim", lp2);

        res = rps.play(p1, p2);

        assertEquals(res, Result.WIN);
    }

    @Test
    public void testTIEPlayer1() throws Exception {

        lp1.add(RPSEnum.PAPER);
        lp2.add(RPSEnum.PAPER);

        p1 = new Player("nas", lp1);
        p2 = new Player("sim", lp2);

        res = rps.play(p1, p2);

        assertEquals(res, Result.TIE);
    }


}