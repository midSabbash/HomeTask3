package AutoBase;

import java.util.ArrayList;
import java.util.Scanner;

import static AutoBase.Driver.statusOrder;

public class Dispatcher {

    private static int dispScanner() {
        try {
            Scanner in = new Scanner(System.in);
            String scan = in.nextLine();
            return Integer.valueOf(scan);

        } catch (NumberFormatException e) {
            System.out.println("Only digits");
        }
        return dispScanner();
    }

    public static void main(String[] args) {

        Order order1 = new Order(499, "Kiev", "Auto parts",true);
        Order order2 = new Order(1017, "Lvov", "Pistons",true);
        Order order3 = new Order(715, "Odessa", "Tires",true);
        Order order4 = new Order(803, "Rovno", "Wheels",true);
        Order order5 = new Order(541, "Nikolaev", "Moto parts",true);

        Cars car1 = new Cars(9844, "Volvo");
        Cars car2 = new Cars(8432, "DAF");
        Cars car3 = new Cars(3210, "Mercedes");
        Cars car4 = new Cars(7731, "MAN");
        Cars car5 = new Cars(1322, "Ford");

        Driver driver1 = new Driver(809393234, "Ivan", true);

        System.out.println("Select Car:");
        System.out.println("1 " + car1);
        System.out.println("2 " + car2);
        System.out.println("3 " + car3);
        System.out.println("4 " + car4);
        System.out.println("5 " + car5);

        System.out.println(statusOrder(order1,2).toString(0));

        int answer = dispScanner();
        switch (answer){
            case 1:
                System.out.println(car1);
                selectDriver();
                Driver.conditionCar();
                break;
            case 2:
                System.out.println(car2);
                selectDriver();
                Driver.conditionCar();
                break;
            case 3:
                System.out.println(car3);
                selectDriver();
                Driver.conditionCar();
                break;
            case 4:
                System.out.println(car4);
                selectDriver();
                Driver.conditionCar();
                break;
            case 5:
                System.out.println(car5);
                selectDriver();
                Driver.conditionCar();
        }

        removeDriver(driver1);
    }

    private static int selectDriver(){
        int i = (int) (Math.random() * 5);
        switch (i){
            case 1:
                System.out.println(new Driver(809393234, "Ivan", true));
                break;
            case 2:
                System.out.println(new Driver(805073721, "Gena", true));
                break;
            case 3:
                System.out.println(new Driver(806356324, "Nina", true));
                break;
            case 4:
                System.out.println(new Driver(809723111, "Artur", true));
                break;
            case 5:
                System.out.println(new Driver(805088332, "Mark", true));
        }
        return i;

    }

    public Order createOrder (int distance, String destination, String product, boolean status){
        return new Order(distance, destination, product, status);
    }

    private static void removeDriver(Driver driver) {
        Driver Jeka = Driver.reason(driver);
        if(Jeka.condition) blackList(Jeka);
    }

    private static void blackList(Driver driver) {
        ArrayList<Driver> drivers = new ArrayList<Driver>();
        drivers.add(driver);
        System.out.println(drivers.get(0));
        System.out.println(drivers.size());

    }
}
