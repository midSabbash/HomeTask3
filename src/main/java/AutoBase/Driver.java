package AutoBase;

public class Driver {
    private int driverID;
    private String name;

    public Driver(int driverID, String name) {
        this.setDriverID(driverID);
        this.setName(name);
    }

    public int getDriverID() {
        return driverID;
    }

    public void setDriverID(int driverID) {
        this.driverID = driverID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
