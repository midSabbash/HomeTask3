package Fraction;

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(){}

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction summing(Fraction f) {
        return new Fraction(this.numerator * f.denominator + f.numerator * this.denominator, this.denominator * f.denominator);
    }

    public Fraction subtraction(Fraction f) {
        return new Fraction(this.numerator * f.denominator - f.numerator * this.denominator, this.denominator * f.denominator);
    }

    public Fraction multiplication(Fraction f) {
        return new Fraction(this.numerator * f.numerator, this.denominator * f.denominator);
    }

    public Fraction divide(Fraction f) {
        return new Fraction (this.numerator * f.denominator, this.denominator * f.numerator);
    }

    public static double simplify(Fraction f) {
        return (double) f.numerator / f.denominator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator &&
                denominator == fraction.denominator;
    }
}