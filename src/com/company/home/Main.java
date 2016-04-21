package com.company.home;

import com.company.home.ComplexFraction.ComplexFraction;
import com.company.home.Fraction.Fraction;
import com.company.home.Game.Game;
import static com.company.home.Fraction.Fraction.simplify;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter 1|2|3|4");

        ComplexFraction complexFraction = new ComplexFraction(2,5);
        ComplexFraction complexFraction1 = new ComplexFraction(1,5);



        int answer = mainScanner();
        if(answer==1){
            Game game = new Game();
            game.theGame();
        }
        if(answer==2){
            Fraction fraction = new Fraction(mainScanner(), mainScanner());
            Fraction fraction1 = new Fraction(mainScanner(), mainScanner());

            System.out.println("The summing result " + fraction.summing(fraction1) + " Simplify -> " +simplify(fraction.summing(fraction1)));
            System.out.println("The subtraction result " + fraction.subtraction(fraction1)+ " Simplify -> " +simplify(fraction.subtraction(fraction1)));
            System.out.println("The multiplication result " + fraction.multiplication(fraction1)+ " Simplify -> " +simplify(fraction.multiplication(fraction1)));
            System.out.println("The divide result " + fraction.divide(fraction1) + " Simplify -> " +simplify(fraction.divide(fraction1)));
        }
        if(answer==3){
            System.out.println(complexFraction);
            System.out.println(complexFraction1);
            System.out.println(complexFraction.multiplication(complexFraction1));
        }
    }
    private static int mainScanner() {
        try {
            Scanner in = new Scanner(System.in);
            String scan = in.nextLine();
            return Integer.valueOf(scan);

        } catch (NumberFormatException e) {
            System.out.println("You can enter only number");
        }
        return mainScanner();
    }

}
