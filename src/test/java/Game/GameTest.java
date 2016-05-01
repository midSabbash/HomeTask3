package Game;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class GameTest {

    @Test
    public void randomTest1 () {
        for (int i = 0; i < 100; i++) {
            int generatedNumber = Game.generateRandom();
            boolean isInRange = generatedNumber >= 0 && generatedNumber <= 100;
            Assert.assertEquals(isInRange, true);
        }
    }

    @Test
    public void theGameTest1() {
        int answer = randomAnswer();
        boolean ifSmaller = answer < Game.generateRandom();
        Assert.assertEquals(ifSmaller, true);
    }

    @Test
    public void theGameTest2() {
        int answer = Game.gameScanner();
        boolean ifBigger = answer > Game.generateRandom();
        Assert.assertEquals(ifBigger, true);
    }

    @Test
    void  theGameTest3() {
        int answer = Game.gameScanner();
        boolean ifWin = answer == Game.generateRandom();
        Assert.assertEquals(ifWin, true);
    }

    @Test (expectedExceptions = NumberFormatException.class)
    public void myScannerTest1() {

//        if(Game.gameScanner() == "null" ){
//            throw new NumberFormatException();
        }
//        try {
//            Game.gameScanner() = new System.in("adgas");
//        } catch (NumberFormatException e) {
//            e.printStackTrace();
//        }
//    }

    public static int randomAnswer() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    @Test
    public void mainScannerTest () {
        Assert.assertEquals(Game.gameScanner(),"You can enter only digits");
    }
}
