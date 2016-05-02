package AutoBase;

public class Cars {

    private int numberplate;
    private String brand;

    public Cars(int numberplate, String brand) {
        this.numberplate = numberplate;
        this.brand = brand;
    }

    public Cars() {
        this.setNumberplate( numberplate);
        this.setBrand(brand);
    }

    public int getNumberplate() {
        return numberplate;
    }

    public void setNumberplate(int numberplate) {
        this.numberplate = numberplate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car: " +
                 brand + ' ' +
                "numberplate - " + numberplate;
    }
}



