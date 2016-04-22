package Fraction;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FractionTest {

    Fraction fraction = new Fraction(2,4);
    Fraction fraction1 = new Fraction(2,4);

    FractionTest(){}

    @Test
    public void simplifyTest1 () {
        Assert.assertEquals(Fraction.simplify(fraction.summing(fraction1)),1.0D);
    }

    @Test
    public void summingTest1() {

    }

    @Test
    public void subtractionTest1() {

    }

    @Test
    public void multiplicationTest1() {

    }

    @Test
    void divideTest() {

    }


}
