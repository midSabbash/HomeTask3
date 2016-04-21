package Game;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public void theGame() {
        System.out.println("Enter the number from 1 to 100 ");
        int random = generateRandom();
        int answer = myScanner();
        while (answer != random) {
            if (answer <= 0 | answer > 100) {
                System.out.println("Wrong number");
                answer = myScanner();
            }
            if (answer < random) {
                System.out.println("small");
                answer = myScanner();
            }
            if (answer > random) {
                System.out.println("big");
                answer = myScanner();
            }
        }
        System.out.println("You win!");
    }

    private static int generateRandom() {
        Random random = new Random();
        return random.nextInt(100) + 1;

    }

    private static int myScanner() {
        try {
            Scanner in = new Scanner(System.in);
            String scan = in.nextLine();
            return Integer.valueOf(scan);
        } catch (NumberFormatException e) {
            System.out.println("You can enter only number");
        }
        return myScanner();
    }
}

