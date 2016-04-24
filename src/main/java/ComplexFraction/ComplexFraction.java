package ComplexFraction;

import Fraction.Fraction;

public class ComplexFraction extends Fraction {
    private int numerator;
    private int denominator;
    private int numerator1;
    private int denominator1;

    public ComplexFraction (int numerator , int denominator,int numerator1, int denominator1) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.numerator1 = numerator1;
        this.denominator1 = denominator1;
    }

    public ComplexFraction summing(ComplexFraction f) {
        return new ComplexFraction(this.numerator * f.numerator1 - this.denominator * f.denominator1 + this.numerator * f.numerator - this.denominator1 * f.denominator,
               this.denominator * f.numerator1 + this.numerator * f.denominator1 + this.numerator * f.denominator + denominator1 * f.numerator,
               numerator * f.numerator1 - this.denominator1 * f.denominator1,denominator1 * f.numerator1 + this.numerator * f.denominator1);
    }


    public ComplexFraction subtract(ComplexFraction f) {
        return new ComplexFraction(this.numerator * f.numerator1 - this.denominator * f.denominator1,this.numerator * f.denominator1 + this.denominator * f.numerator1,
                this.numerator1 * f.numerator - this.denominator1 * f.denominator , this.numerator1 * f.denominator + this.denominator1 * f.numerator);
    }

    public ComplexFraction multiply(ComplexFraction f) {
        return new ComplexFraction(this.numerator*f.numerator-this.denominator*f.denominator,this.numerator*f.denominator+this.denominator*f.numerator,
                this.numerator1*f.numerator1-this.denominator1*f.denominator1,this.denominator1*f.numerator1+this.numerator1*f.denominator1);
    }

    @Override
    public String toString() {
        return "ComplexFraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                ", numerator1=" + numerator1 +
                ", denominator1=" + denominator1 +
                '}';
    }
}
