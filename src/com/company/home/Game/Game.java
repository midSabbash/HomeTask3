package com.company.home.Game;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void theGame() {
        System.out.println("Enter the number from 1 to 100 ");
        int random = generateRandom();
        int answer = myScanner();
        while (answer!=random){
            if (answer < random) {
                System.out.println("small");
                answer = myScanner();
            }
            if (answer > random) {
                System.out.println("big");
                answer = myScanner();
            }
        }
        System.out.println("Yuo win!");
    }
    public static int generateRandom () {
        Random random = new Random();
        int n = random.nextInt(100)+1;
        return n;
    }
    public static int myScanner() {
        Scanner in = new Scanner(System.in);
        String scan = in.nextLine();
        int answer = Integer.valueOf(scan);
        while (answer<=0|answer>100) {
            System.out.println("Wrong number");
            return myScanner();
        }
        return answer;
    }
}