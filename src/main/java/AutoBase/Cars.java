package AutoBase;

public class Cars {
    private int numberplate;
    private String brend;


    public Cars(int carID, String brend) {
        this.setNumberplate(carID);
        this.setBrend(brend);
    }

    public int getNumberplate() {
        return numberplate;
    }

    public void setNumberplate(int numberplate) {
        this.numberplate = numberplate;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }
}

