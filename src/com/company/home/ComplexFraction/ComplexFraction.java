package com.company.home.ComplexFraction;

import com.company.home.Fraction.Fraction;

import static java.lang.Double.POSITIVE_INFINITY;

public class ComplexFraction extends Fraction {
    private int nominator1;
    private int denominator1;

    public ComplexFraction (int nominator1, int denominator1) {
        this.nominator1 = nominator1;
        this.denominator1 = denominator1;

    }
    public String toString(){
        return  this.nominator1 +"/"+ this.denominator1 + "i";
    }

//    public ComplexFraction multiplication(ComplexFraction cF) {
//        return new ComplexFraction();
//    }

//    public void complex(){
//        ComplexFraction complexFraction = new ComplexFraction(3,4,"i");
//        System.out.println(complexFraction);
//    }
}
