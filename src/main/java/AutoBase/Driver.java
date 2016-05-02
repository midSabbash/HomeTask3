package AutoBase;

public class Driver {

    private long Mobile;
    private String name;

    private int flightState;
    private boolean repairCar;


    public Driver(long mobile, String name) {
        this.setMobile(mobile);
        this.setName(name);
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

    public static int conditionCar () {
        int c = (int) (Math.random() * 3);
        switch (c) {
            case 0:
                System.out.println("car defective");
                break;
            case 1:
                System.out.println("car right");
                break;
            case 2:
                System.out.println("It requires minor repairs");
                break;
        }
        return c;
    }

    public static int flightState (int State) {
        return 0;
    }
}


