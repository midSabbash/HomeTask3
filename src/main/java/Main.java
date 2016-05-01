import ComplexFraction.ComplexFraction;
import Fraction.Fraction;
import Game.Game;
import Game.GameBoolean;
import java.util.Scanner;

public class Main {

    private static int mainScanner() {
        try {
            Scanner in = new Scanner(System.in);
            String scan = in.nextLine();
            return Integer.valueOf(scan);

        } catch (NumberFormatException e) {
            System.out.println("Only digits");
        }
        return mainScanner();
    }

    public static void main(String[] args) {
        System.out.println("Enter 1|2|3|4");

//        Game game = new Game();
//        GameBoolean gameBoolean = new GameBoolean();
          int random = GameBoolean.generateRandom();
//        while (!GameBoolean.game(mainScanner(),random));



        int answer = mainScanner();
        if(answer==1){
//            game.theGame();
            System.out.println("Enter the number from 1 to 100");
            while (!GameBoolean.game(mainScanner(),random));
        }
        if(answer==2){
            Fraction fraction = new Fraction(2, 3);
            Fraction fraction1 = new Fraction(3, 5);

            System.out.println("The summing result " + fraction.summing(fraction1) + " Simplify -> " + Fraction.simplify(fraction.summing(fraction1)));
            System.out.println("The subtraction result " + fraction.subtraction(fraction1)+ " Simplify -> " + Fraction.simplify(fraction.subtraction(fraction1)));
            System.out.println("The multiplication result " + fraction.multiplication(fraction1)+ " Simplify -> " + Fraction.simplify(fraction.multiplication(fraction1)));
            System.out.println("The divide result " + fraction.divide(fraction1) + " Simplify -> " + Fraction.simplify(fraction.divide(fraction1)));
        }
        if(answer==3){
            ComplexFraction complexFraction = new ComplexFraction(1,-2,1,3);
            ComplexFraction complexFraction1 = new ComplexFraction(1,-2,1,3);

            System.out.println("The summing result " + complexFraction.summing(complexFraction1));
            System.out.println("The subtraction result " + complexFraction.subtract(complexFraction1));
            System.out.println("The multiplication result " + complexFraction.multiply(complexFraction1));
            System.out.println("The divide result " + complexFraction.divide(complexFraction1));
        }
    }
}
