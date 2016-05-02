package AutoBase;

import AutoBase.Cars;

import java.util.Scanner;

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

        Order order1 = new Order(499, "Kiev", "Auto parts");
        Order order2 = new Order(1017, "Lvov", "Pistons");
        Order order3 = new Order(715, "Odessa", "Tires");
        Order order4 = new Order(803, "Rovno", "Wheels");
        Order order5 = new Order(541, "Nikolaev", "Moto parts");

        Cars car1 = new Cars(9844, "Volvo");
        Cars car2 = new Cars(8432, "DAF");
        Cars car3 = new Cars(3210, "Mercedes");
        Cars car4 = new Cars(7731, "MAN");
        Cars car5 = new Cars(1322, "Ford");

        Driver driver1 = new Driver(809393234, "Ivan");
        Driver driver2 = new Driver(805073721, "Gena");
        Driver driver3 = new Driver(806356324, "Nina");
        Driver driver4 = new Driver(809723111, "Artur");
        Driver driver5 = new Driver(805088332, "Mark");

        System.out.println("Select Car:");
        System.out.println("1 " + car1);
        System.out.println("2 " + car2);
        System.out.println("3 " + car3);
        System.out.println("4 " + car4);
        System.out.println("5 " + car5);

        int answer = dispScanner();
        switch (answer){
            case 1:
                System.out.println(car1);
                repair();
                break;
            case 2:
                System.out.println(car2);
                repair();
                break;
            case 3:
                System.out.println(car3);
                repair();
                break;
            case 4:
                System.out.println(car4);
                repair();
                break;
            case 5:
                System.out.println(car5);
                repair();
        }

        int i = (int) (Math.random() * 5);
        switch (i){
            case 1:
                System.out.println(driver1);
                break;
            case 2:
                System.out.println(driver2);
                break;
            case 3:
                System.out.println(driver3);
                break;
            case 4:
                System.out.println(driver4);
                break;
            case 5:
                System.out.println(driver5);
        }
    }

    public void removeDriver (Driver driver) {

    }

    public void order (Order order){

    }

    public static int repair() {
        int condition = Driver.conditionCar();
        System.out.println(condition);
        return condition;
    }


}
