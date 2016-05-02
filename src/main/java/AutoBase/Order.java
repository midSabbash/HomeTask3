package AutoBase;

public class Order {

    private int distance;
    private String destination;
    private String product;

    Order(int distance, String destination, String product){
        this.setDistance(distance);
        this.setDestination(destination);
        this.setProduct(product);
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
}
