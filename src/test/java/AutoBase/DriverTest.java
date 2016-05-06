package AutoBase;


import org.testng.Assert;
import org.testng.annotations.Test;

public class DriverTest {

    @Test(alwaysRun = true)
    public void testCreationOfPerson() {
        Driver driver = new Driver(809393234, "Ivan", true);
        Assert.assertEquals(driver.getMobile(), 809393234);
        Assert.assertEquals(driver.getName(), "Ivan");
        Assert.assertEquals(driver.isCondition(), true);
    }

    @Test
    public void testToStringPersonMethod() {
        Driver driver = new Driver(809393234, "Ivan", true);
        Assert.assertEquals(driver.toString(), "Your driver Ivan, his phone number: 809393234");
    }
}
