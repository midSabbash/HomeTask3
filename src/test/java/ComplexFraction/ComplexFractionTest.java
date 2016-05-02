package ComplexFraction;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ComplexFractionTest {

    @Test
    public void simplify () {
        Assert.assertEquals(new ComplexFraction(14,2,-8,6).simplify(),new ComplexFraction(-1.0D,1.0D));
    }

    @Test
    public void summingTest1 () {
        Assert.assertEquals(new ComplexFraction(1,-2,1,3).summing(new ComplexFraction(1,-2,1,3)),new ComplexFraction(14,2,-8,6));
    }

    @Test
    public void subtractionTest1 () {
        Assert.assertEquals(new ComplexFraction(1,-2,1,3).subtract(new ComplexFraction(1,-2,1,3)),new ComplexFraction(0,0,-8,6));
    }

    @Test
    public void multiplicationTest1 () {
        Assert.assertEquals(new ComplexFraction(1,-2,1,3).multiply(new ComplexFraction(1,-2,1,3)),new ComplexFraction(-3,-4,-8,6));
    }

    @Test
    public void divideTest1 () {
        Assert.assertEquals(new ComplexFraction(1,-2,1,3).divide(new ComplexFraction(1,-2,1,3)),new ComplexFraction(7,1,7,1));
    }
}
