package Game;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GameBooleanTest {
    @Test
    public void randomTest1 () {
        for (int i = 0; i < 100; i++) {
            int generatedNumber = GameBoolean.generateRandom();
            boolean isInRange = generatedNumber >= 0 && generatedNumber <= 100;
            Assert.assertEquals(isInRange, true);
        }
    }

    @Test
    public void gameTest1 () {
        Assert.assertEquals(GameBoolean.game(7,7),true);
    }

    @Test
    public void gameTest2 () {
        Assert.assertEquals(GameBoolean.game(33,94),false);
    }

    @Test
    public void gameTest3 () {
        Assert.assertEquals(GameBoolean.game(88,77),false);
    }

}
