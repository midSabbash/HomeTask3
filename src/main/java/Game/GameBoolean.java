package Game;

import java.util.Random;

public class GameBoolean {
    public static boolean game(int answer, int random) {
        if(answer < random) {
            System.out.println("Small");
            return false;
        }
        if(answer > random) {
            System.out.println("Big");
            return false;
        }
        System.out.println("Win");
        return true;
    }

    public static int generateRandom() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
}


