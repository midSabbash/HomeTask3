package AutoBase;

public class Flight {
    private int fligthID;
    private String destination;

    Flight(int fligthID, String destination){
        this.setFligthID(fligthID);
        this.setDestination(destination);
    }

    public int getFligthID() {
        return fligthID;
    }

    public void setFligthID(int fligthID) {
        this.fligthID = fligthID;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
