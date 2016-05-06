package AutoBase;

public class Driver {

    private long Mobile;
    private String name;
    public boolean condition;

    public Driver(long mobile, String name, boolean condition) {
        Mobile = mobile;
        this.name = name;
        this.condition = condition;
    }

    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    public long getMobile() {
        return Mobile;
    }

    public void setMobile(long mobile) {
        this.Mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Your driver " + name + ", " + "his phone number: " + Mobile;
    }

    static void conditionCar() {
        int c = (int) (Math.random() * 2);
        switch (c) {
            case 0:
                System.out.println("car defective");
                break;
            case 1:
                System.out.println("car right");
                break;
        }
    }

    public static Order statusOrder (Order order, int check){
        System.out.println("Order to " + order.destination + " Finished");
        if (check == 1) return new Order(order.distance, order.destination, order.product, false);
        return order;
    }

    public static Driver reason(Driver driver) {
        int i = (int) (Math.random() * 10);
        switch (i) {
            case 1:
                System.out.println("Seek");
                driver.condition = false;
                break;
            case 2:
                System.out.println("Drunk");
                driver.condition = false;
                break;
            case 3:
                System.out.println("Got hurt");
                driver.condition = false;
                break;
            default:
        }
        return driver;
    }
}


