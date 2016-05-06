package AutoBase;

public class Order {

    public int distance;
    public String destination;
    public String product;
    public static boolean status;

    Order(int distance, String destination, String product, boolean status){
        this.setDistance(distance);
        this.setDestination(destination);
        this.setProduct(product);
        this.setStatus(status);
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Order" +
                "distance = " + distance +
                ", destination - " + destination +
                ", product - " + product +
                ", status - " + status;
    }

    public String toString(int a) {
        return "status - " + status;
    }
}
