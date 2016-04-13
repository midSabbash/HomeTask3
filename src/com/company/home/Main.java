package com.company.home;

import com.company.home.Fraction.Fraction;
import com.company.home.Game.Game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        Fraction fraction = new Fraction();

        int answer = myScanner();

        if(answer==1){
            game.theGame();
        }
        if(answer==2){
            fraction.summing(5,9,9,11);
            fraction.subtraction(75,100,2,4);
            fraction.division(5,4,3,4);
            fraction.multiplication(2,5,3,4);
        }
    }
    public static int myScanner() {
        Scanner in = new Scanner(System.in);
        String scan = in.nextLine();
        int answer = Integer.valueOf(scan);
        return answer;
    }
}