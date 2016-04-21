package Fraction;

import java.util.Scanner;

public class Fraction {
    public int nominator;
    public int denominator;

    public Fraction(){}

    public Fraction(int nominator, int denominator){
        this.nominator = nominator;
        this.denominator = denominator;
    }

    public Fraction summing(Fraction f) {
        return new Fraction(this.nominator * f.denominator + f.nominator * this.denominator, this.denominator * f.denominator);
    }

    public Fraction subtraction(Fraction f) {
        return new Fraction(this.nominator * f.denominator - f.nominator * this.denominator, this.denominator * f.denominator);
    }

    public Fraction multiplication(Fraction f) {
        return new Fraction(this.nominator * f.nominator, this.denominator * f.denominator);
    }

    public Fraction divide(Fraction f) {
        return new Fraction (this.nominator * f.denominator, this.denominator * f.nominator);
    }

    public static double simplify(Fraction f) {
        return (double) f.nominator / f.denominator;
    }

    public String toString() {
        return nominator + "/" + denominator;
    }

    public static int myScanner() {
        Scanner in = new Scanner(System.in);
        String scan = in.nextLine();
        return Integer.valueOf(scan);
    }
}