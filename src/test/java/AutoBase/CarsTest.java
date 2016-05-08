package AutoBase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CarsTest {

    @Test(alwaysRun = true)
    public void testCreationOfCars() {
        Cars cars = new Cars(4499, "Volvo");
        Assert.assertEquals(cars.getBrand(), "Volvo");
        Assert.assertEquals(cars.getNumberplate(), 4499);
    }

    @Test
    public void testToStringCars() {
        Cars cars = new Cars(9844, "Volvo");
        Assert.assertEquals(cars.toString(), "Car: Volvo numberplate - 9844");
    }
}
