package ComplexFraction;

import Fraction.Fraction;

public class ComplexFraction extends Fraction {

    private int numerator;
    private int denominator;
    private int numerator1;
    private int denominator1;
    private double num;
    private double den;

    public ComplexFraction (int numerator , int denominator,int numerator1, int denominator1) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.numerator1 = numerator1;
        this.denominator1 = denominator1;
    }

    public ComplexFraction (double num, double den) {
        this.num = num;
        this.den = den;
    }

    public ComplexFraction summing(ComplexFraction f) {
        return new ComplexFraction(this.numerator*f.numerator1-this.denominator*f.denominator1+this.numerator1*f.numerator-this.denominator1*f.denominator,
                this.denominator*f.numerator1+this.numerator*f.denominator1+this.numerator1*f.denominator+this.denominator1*f.numerator,
                this.numerator1*f.numerator1-this.denominator1*f.denominator1,this.denominator1*f.numerator1+this.numerator1*f.denominator1);
    }

    public ComplexFraction subtract(ComplexFraction f) {
        return new ComplexFraction((this.numerator*f.numerator1-this.denominator*f.denominator1)-(this.numerator1*f.numerator-this.denominator1*f.denominator),
                (this.denominator*f.numerator1+this.numerator*f.denominator1)-(this.numerator1*f.denominator+this.denominator1*f.numerator),
                this.numerator1*f.numerator1-this.denominator1*f.denominator1,this.denominator1*f.numerator1+this.numerator1*f.denominator1);
    }

    public ComplexFraction multiply(ComplexFraction f) {
        return new ComplexFraction(this.numerator*f.numerator-this.denominator*f.denominator,this.numerator*f.denominator+this.denominator*f.numerator,
                this.numerator1*f.numerator1-this.denominator1*f.denominator1,this.denominator1*f.numerator1+this.numerator1*f.denominator1);
    }

    public ComplexFraction divide(ComplexFraction f) {
        return new ComplexFraction(this.numerator*f.numerator1-this.denominator*f.denominator1,this.numerator*f.denominator1+this.denominator*f.numerator1,
                this.numerator1*f.numerator-this.denominator1*f.denominator,this.numerator1*f.denominator+this.denominator1*f.numerator);
    }

    public ComplexFraction simplify() {
        return new ComplexFraction ((double)(this.numerator*this.numerator1 + this.denominator * this.denominator1)/(double)(this.denominator1*this.denominator1 +
        this.numerator1*this.numerator1),(double)(this.numerator*this.denominator1-this.numerator1*this.denominator)/(double)(this.denominator1*this.denominator1 +
                this.numerator1*this.numerator1));
    }

    @Override
    public String toString() {
        if(numerator!=0||numerator1!=0||denominator!=0||denominator1!=0) return "(" +numerator + " " + denominator + ")(" + numerator1 + " " + denominator1 + ")";
        return " Simplify " + num +" " + den;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ComplexFraction that = (ComplexFraction) o;
        return numerator == that.numerator &&
                denominator == that.denominator &&
                numerator1 == that.numerator1 &&
                denominator1 == that.denominator1;
    }
}
