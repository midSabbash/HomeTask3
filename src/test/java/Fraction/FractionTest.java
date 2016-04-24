package Fraction;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FractionTest {

    @Test
    public void simplifySumming () {
        Assert.assertEquals(Fraction.simplify(new Fraction(3,5).summing(new Fraction(3,5))),1.2D);
    }

    @Test
    public void simplifySubtraction () {
        Assert.assertEquals(Fraction.simplify(new Fraction(2,6).subtraction(new Fraction(3,5))),-0.26666666666666666D);
    }

    @Test
    public void simplifyMultiplication () {
        Assert.assertEquals(Fraction.simplify(new Fraction(1,4).multiplication(new Fraction(2,5))),0.1D);
    }

    @Test
    public void simplifyDivide () {
        Assert.assertEquals(Fraction.simplify(new Fraction(2,4).divide(new Fraction(2,4))),1.0D);
    }

    @Test
    public void summingTest1() {
        Assert.assertEquals(new Fraction(3,5).summing(new Fraction(3,5)),new Fraction(30,25));
    }

    @Test
    public void summingTest2() {
        Assert.assertEquals(new Fraction(-3,5).summing(new Fraction(3,5)),new Fraction(0,25));
    }

    @Test
    public void summingTest3() {
        Assert.assertEquals(new Fraction(2,6).summing(new Fraction(3,5)),new Fraction(28,30));
    }


    @Test
    public void subtractionTest1() {
        Assert.assertEquals(new Fraction(3,5).subtraction(new Fraction(3,5)),new Fraction(0,25));
    }

    @Test
    public void subtractionTest2() {
        Assert.assertEquals(new Fraction(-3,5).subtraction(new Fraction(3,5)),new Fraction(-30,25));
    }

    @Test
    public void subtractionTest3() {
        Assert.assertEquals(new Fraction(2,6).subtraction(new Fraction(3,5)),new Fraction(-8,30));
    }

    @Test
    public void multiplicationTest1() {
        Assert.assertEquals(new Fraction(3,5).multiplication(new Fraction(3,5)),new Fraction(9,25));
    }

    @Test
    public void multiplicationTest2() {
        Assert.assertEquals(new Fraction(-3,5).multiplication(new Fraction(3,5)),new Fraction(-9,25));
    }

    @Test
    public void multiplicationTest3() {
        Assert.assertEquals(new Fraction(2,6).multiplication(new Fraction(3,5)),new Fraction(6,30));
    }

    @Test
    public void divideTest1() {
        Assert.assertEquals(new Fraction(3,5).divide(new Fraction(3,5)), new Fraction(15,15));
    }

    @Test
    public void divideTest2() {
        Assert.assertEquals(new Fraction(-3,5).divide(new Fraction(3,5)), new Fraction(-15,15));
    }

    @Test
    public void divideTest3() {
        Assert.assertEquals(new Fraction(2,6).divide(new Fraction(3,5)), new Fraction(10,18));
    }
}
