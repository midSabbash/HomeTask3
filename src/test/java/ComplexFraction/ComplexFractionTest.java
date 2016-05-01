package ComplexFraction;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ComplexFractionTest {

    @Test
    public void summingTest1 () {
        Assert.assertEquals(new ComplexFraction(1,-2,1,3).summing(new ComplexFraction(1,-2,1,3)),new ComplexFraction(14,2,-8,6));
    }
}
