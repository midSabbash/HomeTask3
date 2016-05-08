package AutoBase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderTest {

    @Test(alwaysRun = true)
    public void testCreationOfOrder() {
        Order order = new Order(499, "Kiev", "Auto parts", true);
        Assert.assertEquals(order.getDistance(), 499);
        Assert.assertEquals(order.getDestination(), "Kiev");
        Assert.assertEquals(order.getProduct(), "Auto parts");
    }

    @Test
    public void testToStringOrder() {
        Order order = new Order(499, "Kiev", "Auto parts",true);
        Assert.assertEquals(order.toString(), "Orderdistance = 499, destination - Kiev, product - Auto parts, status - true");
    }
}
