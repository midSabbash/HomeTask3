import ComplexFraction.ComplexFraction;
import Fraction.Fraction;
import Game.Game;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter 1|2|3|4");

        Game game = new Game();
        ComplexFraction complexFraction = new ComplexFraction(1,2,3,4);
        ComplexFraction complexFraction1 = new ComplexFraction(5,6,7,8);

        System.out.println(complexFraction.summing(complexFraction1));
        System.out.println(complexFraction.subtract(complexFraction1));



//        ComplexFraction complexFraction2 = new ComplexFraction();
//        ComplexFraction complexFraction3 = new ComplexFraction(3,5);

        int answer = mainScanner();

        if(answer==1){
            game.theGame();
        }
        if(answer==2){
            Fraction fraction = new Fraction(mainScanner(), mainScanner());
            Fraction fraction1 = new Fraction(mainScanner(), mainScanner());

            System.out.println("The summing result " + fraction.summing(fraction1) + " Simplify -> " + Fraction.simplify(fraction.summing(fraction1)));
            System.out.println("The subtraction result " + fraction.subtraction(fraction1)+ " Simplify -> " + Fraction.simplify(fraction.subtraction(fraction1)));
            System.out.println("The multiplication result " + fraction.multiplication(fraction1)+ " Simplify -> " + Fraction.simplify(fraction.multiplication(fraction1)));
            System.out.println("The divide result " + fraction.divide(fraction1) + " Simplify -> " + Fraction.simplify(fraction.divide(fraction1)));
        }
        if(answer==3){

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
